
package up_forms;

import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import up_classes.DadosDB;
import up_classes.Opcoes;
import up_classes.Relatorio;
import up_classes.Utilidades;

public class UP_F11_Relatorios_Vendas extends javax.swing.JInternalFrame {
    private DadosDB dadosDB;
         
    public void setDadosDB(DadosDB dadosDB) {
        this.dadosDB = dadosDB;
    }
    
    public UP_F11_Relatorios_Vendas() {
        initComponents();
        
        bgTipo.add(RadioTodasVendas);
        bgTipo.add(RadioSelecaoVendas);
        
        bgFiltro.add(RadioData);
        bgFiltro.add(RadioNumeroVenda);
        bgFiltro.add(RadioCliente);       
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgFiltro = new javax.swing.ButtonGroup();
        bgTipo = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtArquivo = new javax.swing.JTextField();
        btnSelecao = new javax.swing.JButton();
        btnGerarRelatorio = new javax.swing.JButton();
        RadioData = new javax.swing.JRadioButton();
        RadioNumeroVenda = new javax.swing.JRadioButton();
        RadioCliente = new javax.swing.JRadioButton();
        RadioTodasVendas = new javax.swing.JRadioButton();
        RadioSelecaoVendas = new javax.swing.JRadioButton();
        dchDataInicial = new com.toedter.calendar.JDateChooser();
        dchDataFinal = new com.toedter.calendar.JDateChooser();
        cmbVendaInicial = new javax.swing.JComboBox<>();
        cmbVendaFinal = new javax.swing.JComboBox<>();
        cmbCliente = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle(".:Umbrella Pharmaceutical™ Relatorios de Venda");
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(3, 155, 216));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Arquivo.:");
        jLabel2.setMaximumSize(new java.awt.Dimension(44, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(44, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(44, 20));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 60, -1));

        jLabel3.setForeground(new java.awt.Color(3, 155, 216));
        jLabel3.setText("Data Inicial.:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        jLabel4.setForeground(new java.awt.Color(3, 155, 216));
        jLabel4.setText("data Final.:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, -1));

        jLabel5.setForeground(new java.awt.Color(3, 155, 216));
        jLabel5.setText("Venda Inicial.:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, -1, -1));

        jLabel6.setForeground(new java.awt.Color(3, 155, 216));
        jLabel6.setText("Venda Final.:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        jLabel7.setForeground(new java.awt.Color(3, 155, 216));
        jLabel7.setText("Cliente.:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, -1, -1));

        txtArquivo.setBackground(new java.awt.Color(122, 126, 140));
        txtArquivo.setForeground(new java.awt.Color(255, 255, 255));
        txtArquivo.setBorder(null);
        txtArquivo.setMinimumSize(new java.awt.Dimension(71, 22));
        txtArquivo.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 590, 20));

        btnSelecao.setBackground(new java.awt.Color(0, 0, 0));
        btnSelecao.setForeground(new java.awt.Color(3, 155, 216));
        btnSelecao.setText("...");
        btnSelecao.setBorder(null);
        btnSelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelecao, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 180, 60, 20));

        btnGerarRelatorio.setBackground(new java.awt.Color(0, 0, 0));
        btnGerarRelatorio.setForeground(new java.awt.Color(3, 155, 216));
        btnGerarRelatorio.setText("Gerar Relatorio");
        btnGerarRelatorio.setBorder(null);
        btnGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(btnGerarRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, 160, 25));

