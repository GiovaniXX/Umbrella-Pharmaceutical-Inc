package up_forms;

import javax.swing.*;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import up_classes.Dados;

public class UP_F13_Send_Report extends javax.swing.JInternalFrame {

    public Dados dados;

    public void setDados(Dados dados) {
        this.dados = dados;
    }

    public UP_F13_Send_Report() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSendWhatsapp = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblArquivo = new javax.swing.JLabel();
        txtArquivo = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnSend = new javax.swing.JButton();
        lblIcon = new javax.swing.JLabel();

        setClosable(true);
        setTitle(".:Umbrella Pharmaceutical™ Send Report");
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSendWhatsapp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSendWhatsapp.setText("Send Report to Whatsapp");
        getContentPane().add(lblSendWhatsapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 270, -1));

        lblArquivo.setForeground(new java.awt.Color(255, 255, 255));
        lblArquivo.setText("Arquivo.:");
        getContentPane().add(lblArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        txtArquivo.setBackground(new java.awt.Color(122, 0, 0));
        txtArquivo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 450, -1));

        btnSearch.setBackground(new java.awt.Color(122, 0, 0));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, -1, -1));

        btnSend.setBackground(new java.awt.Color(122, 0, 0));
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        getContentPane().add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 210, -1));

        lblIcon.setBackground(new java.awt.Color(50, 0, 1));
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Logos/014.jpg"))); // NOI18N
        lblIcon.setMaximumSize(new java.awt.Dimension(1366, 768));
        lblIcon.setMinimumSize(new java.awt.Dimension(1366, 768));
        lblIcon.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            txtArquivo.setText(selectedFile.getAbsolutePath());
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
        System.out.println("evt search executado com sucesso.!");
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        enviarArquivoPDFWhatsApp();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
        System.out.println("evt send executado com sucesso.!");
    }//GEN-LAST:event_btnSendActionPerformed

    private void enviarArquivoPDFWhatsApp() {
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
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSend;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblArquivo;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblSendWhatsapp;
    private javax.swing.JTextField txtArquivo;
    // End of variables declaration//GEN-END:variables
}
