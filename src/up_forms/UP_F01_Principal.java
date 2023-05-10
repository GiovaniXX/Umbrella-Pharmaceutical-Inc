package up_forms;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import up_classes.DadosDB;

public class UP_F01_Principal extends javax.swing.JFrame {

    private int perfil;
    private String senha;
    private String chave;
    private String usuario;
    private DadosDB dadosDB;

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public void setDadosDB(DadosDB dadosDB) {
        this.dadosDB = dadosDB;
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnDesk = new javax.swing.JDesktopPane();
        lblSair = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        Arquivo = new javax.swing.JMenu();
        Clientes = new javax.swing.JMenuItem();
        Produtos = new javax.swing.JMenuItem();
        Usuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        TrocarSenha = new javax.swing.JMenuItem();
        TrocarUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        Sair = new javax.swing.JMenuItem();
        Movimentos = new javax.swing.JMenu();
        NovaVenda = new javax.swing.JMenuItem();
        RelatorioVenda = new javax.swing.JMenuItem();
        Controle = new javax.swing.JMenu();
        CadastroBoletos = new javax.swing.JMenuItem();
        PesquisarBoletos = new javax.swing.JMenuItem();
        SocialNetwork = new javax.swing.JMenu();
        openFacebookProfile = new javax.swing.JMenuItem();
        openGitHubProfile = new javax.swing.JMenuItem();
        openLinkedinProfile = new javax.swing.JMenuItem();
        openWhatsUpProfile = new javax.swing.JMenuItem();
        Desenvolvedor = new javax.swing.JMenu();
        Sistema = new javax.swing.JMenuItem();
        Dev = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".:Umbrella Pharmaceutical Inc™ menu");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setSize(new java.awt.Dimension(1366, 768));

        dpnDesk.setMaximumSize(new java.awt.Dimension(1366, 768));
        dpnDesk.setMinimumSize(new java.awt.Dimension(1366, 768));

        lblSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Buttons/button4.png"))); // NOI18N
        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
        });
        dpnDesk.add(lblSair);
        lblSair.setBounds(1150, 690, 200, 23);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Logos/000.jpg"))); // NOI18N
        dpnDesk.add(Logo);
        Logo.setBounds(0, 0, 1366, 768);
        Logo.getAccessibleContext().setAccessibleName("");

        Menu.setBackground(new java.awt.Color(78, 103, 74));
        Menu.setMaximumSize(new java.awt.Dimension(151, 21));

        Arquivo.setBackground(new java.awt.Color(78, 103, 74));
        Arquivo.setForeground(new java.awt.Color(0, 0, 0));
        Arquivo.setText("Arquivo");

        Clientes.setBackground(new java.awt.Color(78, 103, 74));
        Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Icons/seguindo.png"))); // NOI18N
        Clientes.setText("Clientes");
        Clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        Arquivo.add(Clientes);

        Produtos.setBackground(new java.awt.Color(78, 103, 74));
        Produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Icons/caminhao-sofa.png"))); // NOI18N
        Produtos.setText("Produtos");
        Produtos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutosActionPerformed(evt);
            }
        });
        Arquivo.add(Produtos);

        Usuarios.setBackground(new java.awt.Color(78, 103, 74));
        Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Icons/usuarios.png"))); // NOI18N
        Usuarios.setText("Usuarios");
        Usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });
        Arquivo.add(Usuarios);

        jSeparator1.setBackground(new java.awt.Color(78, 103, 74));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        Arquivo.add(jSeparator1);

        TrocarSenha.setBackground(new java.awt.Color(78, 103, 74));
        TrocarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Icons/chave.png"))); // NOI18N
        TrocarSenha.setText("Trocar Senha");
        TrocarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TrocarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrocarSenhaActionPerformed(evt);
            }
        });
        Arquivo.add(TrocarSenha);

        TrocarUsuario.setBackground(new java.awt.Color(78, 103, 74));
        TrocarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Icons/adicionar-usuario.png"))); // NOI18N
        TrocarUsuario.setText("Trocar Usuario");
        TrocarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrocarUsuarioActionPerformed(evt);
            }
        });
        Arquivo.add(TrocarUsuario);

        jSeparator2.setBackground(new java.awt.Color(78, 103, 74));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        Arquivo.add(jSeparator2);

        Sair.setBackground(new java.awt.Color(78, 103, 74));
        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Icons/circulo-cruzado.png"))); // NOI18N
        Sair.setText("Sair");
        Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        Arquivo.add(Sair);

        Menu.add(Arquivo);

        Movimentos.setBackground(new java.awt.Color(78, 103, 74));
        Movimentos.setForeground(new java.awt.Color(0, 0, 0));
        Movimentos.setText("Movimentos");

        NovaVenda.setBackground(new java.awt.Color(78, 103, 74));
        NovaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Icons/dolar-aberto-envelope.png"))); // NOI18N
        NovaVenda.setText("Nova Venda");
        NovaVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovaVendaActionPerformed(evt);
            }
        });
        Movimentos.add(NovaVenda);

        RelatorioVenda.setBackground(new java.awt.Color(78, 103, 74));
        RelatorioVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Icons/file-chart-line.png"))); // NOI18N
        RelatorioVenda.setText("Relatorio Venda");
        RelatorioVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RelatorioVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioVendaActionPerformed(evt);
            }
        });
        Movimentos.add(RelatorioVenda);

        Menu.add(Movimentos);

        Controle.setText("Boletos");

        CadastroBoletos.setText("Cadastro de Boletos");
        CadastroBoletos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadastroBoletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroBoletosActionPerformed(evt);
            }
        });
        Controle.add(CadastroBoletos);

        PesquisarBoletos.setText("Pesquisa de Boletos");
        PesquisarBoletos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PesquisarBoletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarBoletosActionPerformed(evt);
            }
        });
        Controle.add(PesquisarBoletos);

        Menu.add(Controle);

        SocialNetwork.setText("Redes Sociais");

        openFacebookProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Icons/facebook2.png"))); // NOI18N
        openFacebookProfile.setText("Facebook");
        openFacebookProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        openFacebookProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFacebookProfileActionPerformed(evt);
            }
        });
        SocialNetwork.add(openFacebookProfile);

        openGitHubProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Icons/github1.png"))); // NOI18N
        openGitHubProfile.setText("GitHub");
        openGitHubProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        openGitHubProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openGitHubProfileActionPerformed(evt);
            }
        });
        SocialNetwork.add(openGitHubProfile);

        openLinkedinProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Icons/linkedin1.png"))); // NOI18N
        openLinkedinProfile.setText("Linkedin");
        openLinkedinProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        openLinkedinProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openLinkedinProfileActionPerformed(evt);
            }
        });
        SocialNetwork.add(openLinkedinProfile);

        openWhatsUpProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Icons/whatsapp1.png"))); // NOI18N
        openWhatsUpProfile.setText("WhatsUp");
        openWhatsUpProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        openWhatsUpProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openWhatsUpProfileActionPerformed(evt);
            }
        });
        SocialNetwork.add(openWhatsUpProfile);

        Menu.add(SocialNetwork);

        Desenvolvedor.setText("Desenvolvedor");

        Sistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Icons/informacoes.png"))); // NOI18N
        Sistema.setText("Sistema");
        Sistema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SistemaActionPerformed(evt);
            }
        });
        Desenvolvedor.add(Sistema);

        Dev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Icons/dev.png"))); // NOI18N
        Dev.setText("Dev");
        Dev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        setBounds(0, 0, 1382, 776);
    }// </editor-fold>//GEN-END:initComponents

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        UP_F02_Usuarios mUsuarios = new UP_F02_Usuarios();
        mUsuarios.setDadosDB(dadosDB);
        dpnDesk.add(mUsuarios);
        mUsuarios.show();

    }//GEN-LAST:event_UsuariosActionPerformed

    private void ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutosActionPerformed
        UP_F03_Produtos msProdutos = new UP_F03_Produtos();
        msProdutos.setDadosDB(dadosDB);
        dpnDesk.add(msProdutos);
        msProdutos.show();
    }//GEN-LAST:event_ProdutosActionPerformed

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        UP_F04_Clientes msClientes = new UP_F04_Clientes();
        msClientes.setDadosDB(dadosDB);
        dpnDesk.add(msClientes);
        msClientes.show();
    }//GEN-LAST:event_ClientesActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void TrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrocarUsuarioActionPerformed
        this.setVisible(false);
        UP_F00_Login ufl = new UP_F00_Login();
        ufl.setDadosDB(dadosDB);
        ufl.setVisible(true);
    }//GEN-LAST:event_TrocarUsuarioActionPerformed

    private void TrocarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrocarSenhaActionPerformed
        UP_F05_Trocar_Senha ufts = new UP_F05_Trocar_Senha(this, rootPaneCheckingEnabled);
        ufts.setSenha(senha);
        ufts.setUsuario(usuario);
        ufts.setDadosDB(dadosDB);
        ufts.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_TrocarSenhaActionPerformed

    private void NovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovaVendaActionPerformed
        UP_F08_Vendas ufv = new UP_F08_Vendas();
        ufv.setDadosDB(dadosDB);
        dpnDesk.add(ufv);
        ufv.show();
    }//GEN-LAST:event_NovaVendaActionPerformed

    private void RelatorioVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioVendaActionPerformed
        UP_F11_Relatorios_Vendas ufrv = new UP_F11_Relatorios_Vendas();
        ufrv.setDadosDB(dadosDB);
        dpnDesk.add(ufrv);
        ufrv.show();
    }//GEN-LAST:event_RelatorioVendaActionPerformed

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSairMouseClicked

    private void SistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SistemaActionPerformed
        UP_F06_Sobre sobre = new UP_F06_Sobre();
        sobre.setDadosDB(dadosDB);
        dpnDesk.add(sobre);
        sobre.show();
    }//GEN-LAST:event_SistemaActionPerformed

    private void DevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DevActionPerformed
        UP_F07_Info info = new UP_F07_Info();
        info.setDadosDB(dadosDB);
        dpnDesk.add(info);
        info.show();
    }//GEN-LAST:event_DevActionPerformed

    private void CadastroBoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroBoletosActionPerformed
        UP_F14_Cadastro_Boletos ufcb = new UP_F14_Cadastro_Boletos();
        ufcb.setDadosDB(dadosDB);
        dpnDesk.add(ufcb);
        ufcb.show();
    }//GEN-LAST:event_CadastroBoletosActionPerformed

    private void PesquisarBoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarBoletosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisarBoletosActionPerformed

    private void openFacebookProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFacebookProfileActionPerformed
        final String LINKEDIN_PROFILE_URL = "https://www.facebook.com/giovani.chaves.52";
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI(LINKEDIN_PROFILE_URL));
        } catch (IOException | URISyntaxException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir o perfil do Linkedin", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_openFacebookProfileActionPerformed

    private void openGitHubProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openGitHubProfileActionPerformed
        final String LINKEDIN_PROFILE_URL = "https://github.com/GiovaniXX";
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI(LINKEDIN_PROFILE_URL));
        } catch (IOException | URISyntaxException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir o perfil do Linkedin", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_openGitHubProfileActionPerformed

    private void openLinkedinProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openLinkedinProfileActionPerformed
        final String LINKEDIN_PROFILE_URL = "https://www.linkedin.com/in/giovani-v-chaves-245440201/";
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI(LINKEDIN_PROFILE_URL));
        } catch (IOException | URISyntaxException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir o perfil do Linkedin", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_openLinkedinProfileActionPerformed

    private void openWhatsUpProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openWhatsUpProfileActionPerformed
        final String LINKEDIN_PROFILE_URL = "https://www.whatsapp.com/?lang=pt_br";
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI(LINKEDIN_PROFILE_URL));
        } catch (IOException | URISyntaxException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir o perfil do Linkedin", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_openWhatsUpProfileActionPerformed

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
    private javax.swing.JMenuItem CadastroBoletos;
    private javax.swing.JMenuItem Clientes;
    private javax.swing.JMenu Controle;
    private javax.swing.JMenu Desenvolvedor;
    private javax.swing.JMenuItem Dev;
    private javax.swing.JLabel Logo;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu Movimentos;
    private javax.swing.JMenuItem NovaVenda;
    private javax.swing.JMenuItem PesquisarBoletos;
    private javax.swing.JMenuItem Produtos;
    private javax.swing.JMenuItem RelatorioVenda;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem Sistema;
    private javax.swing.JMenu SocialNetwork;
    private javax.swing.JMenuItem TrocarSenha;
    private javax.swing.JMenuItem TrocarUsuario;
    private javax.swing.JMenuItem Usuarios;
    private javax.swing.JDesktopPane dpnDesk;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lblSair;
    private javax.swing.JMenuItem openFacebookProfile;
    private javax.swing.JMenuItem openGitHubProfile;
    private javax.swing.JMenuItem openLinkedinProfile;
    private javax.swing.JMenuItem openWhatsUpProfile;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/up_images/Icons/Icon.jpg")));
    }

    private void openFacebookProfileMouseClicked(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
