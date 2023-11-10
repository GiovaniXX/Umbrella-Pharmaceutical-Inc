package up_forms;

import javax.swing.*;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import up_classes.Dados;

public class UP_F13_Enviar_Relatorios_Vendas extends javax.swing.JInternalFrame {

    public Dados dados;

    public void setDados(Dados dados) {
        this.dados = dados;
    }

    public UP_F13_Enviar_Relatorios_Vendas() {
        initComponents();
        preencherTelefonesClientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSendWhatsapp = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        myButton_SearchSales = new up_class_custom.MyButton();
        myButton_SendSalesReportsWhatsApp = new up_class_custom.MyButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jComboBox_Telefones = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();

        setClosable(true);
        setTitle(".:Umbrella Pharmaceutical™ Send Report");
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSendWhatsapp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSendWhatsapp.setForeground(new java.awt.Color(255, 255, 255));
        lblSendWhatsapp.setText("Send Report to Whatsapp");
        getContentPane().add(lblSendWhatsapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 270, -1));

        myButton_SearchSales.setBackground(new java.awt.Color(122, 0, 0));
        myButton_SearchSales.setForeground(new java.awt.Color(255, 255, 255));
        myButton_SearchSales.setText("Search for Sales");
        myButton_SearchSales.setColor(new java.awt.Color(122, 0, 0));
        myButton_SearchSales.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        myButton_SearchSales.setRadius(50);
        myButton_SearchSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton_SearchSalesActionPerformed(evt);
            }
        });
        getContentPane().add(myButton_SearchSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 440, 60));

        myButton_SendSalesReportsWhatsApp.setForeground(new java.awt.Color(255, 255, 255));
        myButton_SendSalesReportsWhatsApp.setText("Send Sales Reports WhatsApp");
        myButton_SendSalesReportsWhatsApp.setColor(new java.awt.Color(122, 0, 0));
        myButton_SendSalesReportsWhatsApp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        myButton_SendSalesReportsWhatsApp.setPreferredSize(new java.awt.Dimension(253, 32));
        myButton_SendSalesReportsWhatsApp.setRadius(50);
        myButton_SendSalesReportsWhatsApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton_SendSalesReportsWhatsAppActionPerformed(evt);
            }
        });
        getContentPane().add(myButton_SendSalesReportsWhatsApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 440, 60));

        tblTabela.setBackground(new java.awt.Color(0, 0, 0));
        tblTabela.setForeground(new java.awt.Color(3, 155, 216));
        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Venda", "Linha", "Produto", "Descrição", "Preço", "Quantidade", "Cedente", "Data Venda", "Valor", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTabela.setGridColor(new java.awt.Color(0, 0, 0));
        tblTabela.setMaximumSize(new java.awt.Dimension(685, 520));
        tblTabela.setMinimumSize(new java.awt.Dimension(685, 520));
        tblTabela.setPreferredSize(new java.awt.Dimension(685, 520));
        tblTabela.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tblTabela.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblTabela);
        if (tblTabela.getColumnModel().getColumnCount() > 0) {
            tblTabela.getColumnModel().getColumn(0).setMinWidth(100);
            tblTabela.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblTabela.getColumnModel().getColumn(0).setMaxWidth(100);
            tblTabela.getColumnModel().getColumn(1).setMinWidth(100);
            tblTabela.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblTabela.getColumnModel().getColumn(1).setMaxWidth(100);
            tblTabela.getColumnModel().getColumn(4).setMinWidth(100);
            tblTabela.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblTabela.getColumnModel().getColumn(4).setMaxWidth(100);
            tblTabela.getColumnModel().getColumn(5).setMinWidth(100);
            tblTabela.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblTabela.getColumnModel().getColumn(5).setMaxWidth(100);
            tblTabela.getColumnModel().getColumn(8).setMinWidth(100);
            tblTabela.getColumnModel().getColumn(8).setPreferredWidth(100);
            tblTabela.getColumnModel().getColumn(8).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 1340, 390));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 270, -1));

        jComboBox_Telefones.setBackground(new java.awt.Color(102, 0, 0));
        jComboBox_Telefones.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jComboBox_Telefones, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 270, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Telefones:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        lblIcon.setBackground(new java.awt.Color(50, 0, 1));
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Logos/014.jpg"))); // NOI18N
        getContentPane().add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myButton_SendSalesReportsWhatsAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton_SendSalesReportsWhatsAppActionPerformed
        int selectedRow = tblTabela.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma venda na tabela.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;  // Sai do método se nenhuma venda estiver selecionada

        }

        // Verifica se foi selecionado um número de telefone
        if (((String) jComboBox_Telefones.getSelectedItem()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um número de telefone.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;  // Sai do método se o número de telefone não estiver selecionado
        }

        enviarRelatoriosVendaWhatsApp();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
        System.out.println("evt Send Record WhatsApp executado com sucesso.!");
    }//GEN-LAST:event_myButton_SendSalesReportsWhatsAppActionPerformed

    private void myButton_SearchSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton_SearchSalesActionPerformed

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
        System.out.println("evt search executado com sucesso.!");
    }//GEN-LAST:event_myButton_SearchSalesActionPerformed

    private void enviarRelatoriosVendaWhatsApp() {
        String numeroCliente = "+5549999367954"; // Substitua pelo número de telefone correto
        String mensagem = "Relatório de venda"; // Substitua pela mensagem desejada
        String caminhoArquivoPDF = "E:\\Projetos java\\Umbrella_Pharmaceutical_Inc\\arquivo.pdf"; // Substitua pelo caminho do arquivo PDF desejado

        if (caminhoArquivoPDF != null) {
            try {
                // Abra o WhatsApp Web com o número do cliente e a mensagem
                String url = "https://api.whatsapp.com/send?phone=" + numeroCliente + "&text=" + URLEncoder.encode(mensagem, StandardCharsets.UTF_8);
                java.awt.Desktop.getDesktop().browse(URI.create(url));

                // Agora, você pode pedir ao usuário que anexe o arquivo manualmente, já que o WhatsApp Web não suporta anexos programaticamente.
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao enviar mensagem no WhatsApp: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um arquivo para envio.");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox_Telefones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblSendWhatsapp;
    private up_class_custom.MyButton myButton_SearchSales;
    private up_class_custom.MyButton myButton_SendSalesReportsWhatsApp;
    private javax.swing.JTable tblTabela;
    // End of variables declaration//GEN-END:variables
}
