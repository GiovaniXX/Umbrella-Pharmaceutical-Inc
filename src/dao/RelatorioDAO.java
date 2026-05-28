package dao;

import java.sql.*;
import util.Conexao;

public class RelatorioDAO {

    public ResultSet getVendas() {
        String sql = """
            SELECT v.idVenda,
                   v.dataVenda,
                   v.idCliente,
                   iv.idProduto,
                   p.produto,
                   p.descricao,
                   iv.precoUnitario AS precoUnitario,
                   iv.quantidade
            FROM vendas v
            JOIN itemvenda iv ON v.idVenda = iv.idVenda
            JOIN produtos p ON iv.idProduto = p.idProduto
            """;
        try {
            Connection conn = Conexao.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet getVendaPorId(int idVenda) {
        String sql = """
            SELECT v.idVenda,
                   v.dataVenda,
                   c.nome AS nomeCliente,
                   p.produto AS nomeProduto,
                   p.descricao,
                   iv.precoUnitario AS precoUnitario,
                   iv.quantidade
            FROM vendas v
            JOIN clientes c ON v.idCliente = c.idCliente
            JOIN itemvenda iv ON v.idVenda = iv.idVenda
            JOIN produtos p ON iv.idProduto = p.idProduto
            WHERE v.idVenda = ?
            """;

        try {
            Connection conn = Conexao.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, idVenda);
            return pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getNomeClientePorId(int idCliente) {
        String sql = "SELECT nome FROM clientes WHERE idCliente = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idCliente);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getString("nome");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Desconhecido";
    }

    public String getNomeProdutoPorId(int idProduto) {
        String sql = "SELECT produto FROM produtos WHERE idProduto = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idProduto);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getString("produto");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Desconhecido";
    }
}
