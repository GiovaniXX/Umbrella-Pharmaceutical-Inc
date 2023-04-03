package up_classes;

public class Usuario {

    private String idUsuario;
    private String nome;
    private String snome;
    private String senha;
    private String chave;
    private int perfil;
   
    public Usuario(String idUsuario, String nome, String snome, String senha, String chave, int perfil) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.snome = snome;
        this.senha = senha;
        this.chave = chave;
        this.perfil = perfil;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSnome() {
        return snome;
    }

    public void setSnome(String snome) {
        this.snome = snome;
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

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }
}
