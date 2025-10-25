package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Produto;
import util.Conexao;
import categories.Utilidades;

public class ProdutoDAO {

    public boolean existeProduto(String idProduto) {
        String sql = "SELECT COUNT(*) FROM produtos WHERE idproduto = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, idProduto);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next() && rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    public String adicionarProduto(Produto produto) {
        String sql = "INSERT INTO produtos (produto, preco, descricao, observacao) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, produto.getProduto());
            pstmt.setBigDecimal(2, produto.getPreco());
            pstmt.setString(3, produto.getDescricao());
            pstmt.setString(4, produto.getObservacao());
            pstmt.executeUpdate();
            return "Produto cadastrado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível cadastrar este produto";
        }
    }

    public String editarProduto(Produto produto) {
        String sql = "UPDATE produtos SET produto = ?, preco = ?, descricao = ?, observacao = ? WHERE idproduto = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, produto.getProduto());
            pstmt.setBigDecimal(2, produto.getPreco());
            pstmt.setString(3, produto.getDescricao());
            pstmt.setString(4, produto.getObservacao());
            pstmt.setInt(5, produto.getIdProduto());
            pstmt.executeUpdate();
            return "Produto editado com sucesso!";
        } catch (SQLException e) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível editar este produto";
        }
    }

    //public String deletarProduto(String idProduto) {
    public String deletarProduto(int idProduto) {
        String sql = "DELETE FROM produtos WHERE idproduto = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            //pstmt.setString(1, idProduto);
            pstmt.setInt(1, idProduto);
            pstmt.executeUpdate();
            return "Produto excluído com sucesso!";
        } catch (SQLException e) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível deletar este produto";
        }
    }

    public List<Produto> listarProdutos() {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produtos";
        try (Connection conn = Conexao.getConnection(); Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Produto produto = new Produto(
                        rs.getInt("idproduto"),
                        rs.getString("produto"),
                        rs.getBigDecimal("preco"),
                        rs.getString("descricao"),
                        rs.getString("observacao")
                );
                produtos.add(produto);
            }
        } catch (SQLException e) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return produtos;
    }

    public int numeroProdutos() {
        String sql = "SELECT COUNT(*) AS num FROM produtos";
        try (Connection conn = Conexao.getConnection(); Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            return rs.next() ? rs.getInt("num") : 0;
        } catch (SQLException e) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, e);
            return 0;
        }
    }

    public Produto getProduto(String idProduto) {
        String sql = "SELECT * FROM produtos WHERE idproduto = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, idProduto);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new Produto(
                            Utilidades.stringToInt(rs.getString("idproduto")),
                            rs.getString("produto"),
                            rs.getBigDecimal("preco"),
                            rs.getString("descricao"),
                            rs.getString("observacao")
                    );
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public Produto getProdutoPorNome(String nomeProduto) {
        String sql = "SELECT * FROM produtos WHERE produto = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nomeProduto);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new Produto(
                            rs.getInt("idproduto"),
                            rs.getString("produto"),
                            rs.getBigDecimal("preco"),
                            rs.getString("descricao"),
                            rs.getString("observacao")
                    );
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, "Erro ao buscar produto por nome", e);
        }
        return null;
    }

    public Produto getProdutoPorId(int idProduto) {
        String sql = "SELECT idProduto, produto, descricao, preco, observacao FROM produtos WHERE idProduto = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idProduto);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    Produto p = new Produto();
                    p.setIdProduto(rs.getInt("idProduto"));
                    p.setProduto(rs.getString("produto"));
                    p.setDescricao(rs.getString("descricao"));
                    p.setPreco(rs.getBigDecimal("preco"));
                    p.setObservacao(rs.getString("observacao"));
                    return p;
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, "Erro ao buscar produto por ID", e);
        }
        return null;
    }

    public String inserirProduto(Produto p) {
        String sql = "INSERT INTO produtos (produto, preco, descricao, observacao) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, p.getProduto());
            pstmt.setBigDecimal(2, p.getPreco());
            pstmt.setString(3, p.getDescricao());
            pstmt.setString(4, p.getObservacao());
            pstmt.executeUpdate();
            return "Produto inserido com sucesso!";
        } catch (SQLException e) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, e);
            return "Erro ao inserir produto.";
        }
    }
}
