package up_forms;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import up_classes.DadosDB;
import up_classes.Produto;
import up_classes.Utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class UP_F03_Produtos extends javax.swing.JInternalFrame {

    private DadosDB dadosDB;
    private int proAtual = 0;
    private boolean novo = false;
    private DefaultTableModel mTabela;

    private String ID;
    private String Descricao;
    private String Preco;

    public void setDadosDB(DadosDB dadosDB) {
        this.dadosDB = dadosDB;
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
        txtIDProduto = new javax.swing.JTextField();
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
        txtAnotacao = new javax.swing.JTextArea();
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

        txtIDProduto.setBackground(new java.awt.Color(122, 126, 140));
        txtIDProduto.setForeground(new java.awt.Color(255, 255, 255));
        txtIDProduto.setBorder(null);
        txtIDProduto.setCaretColor(new java.awt.Color(255, 255, 255));
        txtIDProduto.setEnabled(false);
        txtIDProduto.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtIDProduto);
        txtIDProduto.setBounds(520, 20, 50, 22);

        txtDescricao.setBackground(new java.awt.Color(122, 126, 140));
        txtDescricao.setForeground(new java.awt.Color(255, 255, 255));
        txtDescricao.setBorder(null);
        txtDescricao.setCaretColor(new java.awt.Color(255, 255, 255));
        txtDescricao.setEnabled(false);
        txtDescricao.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtDescricao);
        txtDescricao.setBounds(520, 50, 310, 22);

        txtPreco.setBackground(new java.awt.Color(122, 126, 140));
        txtPreco.setForeground(new java.awt.Color(255, 255, 255));
        txtPreco.setBorder(null);
        txtPreco.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPreco.setEnabled(false);
        txtPreco.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtPreco);
        txtPreco.setBounds(520, 80, 70, 22);

        btnPrimeiro.setBackground(new java.awt.Color(0, 0, 0));
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

        btnAnterior.setBackground(new java.awt.Color(0, 0, 0));
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

        btnProximo.setBackground(new java.awt.Color(0, 0, 0));
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

        btnUltimo.setBackground(new java.awt.Color(0, 0, 0));
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

        btnNovo.setBackground(new java.awt.Color(0, 0, 0));
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

        btnEditar.setBackground(new java.awt.Color(0, 0, 0));
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

        btnSalvar.setBackground(new java.awt.Color(0, 0, 0));
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

        btnExcluir.setBackground(new java.awt.Color(0, 0, 0));
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

        btnCancelar.setBackground(new java.awt.Color(0, 0, 0));
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

        btnPesquisar.setBackground(new java.awt.Color(0, 0, 0));
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

        cmbImposto.setBackground(new java.awt.Color(122, 126, 140));
        cmbImposto.setForeground(new java.awt.Color(255, 255, 255));
        cmbImposto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "5%", "10%", "15%" }));
        cmbImposto.setEnabled(false);
        getContentPane().add(cmbImposto);
        cmbImposto.setBounds(760, 77, 70, 22);

        txtAnotacao.setBackground(new java.awt.Color(122, 126, 140));
        txtAnotacao.setColumns(20);
        txtAnotacao.setForeground(new java.awt.Color(255, 255, 255));
        txtAnotacao.setRows(5);
        jScrollPane2.setViewportView(txtAnotacao);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(520, 110, 310, 50);

        tblTabela.setBackground(new java.awt.Color(0, 0, 0));
        tblTabela.setForeground(new java.awt.Color(3, 155, 216));
        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Usuario", "Nome", "S_Nome", "Perfil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTabela.setGridColor(new java.awt.Color(122, 126, 140));
        tblTabela.setSelectionBackground(new java.awt.Color(122, 126, 140));
        tblTabela.setSelectionForeground(new java.awt.Color(122, 126, 140));
        tblTabela.setShowGrid(false);
        jScrollPane1.setViewportView(tblTabela);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(3, 280, 1350, 410);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Logos/014.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jLabel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-4, 0, 1370, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
