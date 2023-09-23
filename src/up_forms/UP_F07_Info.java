package up_forms;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;
import up_classes.Dados;

public class UP_F07_Info extends javax.swing.JInternalFrame {

    public Dados dados;

    public void setDados(Dados dados) {
        this.dados = dados;
    }

    public UP_F07_Info() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        openLinkedinProfile = new javax.swing.JLabel();
        openGitHubProfile = new javax.swing.JLabel();
        openFacebookProfile = new javax.swing.JLabel();
        JSP = new javax.swing.JScrollPane();
        Informacao = new javax.swing.JTextArea();
        WhatsUp = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        MSN = new javax.swing.JLabel();
        Grau = new javax.swing.JLabel();
        Curso = new javax.swing.JLabel();
        Chapeu = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        Logo_Linkedin = new javax.swing.JLabel();
        Logo_GitHub = new javax.swing.JLabel();
        Logo_Facebook = new javax.swing.JLabel();
        DIO = new javax.swing.JLabel();
        NTTData = new javax.swing.JLabel();
        Uniasselvi = new javax.swing.JLabel();
        TelaFundo = new javax.swing.JLabel();

        setClosable(true);
        setTitle(".:Umbrella Pharmaceutical Inc™ Info");
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        openLinkedinProfile.setForeground(new java.awt.Color(0, 0, 0));
        openLinkedinProfile.setText("Linkedin");
        openLinkedinProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        openLinkedinProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openLinkedinProfileMouseClicked(evt);
            }
        });
        getContentPane().add(openLinkedinProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 50, -1));

        openGitHubProfile.setForeground(new java.awt.Color(0, 0, 0));
        openGitHubProfile.setText("GitHub");
        openGitHubProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        openGitHubProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openGitHubProfileMouseClicked(evt);
            }
        });
        getContentPane().add(openGitHubProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 50, -1));

        openFacebookProfile.setForeground(new java.awt.Color(0, 0, 0));
        openFacebookProfile.setText("Facebook");
        openFacebookProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        openFacebookProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openFacebookProfileMouseClicked(evt);
            }
        });
        getContentPane().add(openFacebookProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 60, -1));

        Informacao.setEditable(false);
        Informacao.setBackground(new java.awt.Color(13, 154, 172));
        Informacao.setColumns(20);
        Informacao.setForeground(new java.awt.Color(0, 0, 0));
        Informacao.setRows(5);
        Informacao.setText(" Me chamo Giovani V. Chaves\n\n Aqui mostro algumas de minhas certificações, principalmente na Línguagem Java.\n Também desenvolvo em C#.\n\n Sou formado em Desenvolvimentos de Sistemas e Web Designer, com um bom conhecimento em\n HTML5, CSS3 e JavaScript.\n\n No presente momento, estou cursando Engenharia de Software (Bacharelado).\n com previsão de formação em 2027.\n\nJoinvile, 27 de agosto de 2023");
        JSP.setViewportView(Informacao);

        getContentPane().add(JSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 620, 410));

        WhatsUp.setForeground(new java.awt.Color(0, 0, 0));
        WhatsUp.setText("(49) 9 9936-7954");
        getContentPane().add(WhatsUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 606, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Icons/whatsapp.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 597, -1, -1));

        MSN.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        MSN.setForeground(new java.awt.Color(0, 0, 0));
        MSN.setText("My Social Networks");
        getContentPane().add(MSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        Grau.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Grau.setForeground(new java.awt.Color(29, 29, 27));
        Grau.setText("(Bacharelado)");
        getContentPane().add(Grau, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 610, -1, -1));

        Curso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Curso.setForeground(new java.awt.Color(29, 29, 27));
        Curso.setText("Engenharia de Software");
        getContentPane().add(Curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, -1, -1));

        Chapeu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Icons/chapeu-de-graduacao.png"))); // NOI18N
        Chapeu.setPreferredSize(new java.awt.Dimension(32, 32));
        getContentPane().add(Chapeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        Nome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Nome.setForeground(new java.awt.Color(29, 29, 27));
        Nome.setText("Giovani V. Chaves");
        getContentPane().add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        Logo_Linkedin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Icons/linkedin1.png"))); // NOI18N
        Logo_Linkedin.setPreferredSize(new java.awt.Dimension(32, 32));
        getContentPane().add(Logo_Linkedin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 40, -1));

        Logo_GitHub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Icons/github1.png"))); // NOI18N
        Logo_GitHub.setPreferredSize(new java.awt.Dimension(32, 32));
        getContentPane().add(Logo_GitHub, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 40, -1));

        Logo_Facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Icons/facebook2.png"))); // NOI18N
        Logo_Facebook.setPreferredSize(new java.awt.Dimension(32, 32));
        getContentPane().add(Logo_Facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 40, -1));

        DIO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/DIO.jpg"))); // NOI18N
        getContentPane().add(DIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, -1, -1));

        NTTData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/NTT_DATA.jpg"))); // NOI18N
        getContentPane().add(NTTData, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 214, -1, -1));

        Uniasselvi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Uniasselvi.png"))); // NOI18N
        getContentPane().add(Uniasselvi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 424, -1, -1));

        TelaFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Logos/012.jpg"))); // NOI18N
        TelaFundo.setMaximumSize(new java.awt.Dimension(1366, 768));
        TelaFundo.setMinimumSize(new java.awt.Dimension(1366, 768));
        TelaFundo.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(TelaFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 774));
        TelaFundo.getAccessibleContext().setAccessibleName("");

        setBounds(0, 0, 1366, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void openFacebookProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openFacebookProfileMouseClicked
        final String FACEBOOK_PROFILE_URL = "https://www.facebook.com/giovani.chaves.52";
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI(FACEBOOK_PROFILE_URL));
        } catch (IOException | URISyntaxException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir o perfil do Facebook", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_openFacebookProfileMouseClicked

    private void openGitHubProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openGitHubProfileMouseClicked
        final String FACEBOOK_PROFILE_URL = "https://github.com/GiovaniXX";
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI(FACEBOOK_PROFILE_URL));
        } catch (IOException | URISyntaxException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir o perfil do GitHub", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_openGitHubProfileMouseClicked

    private void openLinkedinProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openLinkedinProfileMouseClicked
        final String FACEBOOK_PROFILE_URL = "https://www.linkedin.com/in/giovani-v-chaves-245440201/";
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI(FACEBOOK_PROFILE_URL));
        } catch (IOException | URISyntaxException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir o perfil do Linkedin", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_openLinkedinProfileMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Chapeu;
    private javax.swing.JLabel Curso;
    private javax.swing.JLabel DIO;
    private javax.swing.JLabel Grau;
    private javax.swing.JTextArea Informacao;
    private javax.swing.JScrollPane JSP;
    private javax.swing.JLabel Logo_Facebook;
    private javax.swing.JLabel Logo_GitHub;
    private javax.swing.JLabel Logo_Linkedin;
    private javax.swing.JLabel MSN;
    private javax.swing.JLabel NTTData;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel TelaFundo;
    private javax.swing.JLabel Uniasselvi;
    private javax.swing.JLabel WhatsUp;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel openFacebookProfile;
    private javax.swing.JLabel openGitHubProfile;
    private javax.swing.JLabel openLinkedinProfile;
    // End of variables declaration//GEN-END:variables
}
/**
 * 01000111 01101001 01101111 01110110 01100001 01101110 01101110 01101001
 */