        RadioData.setBackground(new java.awt.Color(122, 126, 140));
        RadioData.setForeground(new java.awt.Color(3, 155, 216));
        RadioData.setSelected(true);
        RadioData.setText("Data venda");
        RadioData.setBorder(null);
        RadioData.setEnabled(false);
        RadioData.setMaximumSize(new java.awt.Dimension(124, 23));
        RadioData.setMinimumSize(new java.awt.Dimension(124, 23));
        RadioData.setPreferredSize(new java.awt.Dimension(124, 23));
        RadioData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioDataActionPerformed(evt);
            }
        });
        getContentPane().add(RadioData, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        RadioNumeroVenda.setBackground(new java.awt.Color(122, 126, 140));
        RadioNumeroVenda.setForeground(new java.awt.Color(3, 155, 216));
        RadioNumeroVenda.setText("Número Venda");
        RadioNumeroVenda.setBorder(null);
        RadioNumeroVenda.setEnabled(false);
        RadioNumeroVenda.setMaximumSize(new java.awt.Dimension(124, 23));
        RadioNumeroVenda.setMinimumSize(new java.awt.Dimension(124, 23));
        RadioNumeroVenda.setPreferredSize(new java.awt.Dimension(124, 23));
        RadioNumeroVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioNumeroVendaActionPerformed(evt);
            }
        });
        getContentPane().add(RadioNumeroVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        RadioCliente.setBackground(new java.awt.Color(122, 126, 140));
        RadioCliente.setForeground(new java.awt.Color(3, 155, 216));
        RadioCliente.setText("Cliente");
        RadioCliente.setBorder(null);
        RadioCliente.setEnabled(false);
        RadioCliente.setMaximumSize(new java.awt.Dimension(124, 23));
        RadioCliente.setMinimumSize(new java.awt.Dimension(124, 23));
        RadioCliente.setPreferredSize(new java.awt.Dimension(124, 23));
        RadioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioClienteActionPerformed(evt);
            }
        });
        getContentPane().add(RadioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, -1));

        RadioTodasVendas.setBackground(new java.awt.Color(122, 126, 140));
        RadioTodasVendas.setForeground(new java.awt.Color(3, 155, 216));
        RadioTodasVendas.setSelected(true);
        RadioTodasVendas.setText("Todas as Vendas");
        RadioTodasVendas.setBorder(null);
        RadioTodasVendas.setMaximumSize(new java.awt.Dimension(124, 23));
        RadioTodasVendas.setMinimumSize(new java.awt.Dimension(124, 23));
        RadioTodasVendas.setPreferredSize(new java.awt.Dimension(124, 23));
        RadioTodasVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioTodasVendasActionPerformed(evt);
            }
        });
        getContentPane().add(RadioTodasVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, -1, -1));

        RadioSelecaoVendas.setBackground(new java.awt.Color(122, 126, 140));
        RadioSelecaoVendas.setForeground(new java.awt.Color(3, 155, 216));
        RadioSelecaoVendas.setText("Seleção das vendas");
        RadioSelecaoVendas.setBorder(null);
        RadioSelecaoVendas.setMaximumSize(new java.awt.Dimension(124, 23));
        RadioSelecaoVendas.setMinimumSize(new java.awt.Dimension(124, 23));
        RadioSelecaoVendas.setPreferredSize(new java.awt.Dimension(124, 23));
        RadioSelecaoVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioSelecaoVendasActionPerformed(evt);
            }
        });
        getContentPane().add(RadioSelecaoVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 220, 160, -1));

        dchDataInicial.setBackground(new java.awt.Color(122, 126, 140));
        dchDataInicial.setForeground(new java.awt.Color(255, 255, 255));
        dchDataInicial.setEnabled(false);
        getContentPane().add(dchDataInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 150, -1));

        dchDataFinal.setBackground(new java.awt.Color(122, 126, 140));
        dchDataFinal.setForeground(new java.awt.Color(255, 255, 255));
        dchDataFinal.setEnabled(false);
        getContentPane().add(dchDataFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 150, -1));

        cmbVendaInicial.setBackground(new java.awt.Color(122, 126, 140));
        cmbVendaInicial.setForeground(new java.awt.Color(255, 255, 255));
        cmbVendaInicial.setEnabled(false);
        getContentPane().add(cmbVendaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 180, -1));

        cmbVendaFinal.setBackground(new java.awt.Color(122, 126, 140));
        cmbVendaFinal.setForeground(new java.awt.Color(255, 255, 255));
        cmbVendaFinal.setEnabled(false);
        getContentPane().add(cmbVendaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 180, -1));

        cmbCliente.setBackground(new java.awt.Color(122, 126, 140));
        cmbCliente.setForeground(new java.awt.Color(255, 255, 255));
        cmbCliente.setEnabled(false);
        getContentPane().add(cmbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, 160, -1));

        jLabel1.setBackground(new java.awt.Color(50, 0, 1));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Logos/014.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioTodasVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioTodasVendasActionPerformed
        HabilitarCampos();
    }//GEN-LAST:event_RadioTodasVendasActionPerformed
    private void HabilitarCampos() {
        if (RadioTodasVendas.isSelected()) {
            RadioData.setEnabled(false);
            RadioNumeroVenda.setEnabled(false);
            RadioCliente.setEnabled(false);
            dchDataInicial.setEnabled(false);
            dchDataFinal.setEnabled(false);
            cmbCliente.setEnabled(false);           
            cmbVendaInicial.setEnabled(false);
            cmbVendaFinal.setEnabled(false);           
        } else {
            RadioData.setEnabled(true);
            RadioNumeroVenda.setEnabled(true);
            RadioCliente.setEnabled(true);
            
            if (RadioData.isSelected()) {              
                dchDataInicial.setEnabled(true);
                dchDataFinal.setEnabled(true);
                cmbCliente.setEnabled(false);               
                cmbVendaInicial.setEnabled(false);
                cmbVendaFinal.setEnabled(false);
            }
            
            if (RadioNumeroVenda.isSelected()) {              
                dchDataInicial.setEnabled(false);
                dchDataFinal.setEnabled(false);
                cmbCliente.setEnabled(false);                
                cmbVendaInicial.setEnabled(true);
                cmbVendaFinal.setEnabled(true);
            }
            
            if (RadioCliente.isSelected()) {              
                dchDataInicial.setEnabled(false);
                dchDataFinal.setEnabled(false);
                cmbCliente.setEnabled(true);               
                cmbVendaInicial.setEnabled(false);
                cmbVendaFinal.setEnabled(false);
            }
        }
    }
    
    private void RadioSelecaoVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioSelecaoVendasActionPerformed
        HabilitarCampos();
    }//GEN-LAST:event_RadioSelecaoVendasActionPerformed

    private void RadioDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioDataActionPerformed
        HabilitarCampos();
    }//GEN-LAST:event_RadioDataActionPerformed

    private void RadioNumeroVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioNumeroVendaActionPerformed
        HabilitarCampos();
    }//GEN-LAST:event_RadioNumeroVendaActionPerformed

    private void RadioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioClienteActionPerformed
        HabilitarCampos();
    }//GEN-LAST:event_RadioClienteActionPerformed

    private void btnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioActionPerformed
        if (txtArquivo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            return;
        }
        try {
            //@formatter off
            String arquivo = txtArquivo.getText() + ".pdf";
            String sql = "SELECT vendas.idVenda, vendas.idCliente, CONCAT(nome,snome) AS nomeFull,data, idLinha, idProduto, descricao, preco, quantidade, preco*quantidade AS valor FROM vendas INNER JOIN clientes ON vendas.idCliente = clientes.idCliente INNER JOIN detalhevenda ON vendas.idVenda = detalhevenda.idVenda ";
            //@formatter on

            String filtro = "";
            if (RadioTodasVendas.isSelected()) {
                filtro = "";
            } else {
                if (RadioCliente.isSelected()) {
                    if (cmbCliente.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(null, "Selecione um cliente!");
                        cmbCliente.requestFocusInWindow();
                        return;
                    }
                    filtro = "WHERE vendas.idCliente ='" + ((Opcoes) cmbCliente.getSelectedItem()).getValor() + "'";
                }

                if (RadioNumeroVenda.isSelected()) {
                    if (cmbVendaInicial.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(null, "Selecione uma venda inicial!");
                        cmbVendaFinal.requestFocusInWindow();
                        return;
                    }

                    if (cmbVendaFinal.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(null, "Selecione uma venda final!");
                        cmbVendaFinal.requestFocusInWindow();
                        return;                      
                    }
                                        
                    filtro = "WHERE vendas.idVenda >= "
                            + ((Opcoes) cmbVendaInicial.getSelectedItem()).getValor()
                            + " and vendas.idVenda <= "
                            + ((Opcoes) cmbVendaFinal.getSelectedItem()).getValor();                       
                }
                
                if (RadioData.isSelected()) {
                    if (dchDataInicial.getDate() == null) {
                        JOptionPane.showMessageDialog(null, "Selecione uma data inicial!");
                        dchDataInicial.requestFocusInWindow();
                        return;
                    }

                    if (dchDataFinal.getDate() == null) {
                        JOptionPane.showMessageDialog(null, "Selecione uma venda final!");
                        dchDataFinal.requestFocusInWindow();
                        return;                      
                    }
                                        
                    filtro = "WHERE data >= '"
                            + Utilidades.formatDate(dchDataInicial.getDate())
                            + "' and data <= '"
                            + Utilidades.formatDate(dchDataFinal.getDate()) + "'";                     
                }
            }
            sql = sql + filtro;
            Relatorio.relatorioVenda(arquivo, dadosDB.getConsulta(sql));

            JOptionPane.showMessageDialog(null, "Relatório gerado com sucesso!");
        } catch (HeadlessException ex) {
            Logger.getLogger(UP_F11_Relatorios_Vendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGerarRelatorioActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            Opcoes opc = new Opcoes("abc", "Selecione um cliente!");
            cmbCliente.addItem(opc.toString());
            ResultSet rsCli = dadosDB.getClientes();

            while (rsCli.next()) {

                opc = new Opcoes(
                        rsCli.getString("idClientes"),
                        rsCli.getString("nome") + ""
                        + rsCli.getString("snome"));
                cmbCliente.addItem(opc.toString());
            }

            opc = new Opcoes("abc", "Selecione uma venda");
            cmbVendaInicial.addItem(opc.toString());
            cmbVendaFinal.addItem(opc.toString());
            ResultSet rsVenda = dadosDB.getVendas();

            while (rsVenda.next()) {

                opc = new Opcoes(
                        rsVenda.getString("idVenda"),
                        rsVenda.getString("idVenda"));
                cmbVendaInicial.addItem(opc.toString());
                cmbVendaFinal.addItem(opc.toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(UP_F08_Vendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnSelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecaoActionPerformed
        UP_F12_Selecao_Arquivo ufsa = new UP_F12_Selecao_Arquivo(null, closable);
        ufsa.setVisible(true);
        
        String arquivo = ufsa.getArquivo();
        if (!arquivo.equals("")) {
            txtArquivo.setText(arquivo);           
        }
    }//GEN-LAST:event_btnSelecaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioCliente;
    private javax.swing.JRadioButton RadioData;
    private javax.swing.JRadioButton RadioNumeroVenda;
    private javax.swing.JRadioButton RadioSelecaoVendas;
    private javax.swing.JRadioButton RadioTodasVendas;
    private javax.swing.ButtonGroup bgFiltro;
    private javax.swing.ButtonGroup bgTipo;
    private javax.swing.JButton btnGerarRelatorio;
    private javax.swing.JButton btnSelecao;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbVendaFinal;
    private javax.swing.JComboBox<String> cmbVendaInicial;
    private com.toedter.calendar.JDateChooser dchDataFinal;
    private com.toedter.calendar.JDateChooser dchDataInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtArquivo;
    // End of variables declaration//GEN-END:variables

    /*private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/up_images/Icons/Icon.jpg")));
    }*/
}
