package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cidade;
import util.Conexao;

public class CidadeDAO {

    public boolean existeCidade(int idCidade) {
        String sql = "SELECT 1 FROM cidades WHERE idcidade = ?";
        // A conexão será automaticamente direcionada para H2 ou MySQL conforme o modo definido em Conexao.java
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idCidade);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    public String adicionarCidade(Cidade cidade) {
        String sql = "INSERT INTO cidades (nome, estado) VALUES (?, ?)";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cidade.getNome());
            pstmt.setString(2, cidade.getEstado());
            pstmt.executeUpdate();
            return "Cidade cadastrada com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível cadastrar esta cidade";
        }
    }

    public String editarCidade(Cidade cidade) {
        String sql = "UPDATE cidades SET nome = ?, estado = ? WHERE idcidade = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cidade.getNome());
            pstmt.setString(2, cidade.getEstado());
            pstmt.setInt(3, cidade.getIdCidade());
            pstmt.executeUpdate();
            return "Cidade editada com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível editar esta cidade";
        }
    }

    public String deletarCidade(int idCidade) {
        String sql = "DELETE FROM cidades WHERE idcidade = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idCidade);
            pstmt.executeUpdate();
            return "Cidade deletada com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível deletar esta cidade";
        }
    }

    public Cidade getCidadePorId(int idCidade) {
        String sql = "SELECT * FROM cidades WHERE idcidade = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idCidade);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new Cidade(
                            rs.getInt("idcidade"),
                            rs.getString("nome"),
                            rs.getString("estado")
                    );
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public Cidade getCidadePorNome(String nomeCidade) {
        String sql = "SELECT * FROM cidades WHERE nome = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nomeCidade);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new Cidade(
                            rs.getInt("idcidade"),
                            rs.getString("nome"),
                            rs.getString("estado")
                    );
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public List<Cidade> listarCidades() {
        List<Cidade> cidades = new ArrayList<>();
        String sql = "SELECT * FROM cidades";
        try (Connection conn = Conexao.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Cidade cidade = new Cidade(
                        rs.getInt("idcidade"),
                        rs.getString("nome"),
                        rs.getString("estado")
                );
                cidades.add(cidade);
            }
        } catch (SQLException e) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return cidades;
    }

    public int numeroCidades() {
        String sql = "SELECT COUNT(*) AS num FROM cidades";
        try (Connection conn = Conexao.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            return rs.next() ? rs.getInt("num") : 0;
        } catch (SQLException e) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, e);
            return 0;
        }
    }
}
