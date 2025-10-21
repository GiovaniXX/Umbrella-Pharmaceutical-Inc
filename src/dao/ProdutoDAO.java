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
        String sql = "INSERT INTO produtos (produto, preco, descricao) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, produto.getProduto());
            pstmt.setDouble(2, produto.getPreco());
            pstmt.setString(3, produto.getDescricao());
            pstmt.executeUpdate();
            return "Produto cadastrado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível cadastrar este produto";
        }
    }

    public String editarProduto(Produto produto) {
        String sql = "UPDATE produtos SET produto = ?, preco = ?, descricao = ? WHERE idproduto = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, produto.getProduto());
            pstmt.setDouble(2, produto.getPreco());
            pstmt.setString(3, produto.getDescricao());
            pstmt.setInt(4, produto.getIdProduto());
            pstmt.executeUpdate();
            return "Produto editado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível editar este produto";
        }
    }

    public String deletarProduto(String idProduto) {
        String sql = "DELETE FROM produtos WHERE idproduto = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, idProduto);
            pstmt.executeUpdate();
            return "Produto deletado com sucesso";
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
                        rs.getDouble("preco"),
                        rs.getString("descricao")
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
                            rs.getDouble("preco"),
                            rs.getString("descricao")
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
                            rs.getDouble("preco"),
                            rs.getString("descricao")
                    );
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, "Erro ao buscar produto por nome", e);
        }
        return null;
    }

    public String getNomeProdutoPorId(int idProduto) {
        String sql = "SELECT produto FROM produtos WHERE idproduto = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idProduto);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("produto");
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return "";
    }
}
