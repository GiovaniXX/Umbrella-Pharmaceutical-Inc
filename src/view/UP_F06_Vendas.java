package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import categories.Utilidades;
import java.util.Date;
import java.sql.SQLException;
import javax.swing.SwingConstants;
import model.Cliente;
import model.Produto;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.List;
import model.Venda;
import util.Conexao;
import util.SessaoUsuario;

public class UP_F06_Vendas extends javax.swing.JInternalFrame {

    private final controller.ClienteController clienteController = new controller.ClienteController();
    private final controller.ProdutoController produtoController = new controller.ProdutoController();
    private controller.VendaController vendaController;

    private final model.Dados dados;

    public Conexao conexao;
    private final DefaultTableModel vTabela;

    public void setConexao(Conexao conexao) {
        this.conexao = conexao;
    }

    public UP_F06_Vendas() {
        initComponents();
        try {
            Connection conn = Conexao.getConnection();
            dados = new model.Dados(conn);
            vendaController = new controller.VendaController(conn);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar com o banco", e);
        }

        int idUsuario = SessaoUsuario.getIdUsuario();
        vTabela = new DefaultTableModel(null, new String[]{"Id", "Produto", "Descrição", "Preço", "Quantidade", "Data"});
        tblTabela.setModel(vTabela);

        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.CENTER);
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
        btnConfirmarExclusao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setTitle(".:Umbrella Pharmaceutical Inc™ Vendas");
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
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 790, -1, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quantidade");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 770, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Valor");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 770, -1, -1));

        txtQuantidade.setBackground(new java.awt.Color(30, 30, 30));
        txtQuantidade.setForeground(new java.awt.Color(3, 155, 216));
        txtQuantidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtQuantidade.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 100, -1));

        txtTotalQuantidade.setBackground(new java.awt.Color(30, 30, 30));
        txtTotalQuantidade.setForeground(new java.awt.Color(3, 155, 216));
        txtTotalQuantidade.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalQuantidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotalQuantidade.setCaretColor(new java.awt.Color(0, 0, 0));
        txtTotalQuantidade.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtTotalQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 790, 110, -1));

        txtTotalValor.setBackground(new java.awt.Color(30, 30, 30));
        txtTotalValor.setForeground(new java.awt.Color(3, 155, 216));
        txtTotalValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotalValor.setCaretColor(new java.awt.Color(0, 0, 0));
        txtTotalValor.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtTotalValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 790, 110, -1));

        cmbCliente.setBackground(new java.awt.Color(30, 30, 30));
        cmbCliente.setForeground(new java.awt.Color(3, 155, 216));
        cmbCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(cmbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 47, 250, -1));

        cmbProduto.setBackground(new java.awt.Color(30, 30, 30));
        cmbProduto.setForeground(new java.awt.Color(3, 155, 216));
        cmbProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(cmbProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 77, 250, -1));

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

        btnConfirmarExclusao.setBackground(new java.awt.Color(122, 0, 0));
        btnConfirmarExclusao.setText("Exclusao");
        btnConfirmarExclusao.setBorder(null);
        btnConfirmarExclusao.setMaximumSize(new java.awt.Dimension(101, 25));
        btnConfirmarExclusao.setMinimumSize(new java.awt.Dimension(101, 25));
        btnConfirmarExclusao.setPreferredSize(new java.awt.Dimension(101, 25));
        btnConfirmarExclusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarExclusaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmarExclusao, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 150, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(485, 402));

        tblTabela.setBackground(new java.awt.Color(0, 0, 0));
        tblTabela.setForeground(new java.awt.Color(3, 155, 216));
        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "produto", "Descricao", "Preço", "Quantidade", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, 1410, 570));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logos/0014.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1360, 768));
        jLabel1.setMinimumSize(new java.awt.Dimension(1360, 768));
        jLabel1.setPreferredSize(new java.awt.Dimension(1360, 768));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 853));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        preencherComboClientes();
        preencherComboProdutos();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // Validar cliente selecionado
        if (cmbCliente.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um cliente");
            return;
        }

        // Validar produto selecionado
        if (cmbProduto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um produto");
            return;
        }

        // Obter o cliente selecionado
        String clienteSelecionado = (String) cmbCliente.getSelectedItem();
        Cliente cliente = clienteController.getClientePorNome(clienteSelecionado);
        if (cliente == null) {
            JOptionPane.showMessageDialog(rootPane, "Cliente não encontrado: " + clienteSelecionado);
            return;
        }

        // Obter o produto selecionado
        String produtoSelecionado = (String) cmbProduto.getSelectedItem();
        System.out.println("Produto selecionado: " + produtoSelecionado); // Debug
        Produto produto = produtoController.getProdutoPorNome(produtoSelecionado);
        if (produto == null) {
            JOptionPane.showMessageDialog(rootPane, "Produto não encontrado: " + produtoSelecionado);
            return;
        }

        // Verificar a quantidade
        if (txtQuantidade.getText().isEmpty() || !Utilidades.isNumeric(txtQuantidade.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Digite uma quantidade válida");
            return;
        }

        int quantidade = Integer.parseInt(txtQuantidade.getText());

        // Adicionar linha na tabela
        String[] registro = {
            // Id
            String.valueOf(produto.getIdProduto()),
            // produto
            produto.getProduto(),
            // Descrição
            produto.getDescricao(),
            // Preço
            String.valueOf(produto.getPreco()),
            // Quantidade
            String.valueOf(quantidade),
            // Data atual
            new java.sql.Date(System.currentTimeMillis()).toString()
        };

        vTabela.addRow(registro);
        totalGeral();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        int idUsuario = SessaoUsuario.getIdUsuario();

        if (cmbCliente.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um cliente");
            return;
        }

        int numeroVenda = vendaController.getNumeroVenda();
        int idCliente = vendaController.getClientePorNome((String) cmbCliente.getSelectedItem()).getIdCliente();

        totalGeral();

        double valorVenda = Double.parseDouble(txtTotalValor.getText());
        int quantidadeTotal = Integer.parseInt(txtTotalQuantidade.getText());

        // Obtém o idProduto da primeira linha da tabela
        int idProduto = Integer.parseInt(tblTabela.getValueAt(0, 0).toString());

        // Busca o produto completo no banco
        Produto produto = produtoController.getProdutoPorId(idProduto);
        if (produto == null) {
            JOptionPane.showMessageDialog(rootPane, "Produto não encontrado no banco.");
            return;
        }

        // Salva a venda e captura o idVenda gerado
        int idVenda = vendaController.adicionarVenda(
                idUsuario, numeroVenda, new Date(), valorVenda,
                quantidadeTotal, idCliente,
                produto.getProduto(), produto.getDescricao(),
                produto.getPreco(), produto.getIdProduto()
        );

        if (idVenda == -1) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao salvar a venda.");
            return;
        }

        // Salva os detalhes da venda para cada item da tabela
        for (int i = 0; i < tblTabela.getRowCount(); i++) {
            idProduto = Integer.parseInt(tblTabela.getValueAt(i, 0).toString());
            produto = produtoController.getProdutoPorId(idProduto);
            if (produto == null) {
                continue;
            }

            int quantidade = Integer.parseInt(tblTabela.getValueAt(i, 4).toString());
            vendaController.adicionarDetalheVenda(idVenda, produto.getIdProduto(), produto.getPreco(), quantidade);
        }

        JOptionPane.showMessageDialog(rootPane, "Venda realizada com sucesso!");
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
        carregarVendasNaTabela();
        JOptionPane.showMessageDialog(rootPane, "Selecione a venda na tabela e clique em 'Exclusão' para deletar.");

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnConfirmarExclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarExclusaoActionPerformed
        int linha = tblTabela.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma venda na tabela para excluir.");
            return;
        }

        int idVenda = Integer.parseInt(tblTabela.getValueAt(linha, 0).toString());
        String produto = tblTabela.getValueAt(linha, 1).toString();

        int confirm = JOptionPane.showConfirmDialog(
                rootPane,
                "Tem certeza que deseja excluir a venda do produto: " + produto + "?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        String resposta = vendaController.excluirVenda(idVenda);
        JOptionPane.showMessageDialog(rootPane, resposta);

        carregarVendasNaTabela(); // atualiza a tabela
        totalGeral(); // atualiza os totais

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnConfirmarExclusaoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new UP_F06_Vendas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnConfirmarExclusao;
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

    // Método que cálcula o valor total
    private void totalGeral() {
        int numero = vTabela.getRowCount();
        int somaQuantidade = 0;
        double somaValor = 0;

        for (int i = 0; i < numero; i++) {
            somaQuantidade += Integer.parseInt(vTabela.getValueAt(i, 4).toString());
            somaValor += Double.parseDouble(vTabela.getValueAt(i, 3).toString())
                    * Integer.parseInt(vTabela.getValueAt(i, 4).toString());
        }

        txtTotalQuantidade.setText(String.valueOf(somaQuantidade));
        txtTotalValor.setText(String.valueOf(somaValor));
    }

    public void limparTabela() {
        // Limpa todas as linhas
        vTabela.setRowCount(0);
    }

    // Método para preencher o ComboBox de Clientes
    private void preencherComboClientes() {
        cmbCliente.removeAllItems();
        cmbCliente.addItem("Selecione um cliente");

        for (String nome : dados.getNomesClientes()) {
            cmbCliente.addItem(nome);
        }
    }

    // Método para preencher o ComboBox de Produtos
    private void preencherComboProdutos() {
        cmbProduto.removeAllItems();
        cmbProduto.addItem("Selecione um produto");

        for (String nomeProduto : dados.getNomesProdutos()) {
            cmbProduto.addItem(nomeProduto);
        }
    }

    private void carregarVendasNaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tblTabela.getModel();
        modelo.setRowCount(0); // limpa a tabela

        List<Venda> vendas = vendaController.listarVendas();

        for (Venda v : vendas) {
            modelo.addRow(new Object[]{
                v.getIdvenda(),
                v.getProduto(),
                v.getDescricao(),
                v.getPreco(),
                v.getQuantidade(),
                new SimpleDateFormat("dd/MM/yyyy").format(v.getData())
            });
        }
    }
}
