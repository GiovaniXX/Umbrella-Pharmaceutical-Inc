package dao;

import java.sql.*;
import util.Conexao;

public class RelatorioDAO {

    public ResultSet getVendas() {
        String sql = "SELECT * FROM vendas";
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
        String sql = "SELECT * FROM vendas WHERE idvenda = ?";
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
        String sql = "SELECT nome FROM cliente WHERE idcliente = ?";
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
        String sql = "SELECT produto FROM produto WHERE idproduto = ?";
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
