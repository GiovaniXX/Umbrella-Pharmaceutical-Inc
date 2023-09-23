package up_forms;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import up_classes.Dados;
import up_classes.Utilidades;

public class UP_F09_Pesquisar_Cliente extends javax.swing.JDialog {

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
        String titulos[] = {"ID Cliente", "Nome", "Sobrenome"};
        String registro[] = new String[3];
        mTabela = new DefaultTableModel(null, titulos);
        String sql = "";

        if (txtPesquisaCliente.getText().equals("")) {
            sql = "select idCliente, nome, sobrenome from clientes";
        } else {
            if (RadioID.isSelected()) {
                sql = "select idCliente, nome, sobreNome from clientes " + " where idCliente like '" + txtPesquisaCliente.getText() + "%'";
            }
            if (RadioNomeCliente.isSelected()) {
                sql = "select idCliente, nome, sobreNome from clientes " + " where nome like '" + txtPesquisaCliente.getText() + "%'";
            }
            if (RadioSNomeCliente.isSelected()) {
                sql = "select idCliente, nome, sobreNome from clientes " + " where sobreNome like '" + txtPesquisaCliente.getText() + "%'";
            }
        }
        ResultSet rs = sgbd.getConsulta(sql);
        try {
            while (rs.next()) {
                registro[0] = rs.getString("idCliente");
                registro[1] = rs.getString("nome");
                registro[2] = rs.getString("sobreNome");;
                mTabela.addRow(registro);
            }

            tblTabela.setModel(mTabela);
            return;

        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public UP_F09_Pesquisar_Cliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        bgTipoPesquisa.add(RadioID);
        bgTipoPesquisa.add(RadioNomeCliente);
        bgTipoPesquisa.add(RadioSNomeCliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoPesquisa = new javax.swing.ButtonGroup();
        RadioID = new javax.swing.JRadioButton();
        RadioNomeCliente = new javax.swing.JRadioButton();
        RadioSNomeCliente = new javax.swing.JRadioButton();
        txtPesquisaCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        btnPesquisaCliente = new javax.swing.JButton();
        btnPesquisaSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(".:Umbrella Pharmaceutical™ Pesquisa de Cliente");
        setMaximumSize(new java.awt.Dimension(683, 384));
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
        RadioID.setText("ID Cliente");
        getContentPane().add(RadioID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        RadioNomeCliente.setBackground(new java.awt.Color(44, 44, 44));
        RadioNomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        RadioNomeCliente.setText("Nome Cliente");
        RadioNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioNomeClienteActionPerformed(evt);
            }
        });
        getContentPane().add(RadioNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        RadioSNomeCliente.setBackground(new java.awt.Color(44, 44, 44));
        RadioSNomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        RadioSNomeCliente.setText("S_Nome Cliente");
        RadioSNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioSNomeClienteActionPerformed(evt);
            }
        });
        getContentPane().add(RadioSNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        txtPesquisaCliente.setBackground(new java.awt.Color(44, 44, 44));
        txtPesquisaCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtPesquisaCliente.setBorder(null);
        txtPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtPesquisaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 460, -1));

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

        btnPesquisaCliente.setText("Pesquisar");
        btnPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

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
        txtPesquisaCliente.requestFocusInWindow();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_formWindowOpened

    private void RadioNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioNomeClienteActionPerformed
        txtPesquisaCliente.setText("");
        txtPesquisaCliente.requestFocusInWindow();
        preencherTabela();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_RadioNomeClienteActionPerformed

    private void RadioSNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioSNomeClienteActionPerformed
        txtPesquisaCliente.setText("");
        txtPesquisaCliente.requestFocusInWindow();
        preencherTabela();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_RadioSNomeClienteActionPerformed

    private void txtPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaClienteActionPerformed
        preencherTabela();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_txtPesquisaClienteActionPerformed

    private void btnPesquisaSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaSairActionPerformed
        resposta = "";
        dispose();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnPesquisaSairActionPerformed

    private void btnPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaClienteActionPerformed
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
    }//GEN-LAST:event_btnPesquisaClienteActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UP_F09_Pesquisar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            UP_F09_Pesquisar_Cliente dialog = new UP_F09_Pesquisar_Cliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JRadioButton RadioID;
    private javax.swing.JRadioButton RadioNomeCliente;
    private javax.swing.JRadioButton RadioSNomeCliente;
    private javax.swing.ButtonGroup bgTipoPesquisa;
    private javax.swing.JButton btnPesquisaCliente;
    private javax.swing.JButton btnPesquisaSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtPesquisaCliente;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/up_images/Icons/Icon.jpg")));
    }
}
/**
 * 01000111 01101001 01101111 01110110 01100001 01101110 01101110 01101001
 */
