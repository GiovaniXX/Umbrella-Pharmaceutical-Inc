package up_forms;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import up_classes.Utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import up_classes.Produto;
import up_classes.Dados;

public class UP_F06_Vendas extends javax.swing.JInternalFrame {

    private Dados dados;
    private final DefaultTableModel mTabela;

    public void setDados(Dados dados) {
        this.dados = dados;
    }

    public UP_F06_Vendas() {
        initComponents();
        mTabela = new DefaultTableModel(null, new String[]{"Id", "Produto", "Descrição", "Preço", "Quantidade", "Data"});
        tblTabela.setModel(mTabela);
        // Centraliza o texto nas colunas
        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
        for (int i = 0; i < 6; i++) {
            tblTabela.getColumnModel().getColumn(i).setCellRenderer(dtcr);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        txtTotalQuantidade = new javax.swing.JTextField();
        txtTotalValor = new javax.swing.JTextField();
        cmbCliente = new javax.swing.JComboBox<>();
        cmbProduto = new javax.swing.JComboBox<>();
        btnAdicionar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnDelTodos = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
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
        preencherComboClientes();
        preencherComboProdutos();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // Validar cliente e produto selecionado
        if (cmbCliente.getSelectedIndex() == 0 || cmbProduto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um cliente e um produto");
            return;
        }

        // Obter o produto selecionado
        Produto produto = dados.getProdutoPorNome((String) cmbProduto.getSelectedItem());

        // Verificar a quantidade
        if (txtQuantidade.getText().isEmpty() || !Utilidades.isNumeric(txtQuantidade.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Digite uma quantidade válida");
            return;
        }

        int quantidade = Integer.parseInt(txtQuantidade.getText());

        // Adicionar linha na tabela
        String[] registro = {
            String.valueOf(produto.getIdProduto()), // Id
            produto.getProduto(), // Nome do produto
            produto.getDescricao(), // Descrição
            String.valueOf(produto.getPreco()), // Preço
            String.valueOf(quantidade), // Quantidade
            new java.sql.Date(System.currentTimeMillis()).toString() // Data atual
        };

        mTabela.addRow(registro);
        totalGeral();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (cmbCliente.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um cliente");
            return;
        }

        int numeroVenda = dados.getNumeroVenda();
        int idCliente = dados.getClientePorNome((String) cmbCliente.getSelectedItem()).getIdCliente();
        dados.adicionarVenda(numeroVenda, idCliente, new java.util.Date());

        // Salvar detalhes da venda
        for (int i = 0; i < tblTabela.getRowCount(); i++) {
            int idProduto = Integer.parseInt(tblTabela.getValueAt(i, 0).toString());
            double preco = Double.parseDouble(tblTabela.getValueAt(i, 3).toString());
            int quantidade = Integer.parseInt(tblTabela.getValueAt(i, 4).toString());
            dados.adicionarDetalheVenda(numeroVenda, idProduto, preco, quantidade);
        }

        JOptionPane.showMessageDialog(rootPane, "Venda realizada com sucesso!");
        limparTabela();

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
        // Verifica se algum produto foi selecionado
        if (cmbProduto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um produto para deletar.");
            cmbProduto.requestFocusInWindow();
            return;
        }

        try {
            // Obtém o ID do produto selecionado no ComboBox
            Produto produtoSelecionado = dados.getProdutoPorNome((String) cmbProduto.getSelectedItem());
            int idProdutoCombo = produtoSelecionado.getIdProduto();
            int linhaParaRemover = -1;

            // Percorre a tabela para encontrar o produto a ser deletado
            for (int i = 0; i < mTabela.getRowCount(); i++) {
                int idProdutoTabela = Integer.parseInt(mTabela.getValueAt(i, 0).toString());
                if (idProdutoTabela == idProdutoCombo) {
                    linhaParaRemover = i;
                    break; // Encontra a primeira ocorrência
                }
            }

            if (linhaParaRemover != -1) {
                mTabela.removeRow(linhaParaRemover);
                totalGeral();  // Atualiza os totais após a exclusão
                JOptionPane.showMessageDialog(rootPane, "Produto deletado com sucesso.");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Produto não encontrado na tabela.");
            }

        } catch (Exception e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, "Ocorreu um erro ao deletar", e);
            JOptionPane.showMessageDialog(rootPane, "Erro ao tentar deletar o produto.");
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnDeletarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new UP_F06_Vendas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnDelTodos;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTotalQuantidade;
    private javax.swing.JTextField txtTotalValor;
    // End of variables declaration//GEN-END:variables

    private void totalGeral() {
        int numero = mTabela.getRowCount();
        int somaQuantidade = 0;
        double somaValor = 0;

        for (int i = 0; i < numero; i++) {
            somaQuantidade += Integer.parseInt(mTabela.getValueAt(i, 4).toString());
            somaValor += Double.parseDouble(mTabela.getValueAt(i, 3).toString())
                    * Integer.parseInt(mTabela.getValueAt(i, 4).toString()); // Calcula o valor total
        }

        txtTotalQuantidade.setText(String.valueOf(somaQuantidade));
        txtTotalValor.setText(String.valueOf(somaValor));
    }

    public void limparTabela() {
        mTabela.setRowCount(0); // Limpa todas as linhas
    }

    // Método para preencher o ComboBox de Clientes
    private void preencherComboClientes() {
        try {
            cmbCliente.removeAllItems();
            cmbCliente.addItem("Selecione um cliente");  // Opção padrão

            ResultSet rsClientes = dados.getClientes();
            while (rsClientes.next()) {
                cmbCliente.addItem(rsClientes.getString("nome") + " - ID: " + rsClientes.getInt("idcliente"));  // Exibe o nome e o ID
            }
        } catch (SQLException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Método para preencher o ComboBox de Produtos
    private void preencherComboProdutos() {
        try {
            cmbProduto.removeAllItems();
            cmbProduto.addItem("Selecione um produto");  // Opção padrão

            ResultSet rsProdutos = dados.getProdutos();
            while (rsProdutos.next()) {
                cmbProduto.addItem(rsProdutos.getString("produto") + " - ID: " + rsProdutos.getInt("idproduto"));  // Exibe o nome e o ID
            }
        } catch (SQLException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }
}
/**
 * 01000111 01101001 01101111 01110110 01100001 01101110 01101110 01101001
 */
