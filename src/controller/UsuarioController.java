package controller;

import dao.UsuarioDAO;
import java.util.List;
import model.Usuario;

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
}
