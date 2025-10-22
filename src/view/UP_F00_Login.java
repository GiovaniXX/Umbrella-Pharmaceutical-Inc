package view;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import util.Conexao;

public class UP_F00_Login extends javax.swing.JFrame {

    private final controller.UsuarioController usuarioController = new controller.UsuarioController();

    private Connection cnn;

    public UP_F00_Login() {
        initComponents();
        status();
        setIcon();
    }

    private void status() {
        try {
            Timer timer = new Timer(2000, new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Connection cnn = Conexao.getConnection();
                        // Adiciona verificação se a conexão está ativa
                        if (cnn != null && !cnn.isClosed()) {
                            SGBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/banners/dbok.png")));
                        } else {
                            SGBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/banners/dberror.png")));
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, ex);
                    } finally {
                        try {
                            if (cnn != null) {
                                cnn.close();
                            }
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, ex);
                        }
                    }
                }
            });
            timer.setRepeats(false);
            timer.start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUmbrellaCorporationIBS = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        SGBD = new javax.swing.JLabel();
        _SGBD = new javax.swing.JLabel();
        textField_User = new javax.swing.JTextField();
        passwordField_AccessCode = new javax.swing.JPasswordField();
        passwordField_SecurityKey = new javax.swing.JPasswordField();
        btnEnter = new javax.swing.JButton();
        btnOut = new javax.swing.JButton();
        lblLogoUmbrellaCorporation = new javax.swing.JLabel();
        lbllLogoMySQL = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        AccessCode = new javax.swing.JLabel();
        SecurityKey = new javax.swing.JLabel();
        TelaFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".:Umbrella Pharmaceutical Inc™ Login");
        setMinimumSize(new java.awt.Dimension(936, 248));
        setResizable(false);
        setSize(new java.awt.Dimension(936, 248));

        jPanel1.setBackground(new java.awt.Color(75, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(936, 248));
        jPanel1.setMinimumSize(new java.awt.Dimension(936, 248));
        jPanel1.setPreferredSize(new java.awt.Dimension(936, 248));

        lblUmbrellaCorporationIBS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/banners/04.jpg"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(157, 38, 42));
        jPanel2.setMaximumSize(new java.awt.Dimension(691, 222));
        jPanel2.setMinimumSize(new java.awt.Dimension(691, 222));
        jPanel2.setPreferredSize(new java.awt.Dimension(691, 222));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SGBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/banners/dberror.png"))); // NOI18N
        jPanel2.add(SGBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 180, -1, -1));

        _SGBD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        _SGBD.setForeground(new java.awt.Color(218, 139, 8));
        _SGBD.setText("Database");
        jPanel2.add(_SGBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 198, -1, 10));

        textField_User.setBackground(new java.awt.Color(75, 0, 0));
        textField_User.setForeground(new java.awt.Color(255, 255, 255));
        textField_User.setBorder(null);
        textField_User.setPreferredSize(new java.awt.Dimension(64, 22));
        jPanel2.add(textField_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 35, 340, -1));

        passwordField_AccessCode.setBackground(new java.awt.Color(75, 0, 0));
        passwordField_AccessCode.setForeground(new java.awt.Color(255, 255, 255));
        passwordField_AccessCode.setBorder(null);
        passwordField_AccessCode.setPreferredSize(new java.awt.Dimension(64, 22));
        jPanel2.add(passwordField_AccessCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 85, 340, -1));

        passwordField_SecurityKey.setBackground(new java.awt.Color(75, 0, 0));
        passwordField_SecurityKey.setForeground(new java.awt.Color(255, 255, 255));
        passwordField_SecurityKey.setBorder(null);
        passwordField_SecurityKey.setPreferredSize(new java.awt.Dimension(64, 22));
        jPanel2.add(passwordField_SecurityKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 135, 340, -1));

        btnEnter.setBackground(new java.awt.Color(75, 0, 0));
        btnEnter.setText("Logar");
        btnEnter.setBorder(null);
        btnEnter.setPreferredSize(new java.awt.Dimension(76, 23));
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        jPanel2.add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        btnOut.setBackground(new java.awt.Color(75, 0, 0));
        btnOut.setText("Deslogar");
        btnOut.setBorder(null);
        btnOut.setName(""); // NOI18N
        btnOut.setPreferredSize(new java.awt.Dimension(76, 23));
        btnOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutActionPerformed(evt);
            }
        });
        jPanel2.add(btnOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 190, -1, -1));

        lblLogoUmbrellaCorporation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/banners/05.jpg"))); // NOI18N
        jPanel2.add(lblLogoUmbrellaCorporation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 160));

        lbllLogoMySQL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/banners/mysql.jpg"))); // NOI18N
        jPanel2.add(lbllLogoMySQL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 175, 70, 40));

        User.setForeground(new java.awt.Color(255, 255, 255));
        User.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        User.setText("USER:");
        User.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        User.setMaximumSize(new java.awt.Dimension(80, 15));
        User.setMinimumSize(new java.awt.Dimension(80, 15));
        User.setPreferredSize(new java.awt.Dimension(80, 15));
        jPanel2.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 90, -1));

        AccessCode.setForeground(new java.awt.Color(255, 255, 255));
        AccessCode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AccessCode.setText("ACCESS CODE:");
        AccessCode.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        AccessCode.setMaximumSize(new java.awt.Dimension(90, 15));
        AccessCode.setMinimumSize(new java.awt.Dimension(90, 15));
        AccessCode.setPreferredSize(new java.awt.Dimension(90, 15));
        jPanel2.add(AccessCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        SecurityKey.setForeground(new java.awt.Color(255, 255, 255));
        SecurityKey.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SecurityKey.setText("SECURITY KEY:");
        SecurityKey.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        SecurityKey.setMaximumSize(new java.awt.Dimension(90, 15));
        SecurityKey.setMinimumSize(new java.awt.Dimension(90, 15));
        SecurityKey.setPreferredSize(new java.awt.Dimension(90, 15));
        jPanel2.add(SecurityKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));
        jPanel2.add(TelaFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 14, 680, 208));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblUmbrellaCorporationIBS)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUmbrellaCorporationIBS)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        String usuario = textField_User.getText();
        String senha = new String(passwordField_AccessCode.getPassword());
        String chave = new String(passwordField_SecurityKey.getPassword());

        // Verifica se algum dos campos está em branco
        if (usuario.isEmpty() || senha.isEmpty() || chave.isEmpty()) {
            String message = "<html><font color='orange'><b>Preencha todos os campos!</b></font></html>";
            showMessageWithDuration(message, "Aviso", JOptionPane.WARNING_MESSAGE, 2000);

            textField_User.setText("");
            passwordField_AccessCode.setText("");
            passwordField_SecurityKey.setText("");
            textField_User.requestFocusInWindow();
            return;
        }

        // Validação com o banco de dados
        if (!usuarioController.autenticar(usuario, senha, chave)) {
            String errorMessage = "<html><font color='red'><b>Houve um erro na validação com o banco de dados!</b></font></html>";
            showMessageWithDuration(errorMessage, "Erro", JOptionPane.ERROR_MESSAGE, 2000);

            textField_User.setText("");
            passwordField_AccessCode.setText("");
            passwordField_SecurityKey.setText("");
            textField_User.requestFocusInWindow();
            return;
        }

        String successMessage = "<html><font color='green'><b>Conexão bem sucedida!</b></font></html>";
        showMessageWithDuration(successMessage, "Sucesso", JOptionPane.INFORMATION_MESSAGE, 1000);

        // ↓ Continuação do fluxo do código quando a validação é bem-sucedida ↓            
        UP_F01_Principal ufp = new UP_F01_Principal();
        this.setVisible(false);
        ufp.setIdPerfil(usuarioController.obterIdPerfil(usuario));
        ufp.setSenha(senha);
        ufp.setChave(chave);
        ufp.setUsuario(usuario);

        ufp.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ufp.setVisible(true);

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutActionPerformed
        System.exit(0);

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnOutActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UP_F00_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new UP_F00_Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccessCode;
    private javax.swing.JLabel SGBD;
    private javax.swing.JLabel SecurityKey;
    private javax.swing.JLabel TelaFundo;
    private javax.swing.JLabel User;
    private javax.swing.JLabel _SGBD;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnOut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblLogoUmbrellaCorporation;
    private javax.swing.JLabel lblUmbrellaCorporationIBS;
    private javax.swing.JLabel lbllLogoMySQL;
    private javax.swing.JPasswordField passwordField_AccessCode;
    private javax.swing.JPasswordField passwordField_SecurityKey;
    private javax.swing.JTextField textField_User;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/Icons/Icon.jpg")));
    }

    private void showMessageWithDuration(String message, String title, int messageType, int duration) {
        JOptionPane pane = new JOptionPane(message, messageType);
        JDialog dialog = pane.createDialog(rootPane, title);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        Timer timer = new Timer(duration, (e) -> {
            dialog.dispose();
        });
        timer.setRepeats(false);
        timer.start();

        dialog.setVisible(true);
    }
}
