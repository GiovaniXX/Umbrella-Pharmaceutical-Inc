package up_forms;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import up_classes.Opcoes;
import up_classes.Utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import up_classes.Produto;
import up_classes.Dados;

public class UP_F08_Vendas extends javax.swing.JInternalFrame {

    private Dados dados;
    private DefaultTableModel mTabela;

    public void setDados(Dados dados) {
        this.dados = dados;
    }

    public UP_F08_Vendas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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
        tblTabela = new javax.swing.JTable();
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
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Geral.:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, -1, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quantidade");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 690, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Valor");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 690, -1, -1));

        txtData.setBackground(new java.awt.Color(30, 30, 30));
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtData.setEnabled(false);
        txtData.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 100, -1));

        txtQuantidade.setBackground(new java.awt.Color(30, 30, 30));
        txtQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        txtQuantidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtQuantidade.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 100, -1));

        txtTotalQuantidade.setForeground(new java.awt.Color(0, 0, 0));
        txtTotalQuantidade.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalQuantidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotalQuantidade.setCaretColor(new java.awt.Color(0, 0, 0));
        txtTotalQuantidade.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtTotalQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 710, 110, -1));

        txtTotalValor.setForeground(new java.awt.Color(0, 0, 0));
        txtTotalValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotalValor.setCaretColor(new java.awt.Color(0, 0, 0));
        txtTotalValor.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtTotalValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 710, 110, -1));

        cmbCliente.setBackground(new java.awt.Color(30, 30, 30));
        cmbCliente.setForeground(new java.awt.Color(255, 255, 255));
        cmbCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(cmbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 250, -1));

        cmbProduto.setBackground(new java.awt.Color(30, 30, 30));
        cmbProduto.setForeground(new java.awt.Color(255, 255, 255));
        cmbProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(cmbProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 250, -1));

        btnAdicionar.setBackground(new java.awt.Color(122, 0, 0));
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
        getContentPane().add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        btnDeletar.setBackground(new java.awt.Color(122, 0, 0));
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
        getContentPane().add(btnDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));

        btnDelTodos.setBackground(new java.awt.Color(122, 0, 0));
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
        getContentPane().add(btnDelTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, -1, -1));

        btnSalvar.setBackground(new java.awt.Color(122, 0, 0));
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
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, -1, -1));

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

        tblTabela.setBackground(new java.awt.Color(0, 0, 0));
        tblTabela.setForeground(new java.awt.Color(3, 155, 216));
        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Produto", "Descricao", "Preço", "Quantidade", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, true
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
            tblTabela.getColumnModel().getColumn(0).setMinWidth(50);
            tblTabela.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblTabela.getColumnModel().getColumn(0).setMaxWidth(50);
            tblTabela.getColumnModel().getColumn(3).setMinWidth(100);
            tblTabela.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblTabela.getColumnModel().getColumn(3).setMaxWidth(100);
            tblTabela.getColumnModel().getColumn(4).setMinWidth(100);
            tblTabela.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblTabela.getColumnModel().getColumn(4).setMaxWidth(100);
            tblTabela.getColumnModel().getColumn(5).setMinWidth(100);
            tblTabela.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblTabela.getColumnModel().getColumn(5).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 1370, 490));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Logos/014.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
