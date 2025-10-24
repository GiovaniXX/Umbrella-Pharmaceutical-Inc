package controller;

import dao.UsuarioDAO;
import java.util.List;
import model.Usuario;
import java.sql.Connection;
import util.Conexao;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioController {

    private final UsuarioDAO dao;

    public UsuarioController() {
        dao = new UsuarioDAO();
    }

    public boolean autenticar(String usuario, String senha, String chave) {
        return dao.validarUsuario(usuario, senha, chave);
    }

    public int obterIdPerfil(String idUsuario) {
        return dao.getIdPerfil(idUsuario);
    }

    public Usuario obterUsuarioLogado(String nomeUsuario) {
        return dao.getUsuarioPorNome(nomeUsuario);
    }

    public boolean usuarioExiste(String idUsuario) {
        return dao.existeUsuario(idUsuario);
    }

    public String cadastrarUsuario(Usuario usuario) {
        if (usuarioExiste(String.valueOf(usuario.getIdUsuario()))) {
            return "Usuário já existe";
        }
        return dao.adicionarUsuario(usuario);
    }

    public String atualizarUsuario(Usuario usuario) {
        return dao.editarUsuario(usuario);
    }

    public String excluirUsuario(String idUsuario) {
        return dao.deletarUsuario(idUsuario);
    }

    public int contarUsuarios() {
        return dao.numeroUsuarios();
    }

    public List<Usuario> listarUsuarios() {
        return dao.listarUsuarios();
    }

    public Usuario buscarUsuarioPorCredenciais(String usuario, String senha, String chave) {
        String sql = "SELECT idUsuario, usuario, nome, idPerfil FROM usuarios WHERE usuario = ? AND senha = ? AND chave = ?";

        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, usuario);
            pstmt.setString(2, senha);
            pstmt.setString(3, chave);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    Usuario usuarioEncontrado = new Usuario();
                    usuarioEncontrado.setIdUsuario(rs.getInt("idUsuario"));
                    usuarioEncontrado.setUsuario(rs.getString("usuario"));
                    usuarioEncontrado.setNome(rs.getString("nome"));
                    usuarioEncontrado.setIdPerfil(rs.getInt("perfil")); // se houver campo de perfil
                    return usuarioEncontrado;
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, "Erro ao buscar usuário por credenciais", e);
        }

        return null; // não encontrado ou erro
    }
}
