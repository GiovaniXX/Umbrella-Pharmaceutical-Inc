package up_forms;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import up_classes.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import up_classes.Dados;
import up_classes.Utilidades;

public class UP_F02_Usuarios extends javax.swing.JInternalFrame {

    private Dados dados;
    private int usuarioAtual = 0;
    private boolean novo = false;
    private DefaultTableModel tableModel;

    private String id;
    private String nome;
    private String sobrenome;
    private String perfil;

    public void setDados(Dados dados) {
        this.dados = dados;
    }

    public UP_F02_Usuarios() {
        initComponents();
        dados = new Dados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIdusuario = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtSNome = new javax.swing.JTextField();
        jpfSenha = new javax.swing.JPasswordField();
        jpfConfirmarSenha = new javax.swing.JPasswordField();
        jpfChave = new javax.swing.JPasswordField();
        jpfConfirmarChave = new javax.swing.JPasswordField();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        cmbPerfil = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        TelaFundo = new javax.swing.JLabel();

        setClosable(true);
        setTitle(".:Umbrella Pharmaceutical Inc™ Usuarios");
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(3, 155, 216));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID Usuario.:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 70, -1));

        jLabel3.setForeground(new java.awt.Color(3, 155, 216));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nome.:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 70, -1));

        jLabel4.setForeground(new java.awt.Color(3, 155, 216));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("S_Nome.:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 70, -1));

        jLabel5.setForeground(new java.awt.Color(3, 155, 216));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Senha.:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 70, -1));

        jLabel6.setForeground(new java.awt.Color(3, 155, 216));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Conf Senha.:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 90, -1));

        jLabel7.setForeground(new java.awt.Color(3, 155, 216));
        jLabel7.setText("Perfil.:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 40, -1));

        jLabel1.setForeground(new java.awt.Color(3, 155, 216));
        jLabel1.setText("Chave.:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        jLabel8.setForeground(new java.awt.Color(3, 155, 216));
        jLabel8.setText("Conf Chave.:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        txtIdusuario.setBackground(new java.awt.Color(30, 30, 30));
        txtIdusuario.setForeground(new java.awt.Color(2, 154, 184));
        txtIdusuario.setBorder(null);
        txtIdusuario.setCaretColor(new java.awt.Color(30, 30, 30));
        txtIdusuario.setDisabledTextColor(new java.awt.Color(30, 30, 30));
        txtIdusuario.setEnabled(false);
        txtIdusuario.setPreferredSize(new java.awt.Dimension(71, 22));
        txtIdusuario.setSelectedTextColor(new java.awt.Color(30, 30, 30));
        txtIdusuario.setSelectionColor(new java.awt.Color(30, 30, 30));
        getContentPane().add(txtIdusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 50, -1));

        txtNome.setBackground(new java.awt.Color(30, 30, 30));
        txtNome.setForeground(new java.awt.Color(2, 154, 184));
        txtNome.setBorder(null);
        txtNome.setCaretColor(new java.awt.Color(30, 30, 30));
        txtNome.setDisabledTextColor(new java.awt.Color(30, 30, 30));
        txtNome.setEnabled(false);
        txtNome.setPreferredSize(new java.awt.Dimension(71, 22));
        txtNome.setSelectedTextColor(new java.awt.Color(30, 30, 30));
        txtNome.setSelectionColor(new java.awt.Color(30, 30, 30));
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 310, -1));

        txtSNome.setBackground(new java.awt.Color(30, 30, 30));
        txtSNome.setForeground(new java.awt.Color(2, 154, 184));
        txtSNome.setBorder(null);
        txtSNome.setCaretColor(new java.awt.Color(30, 30, 30));
        txtSNome.setDisabledTextColor(new java.awt.Color(30, 30, 30));
        txtSNome.setEnabled(false);
        txtSNome.setPreferredSize(new java.awt.Dimension(71, 22));
        txtSNome.setSelectedTextColor(new java.awt.Color(30, 30, 30));
        txtSNome.setSelectionColor(new java.awt.Color(30, 30, 30));
        getContentPane().add(txtSNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 310, -1));

        jpfSenha.setBackground(new java.awt.Color(30, 30, 30));
        jpfSenha.setForeground(new java.awt.Color(2, 154, 184));
        jpfSenha.setBorder(null);
        jpfSenha.setCaretColor(new java.awt.Color(30, 30, 30));
        jpfSenha.setDisabledTextColor(new java.awt.Color(30, 30, 30));
        jpfSenha.setEnabled(false);
        jpfSenha.setPreferredSize(new java.awt.Dimension(71, 22));
        jpfSenha.setSelectedTextColor(new java.awt.Color(30, 30, 30));
        jpfSenha.setSelectionColor(new java.awt.Color(30, 30, 30));
        getContentPane().add(jpfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 310, -1));

        jpfConfirmarSenha.setBackground(new java.awt.Color(30, 30, 30));
        jpfConfirmarSenha.setForeground(new java.awt.Color(2, 154, 184));
        jpfConfirmarSenha.setBorder(null);
        jpfConfirmarSenha.setCaretColor(new java.awt.Color(30, 30, 30));
        jpfConfirmarSenha.setDisabledTextColor(new java.awt.Color(30, 30, 30));
        jpfConfirmarSenha.setEnabled(false);
        jpfConfirmarSenha.setPreferredSize(new java.awt.Dimension(71, 22));
        jpfConfirmarSenha.setSelectedTextColor(new java.awt.Color(30, 30, 30));
        jpfConfirmarSenha.setSelectionColor(new java.awt.Color(30, 30, 30));
        getContentPane().add(jpfConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 310, -1));

        jpfChave.setBackground(new java.awt.Color(30, 30, 30));
        jpfChave.setForeground(new java.awt.Color(2, 154, 184));
        jpfChave.setBorder(null);
        jpfChave.setCaretColor(new java.awt.Color(30, 30, 30));
        jpfChave.setDisabledTextColor(new java.awt.Color(30, 30, 30));
        jpfChave.setEnabled(false);
        jpfChave.setPreferredSize(new java.awt.Dimension(71, 22));
        jpfChave.setSelectedTextColor(new java.awt.Color(30, 30, 30));
        jpfChave.setSelectionColor(new java.awt.Color(30, 30, 30));
        getContentPane().add(jpfChave, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 310, -1));

        jpfConfirmarChave.setBackground(new java.awt.Color(30, 30, 30));
        jpfConfirmarChave.setForeground(new java.awt.Color(2, 154, 184));
        jpfConfirmarChave.setBorder(null);
        jpfConfirmarChave.setCaretColor(new java.awt.Color(30, 30, 30));
        jpfConfirmarChave.setDisabledTextColor(new java.awt.Color(30, 30, 30));
        jpfConfirmarChave.setEnabled(false);
        jpfConfirmarChave.setPreferredSize(new java.awt.Dimension(71, 22));
        jpfConfirmarChave.setSelectedTextColor(new java.awt.Color(30, 30, 30));
        jpfConfirmarChave.setSelectionColor(new java.awt.Color(30, 30, 30));
        getContentPane().add(jpfConfirmarChave, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 310, -1));

        btnPrimeiro.setBackground(new java.awt.Color(122, 0, 0));
        btnPrimeiro.setForeground(new java.awt.Color(3, 155, 216));
        btnPrimeiro.setText("Primeiro");
        btnPrimeiro.setBorder(null);
        btnPrimeiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrimeiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 73, 25));

        btnAnterior.setBackground(new java.awt.Color(122, 0, 0));
        btnAnterior.setForeground(new java.awt.Color(3, 155, 216));
        btnAnterior.setText("Anterior");
        btnAnterior.setBorder(null);
        btnAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 73, 25));

        btnProximo.setBackground(new java.awt.Color(122, 0, 0));
        btnProximo.setForeground(new java.awt.Color(3, 155, 216));
        btnProximo.setText("Proximo");
        btnProximo.setBorder(null);
        btnProximo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });
        getContentPane().add(btnProximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 73, 25));

        btnUltimo.setBackground(new java.awt.Color(122, 0, 0));
        btnUltimo.setForeground(new java.awt.Color(3, 155, 216));
        btnUltimo.setText("Ultimo");
        btnUltimo.setBorder(null);
        btnUltimo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });
        getContentPane().add(btnUltimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 73, 25));

        btnNovo.setBackground(new java.awt.Color(122, 0, 0));
        btnNovo.setForeground(new java.awt.Color(3, 155, 216));
        btnNovo.setText("Novo");
        btnNovo.setBorder(null);
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 73, 25));

        btnEditar.setBackground(new java.awt.Color(122, 0, 0));
        btnEditar.setForeground(new java.awt.Color(3, 155, 216));
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 73, 25));

        btnSalvar.setBackground(new java.awt.Color(122, 0, 0));
        btnSalvar.setForeground(new java.awt.Color(3, 155, 216));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(null);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 73, 25));

        btnExcluir.setBackground(new java.awt.Color(122, 0, 0));
        btnExcluir.setForeground(new java.awt.Color(3, 155, 216));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(null);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 73, 25));

        btnCancelar.setBackground(new java.awt.Color(122, 0, 0));
        btnCancelar.setForeground(new java.awt.Color(3, 155, 216));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 73, 25));

        btnPesquisar.setBackground(new java.awt.Color(122, 0, 0));
        btnPesquisar.setForeground(new java.awt.Color(3, 155, 216));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(null);
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 73, 25));

        cmbPerfil.setBackground(new java.awt.Color(122, 126, 140));
        cmbPerfil.setForeground(new java.awt.Color(255, 255, 255));
        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Perfil", "Administrador", "Usuario" }));
        cmbPerfil.setEnabled(false);
        getContentPane().add(cmbPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 27, 150, -1));

        tblUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        tblUsuarios.setForeground(new java.awt.Color(3, 155, 216));
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sobrenome", "Perfil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.setGridColor(new java.awt.Color(0, 0, 0));
        tblUsuarios.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tblUsuarios.setSelectionForeground(new java.awt.Color(3, 155, 216));
        tblUsuarios.setShowGrid(false);
        jScrollPane1.setViewportView(tblUsuarios);
        if (tblUsuarios.getColumnModel().getColumnCount() > 0) {
            tblUsuarios.getColumnModel().getColumn(0).setResizable(false);
            tblUsuarios.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblUsuarios.getColumnModel().getColumn(1).setResizable(false);
            tblUsuarios.getColumnModel().getColumn(2).setResizable(false);
            tblUsuarios.getColumnModel().getColumn(3).setResizable(false);
            tblUsuarios.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 360, 1350, 380));

        TelaFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Logos/014.jpg"))); // NOI18N
        TelaFundo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TelaFundo.setMaximumSize(new java.awt.Dimension(1366, 768));
        TelaFundo.setMinimumSize(new java.awt.Dimension(1366, 768));
        TelaFundo.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(TelaFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1370, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        btnPrimeiro.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnProximo.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnNovo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);

        txtNome.setEnabled(true);
        txtSNome.setEnabled(true);
        jpfSenha.setEnabled(true);
        jpfChave.setEnabled(true);
        jpfConfirmarSenha.setEnabled(true);
        jpfConfirmarChave.setEnabled(true);
        cmbPerfil.setEnabled(true);

        txtIdusuario.setText("");
        txtNome.setText("");
        txtSNome.setText("");
        jpfSenha.setText("");
        jpfChave.setText("");
        jpfConfirmarSenha.setText("");
        jpfConfirmarChave.setText("");
        cmbPerfil.setSelectedIndex(0);

        novo = true;
        txtIdusuario.requestFocus();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String senha = new String(jpfSenha.getPassword());
        String chave = new String(jpfChave.getPassword());
        String confirmarSenha = new String(jpfConfirmarSenha.getPassword());
        String confirmarChave = new String(jpfConfirmarChave.getPassword());

        if (cmbPerfil.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Favor selecionar um perfil!");
            cmbPerfil.requestFocusInWindow();
            return;
        }

        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Favor digitar um nome válido!");
            txtNome.requestFocusInWindow();
            return;
        }

        if (txtSNome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Favor digitar um sobrenome válido!");
            txtSNome.requestFocusInWindow();
            return;
        }

        if (senha.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Favor digitar uma senha válida!");
            jpfSenha.requestFocusInWindow();
            return;
        }

        if (confirmarSenha.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Favor confirmar sua senha!");
            jpfConfirmarSenha.requestFocusInWindow();
            return;
        }

        if (!senha.equals(confirmarSenha)) {
            JOptionPane.showMessageDialog(rootPane, "A sua senha esta diferente da confirmação!");
            jpfSenha.setText("");
            jpfConfirmarSenha.setText("");
            jpfSenha.requestFocusInWindow();
            return;
        }

        if (chave.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Favor digitar uma chave válida!");
            jpfChave.requestFocusInWindow();
            return;
        }

        if (confirmarChave.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Favor confirmar sua chave!");
            jpfConfirmarChave.requestFocusInWindow();
            return;
        }

        if (!chave.equals(confirmarChave)) {
            JOptionPane.showMessageDialog(rootPane, "A sua chave esta diferente da confirmação!");
            jpfChave.setText("");
            jpfConfirmarChave.setText("");
            jpfChave.requestFocusInWindow();
            return;
        }

        if (novo) {
            if (dados.existeUsuario(txtIdusuario.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Este usuário já existe!");
                txtNome.requestFocusInWindow();
                return;
            }
        } else {
            if (!dados.existeUsuario(txtIdusuario.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Este usuário não existe!");
                txtNome.requestFocusInWindow();
                return;
            }
        }

        Usuario mUsuario = new Usuario(
                Utilidades.stringToInt(txtIdusuario.getText()),
                txtNome.getText(),
                txtSNome.getText(),
                senha,
                chave,
                cmbPerfil.getSelectedIndex());
        String msg;
        if (novo) {
            msg = dados.adicionarUsuario(mUsuario);
        } else {
            msg = dados.editarUsuario(mUsuario);
        }
        JOptionPane.showMessageDialog(rootPane, msg);

        btnPrimeiro.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnProximo.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnNovo.setEnabled(true);
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);

        txtIdusuario.setEnabled(false);
        txtNome.setEnabled(false);
        txtSNome.setEnabled(false);
        jpfSenha.setEnabled(false);
        jpfChave.setEnabled(false);
        jpfConfirmarSenha.setEnabled(false);
        jpfConfirmarChave.setEnabled(false);
        cmbPerfil.setEnabled(false);

        preencherTabela();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnPrimeiro.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnProximo.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnNovo.setEnabled(true);
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);

        txtIdusuario.setEnabled(false);
        txtNome.setEnabled(false);
        txtSNome.setEnabled(false);
        jpfSenha.setEnabled(false);
        jpfChave.setEnabled(false);
        jpfConfirmarSenha.setEnabled(false);
        jpfConfirmarChave.setEnabled(false);
        cmbPerfil.setEnabled(false);

        txtNome.setText("");
        txtSNome.setText("");
        jpfSenha.setText("");
        jpfConfirmarSenha.setText("");
        jpfChave.setText("");
        jpfConfirmarChave.setText("");

        carregarPrimeiroRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnPrimeiro.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnProximo.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnNovo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);

        txtNome.setEnabled(true);
        txtSNome.setEnabled(true);
        jpfSenha.setEnabled(true);
        jpfChave.setEnabled(true);
        jpfConfirmarSenha.setEnabled(true);
        jpfConfirmarChave.setEnabled(true);
        cmbPerfil.setEnabled(true);

        novo = false;
        txtNome.requestFocus();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        preencherTabela();
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        usuarioAtual = 0;
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        usuarioAtual = dados.numeroUsuarios() - 1;
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        usuarioAtual++;
        if (usuarioAtual == dados.numeroUsuarios()) {
            usuarioAtual = 0;
        }
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        usuarioAtual--;
        if (usuarioAtual == -1) {
            usuarioAtual = dados.numeroUsuarios() - 1;
        }
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deletar este cadastro?");
        if (resposta != 0) {
            return;
        }
        String msg;
        msg = dados.deletarUsuario(txtIdusuario.getText());
        JOptionPane.showMessageDialog(rootPane, msg);
        usuarioAtual = 0;
        preencherTabela();
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String usuario = JOptionPane.showInputDialog("Insira o código do usuário");

        if (usuario == null) {
            return;
        }

        if (usuario.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O código do usuário é obrigatório para a pesquisa");
            return;
        }

        if (!dados.existeUsuario(usuario)) {
            JOptionPane.showMessageDialog(rootPane, "Este usário não existe");
            return;
        }

        int num = tableModel.getRowCount();
        for (int i = 0; i < num; i++) {
            if (Utilidades.objectToString(tableModel.getValueAt(i, 0)).equals(usuario)) {
                usuarioAtual = i;
                break;
            }
        }
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void mostrarRegistro() {
        txtIdusuario.setText(Utilidades.objectToString(tblUsuarios.getValueAt(usuarioAtual, 0)));
        txtNome.setText(Utilidades.objectToString(tblUsuarios.getValueAt(usuarioAtual, 1)));
        txtSNome.setText(Utilidades.objectToString(tblUsuarios.getValueAt(usuarioAtual, 2)));
        jpfSenha.setText("");
        jpfChave.setText("");
        jpfConfirmarSenha.setText("");
        jpfConfirmarChave.setText("");
        cmbPerfil.setSelectedIndex(perfil(Utilidades.objectToString(tblUsuarios.getValueAt(usuarioAtual, 3))));
    }

    private void preencherTabela() {
        try {
            String titulos[] = {"ID Usuario", "Nome", "Sobrenome", "Perfil"};
            String registro[] = new String[4];
            tableModel = new DefaultTableModel(null, titulos);
            ResultSet rs = dados.getUsuarios();

            while (rs.next()) {
                registro[0] = rs.getString("idusuario");
                registro[1] = rs.getString("nome");
                registro[2] = rs.getString("sobrenome");
                registro[3] = perfil(rs.getInt("perfil"));

                tableModel.addRow(registro);
            }
            tblUsuarios.setModel(tableModel);
        } catch (SQLException ex) {
            Logger.getLogger(UP_F02_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void carregarPrimeiroRegistro() {
        ResultSet rs = dados.getUsuarios();
        try {
            if (rs.next()) {
                id = rs.getString("idusuario");
                nome = rs.getString("nome");
                sobrenome = rs.getString("sobrenome");
                perfil = rs.getString("perfil");

                txtIdusuario.setText(id);
                txtNome.setText(nome);
                txtSNome.setText(sobrenome);
                cmbPerfil.setSelectedItem(perfil);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UP_F02_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String perfil(int perfil) {
        if (perfil == 1) {
            return "Administrador";
        } else {
            return "Usuario";
        }
    }

    private int perfil(String perfil) {
        if (perfil.equals("Administrador")) {
            return 1;
        } else {
            return 2;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TelaFundo;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox<String> cmbPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField jpfChave;
    private javax.swing.JPasswordField jpfConfirmarChave;
    private javax.swing.JPasswordField jpfConfirmarSenha;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtIdusuario;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSNome;
    // End of variables declaration//GEN-END:variables

    /*private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/up_images/Icons/Icon.jpg")));
    }*/
}
/**
 * 01000111 01101001 01101111 01110110 01100001 01101110 01101110 01101001
 */
