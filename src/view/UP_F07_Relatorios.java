package view;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import categories.Relatorio;
import java.sql.ResultSet;
import dao.RelatorioDAO;

public class UP_F07_Relatorios extends javax.swing.JInternalFrame {

    private final RelatorioDAO relatorioDAO = new RelatorioDAO();

    public UP_F07_Relatorios() {
        initComponents();

        // Centraliza o texto nas colunas
        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < 6; i++) {
            tbl_Tabela.getColumnModel().getColumn(i).setCellRenderer(dtcr);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Pdf_File = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btn_Add_Sales = new javax.swing.JButton();
        btn_Generate_Pdf_File = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Tabela = new javax.swing.JTable();
        lblIcon = new javax.swing.JLabel();

        setClosable(true);
        setTitle(".:Umbrella Pharmaceutical™ Reports");
        setMaximumSize(new java.awt.Dimension(1440, 853));
        setMinimumSize(new java.awt.Dimension(1440, 853));
        setPreferredSize(new java.awt.Dimension(1440, 853));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Pdf_File.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_Pdf_File.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Pdf_File.setText("PDF File");
        getContentPane().add(lbl_Pdf_File, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 270, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 270, -1));

        btn_Add_Sales.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Add_Sales.setText("ADD SALES");
        btn_Add_Sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Add_SalesActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Add_Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 530, 60));

        btn_Generate_Pdf_File.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Generate_Pdf_File.setText("GENERATE PDF");
        btn_Generate_Pdf_File.setActionCommand("jButton2");
        btn_Generate_Pdf_File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Generate_Pdf_FileActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Generate_Pdf_File, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 530, 60));

        tbl_Tabela.setBackground(new java.awt.Color(0, 0, 0));
        tbl_Tabela.setForeground(new java.awt.Color(3, 155, 216));
        tbl_Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Data", "Nome do cliente", "Nome do produto", "Descrição do produto", "Quantidade", "Preco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Tabela.setGridColor(new java.awt.Color(0, 0, 0));
        tbl_Tabela.setMaximumSize(new java.awt.Dimension(462, 402));
        tbl_Tabela.setMinimumSize(new java.awt.Dimension(462, 402));
        tbl_Tabela.setPreferredSize(new java.awt.Dimension(462, 402));
        tbl_Tabela.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tbl_Tabela.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tbl_Tabela);
        if (tbl_Tabela.getColumnModel().getColumnCount() > 0) {
            tbl_Tabela.getColumnModel().getColumn(0).setMinWidth(50);
            tbl_Tabela.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbl_Tabela.getColumnModel().getColumn(0).setMaxWidth(50);
            tbl_Tabela.getColumnModel().getColumn(1).setMinWidth(100);
            tbl_Tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbl_Tabela.getColumnModel().getColumn(1).setMaxWidth(100);
            tbl_Tabela.getColumnModel().getColumn(5).setMinWidth(100);
            tbl_Tabela.getColumnModel().getColumn(5).setPreferredWidth(100);
            tbl_Tabela.getColumnModel().getColumn(5).setMaxWidth(100);
            tbl_Tabela.getColumnModel().getColumn(6).setMinWidth(100);
            tbl_Tabela.getColumnModel().getColumn(6).setPreferredWidth(100);
            tbl_Tabela.getColumnModel().getColumn(6).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 280, 1338, 395));

        lblIcon.setBackground(new java.awt.Color(50, 0, 1));
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/variadas/Logos/0014.jpg"))); // NOI18N
        getContentPane().add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 853));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Add_SalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Add_SalesActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbl_Tabela.getModel();
        model.setRowCount(0);

        try (var vendas = relatorioDAO.getVendas()) {
            while (vendas != null && vendas.next()) {
                int idVenda = vendas.getInt("idvenda");
                Date data = vendas.getDate("data");
                int idCliente = vendas.getInt("idcliente");
                int idProduto = vendas.getInt("idproduto");
                String descricao = vendas.getString("descricao");
                int quantidade = vendas.getInt("quantidade");
                double preco = vendas.getDouble("preco");

                String nomeCliente = relatorioDAO.getNomeClientePorId(idCliente);
                String nomeProduto = relatorioDAO.getNomeProdutoPorId(idProduto);

                model.addRow(new Object[]{idVenda, data, nomeCliente, nomeProduto, descricao, quantidade, preco});
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Erro ao acessar vendas", e);
        }

        System.out.println("Vendas carregadas com sucesso!");
        System.out.println("ID do evento: " + evt.getID());
    }//GEN-LAST:event_btn_Add_SalesActionPerformed

    private void btn_Generate_Pdf_FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Generate_Pdf_FileActionPerformed
        int linhaSelecionada = tbl_Tabela.getSelectedRow();

        if (linhaSelecionada == -1) {
            System.out.println("Nenhum registro selecionado.");
            return;
        }

        int idVenda = (int) tbl_Tabela.getValueAt(linhaSelecionada, 0);
        String caminhoArquivo = "relatorio_vendas.pdf";

        try {
            ResultSet rs = relatorioDAO.getVendaPorId(idVenda);
            Relatorio.relatorioVenda(caminhoArquivo, rs);
            System.out.println("PDF gerado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao gerar o relatório de vendas: " + e.getMessage());
        }
        System.out.println("PDF gerado com sucesso!");
        System.out.println("ID do evento: " + evt.getID());
    }//GEN-LAST:event_btn_Generate_Pdf_FileActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add_Sales;
    private javax.swing.JButton btn_Generate_Pdf_File;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lbl_Pdf_File;
    private javax.swing.JTable tbl_Tabela;
    // End of variables declaration//GEN-END:variables
}
