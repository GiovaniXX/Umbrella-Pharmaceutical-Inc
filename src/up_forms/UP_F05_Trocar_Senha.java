package up_forms;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import up_classes.DadosDB;

public class UP_F05_Trocar_Senha extends javax.swing.JDialog {

    private String senha;
    private String usuario;
    private DadosDB dadosDB;

    public void setDadosDB(DadosDB dadosDB) {
        this.dadosDB = dadosDB;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public UP_F05_Trocar_Senha(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAtual = new javax.swing.JPasswordField();
        txtNova = new javax.swing.JPasswordField();
        txtConfirmacao = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(".:Umbrella Pharmaceutical Inc™ Troca de Senha                                                                                                                                Giovani V. Chaves ®");
        setMaximumSize(new java.awt.Dimension(936, 248));
        setMinimumSize(new java.awt.Dimension(936, 248));

        jPanel1.setBackground(new java.awt.Color(12, 45, 60));
        jPanel1.setMaximumSize(new java.awt.Dimension(936, 248));
        jPanel1.setMinimumSize(new java.awt.Dimension(936, 248));
        jPanel1.setPreferredSize(new java.awt.Dimension(936, 248));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/010.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, -1));

        jPanel2.setBackground(new java.awt.Color(8, 13, 32));
        jPanel2.setMaximumSize(new java.awt.Dimension(936, 248));
        jPanel2.setMinimumSize(new java.awt.Dimension(936, 248));
        jPanel2.setPreferredSize(new java.awt.Dimension(936, 248));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/009.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 10, -1, 140));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Senha Atual.:");
        jLabel4.setMaximumSize(new java.awt.Dimension(87, 15));
        jLabel4.setMinimumSize(new java.awt.Dimension(87, 15));
        jLabel4.setPreferredSize(new java.awt.Dimension(87, 15));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Senha Nova.:");
        jLabel5.setMaximumSize(new java.awt.Dimension(87, 15));
        jLabel5.setMinimumSize(new java.awt.Dimension(87, 15));
        jLabel5.setPreferredSize(new java.awt.Dimension(87, 15));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Confirmar Senha.:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        txtAtual.setBackground(new java.awt.Color(0, 38, 93));
        txtAtual.setForeground(new java.awt.Color(255, 255, 255));
        txtAtual.setBorder(null);
        jPanel2.add(txtAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 280, -1));

        txtNova.setBackground(new java.awt.Color(0, 38, 93));
        txtNova.setForeground(new java.awt.Color(255, 255, 255));
        txtNova.setBorder(null);
        jPanel2.add(txtNova, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 280, -1));

        txtConfirmacao.setBackground(new java.awt.Color(0, 38, 93));
        txtConfirmacao.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmacao.setBorder(null);
        jPanel2.add(txtConfirmacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 280, -1));

        btnEntrar.setBackground(new java.awt.Color(0, 38, 93));
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Trocar Senha");
        btnEntrar.setBorder(null);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 80, 25));

        btnSair.setBackground(new java.awt.Color(0, 38, 93));
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.setBorder(null);
        btnSair.setMaximumSize(new java.awt.Dimension(66, 25));
        btnSair.setMinimumSize(new java.awt.Dimension(66, 25));
        btnSair.setPreferredSize(new java.awt.Dimension(66, 25));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel2.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 80, 25));

        btnLimpar.setBackground(new java.awt.Color(0, 38, 93));
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/011.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 10, 690, 215));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 5, 705, 235));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String atual = new String(txtAtual.getPassword());
        String nova = new String(txtNova.getPassword());
        String confirmacao = new String(txtConfirmacao.getPassword());

        if (atual.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Insira a senha atual");
            txtAtual.requestFocusInWindow();
            return;
        }

        if (nova.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Insira a nova senha!");
            txtNova.requestFocusInWindow();
            return;
        }

        if (confirmacao.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Confirme a nova senha!");
            txtConfirmacao.requestFocusInWindow();
            return;
        }

        if (!atual.equals(senha)) {
            JOptionPane.showMessageDialog(rootPane, "Senha atual diferente da senha do sistema principal!");
            txtAtual.setText("");
            txtAtual.requestFocusInWindow();
            return;
        }

        if (!nova.equals(confirmacao)) {
            JOptionPane.showMessageDialog(rootPane, "Senha nova diferente da confirmação!");
            txtAtual.setText("");
            txtNova.setText("");
            txtConfirmacao.setText("");
            txtNova.requestFocusInWindow();
            return;
        }

        dadosDB.trocarSenha(usuario, nova);
        JOptionPane.showMessageDialog(rootPane, "Senha alterada com sucesso!");
        this.dispose();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNova.setText("");
        txtAtual.setText("");
        txtConfirmacao.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UP_F05_Trocar_Senha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UP_F05_Trocar_Senha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UP_F05_Trocar_Senha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UP_F05_Trocar_Senha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UP_F05_Trocar_Senha dialog = new UP_F05_Trocar_Senha(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtAtual;
    private javax.swing.JPasswordField txtConfirmacao;
    private javax.swing.JPasswordField txtNova;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/up_images/Icons/Icon.jpg")));
    }
}
