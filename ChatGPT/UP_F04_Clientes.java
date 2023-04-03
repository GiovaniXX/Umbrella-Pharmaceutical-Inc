package up_forms;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import up_classes.Cliente;
import up_classes.DadosDB;
import java.sql.ResultSet;
import up_classes.Utilidades;

public class UP_F04_Clientes extends javax.swing.JInternalFrame {
    private DadosDB dadosDB;
    private int cliAtual = 0;
    private boolean novo = false;
    private DefaultTableModel mTabela;

    public void setDadosDB(DadosDB dadosDB) {
        this.dadosDB = dadosDB;
    }

    public UP_F04_Clientes() {
        initComponents();
    }
	
	private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {                                        
        setFormEnabled(false);
        clearFormFields();

        novo = true;
        txtIDCliente.requestFocus();
    }                                       

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (!isFormValid()) {
            return;
        }

        Cliente mCliente = new Cliente(
            txtIDCliente.getText(),
            cmbIdentificacao.getSelectedIndex(),
            txtNome.getText(),
            txtSNome.getText(),
            txtEndereco.getText(),
            txtTelefone.getText(),
            cmbCidade.getSelectedIndex(),
            DNascimento.getDate(),
            DData.getDate()
        );

        String msg;
        if (novo) {
            msg = dadosDB.adicionarCliente(mCliente);
        } else {
            msg = dadosDB.editarCliente(mCliente);
        }
        JOptionPane.showMessageDialog(rootPane, msg);

        setFormEnabled(true);
        preencherTabela();
    }                                         

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        setFormEnabled(true);
    }                                           

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        setFormEnabled(false);
        novo = false;
        cmbIdentificacao.requestFocus();
    }                                         

    // ...

    private void setFormEnabled(boolean enabled) {
        btnPrimeiro.setEnabled(enabled);
        btnAnterior.setEnabled(enabled);
        btnProximo.setEnabled(enabled);
        btnUltimo.setEnabled(enabled);
        btnNovo.setEnabled(enabled);
        btnEditar.setEnabled(enabled);
        btnExcluir.setEnabled(enabled);
        btnPesquisar.setEnabled(enabled);
        btnSalvar.setEnabled(!enabled);
        btnCancelar.setEnabled(!enabled);

        txtIDCliente.setEnabled(!enabled);
        cmbIdentificacao.setEnabled(!enabled);
        txtNome.setEnabled(!enabled);
        txtSNome.setEnabled(!enabled);
        txtEndereco.setEnabled(!enabled);
        txtTelefone.setEnabled(!enabled);
        cmbCidade.setEnabled(!enabled);
        DNascimento.setEnabled(!enabled);
        DData.setEnabled(!enabled);
    }

    private void clearFormFields() {
        txtIDCliente.setText("");
        cmbIdentificacao.setSelectedIndex(0);
        txtNome.setText("");
        txtSNome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        cmbCidade.setSelectedIndex(0);
        DNascimento.setDate(new Date());
        DData.setDate(new Date());
    }

    private boolean isFormValid() {
        if (txtIDCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Favor inserir um número de ID do cliente!");
            txtIDCliente.requestFocusInWindow();
            return false;
        }

        if (cmbIdentificacao.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Favor selecionar uma identificação!");
            cmbIdentificacao.requestFocusInWindow();
            return false;
        }

        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "
		}
	}
}
// UP_F04_Clientes/com melhorias/ChatGPT