//        btnPrimeiro.setEnabled(false);
//        btnAnterior.setEnabled(false);
//        btnProximo.setEnabled(false);
//        btnUltimo.setEnabled(false);
//        btnNovo.setEnabled(false);
//        btnEditar.setEnabled(false);
//        btnExcluir.setEnabled(false);
//        btnPesquisar.setEnabled(false);
//        btnSalvar.setEnabled(true);
//        btnCancelar.setEnabled(true);
//
//        txtIDProduto.setEnabled(true);
//        txtDescricao.setEnabled(true);
//        txtPreco.setEnabled(true);
//        txtAnotacao.setEnabled(true);
//        cmbImposto.setEnabled(true);
//
//        txtIDProduto.setText("");
//        txtDescricao.setText("");
//        txtPreco.setText("");
//        txtAnotacao.setText("");
//        cmbImposto.setSelectedIndex(0);
//
//        novo = true;
//        txtIDProduto.requestFocus();

        // Desabilita todos os botões de navegação e ações
        btnPrimeiro.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnProximo.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnNovo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);

        // Habilita os botões de salvar e cancelar
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);

        // Habilita os campos de entrada de dados
        txtIDProduto.setEnabled(true);
        txtDescricao.setEnabled(true);
        txtPreco.setEnabled(true);
        txtAnotacao.setEnabled(true);
        cmbImposto.setEnabled(true);

        // Limpa os campos de entrada de dados
        txtIDProduto.setText("");
        txtDescricao.setText("");
        txtPreco.setText("");
        txtAnotacao.setText("");
        cmbImposto.setSelectedIndex(0);

        // Define a flag 'novo' como verdadeira
        novo = true;

        // Coloca o foco no campo IDProduto
        txtIDProduto.requestFocus();

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
//        if (txtIDProduto.getText().equals("")) {
//            JOptionPane.showMessageDialog(rootPane, "Favor inserir um número de ID!");
//            txtIDProduto.requestFocusInWindow();
//            return;
//        }
//
//        if (cmbImposto.getSelectedIndex() == 0) {
//            JOptionPane.showMessageDialog(rootPane, "Favor selecionar um valor!");
//            cmbImposto.requestFocusInWindow();
//            return;
//        }
//
//        if (txtDescricao.getText().equals("")) {
//            JOptionPane.showMessageDialog(rootPane, "Favor digitar uma descrição!");
//            txtDescricao.requestFocusInWindow();
//            return;
//        }
//
//        if (txtPreco.getText().equals("")) {
//            JOptionPane.showMessageDialog(rootPane, "Favor digitar o preço!");
//            txtPreco.requestFocusInWindow();
//            return;
//        }
//
//        if (!Utilidades.isNumeric(txtPreco.getText())) {
//            JOptionPane.showMessageDialog(rootPane, "Favor digitar somente números!");
//            txtPreco.requestFocusInWindow();
//            return;
//        }
//
//        int preco = Integer.parseInt(txtPreco.getText());
//        if (preco <= 0) {
//            JOptionPane.showMessageDialog(rootPane, "Favor digitar um número acima de zero!");
//            txtPreco.requestFocusInWindow();
//            return;
//        }
//
//        if (novo) {
//            if (dadosDB.existeProduto(txtIDProduto.getText())) {
//                JOptionPane.showMessageDialog(rootPane, "Este produto já existe!");
//                txtIDProduto.requestFocusInWindow();
//                return;
//            }
//        } else {
//            if (!dadosDB.existeProduto(txtIDProduto.getText())) {
//                JOptionPane.showMessageDialog(rootPane, "Este produto não existe!");
//                txtIDProduto.requestFocusInWindow();
//                return;
//            }
//        }
//
//        Produto mProduto = new Produto(txtIDProduto.getText(), txtDescricao.getText(), preco, cmbImposto.getSelectedIndex(), txtAnotacao.getText());
//
//        String msg;
//        if (novo) {
//            msg = dadosDB.adicionarProduto(mProduto);
//        } else {
//            msg = dadosDB.editarProduto(mProduto);
//        }
//        JOptionPane.showMessageDialog(rootPane, msg);
//
//        btnPrimeiro.setEnabled(true);
//        btnAnterior.setEnabled(true);
//        btnProximo.setEnabled(true);
//        btnUltimo.setEnabled(true);
//        btnNovo.setEnabled(true);
//        btnEditar.setEnabled(true);
//        btnExcluir.setEnabled(true);
//        btnPesquisar.setEnabled(true);
//        btnSalvar.setEnabled(false);
//        btnCancelar.setEnabled(false);
//
//        txtIDProduto.setEnabled(false);
//        txtDescricao.setEnabled(false);
//        txtPreco.setEnabled(false);
//        cmbImposto.setEnabled(false);
//        txtAnotacao.setEnabled(false);
//
//        preencherTabela();

        // Verifica se o campo IDProduto está preenchido
        if (txtIDProduto.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Favor inserir um número de ID!");
            txtIDProduto.requestFocusInWindow();
            return;
        }

        // Verifica se um imposto foi selecionado
        if (cmbImposto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Favor selecionar um valor!");
            cmbImposto.requestFocusInWindow();
            return;
        }

        // Verifica se o campo Descrição está preenchido
        if (txtDescricao.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Favor digitar uma descrição!");
            txtDescricao.requestFocusInWindow();
            return;
        }

        // Verifica se o campo Preço está preenchido e contém apenas números
        if (txtPreco.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Favor digitar o preço!");
            txtPreco.requestFocusInWindow();
            return;
        } else if (!Utilidades.isNumeric(txtPreco.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Favor digitar somente números!");
            txtPreco.requestFocusInWindow();
            return;
        }

        // Verifica se o preço é maior que zero
        int preco = Integer.parseInt(txtPreco.getText());
        if (preco <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Favor digitar um número acima de zero!");
            txtPreco.requestFocusInWindow();
            return;
        }

        // Verifica se o IDProduto já existe (caso esteja adicionando um novo produto)
        if (novo && dadosDB.existeProduto(txtIDProduto.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Este produto já existe!");
            txtIDProduto.requestFocusInWindow();
            return;
        }

        // Verifica se o IDProduto não existe (caso esteja editando um produto existente)
        if (!novo && !dadosDB.existeProduto(txtIDProduto.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Este produto não existe!");
            txtIDProduto.requestFocusInWindow();
            return;
        }

        // Cria um novo objeto Produto com os dados informados
        Produto produto = new Produto(txtIDProduto.getText(), txtDescricao.getText(), preco, cmbImposto.getSelectedIndex(), txtAnotacao.getText());

        String msg;
        if (novo) {
            // Adiciona o novo produto no banco de dados
            msg = dadosDB.adicionarProduto(produto);
        } else {
            // Edita o produto existente no banco de dados
            msg = dadosDB.editarProduto(produto);
        }

        JOptionPane.showMessageDialog(rootPane, msg);

        // Habilita novamente os botões de navegação e ações
        btnPrimeiro.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnProximo.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnNovo.setEnabled(true);
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnPesquisar.setEnabled(true);

        // Desabilita os botões de salvar e cancelar
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);

        // Desabilita os campos de entrada de dados
        txtIDProduto.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtPreco.setEnabled(false);
        cmbImposto.setEnabled(false);
        txtAnotacao.setEnabled(false);

        // Preenche a tabela com os dados atualizados
        preencherTabela();

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

        txtIDProduto.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtPreco.setEnabled(false);
        cmbImposto.setEnabled(false);
        txtAnotacao.setEnabled(false);

        txtIDProduto.setText(ID);
        txtDescricao.setText(Descricao);
        txtPreco.setText(Preco);

        carregarPrimeiroRegistro();
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
        txtAnotacao.setEnabled(true);
        cmbImposto.setEnabled(true);

        novo = false;
        txtAnotacao.requestFocus();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        preencherTabela();
        mostrarRegistro();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        proAtual = 0;
        mostrarRegistro();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        proAtual = dadosDB.numeroProdutos() - 1;
        mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        proAtual++;
        if (proAtual == dadosDB.numeroProdutos()) {
            proAtual = 0;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        proAtual--;
        if (proAtual == -1) {
            proAtual = dadosDB.numeroProdutos() - 1;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deletar este cadastro?");
        if (resposta != 0) {
            return;
        }
        String msg;
        msg = dadosDB.deletarProduto(txtIDProduto.getText());
        JOptionPane.showMessageDialog(rootPane, msg);
        proAtual = 0;
        preencherTabela();
        mostrarRegistro();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String produto = JOptionPane.showInputDialog("Insira o código do produto");
        if (produto.equals("")) {
            return;
        }

        if (!dadosDB.existeProduto(produto)) {
            JOptionPane.showMessageDialog(rootPane, "Este produto não existe!");
            return;
        }
        int num = tblTabela.getRowCount();

        for (int i = 0; i < num; i++) {
            if (Utilidades.objectToString(tblTabela.getValueAt(i, 0)).equals(produto)) {
                proAtual = i;
                break;
            }
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void mostrarRegistro() {
        txtIDProduto.setText(Utilidades.objectToString(tblTabela.getValueAt(proAtual, 0)));
        txtDescricao.setText(Utilidades.objectToString(tblTabela.getValueAt(proAtual, 1)));
        txtPreco.setText(Utilidades.objectToString(tblTabela.getValueAt(proAtual, 2)));
        cmbImposto.setSelectedIndex(imposto(Utilidades.objectToString(tblTabela.getValueAt(proAtual, 3))));
        txtAnotacao.setText(Utilidades.objectToString(tblTabela.getValueAt(proAtual, 4)));
    }

    private void preencherTabela() {
        try {
            String titulos[] = {"ID Produto", "Descrição", "Preço", "Imposto", "Anotacao"};
            String registro[] = new String[5];
            mTabela = new DefaultTableModel(null, titulos);
            ResultSet rs = dadosDB.getProdutos();

            while (rs.next()) {
                registro[0] = rs.getString("IdProduto");
                registro[1] = rs.getString("descricao");
                registro[2] = rs.getString("preco");
                registro[3] = imposto(rs.getInt("idImposto"));
                registro[4] = rs.getString("notas");

                mTabela.addRow(registro);
            }
            tblTabela.setModel(mTabela);
            DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
            dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
            tblTabela.getColumnModel().getColumn(2).setCellRenderer(dtcr);

        } catch (SQLException ex) {
            Logger.getLogger(UP_F03_Produtos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void carregarPrimeiroRegistro() {
        ResultSet rs = dadosDB.getProdutos();
        try {
            if (rs.next()) {
                ID = rs.getString("IDProduto");
                Descricao = rs.getString("Descricao");
                Preco = rs.getString("Preco");

                txtIDProduto.setText(ID);
                txtDescricao.setText(Descricao);
                txtPreco.setText(Preco);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UP_F03_Produtos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String imposto(int idImposto) {
        return switch (idImposto) {
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

    private int imposto(String Imposto) {
        return switch (Imposto) {
            case "0%" ->
                0;
            case "10%" ->
                1;
            default ->
                2;
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
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextArea txtAnotacao;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtIDProduto;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables

    /*private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/up_images/Icons/Icon.jpg")));
    }*/
}