//        try {
//            // Preencher o ComboBox de Clientes
//            cmbCliente.addItem(new Opcoes("@Developer: GvC", "Selecione um cliente"));
//            ResultSet rsClientes = dados.getClientes();
//
//            while (rsClientes.next()) {
//                String idcliente = rsClientes.getString("idcliente");
//                String nomeCompleto = rsClientes.getString("nome") + " " + rsClientes.getString("sobrenome");
//                cmbCliente.addItem(new Opcoes(idcliente, nomeCompleto));
//            }
//
//            // Preencher o ComboBox de Produtos
//            cmbProduto.addItem(new Opcoes("@Developer: GvC", "Selecione um produto"));
//            ResultSet rsProdutos = dados.getProdutos();
//
//            while (rsProdutos.next()) {
//                String idproduto = rsProdutos.getString("idproduto");
//                String descricao = rsProdutos.getString("descricao");
//                cmbProduto.addItem(new Opcoes(idproduto, descricao));
//            }
//
//            // Configurar os campos de data e valores iniciais
//            txtData.setText(Utilidades.formatDate(new Date()));
//            txtTotalQuantidade.setText("0");
//            txtTotalValor.setText("0");
//
//            // Preencher a tabela
//            preencherTabela();
//
//        } catch (SQLException e) {
//            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
//        }

        preencherComboClientes();
        preencherComboProdutos();
        preencherTabela();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        if (cmbProduto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um produto");
            cmbProduto.requestFocusInWindow();
            return;
        }

        if (txtQuantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Digite uma quantidade");
            txtQuantidade.requestFocusInWindow();
            return;
        }

        if (!Utilidades.isNumeric(txtQuantidade.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Digite somente numeros");
            txtQuantidade.setText("");
            txtQuantidade.requestFocusInWindow();
            return;
        }

        int qtde = Integer.parseInt(txtQuantidade.getText());
        System.out.println("Quantidade: " + qtde);
        if (qtde <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Digite somente numeros positivos");
            txtQuantidade.setText("");
            txtQuantidade.requestFocusInWindow();
            return;
        }

//        // Alterar para usar um método que retorne um identificador correto
//        Produto mProduto = dados.getProduto(((String) cmbProduto.getSelectedItem()).getPreco());
        // Se cmbProduto contém Strings, use um método para buscar o Produto
        Produto mProduto = dados.getProdutoPorNome((String) cmbProduto.getSelectedItem());

        if (mProduto == null) {
            JOptionPane.showMessageDialog(rootPane, "Produto não encontrado");
            return;
        }

        // Inserir os dados na tblTabela
        String registro[] = new String[6];
        registro[0] = Utilidades.intToString(mProduto.getIdProduto());
        registro[1] = mProduto.getDescricao();
        registro[2] = Utilidades.intToString((int) mProduto.getPreco());
        registro[3] = Utilidades.intToString(qtde);
        registro[4] = Utilidades.doubleToString(qtde * mProduto.getPreco());
        registro[5] = new java.sql.Date(new java.util.Date().getTime()).toString();

        mTabela.addRow(registro);
        totalGeral();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // Verificar se cliente foi selecionado
        if (cmbCliente.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um cliente");
            cmbCliente.requestFocusInWindow();
            return;
        }

        // Verificar se produto foi selecionado
        if (cmbProduto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um produto para a venda");
            cmbProduto.requestFocusInWindow();
            return;
        }

        // Verificar se quantidade é válida
        int total = Integer.parseInt(txtTotalQuantidade.getText());
        if (total == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione a quantidade do produto");
            txtQuantidade.requestFocusInWindow();
            return;
        }

        // Verificar se a tabela contém itens
        if (tblTabela.getRowCount() == 0) {
            JOptionPane.showMessageDialog(rootPane, "A venda precisa estar adicionada na tabela antes de salvar");
            return;
        }

        // Confirmar se a venda será realizada
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Realizar esta venda?");
        if (resposta != 0) {
            return;
        }

        // Obter o cliente selecionado
        int clienteId = ((Opcoes) cmbCliente.getSelectedItem()).getId();  // Supondo que você tenha um método `getId` no objeto `Opcoes`

        // Obter número da venda
        int numeroVenda = dados.getNumeroVenda();

        // Adicionar venda ao banco de dados
        dados.adicionarVenda(numeroVenda, clienteId, new Date());

        // Obter o número de linhas da tabela
        int numeroLinhas = tblTabela.getRowCount();

        // Loop para adicionar os detalhes da venda
        for (int i = 0; i < numeroLinhas; i++) {
            int idProduto = Utilidades.objectToInt(tblTabela.getValueAt(i, 0));  // Coluna 0 deve conter o ID do produto
            int quantidade = Utilidades.objectToInt(tblTabela.getValueAt(i, 4));  // Coluna 4 deve conter a quantidade
            double preco = Utilidades.objectToDouble(tblTabela.getValueAt(i, 3)); // Coluna 3 deve conter o preço

            dados.adicionarDetalheVenda(numeroVenda, idProduto, preco, quantidade);
        }

        JOptionPane.showMessageDialog(rootPane, "Venda:" + numeroVenda + "Realizada com sucesso!");

        // Limpar os campos e a tabela após salvar
        cmbCliente.setSelectedIndex(0);
        cmbProduto.setSelectedIndex(0);
        txtQuantidade.setText("");
        cmbCliente.requestFocusInWindow();

        limparTabela();
        totalGeral();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDelTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelTodosActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deletar todas as vendas?");
        if (resposta != 0) {
            return;
        }
        limparTabela();
        totalGeral();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnDelTodosActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (cmbProduto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Venda deletada com sucesso.!");
            cmbProduto.requestFocusInWindow();
            return;
        }
        try {
            DefaultTableModel modelo = (DefaultTableModel) tblTabela.getModel();
            int linha = tblTabela.getRowCount();
            for (int i = 0; i < linha; i++) {
                String tabela = Utilidades.objectToString(tblTabela.getValueAt(i, 0));
                String combo = ((Opcoes) cmbProduto.getSelectedItem()).getPreco();
                if (tabela.equals(combo)) {
                    modelo.removeRow(0);
                    totalGeral();
                    return;
                }
            }
        } catch (Exception e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, "Ocorreu um erro ao deletar", e);
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnPesqClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqClienteActionPerformed
        UP_F09_Pesquisar_Cliente ufpc = new UP_F09_Pesquisar_Cliente(null, closable);
        ufpc.setSGBDmethods(dados);
        ufpc.setVisible(true);

        String rta = ufpc.getResposta();
        if (rta.equals("")) {
            return;
        }
        for (int i = 0; i < cmbCliente.getItemCount(); i++) {
            // Verifica se o item é String ou Cliente, e realiza a verificação correspondente
            if (cmbCliente.getItemAt(i).equals(rta)) {
                cmbCliente.setSelectedIndex(i);
                return;
            }

//            if (((String) cmbCliente.getItemAt(i)).getPreco().equals(rta)) {
//                cmbCliente.setSelectedIndex(i);
//                return;
//            }
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnPesqClienteActionPerformed

    private void btnPesqProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqProdutoActionPerformed
        UP_F10_Pesquisar_Produtos ufpp = new UP_F10_Pesquisar_Produtos(null, closable);
        ufpp.setSGBDmethods(dados);
        ufpp.setVisible(true);

        String rta = ufpp.getResposta();
        if (rta.equals("")) {
            return;
        }
        for (int i = 0; i < cmbProduto.getItemCount(); i++) {
            // Verifica se o item é String ou Cliente, e realiza a verificação correspondente
            if (cmbProduto.getItemAt(i).equals(rta)) {
                cmbProduto.setSelectedIndex(i);
                return;
            }

//            if (((String) cmbProduto.getItemAt(i)).getPreco().equals(rta)) {
//                cmbProduto.setSelectedIndex(i);
//                return;
//            }
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTotalQuantidade;
    private javax.swing.JTextField txtTotalValor;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        String titulos[] = {"Id", "Produto", "Descricao", "Preco", "Quantidade", "Data"};
        String registro[] = new String[5];

        mTabela = new DefaultTableModel(null, titulos);

        tblTabela.setModel(mTabela);

        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
        tblTabela.getColumnModel().getColumn(0).setCellRenderer(dtcr);
        tblTabela.getColumnModel().getColumn(1).setCellRenderer(dtcr);
        tblTabela.getColumnModel().getColumn(2).setCellRenderer(dtcr);
        tblTabela.getColumnModel().getColumn(3).setCellRenderer(dtcr);
        tblTabela.getColumnModel().getColumn(4).setCellRenderer(dtcr);
        tblTabela.getColumnModel().getColumn(5).setCellRenderer(dtcr);

        mTabela.addRow(registro);
    }

    private void totalGeral() {
        int numero = tblTabela.getRowCount();
        int somaQuantidade = 0;
        double somaValor = 0;
        for (int i = 0; i < numero; i++) {
            somaQuantidade += Utilidades.objectToInt(tblTabela.getValueAt(i, 3));
            somaValor += Utilidades.objectToDouble(tblTabela.getValueAt(i, 2));
            //somaValor += Utilidades.objectToDouble(tblTabela.getValueAt(i, 4));
        }
        txtTotalQuantidade.setText(String.valueOf(somaQuantidade));
        txtTotalValor.setText(String.valueOf(somaValor));
    }

    public void limparTabela() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tblTabela.getModel();
            int linha = tblTabela.getRowCount();
            for (int i = 0; linha > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, "Ocorreu um erro ao limpar a tabela", e);

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
            cmbProduto.removeAllItems();

            // Adiciona os produtos ao ComboBox
            while (rsProdutos != null && rsProdutos.next()) {
                String produto = rsProdutos.getString("produto"); // Supondo que a coluna no banco é "produto"
                cmbProduto.addItem(produto); // Adiciona o nome do produto ao ComboBox
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
