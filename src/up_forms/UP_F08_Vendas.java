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
        jLabel6.setText("Total.:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, -1, 20));

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
        txtTotalQuantidade.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtTotalQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, 110, -1));

        txtTotalValor.setForeground(new java.awt.Color(0, 0, 0));
        txtTotalValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotalValor.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtTotalValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 110, -1));

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
        getContentPane().add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

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
        getContentPane().add(btnDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, -1));

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
        getContentPane().add(btnDelTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, -1, -1));

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
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, -1, -1));

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
                "ID", "Descrição", "Preço", "Quantidade", "Valor"
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
            tblTabela.getColumnModel().getColumn(2).setMinWidth(100);
            tblTabela.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblTabela.getColumnModel().getColumn(2).setMaxWidth(100);
            tblTabela.getColumnModel().getColumn(3).setMinWidth(100);
            tblTabela.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblTabela.getColumnModel().getColumn(3).setMaxWidth(100);
            tblTabela.getColumnModel().getColumn(4).setMinWidth(100);
            tblTabela.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblTabela.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 1370, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Logos/014.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            // Preencher o ComboBox de Clientes
            cmbCliente.addItem(new Opcoes("@Developer: GvC", "Selecione um cliente"));
            ResultSet rsClientes = dados.getClientes();

            while (rsClientes.next()) {
                String idcliente = rsClientes.getString("idcliente");
                String nomeCompleto = rsClientes.getString("nome") + " " + rsClientes.getString("sobrenome");
                cmbCliente.addItem(new Opcoes(idcliente, nomeCompleto));
            }

            // Preencher o ComboBox de Produtos
            cmbProduto.addItem(new Opcoes("@Developer: GvC", "Selecione um produto"));
            ResultSet rsProdutos = dados.getProdutos();

            while (rsProdutos.next()) {
                String idproduto = rsProdutos.getString("idproduto");
                String descricao = rsProdutos.getString("descricao");
                cmbProduto.addItem(new Opcoes(idproduto, descricao));
            }

            // Configurar os campos de data e valores iniciais
            txtData.setText(Utilidades.formatDate(new Date()));
            txtTotalQuantidade.setText("0");
            txtTotalValor.setText("0");

            // Preencher a tabela
            preencherTabela();

        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
        }

