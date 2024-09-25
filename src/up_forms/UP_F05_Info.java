package up_forms;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;
import up_classes.Dados;

public class UP_F05_Info extends javax.swing.JInternalFrame {

    public Dados dados;

    public void setDados(Dados dados) {
        this.dados = dados;
    }

    public UP_F05_Info() {
        initComponents();
        String htmlContent = "<html>"
                + "<body style='font-size: 8px;'>"
                + "<h1 style='font-size: 18px;'>Giovani V. Chaves - Developer</h1>"
                + "<p><b>Giovani V. Chaves</b> é um desenvolvedor altamente capacitado com uma sólida formação em Desenvolvimento de Sistemas e Web Design, obtida em um curso tecnólogo de dois anos pela Prepara Cursos Profissionalizantes. Desde o início de sua carreira, tem demonstrado grande dedicação e paixão pela tecnologia, investindo continuamente em sua qualificação profissional.</p>"
                + "<p>Além de sua formação inicial, Giovani ampliou suas habilidades técnicas por meio de uma série de bootcamps intensivos pela Digital Innovation One (DIO), especializando-se em linguagens de programação como Java e C#, além de adquirir valiosas soft skills.</p>"
                + "<h2 style='font-size: 16px;'>Formações e Certificações:</h2>"
                + "<ul>"
                + "<li>.NET Developer</li>"
                + "<li>Cognizant Cloud Data Engineer</li>"
                + "<li>GFT Quality Assurance</li>"
                + "<li>NTT DATA Android Developer</li>"
                + "<li>Java Developer</li>"
                + "<li>Desenvolvimento Avançado em Java</li>"
                + "<li>Arquitetura de Sistemas Avançada</li>"
                + "<li>Desenvolvimento Integrado de Dados com SQLite no Android</li>"
                + "<li>Princípios de Pensamento Computacional com Python</li>"
                + "<li>Testes Unitários com JUnit</li>"
                + "<li>Segurança da Informação com Python</li>"
                + "<li>Explorando Relacionamentos com MySQL Workbench</li>"
                + "<li>Implementando Validações de Testes Unitários com Csharp</li>"
                + "</ul>"
                + "<p>Atualmente, Giovani está expandindo seu conhecimento ao cursar Engenharia de Software (bacharelado) na Uniasselve - Centro Universitário Leonardo da Vinci, com previsão de conclusão em 2027. Com foco na inovação e na busca por excelência, ele aprimora suas habilidades técnicas e de pensamento crítico, sendo um profissional preparado para enfrentar os desafios do mercado.</p>"
                + "<h3 style='font-size: 8px;'>Data.: 25/09/2024 - Lages sc</h3>"
                + "</body>"
                + "</html>";
        jep_Info.setContentType("text/html");
        jep_Info.setText(htmlContent);

        // Oculta o cursor (caret) não seja exibido
        jep_Info.getCaret().setVisible(false);
        jep_Info.setCaretPosition(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        openLinkedinProfile = new javax.swing.JLabel();
        openGitHubProfile = new javax.swing.JLabel();
        openFacebookProfile = new javax.swing.JLabel();
        MSN = new javax.swing.JLabel();
        Grau = new javax.swing.JLabel();
        Curso = new javax.swing.JLabel();
        Chapeu = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        Logo_Linkedin = new javax.swing.JLabel();
        Logo_GitHub = new javax.swing.JLabel();
        Logo_Facebook = new javax.swing.JLabel();
        GvC_Developer = new javax.swing.JLabel();
        Avanade = new javax.swing.JLabel();
        Cognizant = new javax.swing.JLabel();
        GTF = new javax.swing.JLabel();
        NTTData = new javax.swing.JLabel();
        Uniasselvi = new javax.swing.JLabel();
        Java_Developer = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        jep_Info = new javax.swing.JEditorPane();
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
        getContentPane().add(openLinkedinProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 610, 50, -1));

        openGitHubProfile.setForeground(new java.awt.Color(0, 0, 0));
        openGitHubProfile.setText("GitHub");
        openGitHubProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        openGitHubProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openGitHubProfileMouseClicked(evt);
            }
        });
        getContentPane().add(openGitHubProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, 50, -1));

        openFacebookProfile.setForeground(new java.awt.Color(0, 0, 0));
        openFacebookProfile.setText("Facebook");
        openFacebookProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        openFacebookProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openFacebookProfileMouseClicked(evt);
            }
        });
        getContentPane().add(openFacebookProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 60, -1));

        MSN.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        MSN.setForeground(new java.awt.Color(0, 0, 0));
        MSN.setText("My Social Networks");
        getContentPane().add(MSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, -1, -1));

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
        getContentPane().add(Logo_Linkedin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 600, 40, -1));

        Logo_GitHub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Icons/github1.png"))); // NOI18N
        Logo_GitHub.setPreferredSize(new java.awt.Dimension(32, 32));
        getContentPane().add(Logo_GitHub, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 40, -1));

        Logo_Facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Icons/facebook2.png"))); // NOI18N
        Logo_Facebook.setPreferredSize(new java.awt.Dimension(32, 32));
        getContentPane().add(Logo_Facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 40, -1));

        GvC_Developer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Developer.png"))); // NOI18N
        GvC_Developer.setText("jLabel1");
        getContentPane().add(GvC_Developer, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 200, 90));

        Avanade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Avanade.jpg"))); // NOI18N
        getContentPane().add(Avanade, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, -1, -1));

        Cognizant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Cognizant.jpg"))); // NOI18N
        getContentPane().add(Cognizant, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 220, -1, -1));

        GTF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/GFT.jpg"))); // NOI18N
        getContentPane().add(GTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 430, -1, -1));

        NTTData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/NTT_DATA.jpg"))); // NOI18N
        getContentPane().add(NTTData, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 214, -1, -1));

        Uniasselvi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Uniasselvi.png"))); // NOI18N
        getContentPane().add(Uniasselvi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 424, -1, -1));

        Java_Developer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/DIO.jpg"))); // NOI18N
        getContentPane().add(Java_Developer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, -1, -1));

        jep_Info.setEditable(false);
        jep_Info.setBackground(new java.awt.Color(29, 192, 207));
        jep_Info.setForeground(new java.awt.Color(0, 0, 72));
        jep_Info.setText("Giovani V. Chaves - Developer\nGiovani V. Chaves é um desenvolvedor altamente capacitado com uma sólida formação em Desenvolvimento de Sistemas e Web Design, obtida em um curso tecnólogo de dois anos pela Prepara Cursos Profissionalizantes. Desde o início de sua carreira, tem demonstrado grande dedicação e paixão pela tecnologia, investindo continuamente em sua qualificação profissional.\nAlém de sua formação inicial, Giovani ampliou suas habilidades técnicas por meio de uma série de bootcamps intensivos pela Digital Innovation One (DIO), especializando-se em linguagens de programação como Java e C#, além de adquirir valiosas soft skills.\nFormações e Certificações:\n.NET Developer\nCognizant Cloud Data Engineer\nGFT Quality Assurance\nNTT DATA Android Developer\nJava Developer\nDesenvolvimento Avançado em Java\nArquitetura de Sistemas Avançada\nDesenvolvimento Integrado de Dados com SQLite no Android\nPrincípios de Pensamento Computacional com Python\nTestes Unitários com JUnit\nSegurança da Informação com Python\nExplorando Relacionamentos com MySQL Workbench\nImplementando Validações de Testes Unitários com Csharp\nAtualmente, Giovani está expandindo seu conhecimento ao cursar Engenharia de Software (bacharelado) na Uniasselve - Centro Universitário Leonardo da Vinci, com previsão de conclusão em 2027. Com foco na inovação e na busca por excelência, ele aprimora suas habilidades técnicas e de pensamento crítico, sendo um profissional preparado para enfrentar os desafios do mercado de tecnologia.\nSeus projetos e habilidades abrangem áreas como desenvolvimento de software robusto, testes unitários, e segurança da informação. Giovani é focado no crescimento contínuo e na busca de soluções inovadoras para problemas complexos, sendo um profissional valioso para qualquer equipe de tecnologia.\nLages, SC 08/09/2024");
        jScrollPane.setViewportView(jep_Info);

        getContentPane().add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 690, 400));

        TelaFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Logos/012.jpg"))); // NOI18N
        TelaFundo.setMaximumSize(new java.awt.Dimension(1366, 768));
        TelaFundo.setMinimumSize(new java.awt.Dimension(1366, 768));
        TelaFundo.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(TelaFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 730));
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
    private javax.swing.JLabel Avanade;
    private javax.swing.JLabel Chapeu;
    private javax.swing.JLabel Cognizant;
    private javax.swing.JLabel Curso;
    private javax.swing.JLabel GTF;
    private javax.swing.JLabel Grau;
    private javax.swing.JLabel GvC_Developer;
    private javax.swing.JLabel Java_Developer;
    private javax.swing.JLabel Logo_Facebook;
    private javax.swing.JLabel Logo_GitHub;
    private javax.swing.JLabel Logo_Linkedin;
    private javax.swing.JLabel MSN;
    private javax.swing.JLabel NTTData;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel TelaFundo;
    private javax.swing.JLabel Uniasselvi;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JEditorPane jep_Info;
    private javax.swing.JLabel openFacebookProfile;
    private javax.swing.JLabel openGitHubProfile;
    private javax.swing.JLabel openLinkedinProfile;
    // End of variables declaration//GEN-END:variables
}
