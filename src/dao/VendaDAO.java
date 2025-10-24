package dao;

import model.Cliente;
import model.Produto;
import java.math.BigDecimal;

import util.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VendaDAO {

    private Connection conn;

    public VendaDAO(Connection conn) {
        if (conn == null) {
            throw new IllegalArgumentException("Conexão não pode ser nula");
        }
        this.conn = conn;
    }

    public int gerarNumeroVenda() {
        String sql = "SELECT MAX(numerovenda) FROM vendas";
        try (Statement stmt = this.conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getInt(1) + 1;
            }
        } catch (SQLException e) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return 1;
    }

    public Cliente buscarClientePorNome(String nome) {
        String sql = "SELECT * FROM clientes WHERE nome = ?";
        try (PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
            pstmt.setString(1, nome);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    Cliente c = new Cliente();
                    c.setIdCliente(rs.getInt("idcliente"));
                    c.setNome(rs.getString("nome"));
                    return c;
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public Produto buscarProdutoPorNome(String nome) {
        String sql = "SELECT * FROM produtos WHERE produto = ?";
        try (PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
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

    public int salvarVenda(int idUsuario, int numeroVenda, int idCliente, java.util.Date dataVenda, double valorTotal,
            int quantidade, String produto, String descricao, BigDecimal preco, int idProduto) {

        String sql = "INSERT INTO vendas (idUsuario, numerovenda, idCliente, dataVenda, valortotal, quantidade, produto, descricao, preco, idProduto) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setInt(1, idUsuario);
            pstmt.setInt(2, numeroVenda);
            pstmt.setInt(3, idCliente);
            pstmt.setTimestamp(4, new java.sql.Timestamp(dataVenda.getTime())); // datetime
            pstmt.setDouble(5, valorTotal);
            pstmt.setInt(6, quantidade);
            pstmt.setString(7, produto);
            pstmt.setString(8, descricao);
            pstmt.setBigDecimal(9, preco);
            pstmt.setInt(10, idProduto);

            pstmt.executeUpdate();

            try (ResultSet rs = pstmt.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1); // retorna o idVenda gerado
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, "Erro ao salvar venda", e);
        }
        return -1;
    }

    public void salvarDetalheVenda(int idVenda, int idProduto, BigDecimal preco, int quantidade) {
        String sql = "INSERT INTO detalhe_venda (idVenda, idProduto, preco, quantidade) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
            pstmt.setInt(1, idVenda);
            pstmt.setInt(2, idProduto);
            pstmt.setBigDecimal(3, preco); // ✅ usa BigDecimal
            pstmt.setInt(4, quantidade);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, "Erro ao salvar os detalhes da venda", e);
        }
    }

    public List<String> listarNomesClientes() {
        List<String> nomes = new ArrayList<>();
        String sql = "SELECT nome FROM clientes ORDER BY nome";
        try (PreparedStatement pstmt = this.conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {
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
        String sql = "SELECT produto FROM produtos ORDER BY produto";
        try (PreparedStatement pstmt = this.conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                produtos.add(rs.getString("produto"));
            }
        } catch (SQLException e) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return produtos;
    }
}
