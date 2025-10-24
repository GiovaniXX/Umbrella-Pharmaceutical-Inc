package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;
import util.Conexao;

public class UsuarioDAO {

    public boolean existeUsuario(String idUsuario) {
        String sql = "SELECT 1 FROM usuarios WHERE idusuario = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, idUsuario);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    public String adicionarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (idUsuario, nome, sobrenome, usuario, senha, chave, perfil) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, usuario.getIdUsuario());               // ✅ idUsuario
            pstmt.setString(2, usuario.getNome());                 // ✅ nome
            pstmt.setString(3, usuario.getSobrenome());            // ✅ sobrenome
            pstmt.setString(4, usuario.getUsuario());              // ✅ usuario
            pstmt.setString(5, usuario.getSenha());                // ✅ senha
            pstmt.setString(6, usuario.getChave());                // ✅ chave
            pstmt.setInt(7, usuario.getIdPerfil());
            pstmt.executeUpdate();
            return "Usuário cadastrado com sucesso!";
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível cadastrar este usuário!";
        }
    }

    public String editarUsuario(Usuario usuario) {
        String sql = "UPDATE usuarios SET nome = ?, sobrenome = ?, senha = ?, idPerfil = ? WHERE idusuario = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, usuario.getNome());
            pstmt.setString(2, usuario.getSobrenome());
            pstmt.setString(3, usuario.getSenha());
            pstmt.setInt(4, usuario.getIdPerfil());
            pstmt.setInt(5, usuario.getIdUsuario());
            pstmt.executeUpdate();
            return "Usuário editado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível editar este usuário";
        }
    }

    public String deletarUsuario(String idUsuario) {
        String sql = "DELETE FROM usuarios WHERE idusuario = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, idUsuario);
            pstmt.executeUpdate();
            return "Usuário deletado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível deletar este usuário";
        }
    }

    public ResultSet getUsuarios() {
        String sql = "SELECT * FROM usuarios";
        try {
            Connection conn = Conexao.getConnection();
            Statement st = conn.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public int numeroUsuarios() {
        String sql = "SELECT COUNT(*) AS num FROM usuarios";
        try (Connection conn = Conexao.getConnection(); Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            return rs.next() ? rs.getInt("num") : 0;
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            return 0;
        }
    }

    public Usuario getUsuarioPorNome(String nomeUsuario) {
        String sql = "SELECT idusuario, nome, sobrenome, usuario, senha, chave, idPerfil FROM usuarios WHERE nome = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nomeUsuario);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new Usuario(
                            rs.getInt("idusuario"),
                            rs.getString("nome"),
                            rs.getString("sobrenome"),
                            rs.getString("usuario"),
                            rs.getString("senha"),
                            rs.getString("chave"),
                            rs.getInt("idPerfil")
                    );
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public int getIdPerfil(String idUsuario) {
        String sql = "SELECT idPerfil FROM usuarios WHERE idusuario = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, idUsuario);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next() ? rs.getInt("idPerfil") : -1;
            }
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            return -1;
        }
    }

    public boolean validarUsuario(String usuario, String senha, String chave) {
        String sql = "SELECT 1 FROM usuarios WHERE usuario = ? AND senha = ? AND chave = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, usuario);
            pstmt.setString(2, senha);
            pstmt.setString(3, chave);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";
        try (Connection conn = Conexao.getConnection(); Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Usuario u = new Usuario(
                        rs.getInt("idusuario"),
                        rs.getString("nome"),
                        rs.getString("sobrenome"),
                        rs.getString("usuario"),
                        rs.getString("senha"),
                        rs.getString("chave"),
                        rs.getInt("idperfil")
                );
                usuarios.add(u);
            }
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return usuarios;
    }
}