//            Opcoes opc = new Opcoes("@Developer: GvC", "Selecione um cliente");
//            cmbCliente.addItem(opc);
//            ResultSet rsCli = dados.getClientes();
//
//            while (rsCli.next()) {
//                opc = new Opcoes(
//                        rsCli.getString("idcliente"),
//                        rsCli.getString("nome") + ""
//                        + rsCli.getString("sobrenome"));
//                cmbCliente.addItem(opc);
//            }
//
//            opc = new Opcoes("@Developer: GvC", "Selecione um produto");
//            cmbProduto.addItem(opc);
//            ResultSet rsPro = dados.getProdutos();
//
//            while (rsPro.next()) {
//                opc = new Opcoes(
//                        rsPro.getString("idproduto"),
//                        rsPro.getString("descricao"));
//                cmbProduto.addItem(opc);
//            }
//
//            txtData.setText(Utilidades.formatDate(new Date()));
//            txtTotalQuantidade.setText("0");
//            txtTotalValor.setText("0");
//
//            preencherTabela();
//
//        } catch (SQLException e) {
//            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
//        }
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

        Produto mProduto = dados.getProduto(((Opcoes) cmbProduto.getSelectedItem()).getValor());

        String registro[] = new String[5];
        registro[0] = Utilidades.intToString(mProduto.getIdProduto());
        registro[1] = mProduto.getDescricao();
        registro[2] = String.valueOf(mProduto.getPreco());
        registro[3] = String.valueOf(qtde);
        registro[4] = String.valueOf(qtde * mProduto.getPreco());
        mTabela.addRow(registro);

        cmbProduto.setSelectedIndex(0);
        txtQuantidade.setText("");
        cmbProduto.requestFocusInWindow();

        total();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (cmbCliente.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um cliente");
            cmbCliente.requestFocusInWindow();
            return;
        }

        if (cmbProduto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um produto para a venda");
            cmbProduto.requestFocusInWindow();
            return;
        }

        int total = Integer.parseInt(txtTotalQuantidade.getText());
        System.out.println("Total: " + total);
        if (total == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione a quantidade do produto");
            txtQuantidade.requestFocusInWindow();
            return;
        }

        if (tblTabela.getRowCount() == 0) {
            JOptionPane.showMessageDialog(rootPane, "A venda precisa estar adicionada na tabela antes de salvar");
            return;
        }

        int resposta = JOptionPane.showConfirmDialog(rootPane, "Realizar está venda?");
        if (resposta != 0) {
            return;
        }

        int numeroVenda = dados.getNumeroVenda();

        int cliente = Integer.parseInt(((Opcoes) cmbCliente.getSelectedItem()).getValor());
        dados.adicionarVenda(numeroVenda, cliente, new Date());

        //dados.adicionarVenda(numeroVenda, ((Opcoes) cmbCliente.getSelectedItem()).getValor(), new Date());
        int numero = tblTabela.getRowCount();

        for (int i = 0; i < numero; i++) {
            dados.adicionarDetalheVenda(numeroVenda, i,
                    Utilidades.objectToInt(tblTabela.getValueAt(i, 0)),
                    Utilidades.objectToString(tblTabela.getValueAt(i, 1)),
                    Utilidades.objectToInt(tblTabela.getValueAt(i, 2)),
                    Utilidades.objectToInt(tblTabela.getValueAt(i, 3)));
        }
        JOptionPane.showMessageDialog(rootPane, "Venda:" + numeroVenda + "Realizada com sucesso!");

        cmbCliente.setSelectedIndex(0);
        limparTabela();
        total();
        cmbCliente.requestFocusInWindow();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDelTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelTodosActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deletar todas as vendas?");
        if (resposta != 0) {
            return;
        }
        limparTabela();
        total();

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
                String combo = ((Opcoes) cmbProduto.getSelectedItem()).getValor();
                if (tabela.equals(combo)) {
                    modelo.removeRow(0);
                    total();
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
            if (((Opcoes) cmbCliente.getItemAt(i)).getValor().equals(rta)) {
                cmbCliente.setSelectedIndex(i);
                return;
            }
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
            if (((Opcoes) cmbProduto.getItemAt(i)).getValor().equals(rta)) {
                cmbProduto.setSelectedIndex(i);
                return;
            }
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
    private javax.swing.JComboBox<Opcoes> cmbCliente;
    private javax.swing.JComboBox<Opcoes> cmbProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTotalQuantidade;
    private javax.swing.JTextField txtTotalValor;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        String titulos[] = {"ID Venda", "Descricao", "Preco", "Quantidade", "Valor"};
        String registro[] = new String[5];
        mTabela = new DefaultTableModel(null, titulos);

        tblTabela.setModel(mTabela);

        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
        tblTabela.getColumnModel().getColumn(2).setCellRenderer(dtcr);
        tblTabela.getColumnModel().getColumn(3).setCellRenderer(dtcr);
        tblTabela.getColumnModel().getColumn(4).setCellRenderer(dtcr);

        mTabela.addRow(registro);
    }

    private void total() {
        int numero = tblTabela.getRowCount();
        int somaQuantidade = 0, somaValor = 0;
        for (int i = 0; i < numero; i++) {
            somaQuantidade += Utilidades.objectToInt(tblTabela.getValueAt(i, 3));
            somaValor += Utilidades.objectToInt(tblTabela.getValueAt(i, 4));
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
}
/**
 * 01000111 01101001 01101111 01110110 01100001 01101110 01101110 01101001
 */
