package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produto;
import categories.Utilidades;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class UP_F03_Produtos extends javax.swing.JInternalFrame {

    private final controller.ProdutoController produtoController = new controller.ProdutoController();

    private List<Produto> produtos;
    public int produtoAtual = 0;
    private boolean novo = false;
    private DefaultTableModel pTabela;

    private String idProduto;
    private String produto;
    private String preco;
    private String descricao;
    private String observacao;

    public UP_F03_Produtos() {
        initComponents();
        pTabela = new DefaultTableModel(new Object[]{"Id", "Produto", "Descrição", "Preço", "Observação"}, 0);
        tblTabela.setModel(pTabela);

        preencherTabela();

        // Centraliza o texto nas colunas
        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.CENTER);
        System.out.println(tblTabela.getColumnCount());
        for (int i = 0; i < tblTabela.getColumnCount(); i++) {
            tblTabela.getColumnModel().getColumn(i).setCellRenderer(dtcr);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdproduto = new javax.swing.JTextField();
        txtProduto = new javax.swing.JTextField();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaObservacao = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle(".:Umbrella Pharmaceutical Inc™ Produtos");
        setMaximumSize(new java.awt.Dimension(1440, 853));
        setMinimumSize(new java.awt.Dimension(1440, 853));
        setPreferredSize(new java.awt.Dimension(1440, 853));
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
        jLabel3.setBounds(440, 90, 70, 16);

        jLabel4.setForeground(new java.awt.Color(3, 155, 216));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Preço.:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(440, 120, 70, 16);

        jLabel5.setForeground(new java.awt.Color(3, 155, 216));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Observação.:");
        jLabel5.setEnabled(false);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(440, 150, 70, 16);

        jLabel6.setForeground(new java.awt.Color(3, 155, 216));
        jLabel6.setText("Produto.:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(457, 60, 50, 16);

        txtIdproduto.setBackground(new java.awt.Color(30, 30, 30));
        txtIdproduto.setForeground(new java.awt.Color(3, 155, 216));
        txtIdproduto.setBorder(null);
        txtIdproduto.setEnabled(false);
        txtIdproduto.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtIdproduto);
        txtIdproduto.setBounds(520, 20, 50, 22);
        getContentPane().add(txtProduto);
        txtProduto.setBounds(520, 60, 310, 22);

        txtDescricao.setBackground(new java.awt.Color(30, 30, 30));
        txtDescricao.setForeground(new java.awt.Color(3, 155, 216));
        txtDescricao.setBorder(null);
        txtDescricao.setEnabled(false);
        txtDescricao.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtDescricao);
        txtDescricao.setBounds(520, 90, 310, 22);

        txtPreco.setBackground(new java.awt.Color(30, 30, 30));
        txtPreco.setForeground(new java.awt.Color(3, 155, 216));
        txtPreco.setBorder(null);
        txtPreco.setEnabled(false);
        txtPreco.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtPreco);
        txtPreco.setBounds(520, 120, 70, 22);

        btnPrimeiro.setBackground(new java.awt.Color(122, 0, 0));
        btnPrimeiro.setForeground(new java.awt.Color(3, 155, 216));
        btnPrimeiro.setText("Primeiro");
        btnPrimeiro.setBorder(null);
        btnPrimeiro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrimeiro);
        btnPrimeiro.setBounds(520, 210, 73, 25);

        btnAnterior.setBackground(new java.awt.Color(122, 0, 0));
        btnAnterior.setForeground(new java.awt.Color(3, 155, 216));
        btnAnterior.setText("Anterior");
        btnAnterior.setBorder(null);
        btnAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnterior);
        btnAnterior.setBounds(600, 210, 73, 25);

        btnProximo.setBackground(new java.awt.Color(122, 0, 0));
        btnProximo.setForeground(new java.awt.Color(3, 155, 216));
        btnProximo.setText("Proximo");
        btnProximo.setBorder(null);
        btnProximo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });
        getContentPane().add(btnProximo);
        btnProximo.setBounds(680, 210, 73, 25);

        btnUltimo.setBackground(new java.awt.Color(122, 0, 0));
        btnUltimo.setForeground(new java.awt.Color(3, 155, 216));
        btnUltimo.setText("Ultimo");
        btnUltimo.setBorder(null);
        btnUltimo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });
        getContentPane().add(btnUltimo);
        btnUltimo.setBounds(760, 210, 73, 25);

        btnNovo.setBackground(new java.awt.Color(122, 0, 0));
        btnNovo.setForeground(new java.awt.Color(3, 155, 216));
        btnNovo.setText("Novo");
        btnNovo.setBorder(null);
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo);
        btnNovo.setBounds(520, 240, 73, 25);

        btnEditar.setBackground(new java.awt.Color(122, 0, 0));
        btnEditar.setForeground(new java.awt.Color(3, 155, 216));
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(600, 240, 73, 25);

        btnSalvar.setBackground(new java.awt.Color(122, 0, 0));
        btnSalvar.setForeground(new java.awt.Color(3, 155, 216));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(null);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(680, 240, 73, 25);

        btnExcluir.setBackground(new java.awt.Color(122, 0, 0));
        btnExcluir.setForeground(new java.awt.Color(3, 155, 216));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(null);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(760, 240, 73, 25);

        btnCancelar.setBackground(new java.awt.Color(122, 0, 0));
        btnCancelar.setForeground(new java.awt.Color(3, 155, 216));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(600, 270, 73, 25);

        btnPesquisar.setBackground(new java.awt.Color(122, 0, 0));
        btnPesquisar.setForeground(new java.awt.Color(3, 155, 216));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(null);
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(680, 270, 73, 25);

        jtaObservacao.setBackground(new java.awt.Color(30, 30, 30));
        jtaObservacao.setColumns(20);
        jtaObservacao.setForeground(new java.awt.Color(3, 155, 216));
        jtaObservacao.setRows(5);
        jtaObservacao.setEnabled(false);
        jScrollPane2.setViewportView(jtaObservacao);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(520, 150, 310, 50);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(462, 402));

        tblTabela.setBackground(new java.awt.Color(0, 0, 0));
        tblTabela.setForeground(new java.awt.Color(3, 155, 216));
        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Produto", "Descrição", "Preço", "Observação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTabela.setGridColor(new java.awt.Color(122, 126, 140));
        tblTabela.setMinimumSize(new java.awt.Dimension(452, 402));
        tblTabela.setPreferredSize(new java.awt.Dimension(452, 402));
        tblTabela.setSelectionBackground(new java.awt.Color(122, 126, 140));
        tblTabela.setSelectionForeground(new java.awt.Color(122, 126, 140));
        tblTabela.setShowGrid(false);
        jScrollPane1.setViewportView(tblTabela);
        if (tblTabela.getColumnModel().getColumnCount() > 0) {
            tblTabela.getColumnModel().getColumn(0).setMinWidth(50);
            tblTabela.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblTabela.getColumnModel().getColumn(0).setMaxWidth(50);
            tblTabela.getColumnModel().getColumn(3).setMinWidth(100);
            tblTabela.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblTabela.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(15, 310, 1400, 500);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Logos/0014.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1430, 853);

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

        txtProduto.setEnabled(true);
        txtDescricao.setEnabled(true);
        txtPreco.setEnabled(true);
        jtaObservacao.setEnabled(true);

        txtIdproduto.setText("");
        txtProduto.setText("");
        txtDescricao.setText("");
        txtPreco.setText("");
        jtaObservacao.setText("");

        novo = true;
        txtIdproduto.requestFocus();

        int id_number = evt.getID();
        System.out.println("ID do evento: " + id_number);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // Verifica se a descrição foi fornecida
        if (txtDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Insira uma descrição.");
            txtDescricao.requestFocusInWindow();
            return;
        }

        // Verifica se o preço foi fornecido
        if (txtPreco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Insira o preço.");
            txtPreco.requestFocusInWindow();
            return;
        }

        // Verifica se o preço é um número válido
        if (!Utilidades.isNumeric2(txtPreco.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Insira somente números.");
            txtPreco.requestFocusInWindow();
            return;
        }

        double preco = Double.parseDouble(txtPreco.getText());

        // Verifica se o preço é maior que zero
        if (preco <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Insira um preço acima de zero.");
            txtPreco.requestFocusInWindow();
            return;
        }

        // Verifica a existência do produto, conforme o estado da operação (novo ou edição)
        boolean produtoExistente = produtoController.produtoExiste(txtIdproduto.getText());
        if (novo && produtoExistente) {
            JOptionPane.showMessageDialog(rootPane, "Este produto já existe.");
            txtIdproduto.requestFocusInWindow();
            return;
        } else if (!novo && !produtoExistente) {
            JOptionPane.showMessageDialog(rootPane, "Este produto não existe.");
            txtIdproduto.requestFocusInWindow();
            return;
        }

        // Cria um novo objeto Produto
        Produto mProduto = new Produto(
                Utilidades.objectToInt(txtIdproduto.getText()),
                txtProduto.getText(),
                new BigDecimal(String.valueOf(preco)),
                txtDescricao.getText(),
                jtaObservacao.getText()
        );

        // Mensagem a ser exibida após a operação de adicionar ou editar
        String msg = novo
                ? produtoController.cadastrarProduto(mProduto)
                : produtoController.atualizarProduto(mProduto);

        JOptionPane.showMessageDialog(rootPane, msg);

        // Habilita e desabilita os botões conforme a operação
        toggleButtonStatesAfterSave();

        // Limpa os campos de entrada
        clearInputFields();

        // Atualiza a tabela
        preencherTabela();

        carregarProdutoAtual();

        int id_number = evt.getID();
        System.out.println("ID do evento: " + id_number);
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
        txtProduto.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtPreco.setEnabled(false);
        jtaObservacao.setEnabled(false);

        txtIdproduto.setText(idProduto);
        txtProduto.setText(produto);
        txtDescricao.setText(descricao);
        txtPreco.setText(preco);
        jtaObservacao.setText("Entre com a observação sobre o produto aqui");

        carregarPrimeiroRegistro();
        carregarProdutoAtual();

        int id_number = evt.getID();
        System.out.println("ID do evento: " + id_number);
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

        txtProduto.setEnabled(true);
        txtDescricao.setEnabled(true);
        txtPreco.setEnabled(true);
        jtaObservacao.setEnabled(true);

        novo = false;
        jtaObservacao.requestFocus();

        int id_number = evt.getID();
        System.out.println("ID do evento: " + id_number);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        preencherTabela();
        mostrarRegistro();

        int id_number = evt.getID();
        System.out.println("ID do evento: " + id_number);
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        produtoAtual = 0;
        mostrarRegistro();

//        produtoAtual = 0;
//        carregarProdutoAtual();
        int id_number = evt.getID();
        System.out.println("ID do evento: " + id_number);
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        produtoAtual = produtoController.contarProdutos() - 1;
        mostrarRegistro();

//        produtoAtual = produtos.size() - 1;
//        carregarProdutoAtual();
        int id_number = evt.getID();
        System.out.println("ID do evento: " + id_number);
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        produtoAtual++;
        if (produtoAtual == produtoController.contarProdutos()) {
            produtoAtual = 0;
        }
        mostrarRegistro();

//        if (produtoAtual < produtos.size() - 1) {
//            produtoAtual++;
//            carregarProdutoAtual();
//        }
        int id_number = evt.getID();
        System.out.println("ID do evento: " + id_number);
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        produtoAtual--;
        if (produtoAtual == -1) {
            produtoAtual = produtoController.contarProdutos() - 1;
        }
        mostrarRegistro();

//        if (produtoAtual > 0) {
//            produtoAtual--;
//            carregarProdutoAtual();
//        }
        int id_number = evt.getID();
        System.out.println("ID do evento: " + id_number);
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deletar este cadastro?");
        if (resposta != 0) {
            return;
        }
        String msg = produtoController.excluirProduto(txtIdproduto.getText());
        JOptionPane.showMessageDialog(rootPane, msg);
        produtoAtual = 0;
        preencherTabela();
        mostrarRegistro();

        int id_number = evt.getID();
        System.out.println("ID do evento: " + id_number);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String produto = JOptionPane.showInputDialog("Insira o código do produto");
        if (produto == null || produto.isEmpty()) {
            return;
        }

        if (!produtoController.produtoExiste(produto)) {
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

        int id_number = evt.getID();
        System.out.println("ID do evento: " + id_number);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void mostrarRegistro() {
        txtIdproduto.setText(Utilidades.objectToString(tblTabela.getValueAt(produtoAtual, 0)));
        txtProduto.setText(Utilidades.objectToString(tblTabela.getValueAt(produtoAtual, 1)));
        txtDescricao.setText(Utilidades.objectToString(tblTabela.getValueAt(produtoAtual, 2)));
        txtPreco.setText(Utilidades.objectToString(tblTabela.getValueAt(produtoAtual, 3)));
        jtaObservacao.setText(Utilidades.objectToString(tblTabela.getValueAt(produtoAtual, 4)));
    }

    private void preencherTabela() {
        List<Produto> produtos = produtoController.listarProdutos();
        DefaultTableModel modelo = (DefaultTableModel) tblTabela.getModel();
        modelo.setRowCount(0); // limpa a tabela antes de preencher

        for (Produto p : produtos) {
            modelo.addRow(new Object[]{
                p.getIdProduto(),
                p.getProduto(),
                p.getDescricao(),
                p.getPreco(),
                p.getObservacao()
            });
        }
    }

    private void carregarPrimeiroRegistro() {
        List<Produto> produtos = produtoController.listarProdutos();
        if (!produtos.isEmpty()) {
            Produto p = produtos.get(0);
            txtIdproduto.setText(String.valueOf(p.getIdProduto()));
            txtProduto.setText(p.getProduto());
            txtDescricao.setText(p.getDescricao());
            txtPreco.setText(String.valueOf(p.getPreco()));
            jtaObservacao.setText(p.getObservacao());
        }
    }

    private void carregarProdutoAtual() {
        if (produtos == null || produtos.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Nenhum produto disponível.");
            return;
        }

        Produto p = produtos.get(produtoAtual);

        txtIdproduto.setText(String.valueOf(p.getIdProduto()));
        txtProduto.setText(p.getProduto());
        txtDescricao.setText(p.getDescricao());
        txtPreco.setText(p.getPreco().toString());
        jtaObservacao.setText(p.getObservacao());
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jtaObservacao;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtIdproduto;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables

    // Método auxiliar para habilitar/desabilitar botões
    private void toggleButtonStatesAfterSave() {
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
    }

    // Método auxiliar para limpar os campos de entrada
    private void clearInputFields() {
        txtIdproduto.setText("");
        txtProduto.setText("");
        txtDescricao.setText("");
        txtPreco.setText("");
        jtaObservacao.setText("");
    }

}
