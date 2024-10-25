package up_forms;

import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import up_classes.Dados;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import up_classes.Relatorio;

public class UP_F07_Relatorios extends javax.swing.JInternalFrame {

    //private Connection cnn;
    public Dados dados;

    public void setDados(Dados dados) {
        this.dados = dados;
        // Obtém a conexão da classe Dados
        //this.cnn = dados.cnn;
    }

    // Construtor da classe
    public UP_F07_Relatorios() {
        initComponents();
        // Inicializar dados e a conexão
        dados = new Dados(); // Cria uma nova instância de Dados
        //this.cnn = dados.cnn; // Usa a conexão da instância de Dados 

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
        myButton_Add_Sales = new up_class_custom.MyButton();
        myButton_Generate_Pdf_File = new up_class_custom.MyButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Tabela = new javax.swing.JTable();
        lblIcon = new javax.swing.JLabel();

        setClosable(true);
        setTitle(".:Umbrella Pharmaceutical™ Reports");
        setMaximumSize(new java.awt.Dimension(1360, 720));
        setMinimumSize(new java.awt.Dimension(1360, 720));
        setPreferredSize(new java.awt.Dimension(1360, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Pdf_File.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_Pdf_File.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Pdf_File.setText("PDF File");
        getContentPane().add(lbl_Pdf_File, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 270, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 270, -1));

        myButton_Add_Sales.setBackground(new java.awt.Color(122, 0, 0));
        myButton_Add_Sales.setForeground(new java.awt.Color(255, 255, 255));
        myButton_Add_Sales.setText("Add sales");
        myButton_Add_Sales.setColor(new java.awt.Color(122, 0, 0));
        myButton_Add_Sales.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        myButton_Add_Sales.setRadius(50);
        myButton_Add_Sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton_Add_SalesActionPerformed(evt);
            }
        });
        getContentPane().add(myButton_Add_Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 440, 60));

        myButton_Generate_Pdf_File.setForeground(new java.awt.Color(255, 255, 255));
        myButton_Generate_Pdf_File.setText("Generate a PDF file");
        myButton_Generate_Pdf_File.setColor(new java.awt.Color(122, 0, 0));
        myButton_Generate_Pdf_File.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        myButton_Generate_Pdf_File.setPreferredSize(new java.awt.Dimension(253, 32));
        myButton_Generate_Pdf_File.setRadius(50);
        myButton_Generate_Pdf_File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton_Generate_Pdf_FileActionPerformed(evt);
            }
        });
        getContentPane().add(myButton_Generate_Pdf_File, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 440, 60));

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
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Logos/014.jpg"))); // NOI18N
        getContentPane().add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1355, 685));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myButton_Generate_Pdf_FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton_Generate_Pdf_FileActionPerformed
        int linhaSelecionada = tbl_Tabela.getSelectedRow();

        if (linhaSelecionada == -1) {
            // Nenhuma linha selecionada
            System.out.println("Nenhum registro selecionado.");
            return;
        }

        System.out.println("Linha selecionada: " + linhaSelecionada);

        // Extrair os dados da linha selecionada na tabela
        DefaultTableModel model = (DefaultTableModel) tbl_Tabela.getModel();
        int idVenda = (int) model.getValueAt(linhaSelecionada, 0);
        String nomeCliente = (String) model.getValueAt(linhaSelecionada, 2);
        String nomeProduto = (String) model.getValueAt(linhaSelecionada, 3);
        String descricao = (String) model.getValueAt(linhaSelecionada, 4);
        int quantidade = (int) model.getValueAt(linhaSelecionada, 5);
        double preco = (double) model.getValueAt(linhaSelecionada, 6);

        // Definir o caminho onde o PDF será salvo
        String caminhoArquivo = "relatorio_vendas.pdf";

        Dados dados = null;

        try {
            // Instanciar a classe Dados para realizar a consulta
            dados = new Dados();
            // Obter detalhes da venda selecionada com base no ID
            ResultSet rs = dados.getVendaPorId(idVenda);

            // Chama o método relatorioVenda para gerar o PDF, passando os dados selecionados
            Relatorio.relatorioVenda(caminhoArquivo, rs);

            System.out.println("PDF gerado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao gerar o relatório de vendas: " + e.getMessage());
        } finally {
            try {
                if (dados != null) {
                    dados.closeConnection(); // Fecha a conexão
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
            }
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
        System.out.println("evt Generate_Pdf_File executado com sucesso.!");
    }//GEN-LAST:event_myButton_Generate_Pdf_FileActionPerformed

    private void myButton_Add_SalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton_Add_SalesActionPerformed
        // Criar uma instância da classe Dados
        Dados dados = new Dados();

        // Obter o ResultSet com todas as vendas
        ResultSet vendas = dados.getVenda();

        // Limpar a tabela antes de adicionar novos dados
        DefaultTableModel model = (DefaultTableModel) tbl_Tabela.getModel();
        // Limpa as linhas existentes
        model.setRowCount(0);

        try {
            // Percorrer o ResultSet e adicionar os dados à tabela
            while (vendas != null && vendas.next()) {
                // Tabela vendas têm colunas --> idvenda(pk), data, idcliente(fk), idproduto(fk), descricao, quantidade e preco
                int idVenda = vendas.getInt("idvenda");
                Date data = vendas.getDate("data");
                int idCliente = vendas.getInt("idcliente");
                int idProduto = vendas.getInt("idproduto");
                String descricao = vendas.getString("descricao");
                int quantidade = vendas.getInt("quantidade");
                double preco = vendas.getDouble("preco");

                // Obter os nomes do cliente e do produto
                String nomeCliente = dados.getNomeClientePorId(idCliente);
                String nomeProduto = dados.getNomeProdutoPorId(idProduto);

                // Adicionar a linha na tabela com os nomes
                model.addRow(new Object[]{idVenda, data, nomeCliente, nomeProduto, descricao, quantidade, preco});
            }
        } catch (SQLException e) {
            // Tratar exceções se ocorrer um erro ao acessar o ResultSet
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Erro ao acessar vendas", e);
        } finally {
            // Fechar a conexão se necessário
            dados.close();
        }

        System.out.println("Vendas carregadas com sucesso!");

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
        System.out.println("evt search executado com sucesso.!");
    }//GEN-LAST:event_myButton_Add_SalesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lbl_Pdf_File;
    private up_class_custom.MyButton myButton_Add_Sales;
    private up_class_custom.MyButton myButton_Generate_Pdf_File;
    private javax.swing.JTable tbl_Tabela;
    // End of variables declaration//GEN-END:variables
}
