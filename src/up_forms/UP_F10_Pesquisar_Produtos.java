package up_forms;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import up_classes.Dados;
import up_classes.Utilidades;

public class UP_F10_Pesquisar_Produtos extends javax.swing.JDialog {

    private Dados sgbd;
    private DefaultTableModel mTabela;
    private String resposta = "";

    public void setSGBDmethods(Dados sgbd) {
        this.sgbd = sgbd;
    }

    public String getResposta() {
        return resposta;
    }

    private void preencherTabela() {
        String titulos[] = {"ID Produto", "Descricao"};
        String registro[] = new String[2];
        mTabela = new DefaultTableModel(null, titulos);
        String sql = "";

        if (txtPesquisaProduto.getText().equals("")) {
            sql = "select idProduto, descricao from produtos";
        } else {
            if (RadioID.isSelected()) {
                sql = "select idProduto, descricao from produtos " + " where idProduto like '" + txtPesquisaProduto.getText() + "%'";
            }
            if (RadioDescricao.isSelected()) {
                sql = "select idProduto, descricao from produtos " + " where descricao like '" + txtPesquisaProduto.getText() + "%'";
            }
        }
        ResultSet rs = sgbd.getConsulta(sql);
        try {
            while (rs.next()) {
                registro[0] = rs.getString("idProduto");
                registro[1] = rs.getString("descricao");
                mTabela.addRow(registro);
            }

            tblTabela.setModel(mTabela);
            return;

        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public UP_F10_Pesquisar_Produtos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        bgTipoPesquisa.add(RadioID);
        bgTipoPesquisa.add(RadioDescricao);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoPesquisa = new javax.swing.ButtonGroup();
        RadioID = new javax.swing.JRadioButton();
        RadioDescricao = new javax.swing.JRadioButton();
        txtPesquisaProduto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        btnPesquisaProduto = new javax.swing.JButton();
        btnPesquisaSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(".:Umbrella Pharmaceutical™ Pesquisa de Produtos");
        setMinimumSize(new java.awt.Dimension(683, 384));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RadioID.setBackground(new java.awt.Color(44, 44, 44));
        RadioID.setForeground(new java.awt.Color(255, 255, 255));
        RadioID.setSelected(true);
        RadioID.setText("ID Produto");
        getContentPane().add(RadioID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        RadioDescricao.setBackground(new java.awt.Color(44, 44, 44));
        RadioDescricao.setForeground(new java.awt.Color(255, 255, 255));
        RadioDescricao.setText("Descrição");
        RadioDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioDescricaoActionPerformed(evt);
            }
        });
        getContentPane().add(RadioDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        txtPesquisaProduto.setBackground(new java.awt.Color(44, 44, 44));
        txtPesquisaProduto.setForeground(new java.awt.Color(255, 255, 255));
        txtPesquisaProduto.setBorder(null);
        txtPesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(txtPesquisaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 460, -1));

        tblTabela.setBackground(new java.awt.Color(44, 44, 44));
        tblTabela.setForeground(new java.awt.Color(255, 255, 255));
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
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblTabela.setGridColor(new java.awt.Color(44, 44, 44));
        jScrollPane1.setViewportView(tblTabela);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 460, 200));

        btnPesquisaProduto.setText("Pesquisar");
        btnPesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

        btnPesquisaSair.setText("Sair");
        btnPesquisaSair.setMaximumSize(new java.awt.Dimension(82, 25));
        btnPesquisaSair.setMinimumSize(new java.awt.Dimension(82, 25));
        btnPesquisaSair.setPreferredSize(new java.awt.Dimension(82, 25));
        btnPesquisaSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisaSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Logos/009.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        preencherTabela();
        txtPesquisaProduto.requestFocusInWindow();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_formWindowOpened

    private void RadioDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioDescricaoActionPerformed
        txtPesquisaProduto.setText("");
        txtPesquisaProduto.requestFocusInWindow();
        preencherTabela();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_RadioDescricaoActionPerformed

    private void txtPesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaProdutoActionPerformed
        preencherTabela();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_txtPesquisaProdutoActionPerformed

    private void btnPesquisaSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaSairActionPerformed
        resposta = "";
        dispose();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnPesquisaSairActionPerformed

    private void btnPesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaProdutoActionPerformed
        int numero = tblTabela.getRowCount();
        if (numero == 0) {
            resposta = "";
            dispose();
            return;
        }

        for (int i = 0; i < numero; i++) {
            if (tblTabela.isRowSelected(i)) {
                resposta = Utilidades.objectToString(tblTabela.getValueAt(i, 0));
                dispose();
                return;
            }
        }
        resposta = Utilidades.objectToString(tblTabela.getValueAt(0, 0));
        dispose();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnPesquisaProdutoActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UP_F10_Pesquisar_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            UP_F10_Pesquisar_Produtos dialog = new UP_F10_Pesquisar_Produtos(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioDescricao;
    private javax.swing.JRadioButton RadioID;
    private javax.swing.ButtonGroup bgTipoPesquisa;
    private javax.swing.JButton btnPesquisaProduto;
    private javax.swing.JButton btnPesquisaSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtPesquisaProduto;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/up_images/Icons/Icon.jpg")));
    }
}
/**
 * 01000111 01101001 01101111 01110110 01100001 01101110 01101110 01101001
 */
