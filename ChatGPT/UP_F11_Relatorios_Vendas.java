package up_forms;

import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import up_classes.DadosDB;
import up_classes.Opcoes;
import up_classes.Relatorio;
import up_classes.Utilidades;

public class UP_F11_Relatorios_Vendas extends javax.swing.JInternalFrame {

    private DadosDB dadosDB;
    private ButtonGroup bgTipo = new ButtonGroup();
    private ButtonGroup bgFiltro = new ButtonGroup();

    public UP_F11_Relatorios_Vendas() {
        initComponents();

        bgTipo.add(RadioTodasVendas);
        bgTipo.add(RadioSelecaoVendas);

        bgFiltro.add(RadioData);
        bgFiltro.add(RadioNumeroVenda);
        bgFiltro.add(RadioCliente);
    }

    /**
     * Set the database connection object
     * 
     * @param dadosDB The database connection object
     */
    public void setDadosDB(DadosDB dadosDB) {
        this.dadosDB = dadosDB;
    }

    /**
     * Enable or disable form fields based on the selected filter type
     */
    private void enableFormFields() {
        boolean todasVendasSelected = RadioTodasVendas.isSelected();
        RadioData.setEnabled(!todasVendasSelected);
        RadioNumeroVenda.setEnabled(!todasVendasSelected);
        RadioCliente.setEnabled(!todasVendasSelected);
        dchDataInicial.setEnabled(!todasVendasSelected && RadioData.isSelected());
        dchDataFinal.setEnabled(!todasVendasSelected && RadioData.isSelected());
        cmbCliente.setEnabled(!todasVendasSelected && RadioCliente.isSelected());
        cmbVendaInicial.setEnabled(!todasVendasSelected && RadioNumeroVenda.isSelected());
        cmbVendaFinal.setEnabled(!todasVendasSelected && RadioNumeroVenda.isSelected());
    }

    private void RadioTodasVendasActionPerformed(java.awt.event.ActionEvent evt) {
        enableFormFields();
    }

    private void RadioSelecaoVendasActionPerformed(java.awt.event.ActionEvent evt) {
        enableFormFields();
    }

    private void RadioDataActionPerformed(java.awt.event.ActionEvent evt) {
        enableFormFields();
    }

    private void RadioNumeroVendaActionPerformed(java.awt.event.ActionEvent evt) {
        enableFormFields();
    }

    private void RadioClienteActionPerformed(java.awt.event.ActionEvent evt) {
        enableFormFields();
    }

    private void btnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {
        String arquivo = txtArquivo.getText().trim();
        if (arquivo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            return;
        }

        try (Connection conn = dadosDB.getConnection();
                PreparedStatement stmt = conn.prepareStatement(buildSql())) {
            try (ResultSet rs = stmt.executeQuery()) {
                Relatorio.relatorioVenda(arquivo + ".pdf", rs);
            }
            JOptionPane.showMessageDialog(null, "Relatório gerado com sucesso!");
        } catch (SQLException | IOException ex) {		
	}
}
