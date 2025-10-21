package model;

public class Usuario {

    private int idUsuario;
    private String nome;
    private String sobrenome;
    private String senha;
    private String chave;
    private int idPerfil;

    public Usuario(int idUsuario, String nome, String sobrenome, String senha, String chave, int idPerfil) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
        this.chave = chave;
        this.idPerfil = idPerfil;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idPerfil=" + idPerfil + '}';
    }
}
/**
 * 01000111 01101001 01101111 01110110 01100001 01101110 01101110 01101001
 */
