package up_forms;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import up_classes.Produto;
import up_classes.Utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import up_classes.Dados;

public class UP_F03_Produtos extends javax.swing.JInternalFrame {

    private Dados dados;
    public int produtoAtual = 0;
    private boolean novo = false;
    private DefaultTableModel mTabela;

    private String id;
    private String descricao;
    private String preco;
    private String imposto;
    private String anotacao;

    public void setDados(Dados dados) {
        this.dados = dados;
    }

    public UP_F03_Produtos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdproduto = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        cmbImposto = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaAnotacao = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle(".:Umbrella Pharmaceutical Inc™ Produtos");
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
        getContentPane().setLayout(null);

        jLabel2.setForeground(new java.awt.Color(3, 155, 216));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID Produto.:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 20, 70, 16);

        jLabel3.setForeground(new java.awt.Color(3, 155, 216));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Descrição.:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(440, 50, 70, 16);

        jLabel4.setForeground(new java.awt.Color(3, 155, 216));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Preço.:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(440, 80, 70, 16);

        jLabel5.setForeground(new java.awt.Color(3, 155, 216));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Anotação.:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(440, 110, 70, 16);

        jLabel7.setForeground(new java.awt.Color(3, 155, 216));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Imposto.:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(700, 80, 50, 16);

        txtIdproduto.setBackground(new java.awt.Color(30, 30, 30));
        txtIdproduto.setForeground(new java.awt.Color(3, 155, 216));
        txtIdproduto.setBorder(null);
        txtIdproduto.setEnabled(false);
        txtIdproduto.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtIdproduto);
        txtIdproduto.setBounds(520, 20, 50, 22);

        txtDescricao.setBackground(new java.awt.Color(30, 30, 30));
        txtDescricao.setForeground(new java.awt.Color(3, 155, 216));
        txtDescricao.setBorder(null);
        txtDescricao.setEnabled(false);
        txtDescricao.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtDescricao);
        txtDescricao.setBounds(520, 50, 310, 22);

        txtPreco.setBackground(new java.awt.Color(30, 30, 30));
        txtPreco.setForeground(new java.awt.Color(3, 155, 216));
        txtPreco.setBorder(null);
        txtPreco.setEnabled(false);
        txtPreco.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtPreco);
        txtPreco.setBounds(520, 80, 70, 22);

        btnPrimeiro.setBackground(new java.awt.Color(122, 0, 0));
        btnPrimeiro.setForeground(new java.awt.Color(3, 155, 216));
        btnPrimeiro.setText("Primeiro");
        btnPrimeiro.setBorder(null);
        btnPrimeiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrimeiro);
        btnPrimeiro.setBounds(520, 170, 73, 25);

        btnAnterior.setBackground(new java.awt.Color(122, 0, 0));
        btnAnterior.setForeground(new java.awt.Color(3, 155, 216));
        btnAnterior.setText("Anterior");
        btnAnterior.setBorder(null);
        btnAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnterior);
        btnAnterior.setBounds(600, 170, 73, 25);

        btnProximo.setBackground(new java.awt.Color(122, 0, 0));
        btnProximo.setForeground(new java.awt.Color(3, 155, 216));
        btnProximo.setText("Proximo");
        btnProximo.setBorder(null);
        btnProximo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });
        getContentPane().add(btnProximo);
        btnProximo.setBounds(680, 170, 73, 25);

        btnUltimo.setBackground(new java.awt.Color(122, 0, 0));
        btnUltimo.setForeground(new java.awt.Color(3, 155, 216));
        btnUltimo.setText("Ultimo");
        btnUltimo.setBorder(null);
        btnUltimo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });
        getContentPane().add(btnUltimo);
        btnUltimo.setBounds(760, 170, 73, 25);

        btnNovo.setBackground(new java.awt.Color(122, 0, 0));
        btnNovo.setForeground(new java.awt.Color(3, 155, 216));
        btnNovo.setText("Novo");
        btnNovo.setBorder(null);
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo);
        btnNovo.setBounds(520, 200, 73, 25);

        btnEditar.setBackground(new java.awt.Color(122, 0, 0));
        btnEditar.setForeground(new java.awt.Color(3, 155, 216));
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(600, 200, 73, 25);

        btnSalvar.setBackground(new java.awt.Color(122, 0, 0));
        btnSalvar.setForeground(new java.awt.Color(3, 155, 216));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(null);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(680, 200, 73, 25);

        btnExcluir.setBackground(new java.awt.Color(122, 0, 0));
        btnExcluir.setForeground(new java.awt.Color(3, 155, 216));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(null);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(760, 200, 73, 25);

        btnCancelar.setBackground(new java.awt.Color(122, 0, 0));
        btnCancelar.setForeground(new java.awt.Color(3, 155, 216));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(600, 230, 73, 25);

        btnPesquisar.setBackground(new java.awt.Color(122, 0, 0));
        btnPesquisar.setForeground(new java.awt.Color(3, 155, 216));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(null);
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(680, 230, 73, 25);

        cmbImposto.setBackground(new java.awt.Color(30, 30, 30));
        cmbImposto.setForeground(new java.awt.Color(3, 155, 216));
        cmbImposto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "5%", "10%", "15%" }));
        cmbImposto.setEnabled(false);
        getContentPane().add(cmbImposto);
        cmbImposto.setBounds(760, 77, 70, 22);

        jtaAnotacao.setBackground(new java.awt.Color(30, 30, 30));
        jtaAnotacao.setColumns(20);
        jtaAnotacao.setForeground(new java.awt.Color(3, 155, 216));
        jtaAnotacao.setRows(5);
        jScrollPane2.setViewportView(jtaAnotacao);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(520, 110, 310, 50);

        tblTabela.setBackground(new java.awt.Color(0, 0, 0));
        tblTabela.setForeground(new java.awt.Color(3, 155, 216));
        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descricao", "Preco", "Imposto", "Anotacao"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class
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
        tblTabela.setGridColor(new java.awt.Color(122, 126, 140));
        tblTabela.setSelectionBackground(new java.awt.Color(122, 126, 140));
        tblTabela.setSelectionForeground(new java.awt.Color(122, 126, 140));
        tblTabela.setShowGrid(false);
        jScrollPane1.setViewportView(tblTabela);
        if (tblTabela.getColumnModel().getColumnCount() > 0) {
            tblTabela.getColumnModel().getColumn(0).setMinWidth(50);
            tblTabela.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblTabela.getColumnModel().getColumn(0).setMaxWidth(50);
            tblTabela.getColumnModel().getColumn(2).setMinWidth(100);
            tblTabela.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblTabela.getColumnModel().getColumn(2).setMaxWidth(100);
            tblTabela.getColumnModel().getColumn(3).setMinWidth(100);
            tblTabela.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblTabela.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 270, 1350, 460);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Logos/014.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-4, 0, 1370, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        btnPrimeiro.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnProximo.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnNovo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);

        txtDescricao.setEnabled(true);
        txtPreco.setEnabled(true);
        jtaAnotacao.setEnabled(true);
        cmbImposto.setEnabled(true);

        txtIdproduto.setText("");
        txtDescricao.setText("");
        txtPreco.setText("");
        jtaAnotacao.setText("");
        cmbImposto.setSelectedIndex(0);

        novo = true;
        txtIdproduto.requestFocus();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (cmbImposto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione o imposto");
            cmbImposto.requestFocusInWindow();
            return;
        }

        if (txtDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Insira uma descricao");
            txtDescricao.requestFocusInWindow();
            return;
        }

        if (txtPreco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Insira o preço");
            txtPreco.requestFocusInWindow();
            return;
        }

        if (!Utilidades.isNumeric2(txtPreco.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Insira somente números");
            txtPreco.requestFocusInWindow();
            return;
        }

        double preco = Double.parseDouble(txtPreco.getText());
        if (preco <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Insira somente números acima de zero");
            txtPreco.requestFocusInWindow();
            return;
        }

        if (novo) {
            if (dados.existeProduto(txtIdproduto.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Este produto já existe");
                txtIdproduto.requestFocusInWindow();
                return;
            }
        } else {
            if (!dados.existeProduto(txtIdproduto.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Este produto ainda não existe");
                txtIdproduto.requestFocusInWindow();
                return;
            }
        }

        Produto mProduto = new Produto(
                Utilidades.objectToInt(txtIdproduto.getText()),
                txtDescricao.getText(),
                preco,
                cmbImposto.getSelectedIndex(),
                jtaAnotacao.getText());
        String msg;
        if (novo) {
            msg = dados.adicionarProduto(mProduto);
        } else {
            msg = dados.editarProduto(mProduto);
        }
        JOptionPane.showMessageDialog(rootPane, msg);

        btnPrimeiro.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnProximo.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnNovo.setEnabled(true);
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);

        txtIdproduto.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtPreco.setEnabled(false);
        cmbImposto.setEnabled(false);
        jtaAnotacao.setEnabled(false);

        txtIdproduto.setText("");
        txtDescricao.setText("");
        txtPreco.setText("");
        cmbImposto.setSelectedIndex(0);
        jtaAnotacao.setText("");

        preencherTabela();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnPrimeiro.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnProximo.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnNovo.setEnabled(true);
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);

        txtIdproduto.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtPreco.setEnabled(false);
        cmbImposto.setEnabled(false);
        jtaAnotacao.setEnabled(false);

        txtIdproduto.setText(id);
        txtDescricao.setText(descricao);
        txtPreco.setText(preco);
        cmbImposto.setSelectedItem(imposto);
        jtaAnotacao.setText(anotacao);

        carregarPrimeiroRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnPrimeiro.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnProximo.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnNovo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);

        txtDescricao.setEnabled(true);
        txtPreco.setEnabled(true);
        jtaAnotacao.setEnabled(true);
        cmbImposto.setEnabled(true);

        novo = false;
        jtaAnotacao.requestFocus();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        preencherTabela();
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        produtoAtual = 0;
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        produtoAtual = dados.numeroProdutos() - 1;
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        produtoAtual++;
        if (produtoAtual == dados.numeroProdutos()) {
            produtoAtual = 0;
        }
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        produtoAtual--;
        if (produtoAtual == -1) {
            produtoAtual = dados.numeroProdutos() - 1;
        }
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deletar este cadastro?");
        if (resposta != 0) {
            return;
        }
        String msg;
        msg = dados.deletarProduto(txtIdproduto.getText());
        JOptionPane.showMessageDialog(rootPane, msg);
        produtoAtual = 0;
        preencherTabela();
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String produto = JOptionPane.showInputDialog("Insira o código do produto");
        if (produto.equals("")) {
            return;
        }

        if (!dados.existeProduto(produto)) {
            JOptionPane.showMessageDialog(rootPane, "Este produto não existe!");
            return;
        }
        int num = tblTabela.getRowCount();

        for (int i = 0; i < num; i++) {
            if (Utilidades.objectToString(tblTabela.getValueAt(i, 0)).equals(produto)) {
                produtoAtual = i;
                break;
            }
        }
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void mostrarRegistro() {
        txtIdproduto.setText(Utilidades.objectToString(tblTabela.getValueAt(produtoAtual, 0)));
        txtDescricao.setText(Utilidades.objectToString(tblTabela.getValueAt(produtoAtual, 1)));
        txtPreco.setText(Utilidades.objectToString(tblTabela.getValueAt(produtoAtual, 2)));
        jtaAnotacao.setText(Utilidades.objectToString(tblTabela.getValueAt(produtoAtual, 3)));
        cmbImposto.setSelectedIndex(imposto(Utilidades.objectToString(tblTabela.getValueAt(produtoAtual, 4))));
        //int index = imposto(Utilidades.objectToString(tblTabela.getValueAt(produtoAtual, 4)));

//        if (index >= 0 && index < cmbImposto.getItemCount()) {
//            cmbImposto.setSelectedIndex(index);
//        } else {
//            cmbImposto.setSelectedIndex(0);
//        }
    }

    private void preencherTabela() {
        try {
            String titulos[] = {"ID Produto", "Descricao", "Preco", "Imposto", "Anotacao"};
            String registro[] = new String[5];
            mTabela = new DefaultTableModel(null, titulos);
            ResultSet rs = dados.getProdutos();

            while (rs.next()) {
                registro[0] = rs.getString("idProduto");
                registro[1] = rs.getString("descricao");
                registro[2] = rs.getString("preco");
                registro[3] = imposto(rs.getInt("imposto"));
                registro[4] = rs.getString("anotacao");
                mTabela.addRow(registro);
            }

            tblTabela.setModel(mTabela);
            DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
            dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
            tblTabela.getColumnModel().getColumn(2).setCellRenderer(dtcr);
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void carregarPrimeiroRegistro() {
        ResultSet rs = dados.getProdutos();
        try {
            if (rs.next()) {
                id = rs.getString("idproduto");
                descricao = rs.getString("descricao");
                preco = rs.getString("preco");
                imposto = rs.getString("imposto");
                anotacao = rs.getString("anotacao");

                txtIdproduto.setText(id);
                txtDescricao.setText(descricao);
                txtPreco.setText(preco);
                cmbImposto.setSelectedItem(imposto);
                jtaAnotacao.setText(anotacao);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UP_F03_Produtos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String imposto(int imposto) {
        return switch (imposto) {
            case 0 ->
                "0%";
            case 1 ->
                "5%";
            case 2 ->
                "10%";
            case 3 ->
                "15%";
            default ->
                "Não definido!";
        };
    }

    private int imposto(String imposto) {
        return switch (imposto) {
            case "0%" ->
                0;
            case "5%" ->
                1;
            case "10%" ->
                2;
            case "15%" ->
                3;
            default ->
                0;
        };
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox<String> cmbImposto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jtaAnotacao;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtIdproduto;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables

    /*private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/up_images/Icons/Icon.jpg")));
    }*/
}
/**
 * 01000111 01101001 01101111 01110110 01100001 01101110 01101110 01101001
 */
