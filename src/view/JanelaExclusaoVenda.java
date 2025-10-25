package view;

import controller.VendaController;
import model.Venda;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.List;

public class JanelaExclusaoVenda extends JDialog {

    private JTable tabela;
    private DefaultTableModel modelo;
    private JTextField txtBusca;
    private final VendaController controller;

    public JanelaExclusaoVenda(VendaController controller) {
        this.controller = controller;
        setTitle("Excluir Venda");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setModal(true);
        setLayout(new BorderLayout());

        // Campo de busca
        txtBusca = new JTextField();
        txtBusca.setToolTipText("Buscar por produto...");
        txtBusca.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                filtrar();
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                filtrar();
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                filtrar();
            }

            private void filtrar() {
                String termo = txtBusca.getText();
                TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + termo));
                tabela.setRowSorter(sorter);
            }
        });
        add(txtBusca, BorderLayout.NORTH);

        // Tabela
        modelo = new DefaultTableModel(new Object[]{"ID", "Produto", "Descrição", "Preço", "Quantidade", "Data"}, 0);
        tabela = new JTable(modelo);
        tabela.setRowHeight(24);
        JScrollPane scroll = new JScrollPane(tabela);
        add(scroll, BorderLayout.CENTER);

        // Botão de exclusão
        JButton btnExcluir = new JButton("🗑️ Excluir Venda Selecionada");
        btnExcluir.setBackground(new Color(220, 53, 69));
        btnExcluir.setForeground(Color.WHITE);
        btnExcluir.setFont(new Font("Arial", Font.BOLD, 14));
        btnExcluir.addActionListener(e -> excluirVenda());
        add(btnExcluir, BorderLayout.SOUTH);

        carregarVendas();
    }

    private void carregarVendas() {
        modelo.setRowCount(0);
        List<Venda> vendas = controller.listarVendas();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (Venda v : vendas) {
            modelo.addRow(new Object[]{
                v.getIdvenda(),
                v.getProduto(),
                v.getDescricao(),
                v.getPreco(),
                v.getQuantidade(),
                sdf.format(v.getData())
            });
        }
    }

    private void excluirVenda() {
        int linha = tabela.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma venda para excluir.");
            return;
        }

        int id = (int) modelo.getValueAt(linha, 0);
        String produto = modelo.getValueAt(linha, 1).toString();

        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Tem certeza que deseja excluir a venda do produto: " + produto + "?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        String resposta = controller.excluirVenda(id);
        JOptionPane.showMessageDialog(this, resposta);
        carregarVendas(); // atualiza a tabela
    }
}
