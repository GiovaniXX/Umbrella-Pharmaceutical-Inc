package up_classes;

public class Usuario {

    private int idusuario;
    private String nome;
    private String sobrenome;
    private String senha;
    private String chave;
    private int perfil;

    public Usuario(int idusuario, String nome, String sobrenome, String senha, String chave, int perfil) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
        this.chave = chave;
        this.perfil = perfil;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
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

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Usuario{" + "perfil=" + perfil + '}';
    }
}
/**
 * 01000111 01101001 01101111 01110110 01100001 01101110 01101110 01101001
 */
