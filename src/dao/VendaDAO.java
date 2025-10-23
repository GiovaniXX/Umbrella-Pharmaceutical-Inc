package dao;

import model.Cliente;
import model.Produto;
import util.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VendaDAO {

    public int gerarNumeroVenda() {
        String sql = "SELECT MAX(numerovenda) FROM vendas";
        try (Connection conn = Conexao.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getInt(1) + 1;
            }
        } catch (SQLException e) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return 1;
    }

    public Cliente buscarClientePorNome(String nome) {
        String sql = "SELECT * FROM cliente WHERE nome = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nome);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    Cliente c = new Cliente();
                    c.setIdCliente(rs.getInt("idcliente"));
                    c.setNome(rs.getString("nome"));
                    // outros campos...
                    return c;
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public Produto buscarProdutoPorNome(String nome) {
        String sql = "SELECT * FROM produto WHERE produto = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nome);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    Produto p = new Produto();
                    p.setIdProduto(rs.getInt("idproduto"));
                    p.setProduto(rs.getString("produto"));
                    p.setDescricao(rs.getString("descricao"));
                    p.setPreco(rs.getBigDecimal("preco"));
                    return p;
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public void salvarVenda(int numeroVenda, int idCliente, java.util.Date data, double valorTotal, int quantidadeTotal,
            String nomeProduto, String descricaoProduto, int idFuncionario, int idFormaPagamento) {
        String sql = "INSERT INTO vendas (numerovenda, idcliente, datavenda, valortotal, quantidadetotal, nomeproduto, descricaoproduto, idfuncionario, idformapagamento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, numeroVenda);
            pstmt.setInt(2, idCliente);
            pstmt.setDate(3, new java.sql.Date(data.getTime()));
            pstmt.setDouble(4, valorTotal);
            pstmt.setInt(5, quantidadeTotal);
            pstmt.setString(6, nomeProduto);
            pstmt.setString(7, descricaoProduto);
            pstmt.setInt(8, idFuncionario);
            pstmt.setInt(9, idFormaPagamento);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void salvarDetalheVenda(int numeroVenda, int idProduto, double preco, int quantidade) {
        String sql = "INSERT INTO detalhesvenda (numerovenda, idproduto, preco, quantidade) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, numeroVenda);
            pstmt.setInt(2, idProduto);
            pstmt.setDouble(3, preco);
            pstmt.setInt(4, quantidade);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public List<String> listarNomesClientes() {
        List<String> nomes = new ArrayList<>();
        String sql = "SELECT nome FROM cliente ORDER BY nome";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                nomes.add(rs.getString("nome"));
            }
        } catch (SQLException e) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return nomes;
    }

    public List<String> listarNomesProdutos() {
        List<String> produtos = new ArrayList<>();
        String sql = "SELECT produto FROM produto ORDER BY produto";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                produtos.add(rs.getString("produto"));
            }
        } catch (SQLException e) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return produtos;
    }
}
