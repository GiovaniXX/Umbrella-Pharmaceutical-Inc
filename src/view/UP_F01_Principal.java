package view;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;
import categories.Letreiro;
import util.Conexao;

public class UP_F01_Principal extends javax.swing.JFrame {

    private final Letreiro letreiro;
    public Conexao conexao;

    public int idPerfil;
    public String senha;
    public String chave;
    public String usuario;

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public void setDados(Conexao conexao) {
        this.conexao = conexao;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public UP_F01_Principal() {
        initComponents();
        setIcon();

        letreiro = new Letreiro(lblMensagem);
        letreiro.setFontColor(new Color(251, 197, 51));
        letreiro.iniciarLetreiro();
        letreiro.setTamanhoFonte(24);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnDesk = new javax.swing.JDesktopPane();
        lblMensagem = new javax.swing.JLabel();
        LogoJavaOracle = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        Arquivo = new javax.swing.JMenu();
        Clientes = new javax.swing.JMenuItem();
        Produtos = new javax.swing.JMenuItem();
        Usuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        Sair = new javax.swing.JMenuItem();
        Movimentos = new javax.swing.JMenu();
        NovaVenda = new javax.swing.JMenuItem();
        SendReport = new javax.swing.JMenuItem();
        SocialNetwork = new javax.swing.JMenu();
        openFacebookProfile = new javax.swing.JMenuItem();
        openGitHubProfile = new javax.swing.JMenuItem();
        openLinkedinProfile = new javax.swing.JMenuItem();
        openWhatsUpProfile = new javax.swing.JMenuItem();
        Desenvolvedor = new javax.swing.JMenu();
        Dev = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".:Umbrella Pharmaceutical Inc™ menu");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1440, 900));
        setSize(new java.awt.Dimension(1366, 768));

        dpnDesk.setMaximumSize(new java.awt.Dimension(1366, 768));
        dpnDesk.setMinimumSize(new java.awt.Dimension(1366, 768));

        lblMensagem.setMaximumSize(new java.awt.Dimension(37, 30));
        lblMensagem.setMinimumSize(new java.awt.Dimension(37, 30));
        lblMensagem.setPreferredSize(new java.awt.Dimension(37, 30));
        dpnDesk.add(lblMensagem);
        lblMensagem.setBounds(10, 680, 1350, 30);

        LogoJavaOracle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/banners/Oracle1.png"))); // NOI18N
        dpnDesk.add(LogoJavaOracle);
        LogoJavaOracle.setBounds(1180, 10, 180, 180);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/variadas/Logos/0000.jpg"))); // NOI18N
        dpnDesk.add(Logo);
        Logo.setBounds(0, 0, 1440, 900);
        Logo.getAccessibleContext().setAccessibleName("");

        Menu.setBackground(new java.awt.Color(78, 103, 74));
        Menu.setMaximumSize(new java.awt.Dimension(151, 21));

        Arquivo.setBackground(new java.awt.Color(78, 103, 74));
        Arquivo.setText("Arquivo");

        Clientes.setBackground(new java.awt.Color(78, 103, 74));
        Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/variadas/Icons/seguindo.png"))); // NOI18N
        Clientes.setText("Clientes");
        Clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        Arquivo.add(Clientes);

        Produtos.setBackground(new java.awt.Color(78, 103, 74));
        Produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/variadas/Icons/caminhao-sofa.png"))); // NOI18N
        Produtos.setText("Produtos");
        Produtos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutosActionPerformed(evt);
            }
        });
        Arquivo.add(Produtos);

        Usuarios.setBackground(new java.awt.Color(78, 103, 74));
        Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/variadas/Icons/usuarios.png"))); // NOI18N
        Usuarios.setText("Usuarios");
        Usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });
        Arquivo.add(Usuarios);

        jSeparator1.setBackground(new java.awt.Color(78, 103, 74));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        Arquivo.add(jSeparator1);

        jSeparator2.setBackground(new java.awt.Color(78, 103, 74));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        Arquivo.add(jSeparator2);

        Sair.setBackground(new java.awt.Color(78, 103, 74));
        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/variadas/Icons/circulo-cruzado.png"))); // NOI18N
        Sair.setText("Sair");
        Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        Arquivo.add(Sair);

        Menu.add(Arquivo);

        Movimentos.setBackground(new java.awt.Color(78, 103, 74));
        Movimentos.setText("Movimentos");

        NovaVenda.setBackground(new java.awt.Color(78, 103, 74));
        NovaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/variadas/Icons/dolar-aberto-envelope.png"))); // NOI18N
        NovaVenda.setText("Nova Venda");
        NovaVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        NovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovaVendaActionPerformed(evt);
            }
        });
        Movimentos.add(NovaVenda);

        SendReport.setText("Gerar PDF");
        SendReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendReportActionPerformed(evt);
            }
        });
        Movimentos.add(SendReport);

        Menu.add(Movimentos);

        SocialNetwork.setText("Redes Sociais");

        openFacebookProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/variadas/Icons/facebook2.png"))); // NOI18N
        openFacebookProfile.setText("Facebook");
        openFacebookProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        openFacebookProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFacebookProfileActionPerformed(evt);
            }
        });
        SocialNetwork.add(openFacebookProfile);

        openGitHubProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/variadas/Icons/github1.png"))); // NOI18N
        openGitHubProfile.setText("GitHub");
        openGitHubProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        openGitHubProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openGitHubProfileActionPerformed(evt);
            }
        });
        SocialNetwork.add(openGitHubProfile);

        openLinkedinProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/variadas/Icons/linkedin1.png"))); // NOI18N
        openLinkedinProfile.setText("Linkedin");
        openLinkedinProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        openLinkedinProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openLinkedinProfileActionPerformed(evt);
            }
        });
        SocialNetwork.add(openLinkedinProfile);

        openWhatsUpProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/variadas/Icons/whatsapp1.png"))); // NOI18N
        openWhatsUpProfile.setText("WhatsUp");
        openWhatsUpProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        openWhatsUpProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openWhatsUpProfileActionPerformed(evt);
            }
        });
        SocialNetwork.add(openWhatsUpProfile);

        Menu.add(SocialNetwork);

        Desenvolvedor.setText("Desenvolvedor");

        Dev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/variadas/Icons/dev.png"))); // NOI18N
        Dev.setText("Dev");
        Dev.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Dev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DevActionPerformed(evt);
            }
        });
        Desenvolvedor.add(Dev);

        Menu.add(Desenvolvedor);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1456, 908);
    }// </editor-fold>//GEN-END:initComponents

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        UP_F02_Usuarios ufu = new UP_F02_Usuarios();
        dpnDesk.add(ufu);
        ufu.show();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
        System.out.println("Form usuarios chamado com sucesso.!");

    }//GEN-LAST:event_UsuariosActionPerformed

    private void ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutosActionPerformed
        UP_F03_Produtos ufp = new UP_F03_Produtos();
        dpnDesk.add(ufp);
        ufp.show();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
        System.out.println("Form produtos chamado com sucesso.!");
    }//GEN-LAST:event_ProdutosActionPerformed

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        UP_F04_Clientes ufc = new UP_F04_Clientes();
        dpnDesk.add(ufc);
        ufc.show();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
        System.out.println("Form cliente chamado com sucesso.!");
    }//GEN-LAST:event_ClientesActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_SairActionPerformed

    private void NovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovaVendaActionPerformed
        UP_F06_Vendas ufv = new UP_F06_Vendas();
        ufv.setConexao(conexao);
        dpnDesk.add(ufv);
        ufv.show();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
        System.out.println("Form nova venda chamado com sucesso.!");
    }//GEN-LAST:event_NovaVendaActionPerformed

    private void DevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DevActionPerformed
        UP_F05_Info ufi = new UP_F05_Info();
        ufi.setConexao(conexao);
        dpnDesk.add(ufi);
        ufi.show();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
        System.out.println("Form dev chamado com sucesso.!");
    }//GEN-LAST:event_DevActionPerformed

    private void openFacebookProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFacebookProfileActionPerformed
        final String FACEBOOK_PROFILE_URL = "https://www.facebook.com/giovani.chaves.52";
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI(FACEBOOK_PROFILE_URL));
        } catch (IOException | URISyntaxException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir o perfil do Facebook", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
        System.out.println("Profile do Facebook executado com sucesso.!");
    }//GEN-LAST:event_openFacebookProfileActionPerformed

    private void openGitHubProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openGitHubProfileActionPerformed
        final String GITHUB_PROFILE_URL = "https://github.com/GiovaniXX";
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI(GITHUB_PROFILE_URL));
        } catch (IOException | URISyntaxException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir o perfil do GitHub", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
        System.out.println("Profile do GitHub executado com sucesso.!");
    }//GEN-LAST:event_openGitHubProfileActionPerformed

    private void openLinkedinProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openLinkedinProfileActionPerformed
        final String LINKEDIN_PROFILE_URL = "https://www.linkedin.com/in/giovani-v-chaves-245440201/";
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI(LINKEDIN_PROFILE_URL));
        } catch (IOException | URISyntaxException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir o perfil do Linkedin", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
        System.out.println("Profile do Linkedin executado com sucesso.!");
    }//GEN-LAST:event_openLinkedinProfileActionPerformed

    private void openWhatsUpProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openWhatsUpProfileActionPerformed
        final String WHATSAPP_PROFILE_URL = "https://www.whatsapp.com/?lang=pt_br";
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI(WHATSAPP_PROFILE_URL));
        } catch (IOException | URISyntaxException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir a página inicial do Whatsapp", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
        System.out.println("Profile do Whatsapp executado com sucesso.!");
    }//GEN-LAST:event_openWhatsUpProfileActionPerformed

    private void SendReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendReportActionPerformed
        UP_F07_Relatorios ufsr = new UP_F07_Relatorios();
        dpnDesk.add(ufsr);
        ufsr.show();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
        System.out.println("Form send report chamado com sucesso.!");
    }//GEN-LAST:event_SendReportActionPerformed

    // @formatter:off
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UP_F01_Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new UP_F01_Principal().setVisible(true);
        });
    }
    // @formatter:on

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Arquivo;
    private javax.swing.JMenuItem Clientes;
    private javax.swing.JMenu Desenvolvedor;
    private javax.swing.JMenuItem Dev;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel LogoJavaOracle;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu Movimentos;
    private javax.swing.JMenuItem NovaVenda;
    private javax.swing.JMenuItem Produtos;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem SendReport;
    private javax.swing.JMenu SocialNetwork;
    private javax.swing.JMenuItem Usuarios;
    private javax.swing.JDesktopPane dpnDesk;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JMenuItem openFacebookProfile;
    private javax.swing.JMenuItem openGitHubProfile;
    private javax.swing.JMenuItem openLinkedinProfile;
    private javax.swing.JMenuItem openWhatsUpProfile;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/variadas/Icons/Icon.jpg")));
    }
}
/**
 * 01000111 01101001 01101111 01110110 01100001 01101110 01101110 01101001
 */
