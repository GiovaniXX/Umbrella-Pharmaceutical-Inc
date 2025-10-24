package util;

public class SessaoUsuario {

    private static int idUsuario;

    public static void setIdUsuario(int id) {
        idUsuario = id;
    }

    public static int getIdUsuario() {
        return idUsuario;
    }

    public static void limpar() {
        idUsuario = 0;
    }
}
