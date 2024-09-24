package up_forms;

import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import up_classes.Opcoes;
import up_classes.Relatorio;
import up_classes.Dados;
import up_classes.Utilidades;

public class UP_F11_Relatorios_Vendas extends javax.swing.JInternalFrame {

    public Dados dados;

    public void setDados(Dados dados) {
        this.dados = dados;
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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
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
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 60, -1));

        jLabel3.setForeground(new java.awt.Color(3, 155, 216));
        jLabel3.setText("Data Inicial.:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        jLabel4.setForeground(new java.awt.Color(3, 155, 216));
        jLabel4.setText("data Final.:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, -1, -1));

        jLabel5.setForeground(new java.awt.Color(3, 155, 216));
        jLabel5.setText("Venda Inicial.:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        jLabel6.setForeground(new java.awt.Color(3, 155, 216));
        jLabel6.setText("Venda Final.:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, -1, -1));

        jLabel7.setForeground(new java.awt.Color(3, 155, 216));
        jLabel7.setText("Cliente.:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, -1));

        txtArquivo.setBackground(new java.awt.Color(122, 126, 140));
        txtArquivo.setForeground(new java.awt.Color(255, 255, 255));
        txtArquivo.setText("arquivo");
        txtArquivo.setBorder(null);
        txtArquivo.setMinimumSize(new java.awt.Dimension(71, 22));
        txtArquivo.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 510, 20));

        btnSelecao.setBackground(new java.awt.Color(112, 126, 140));
        btnSelecao.setForeground(new java.awt.Color(3, 155, 216));
        btnSelecao.setText("Seleção");
        btnSelecao.setBorder(null);
        btnSelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelecao, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 50, 60, 20));

        btnGerarRelatorio.setBackground(new java.awt.Color(255, 0, 102));
        btnGerarRelatorio.setForeground(new java.awt.Color(3, 155, 216));
        btnGerarRelatorio.setText("Gerar Relatorio");
        btnGerarRelatorio.setBorder(null);
        btnGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(btnGerarRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 430, 160, 25));

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
        getContentPane().add(RadioData, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 160, -1));

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
        getContentPane().add(RadioNumeroVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 160, -1));

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
        getContentPane().add(RadioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 160, -1));

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
        getContentPane().add(RadioTodasVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 160, -1));

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
        getContentPane().add(RadioSelecaoVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 160, -1));

        dchDataInicial.setBackground(new java.awt.Color(122, 126, 140));
        dchDataInicial.setForeground(new java.awt.Color(255, 255, 255));
        dchDataInicial.setEnabled(false);
        getContentPane().add(dchDataInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 160, -1));

        dchDataFinal.setBackground(new java.awt.Color(122, 126, 140));
        dchDataFinal.setForeground(new java.awt.Color(255, 255, 255));
        dchDataFinal.setEnabled(false);
        getContentPane().add(dchDataFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 180, -1));

        cmbVendaInicial.setBackground(new java.awt.Color(122, 126, 140));
        cmbVendaInicial.setForeground(new java.awt.Color(255, 255, 255));
        cmbVendaInicial.setEnabled(false);
        getContentPane().add(cmbVendaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 160, -1));

        cmbVendaFinal.setBackground(new java.awt.Color(122, 126, 140));
        cmbVendaFinal.setForeground(new java.awt.Color(255, 255, 255));
        cmbVendaFinal.setEnabled(false);
        getContentPane().add(cmbVendaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 180, -1));

        cmbCliente.setBackground(new java.awt.Color(122, 126, 140));
        cmbCliente.setForeground(new java.awt.Color(255, 255, 255));
        cmbCliente.setEnabled(false);
        getContentPane().add(cmbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 160, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 590, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 590, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 590, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 590, -1));

        jLabel1.setBackground(new java.awt.Color(50, 0, 1));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Logos/014.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioTodasVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioTodasVendasActionPerformed
        habilitarCampos();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_RadioTodasVendasActionPerformed

    private void RadioSelecaoVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioSelecaoVendasActionPerformed
        habilitarCampos();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_RadioSelecaoVendasActionPerformed

    private void RadioDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioDataActionPerformed
        habilitarCampos();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_RadioDataActionPerformed

    private void RadioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioClienteActionPerformed
        habilitarCampos();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_RadioClienteActionPerformed

    private void btnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioActionPerformed
        if (txtArquivo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Preencher todos os campos");
            return;
        }

        try {
            String arquivo = txtArquivo.getText() + ".pdf";

            //@formatter off
            String sql = "SELECT vendas.idvenda, vendas.cliente, CONCAT(nome, sobrenome) AS nomeFull, data, linha, produto, descricao, preco, quantidade, preco*detalhevendas.quantidade AS valor FROM vendas INNER JOIN clientes ON vendas.cliente = clientes.idcliente INNER JOIN detalhevendas ON vendas.idvenda = detalhevendas.idvenda ";
            //@formatter on

            String filtro = "";
            if (RadioTodasVendas.isSelected()) {
                filtro = "";
            } else {
                if (RadioCliente.isSelected()) {
                    if (cmbCliente.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(rootPane, "Selecione um cliente");
                        cmbCliente.requestFocusInWindow();
                        return;
                    }
                    filtro = "WHERE vendas.cliente ='" + ((Opcoes) cmbCliente.getSelectedItem()).getPreco() + "'";
                }
                if (RadioNumeroVenda.isSelected()) {
                    if (cmbVendaInicial.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(rootPane, "Selecione a venda inicial");
                        cmbVendaFinal.requestFocusInWindow();
                        return;
                    }
                    if (RadioNumeroVenda.isSelected()) {
                        if (cmbVendaFinal.getSelectedIndex() == 0) {
                            JOptionPane.showMessageDialog(rootPane, "Selecione a venda final");
                            cmbVendaFinal.requestFocusInWindow();
                            return;
                        }
                        //@formatter off
                        filtro = "WHERE vendas.idvenda >= " + ((Opcoes) cmbVendaInicial.getSelectedItem()).getPreco() + " AND vendas.idvenda <= " + ((Opcoes) cmbVendaFinal.getSelectedItem()).getPreco();
                        //@formatter on
                    }
                    if (RadioData.isSelected()) {
                        if (dchDataInicial.getDate() == null) {
                            JOptionPane.showMessageDialog(rootPane, "Selecione a data inicial");
                            dchDataFinal.requestFocusInWindow();
                            return;
                        }
                        if (dchDataFinal.getDate() == null) {
                            if (cmbVendaFinal.getSelectedIndex() == 0) {
                                JOptionPane.showMessageDialog(rootPane, "Selecione a data final");
                                dchDataInicial.requestFocusInWindow();
                                return;
                            }
                            //@formatter off
                            filtro = "WHERE data >= '" + Utilidades.formatDate(dchDataInicial.getDate()) + "' AND data <= '" + Utilidades.formatDate(dchDataFinal.getDate()) + "'";
                            //@formatter on
                        }
                    }
                }
                sql = sql + filtro;
                Relatorio.relatorioVenda(arquivo, dados.getConsulta(sql));
                JOptionPane.showMessageDialog(rootPane, "Relatório gerado com sucesso!");
            }

        } catch (HeadlessException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnGerarRelatorioActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
//        try {
//            Opcoes opc = new Opcoes("Developer: GvC", "Selecione um cliente");
//            cmbCliente.addItem(opc);
//            //cmbClienteFinal.addItem(opc);
//            ResultSet rsCli = dados.getClientes();
//
//            while (rsCli.next()) {
//                String idCliente = rsCli.getString("idcliente");
//                String nomeCompleto = rsCli.getString("nome") + " " + rsCli.getString("sobreNome");
//                opc = new Opcoes(idCliente, nomeCompleto);
//                cmbCliente.addItem(opc);
//                //cmbClienteFinal.addItem(opc);
//            }
//
//            opc = new Opcoes("Developer: GvC", "Selecione uma venda");
//            cmbVendaInicial.addItem(opc);
//            cmbVendaFinal.addItem(opc);
//            ResultSet rsFat = dados.getVenda();
//
//            while (rsFat.next()) {
//                String idVenda = rsFat.getString("idvenda");
//                opc = new Opcoes(idVenda, idVenda);
//                cmbVendaInicial.addItem(opc);
//                cmbVendaFinal.addItem(opc);
//            }
//        } catch (SQLException e) {
//            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
//        }

        preencherComboClientes();
        preencherComboProdutos();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnSelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecaoActionPerformed
        UP_F12_Selecao_Arquivo ufsa = new UP_F12_Selecao_Arquivo(null, closable);
        ufsa.setVisible(true);

        String arquivo = ufsa.getArquivo();
        if (!arquivo.equals("")) {
            txtArquivo.setText(arquivo);
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnSelecaoActionPerformed

    private void RadioNumeroVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioNumeroVendaActionPerformed
        habilitarCampos();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_RadioNumeroVendaActionPerformed


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
    private javax.swing.JComboBox<Opcoes> cmbVendaFinal;
    private javax.swing.JComboBox<Opcoes> cmbVendaInicial;
    private com.toedter.calendar.JDateChooser dchDataFinal;
    private com.toedter.calendar.JDateChooser dchDataInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtArquivo;
    // End of variables declaration//GEN-END:variables

    private void habilitarCampos() {
        if (RadioTodasVendas.isSelected()) {
            RadioData.setEnabled(false);
            RadioNumeroVenda.setEnabled(false);
            RadioCliente.setEnabled(false);

            dchDataInicial.setEnabled(false);
            dchDataFinal.setEnabled(false);

            cmbVendaInicial.setEnabled(false);
            cmbVendaFinal.setEnabled(false);
            cmbCliente.setEnabled(false);
            //cmbClienteFinal.setEnabled(false);
        } else {
            RadioData.setEnabled(true);
            RadioNumeroVenda.setEnabled(true);
            RadioCliente.setEnabled(true);

            if (RadioData.isSelected()) {
                dchDataInicial.setEnabled(true);
                dchDataFinal.setEnabled(true);

                cmbVendaInicial.setEnabled(false);
                cmbVendaFinal.setEnabled(false);
                cmbCliente.setEnabled(false);
                //cmbClienteFinal.setEnabled(false);
            }

            if (RadioNumeroVenda.isSelected()) {
                dchDataInicial.setEnabled(false);
                dchDataFinal.setEnabled(false);

                cmbVendaInicial.setEnabled(true);
                cmbVendaFinal.setEnabled(true);
                cmbCliente.setEnabled(false);
                //cmbClienteFinal.setEnabled(false);
            }

            if (RadioCliente.isSelected()) {
                dchDataInicial.setEnabled(false);
                dchDataFinal.setEnabled(false);

                cmbVendaInicial.setEnabled(false);
                cmbVendaFinal.setEnabled(false);
                cmbCliente.setEnabled(true);
                //cmbClienteFinal.setEnabled(true);
            }
        }
    }

    // Método para preencher o ComboBox de Clientes
    private void preencherComboClientes() {
        Dados dados = new Dados();  // Instancia a classe Dados para usar a conexão
        ResultSet rsClientes = null;

        try {
            rsClientes = dados.getClientes(); // Pega os registros de clientes

            // Limpa os itens existentes no ComboBox
            cmbCliente.removeAllItems();

            // Adiciona os clientes ao ComboBox
            while (rsClientes != null && rsClientes.next()) {
                String cliente = rsClientes.getString("nome"); // Supondo que a coluna no banco é "nome"
                cmbCliente.addItem(cliente); // Adiciona o nome do cliente ao ComboBox
            }
        } catch (SQLException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Erro ao preencher ComboBox de clientes", ex);
        } finally {
            try {
                if (rsClientes != null) {
                    rsClientes.close();
                }
                dados.close(); // Fecha a conexão ao terminar
            } catch (SQLException e) {
                Logger.getLogger(getClass().getName()).log(Level.WARNING, "Erro ao fechar ResultSet ou conexão", e);
            }
        }
    }

    // Método para preencher o ComboBox de Produtos
    private void preencherComboProdutos() {
        Dados dados = new Dados();  // Instancia a classe Dados para usar a conexão
        ResultSet rsProdutos = null;

        try {
            rsProdutos = dados.getProdutos(); // Pega os registros de produtos

            // Limpa os itens existentes no ComboBox
            //cmbProduto.removeAllItems();
            // Adiciona os produtos ao ComboBox
            while (rsProdutos != null && rsProdutos.next()) {
                String produto = rsProdutos.getString("produto"); // Supondo que a coluna no banco é "produto"
                //cmbProduto.addItem(produto); // Adiciona o nome do produto ao ComboBox
            }
        } catch (SQLException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Erro ao preencher ComboBox de produtos", ex);
        } finally {
            try {
                if (rsProdutos != null) {
                    rsProdutos.close();
                }
                dados.close(); // Fecha a conexão ao terminar
            } catch (SQLException e) {
                Logger.getLogger(getClass().getName()).log(Level.WARNING, "Erro ao fechar ResultSet ou conexão", e);
            }
        }
    }
}
/**
 * 01000111 01101001 01101111 01110110 01100001 01101110 01101110 01101001
 */
