package up_forms;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import up_classes.DadosDB;

public class UP_F13_Pesquisar_Boletos extends javax.swing.JInternalFrame {

    private final Timer timer;
    public DadosDB dadosDB;

    public void setDadosDB(DadosDB dadosDB) {
        this.dadosDB = dadosDB;
    }

    public UP_F13_Pesquisar_Boletos() {
        initComponents();
        timer = new Timer(1000, (ActionEvent e) -> {
            atualizarDataHoraAtual();
        });
        timer.start();
        atualizarDataHoraAtual();

        jTextField_DigiteCodigoBarras.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_DigiteCodigoBarras.setText("");
            }
        });

        jRadioButton_Data.addItemListener((java.awt.event.ItemEvent evt) -> {
            if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
                jDateChooser_Data.setEnabled(true);
                jTextField_DigiteCodigoBarras.setEnabled(false);
            } else {
                jDateChooser_Data.setEnabled(false);
            }
        });

        jRadioButton_CodigoBarras.addItemListener((java.awt.event.ItemEvent evt) -> {
            if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
                jTextField_DigiteCodigoBarras.setEnabled(true);
                jDateChooser_Data.setEnabled(false);
            } else {
                jTextField_DigiteCodigoBarras.setEnabled(false);
            }
        });
    }

    private void atualizarDataHoraAtual() {
        SimpleDateFormat formatoDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dataHoraAtual = new Date();
        String dataHoraAtualFormatada = formatoDataHora.format(dataHoraAtual);
        jLabel_DataHoraAtualSistema.setText(dataHoraAtualFormatada);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_PesquisarBoletoBancario = new javax.swing.JComboBox<>();
        jButton_Pesquisar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jRadioButton_Data = new javax.swing.JRadioButton();
        jRadioButton_CodigoBarras = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Tabela = new javax.swing.JTable();
        jCheckBox_Vencer = new javax.swing.JCheckBox();
        jCheckBox_Pagos = new javax.swing.JCheckBox();
        jSeparator3 = new javax.swing.JSeparator();
        jDateChooser_Data = new com.toedter.calendar.JDateChooser();
        jTextField_DigiteCodigoBarras = new javax.swing.JTextField();
        jLabel_DataHoraAtualSistema = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle(".:Umbrella Pharmaceutical™ Controle de Boletos Bancarios");
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jLabel1.setText("Data/Hora Atual.:");

        jLabel2.setText("Boleto.:");

        jComboBox_PesquisarBoletoBancario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesquisar Boleto Bancario", "Boticario", "Natura", "Eudora", "Golfran" }));

        jButton_Pesquisar.setText("Pesquisar");
        jButton_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PesquisarActionPerformed(evt);
            }
        });

        jRadioButton_Data.setText("Data");

        jRadioButton_CodigoBarras.setText("Código de Barras");

        jTable_Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Boleto", "Cedente", "Código de Barras", "Data de Vencimento", "Valor a Pagar"
            }
        ));
        jTable_Tabela.setMinimumSize(new java.awt.Dimension(500, 80));
        jScrollPane1.setViewportView(jTable_Tabela);
        if (jTable_Tabela.getColumnModel().getColumnCount() > 0) {
            jTable_Tabela.getColumnModel().getColumn(0).setMinWidth(100);
            jTable_Tabela.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable_Tabela.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable_Tabela.getColumnModel().getColumn(3).setMinWidth(150);
            jTable_Tabela.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTable_Tabela.getColumnModel().getColumn(3).setMaxWidth(150);
            jTable_Tabela.getColumnModel().getColumn(4).setMinWidth(100);
            jTable_Tabela.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable_Tabela.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        jCheckBox_Vencer.setText("A Vencer");

        jCheckBox_Pagos.setText("Pagos");
        jCheckBox_Pagos.setEnabled(false);

        jDateChooser_Data.setEnabled(false);

        jTextField_DigiteCodigoBarras.setText("Digite o código de barras");
        jTextField_DigiteCodigoBarras.setEnabled(false);

        jLabel_DataHoraAtualSistema.setPreferredSize(new java.awt.Dimension(0, 16));

        jButton1.setText("Enviar Registros para o WhatsApp");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox_PesquisarBoletoBancario, 0, 300, Short.MAX_VALUE)
                            .addComponent(jLabel_DataHoraAtualSistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Pesquisar)
                        .addGap(0, 852, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateChooser_Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox_Vencer)
                            .addComponent(jCheckBox_Pagos))
                        .addGap(902, 902, 902))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton_Data)
                            .addComponent(jRadioButton_CodigoBarras)
                            .addComponent(jTextField_DigiteCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel_DataHoraAtualSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox_PesquisarBoletoBancario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Pesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_Data)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateChooser_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton_CodigoBarras))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox_Vencer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox_Pagos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_DigiteCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(9, 9, 9)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PesquisarActionPerformed
        try {
            DadosDB dadosDB = new DadosDB();
            String empresaSelecionada = (String) jComboBox_PesquisarBoletoBancario.getSelectedItem();

            String coluna = "";
            String valor = "";

            if (empresaSelecionada.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Selecione uma empresa primeiro.");
                return;
            }

            // Verificar opção selecionada
            if (jRadioButton_Data.isSelected()) {
                coluna = "dataVencimento";
                // Defina o valor com a data selecionada, convertida para o formato correto
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                valor = dateFormat.format(jDateChooser_Data.getDate());
            } else if (jRadioButton_CodigoBarras.isSelected()) {
                coluna = "codigoBarras";
                valor = jTextField_DigiteCodigoBarras.getText();
            }

            // Verificar checkboxes selecionados
            if (jCheckBox_Vencer.isSelected()) {
                // Adicionar condição para boletos a vencer
                coluna = "dataVencimento";

                // Obter a data atual e subtrair um dia
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.DAY_OF_MONTH, -1);
                Date dataVencimento = calendar.getTime();

                // Definir o valor com a data de vencimento
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                valor = dateFormat.format(dataVencimento);
            } else if (jCheckBox_Pagos.isSelected()) {
                // Adicionar condição para boletos pagos
                coluna = "dataVencimento";

                // Obter a data atual e adicionar um dia
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.DAY_OF_MONTH, 1);
                Date dataPagamento = calendar.getTime();

                // Definir o valor com a data de pagamento
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                valor = dateFormat.format(dataPagamento);
            }

            // Realizar a pesquisa no banco de dados
            DefaultTableModel tableModel = dadosDB.pesquisarNoBanco(empresaSelecionada.toLowerCase(), coluna, valor);

            // Exibir os registros na tabela
            jTable_Tabela.setModel(tableModel);
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao pesquisar no banco de dados: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButton_PesquisarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        enviarBoletoWhatsApp();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Pesquisar;
    private javax.swing.JCheckBox jCheckBox_Pagos;
    private javax.swing.JCheckBox jCheckBox_Vencer;
    private javax.swing.JComboBox<String> jComboBox_PesquisarBoletoBancario;
    private com.toedter.calendar.JDateChooser jDateChooser_Data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_DataHoraAtualSistema;
    private javax.swing.JRadioButton jRadioButton_CodigoBarras;
    private javax.swing.JRadioButton jRadioButton_Data;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable_Tabela;
    private javax.swing.JTextField jTextField_DigiteCodigoBarras;
    // End of variables declaration//GEN-END:variables

    private void enviarMensagemWhatsApp(String numero, String mensagem) {
        try {
            String url = "https://api.whatsapp.com/send?phone=" + numero + "&text=" + URLEncoder.encode(mensagem, StandardCharsets.UTF_8);
            java.awt.Desktop.getDesktop().browse(URI.create(url));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao enviar mensagem no WhatsApp: " + ex.getMessage());
        }
    }

    private void enviarBoletoWhatsApp() {
        int selectedRow = jTable_Tabela.getSelectedRow();
        if (selectedRow != -1) {
            // Obter os dados do boleto selecionado na tabela
            String idBoleto = jTable_Tabela.getValueAt(selectedRow, 0).toString();
            String cedente = jTable_Tabela.getValueAt(selectedRow, 1).toString();
            String codigoBarras = jTable_Tabela.getValueAt(selectedRow, 2).toString();
            String dataVencimento = jTable_Tabela.getValueAt(selectedRow, 3).toString();
            String valorPagar = jTable_Tabela.getValueAt(selectedRow, 4).toString();

            // Formatar a mensagem a ser enviada
            String mensagem = "Boleto a vencer:\n\n"
                    + "ID do Boleto: " + idBoleto + "\n"
                    + "Cedente: " + cedente + "\n"
                    + "Código de Barras: " + codigoBarras + "\n"
                    + "Data de Vencimento: " + dataVencimento + "\n"
                    + "Valor a Pagar: " + valorPagar;

            // Número de telefone para onde irá mensagem
            String numeroCliente = "+5549999573756";

            // Enviar a mensagem pelo WhatsApp
            enviarMensagemWhatsApp(numeroCliente, mensagem);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um boleto na tabela.");
        }
    }
}
