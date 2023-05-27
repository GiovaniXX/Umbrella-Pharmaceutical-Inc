package up_forms;

import up_classes.DadosDB;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import up_classes.Opcoes;
import up_classes.Utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import up_classes.Produto;

public class UP_F08_Vendas extends javax.swing.JInternalFrame {

    private final DefaultTableModel mTabela;

    public DadosDB dadosDB = new DadosDB();

    //public DadosDB dadosDB;
    public void setDadosDB(DadosDB dadosDB) {
        this.dadosDB = dadosDB;
    }

    public UP_F08_Vendas() {
        initComponents();
        DadosDB dadosDB = new DadosDB();
        mTabela = new DefaultTableModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtTotalQuantidade = new javax.swing.JTextField();
        txtTotalValor = new javax.swing.JTextField();
        cmbCliente = new javax.swing.JComboBox<>();
        cmbProduto = new javax.swing.JComboBox<>();
        btnAdicionar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnDelTodos = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnPesqCliente = new javax.swing.JButton();
        btnPesqProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalhes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setTitle(".:Umbrella Pharmaceutical Inc™ Vendas");
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
        jLabel2.setText("Data.:");
        jLabel2.setMaximumSize(new java.awt.Dimension(61, 15));
        jLabel2.setMinimumSize(new java.awt.Dimension(61, 15));
        jLabel2.setPreferredSize(new java.awt.Dimension(61, 15));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        jLabel3.setForeground(new java.awt.Color(3, 155, 216));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cliente.:");
        jLabel3.setMaximumSize(new java.awt.Dimension(61, 15));
        jLabel3.setMinimumSize(new java.awt.Dimension(61, 15));
        jLabel3.setPreferredSize(new java.awt.Dimension(61, 15));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        jLabel4.setForeground(new java.awt.Color(3, 155, 216));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Produto.:");
        jLabel4.setMaximumSize(new java.awt.Dimension(61, 15));
        jLabel4.setMinimumSize(new java.awt.Dimension(61, 15));
        jLabel4.setPreferredSize(new java.awt.Dimension(61, 15));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        jLabel5.setForeground(new java.awt.Color(3, 155, 216));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Quantidade.:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total.:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 632, -1, -1));

        txtData.setBackground(new java.awt.Color(0, 0, 0));
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setBorder(null);
        txtData.setEnabled(false);
        txtData.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 100, -1));

        txtQuantidade.setBackground(new java.awt.Color(0, 0, 0));
        txtQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        txtQuantidade.setBorder(null);
        txtQuantidade.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 100, -1));

        txtTotalQuantidade.setBackground(new java.awt.Color(0, 0, 0));
        txtTotalQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalQuantidade.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalQuantidade.setBorder(null);
        txtTotalQuantidade.setEnabled(false);
        txtTotalQuantidade.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtTotalQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, 110, -1));

        txtTotalValor.setBackground(new java.awt.Color(0, 0, 0));
        txtTotalValor.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalValor.setBorder(null);
        txtTotalValor.setEnabled(false);
        txtTotalValor.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtTotalValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 110, -1));

        cmbCliente.setBackground(new java.awt.Color(122, 126, 140));
        cmbCliente.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cmbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 250, -1));

        cmbProduto.setBackground(new java.awt.Color(122, 126, 140));
        cmbProduto.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cmbProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 250, -1));

        btnAdicionar.setBackground(new java.awt.Color(0, 0, 0));
        btnAdicionar.setForeground(new java.awt.Color(3, 155, 216));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.setBorder(null);
        btnAdicionar.setMaximumSize(new java.awt.Dimension(101, 25));
        btnAdicionar.setMinimumSize(new java.awt.Dimension(101, 25));
        btnAdicionar.setPreferredSize(new java.awt.Dimension(101, 25));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        btnDeletar.setBackground(new java.awt.Color(0, 0, 0));
        btnDeletar.setForeground(new java.awt.Color(3, 155, 216));
        btnDeletar.setText("Deletar");
        btnDeletar.setBorder(null);
        btnDeletar.setMaximumSize(new java.awt.Dimension(101, 25));
        btnDeletar.setMinimumSize(new java.awt.Dimension(101, 25));
        btnDeletar.setPreferredSize(new java.awt.Dimension(101, 25));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, -1));

        btnDelTodos.setBackground(new java.awt.Color(0, 0, 0));
        btnDelTodos.setForeground(new java.awt.Color(3, 155, 216));
        btnDelTodos.setText("Deletar Todos");
        btnDelTodos.setBorder(null);
        btnDelTodos.setMaximumSize(new java.awt.Dimension(101, 25));
        btnDelTodos.setMinimumSize(new java.awt.Dimension(101, 25));
        btnDelTodos.setPreferredSize(new java.awt.Dimension(101, 25));
        btnDelTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelTodosActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, -1, -1));

        btnSalvar.setBackground(new java.awt.Color(0, 0, 0));
        btnSalvar.setForeground(new java.awt.Color(3, 155, 216));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(null);
        btnSalvar.setMaximumSize(new java.awt.Dimension(101, 25));
        btnSalvar.setMinimumSize(new java.awt.Dimension(101, 25));
        btnSalvar.setPreferredSize(new java.awt.Dimension(101, 25));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, -1, -1));

        btnPesqCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnPesqCliente.setForeground(new java.awt.Color(3, 155, 216));
        btnPesqCliente.setText("Pesquisar Cliente");
        btnPesqCliente.setBorder(null);
        btnPesqCliente.setMaximumSize(new java.awt.Dimension(122, 25));
        btnPesqCliente.setMinimumSize(new java.awt.Dimension(122, 25));
        btnPesqCliente.setPreferredSize(new java.awt.Dimension(122, 25));
        btnPesqCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesqCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, -1, -1));

        btnPesqProduto.setBackground(new java.awt.Color(0, 0, 0));
        btnPesqProduto.setForeground(new java.awt.Color(3, 155, 216));
        btnPesqProduto.setText("Pesquisar Produto");
        btnPesqProduto.setBorder(null);
        btnPesqProduto.setMaximumSize(new java.awt.Dimension(122, 25));
        btnPesqProduto.setMinimumSize(new java.awt.Dimension(122, 25));
        btnPesqProduto.setPreferredSize(new java.awt.Dimension(122, 25));
        btnPesqProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesqProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, -1, -1));

        tblDetalhes.setBackground(new java.awt.Color(0, 0, 0));
        tblDetalhes.setForeground(new java.awt.Color(3, 155, 216));
        tblDetalhes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Produto", "Descrição", "Preço", "Quantidade", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDetalhes.setGridColor(new java.awt.Color(0, 0, 0));
        tblDetalhes.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tblDetalhes.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblDetalhes);
        if (tblDetalhes.getColumnModel().getColumnCount() > 0) {
            tblDetalhes.getColumnModel().getColumn(0).setMinWidth(100);
            tblDetalhes.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblDetalhes.getColumnModel().getColumn(0).setMaxWidth(100);
            tblDetalhes.getColumnModel().getColumn(2).setMinWidth(100);
            tblDetalhes.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblDetalhes.getColumnModel().getColumn(2).setMaxWidth(100);
            tblDetalhes.getColumnModel().getColumn(3).setMinWidth(100);
            tblDetalhes.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblDetalhes.getColumnModel().getColumn(3).setMaxWidth(100);
            tblDetalhes.getColumnModel().getColumn(4).setMinWidth(100);
            tblDetalhes.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblDetalhes.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 1350, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Logos/014.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            Opcoes opc = new Opcoes("abc", "Selecione um cliente");
            cmbCliente.addItem(opc.toString());
            ResultSet rsCli = dadosDB.getClientes();

            while (rsCli.next()) {

                opc = new Opcoes(
                        rsCli.getString("IdClientes"),
                        rsCli.getString("nome") + ""
                        + rsCli.getString("snome"));
                cmbCliente.addItem(opc.toString());
            }

            Opcoes opcc = new Opcoes("abc", "Selecione um produto");
            cmbProduto.addItem(opcc.toString());
            ResultSet rsPro = dadosDB.getProdutos();

            while (rsPro.next()) {

                opcc = new Opcoes(
                        rsPro.getString("idProduto"),
                        rsPro.getString("descricao"));
                cmbProduto.addItem(opcc.toString());
            }

            txtData.setText(Utilidades.formatDate(new Date()));
            txtTotalQuantidade.setText("0");
            txtTotalValor.setText("0");

            preencherTabela();
        } catch (SQLException ex) {
            Logger.getLogger(UP_F08_Vendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        if (cmbProduto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um produto!");
            cmbProduto.requestFocusInWindow();
            return;
        }

        String quantidadeText = txtQuantidade.getText();
        if (quantidadeText.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Entre com uma quantidade!");
            txtQuantidade.requestFocusInWindow();
            return;
        }

        if (!Utilidades.isNumeric(quantidadeText)) {
            JOptionPane.showMessageDialog(rootPane, "Entre somente com números!");
            txtQuantidade.setText("");
            txtQuantidade.requestFocusInWindow();
            return;
        }

        int quantidade = Integer.parseInt(quantidadeText);
        if (quantidade <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Entre somente com números acima de zero!");
            txtQuantidade.setText("");
            txtQuantidade.requestFocusInWindow();
            return;
        }

        Opcoes opcoesSelecionadas = (Opcoes) cmbProduto.getSelectedItem();
        String valorSelecionado = opcoesSelecionadas.getValor();

        //Produto mProduto = dadosDB.getProduto(((Opcoes) cmbProduto.getSelectedItem()).getValor());
        Produto mProduto = dadosDB.getProduto(valorSelecionado);
        String idProduto = String.valueOf(mProduto.getIdProduto());
        String descricao = mProduto.getDescricao();
        String preco = String.valueOf(mProduto.getPreco());
        String quantidadeString = String.valueOf(quantidade);
        String valorTotal = String.valueOf(quantidade * mProduto.getPreco());

        String[] registro = {idProduto, descricao, preco, quantidadeString, valorTotal};

        mTabela.addRow(registro);
        cmbProduto.setSelectedIndex(0);
        txtQuantidade.setText("");
        cmbProduto.requestFocusInWindow();

        tblDetalhes.setModel(mTabela);
        preencherTabela();
        totalGeral();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (cmbCliente.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um cliente!");
            cmbCliente.requestFocusInWindow();
            return;
        }

        int totalQtde = Utilidades.objectToInt(txtTotalQuantidade.getText());
        if (totalQtde == 0) {
            JOptionPane.showMessageDialog(rootPane, "Insira dados para uma venda!");
            cmbProduto.requestFocusInWindow();
            return;
        }

        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja efetuar esta venda?");
        if (resposta != 0) {
            return;
        }

        int numVenda = dadosDB.getNumeroVenda();
        dadosDB.adicionarVendas(numVenda, ((Opcoes) cmbCliente.getSelectedItem()).getValor(), new Date());

        int num = tblDetalhes.getRowCount();
        for (int i = 0; i < num; i++) {
            dadosDB.adicionarDetalheVendas(numVenda, i,
                    Utilidades.objectToString(tblDetalhes.getValueAt(i, 0)),
                    Utilidades.objectToString(tblDetalhes.getValueAt(i, 1)),
                    Utilidades.objectToInt(tblDetalhes.getValueAt(i, 2)),
                    Utilidades.objectToInt(tblDetalhes.getValueAt(i, 3)));
        }

        JOptionPane.showMessageDialog(rootPane, "Venda:" + numVenda + "Venda realizada com sucesso");
        cmbCliente.setSelectedIndex(0);
        limparTabela();
        totalGeral();
        cmbCliente.requestFocusInWindow();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDelTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelTodosActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja deletar todas as vendas?");
        if (resposta != 0) {
            return;
        }
        limparTabela();
        totalGeral();
    }//GEN-LAST:event_btnDelTodosActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (cmbProduto.getSelectedIndex() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Deseja deletar esta venda?");
            cmbProduto.requestFocusInWindow();
            return;
        }

        try {
            DefaultTableModel modelo = (DefaultTableModel) tblDetalhes.getModel();
            int Linha = tblDetalhes.getRowCount();
            for (int i = 0; Linha > i; i++) {
                String idTabela = Utilidades.objectToString(tblDetalhes.getValueAt(i, 0));
                String idCombo = ((Opcoes) cmbProduto.getSelectedItem()).getValor();

                if (idTabela.equals(idCombo)) {
                    modelo.removeRow(i);
                    return;
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnPesqClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqClienteActionPerformed
        UP_F09_Pesquisar_Cliente ufpc = new UP_F09_Pesquisar_Cliente(null, closable);
        ufpc.setDadosDB(dadosDB);
        ufpc.setVisible(true);

        String rta = ufpc.getResposta();
        if (rta.equals("")) {
            return;
        }
        for (int i = 0; i < cmbCliente.getItemCount(); i++) {
            Opcoes selectedOption = new Opcoes(rta, rta);
            cmbCliente.setSelectedItem(selectedOption);

            return;
        }
    }//GEN-LAST:event_btnPesqClienteActionPerformed

    private void btnPesqProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqProdutoActionPerformed
        UP_F10_Pesquisar_Produtos ufpp = new UP_F10_Pesquisar_Produtos(null, closable);
        ufpp.setDadosDB(dadosDB);
        ufpp.setVisible(true);

        String rta = ufpp.getResposta();
        if (rta.equals("")) {
            return;
        }
        for (int i = 0; i < cmbProduto.getItemCount(); i++) {
            Opcoes selectedOption = new Opcoes(rta, rta);
            cmbProduto.setSelectedItem(selectedOption);

            return;
        }
    }//GEN-LAST:event_btnPesqProdutoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new UP_F08_Vendas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnDelTodos;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnPesqCliente;
    private javax.swing.JButton btnPesqProduto;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDetalhes;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTotalQuantidade;
    private javax.swing.JTextField txtTotalValor;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        String titulos[] = {"ID Produto", "Descricao", "Preço", "Quantidade", "Valor"};
        String registro[] = new String[5];
        mTabela.addRow(registro);
        mTabela.setColumnIdentifiers(titulos);

        tblDetalhes.setModel(mTabela);

        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
        tblDetalhes.getColumnModel().getColumn(0).setCellRenderer(dtcr);
        tblDetalhes.getColumnModel().getColumn(1).setCellRenderer(dtcr);
        tblDetalhes.getColumnModel().getColumn(2).setCellRenderer(dtcr);
        tblDetalhes.getColumnModel().getColumn(3).setCellRenderer(dtcr);
        tblDetalhes.getColumnModel().getColumn(4).setCellRenderer(dtcr);
    }

    private void totalGeral() {
        int num = tblDetalhes.getRowCount();
        int somaQtde = 0;
        int somaValor = 0;

        for (int i = 0; i < num; i++) {
            somaQtde += Utilidades.objectToInt(tblDetalhes.getValueAt(i, 3));
            somaValor += Utilidades.objectToInt(tblDetalhes.getValueAt(i, 4));
        }
        txtTotalQuantidade.setText("" + somaQtde);
        txtTotalValor.setText("" + somaValor);
    }

    public void limparTabela() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tblDetalhes.getModel();
            int Linha = tblDetalhes.getRowCount();
            for (int i = 0; Linha > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
        }
    }
}
