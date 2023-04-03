package up_classes;

import up_forms.UP_F00_Login;

public class Vendas {

    public static void main(String[] args) {
        DadosDB dadosDB = new DadosDB();
        UP_F00_Login ufl = new UP_F00_Login();
        ufl.setDadosDB(dadosDB);
        ufl.setVisible(true);
    }
}
