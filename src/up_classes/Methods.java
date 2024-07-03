package up_classes;

import javax.swing.DefaultComboBoxModel;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import up_classes.Dados;

public class Methods {

    private final Dados dados;
    private JComboBox<String> jComboBox_Telefones;

    public Methods(Dados dados) {
        this.dados = dados;
    }

    private void preencherTelefonesClientes() throws SQLException {
        // Obtenha os telefones dos clientes do banco de dados
        ResultSet telefonesClientes = dados.getTelefonesClientes();

        // Crie um modelo de dados para o JComboBox
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

        // Adicione o item default no início do JComboBox
        comboBoxModel.addElement("Selecione um telefone");

        // Adicione os telefones ao modelo de dados
        while (telefonesClientes.next()) {
            String telefone = telefonesClientes.getString("telefone");
            comboBoxModel.addElement(telefone);
        }

        // Associe o modelo de dados ao JComboBox_Telefones
        jComboBox_Telefones.setModel(comboBoxModel);

        // Não se esqueça de fechar o ResultSet após usá-lo
        telefonesClientes.close();
    }
}
