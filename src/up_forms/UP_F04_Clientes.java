package up_forms;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import up_classes.Cliente;
import up_classes.DadosDB;
import java.sql.ResultSet;
import up_classes.Utilidades;

public class UP_F04_Clientes extends javax.swing.JInternalFrame {

    private DadosDB dadosDB;
    private int cliAtual = 0;
    private boolean novo = false;
    private DefaultTableModel mTabela;

    private String ID;
    private String Nome;
    private String SNome;
    private String Endereco;
    private String Telefone;

    public void setDadosDB(DadosDB dadosDB) {
        this.dadosDB = dadosDB;
    }

    public UP_F04_Clientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIDCliente = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtSNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        cmbIdentificacao = new javax.swing.JComboBox<>();
        cmbCidade = new javax.swing.JComboBox<>();
        DData = new com.toedter.calendar.JDateChooser();
        DNascimento = new com.toedter.calendar.JDateChooser();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle(".:Umbrella Pharmaceutical Inc™ Clientes");
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
        getContentPane().setLayout(null);

        jLabel2.setForeground(new java.awt.Color(3, 155, 216));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID Cliente.:");
        jLabel2.setMaximumSize(new java.awt.Dimension(67, 15));
        jLabel2.setMinimumSize(new java.awt.Dimension(67, 15));
        jLabel2.setPreferredSize(new java.awt.Dimension(67, 15));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 9, 80, 15);

        jLabel3.setForeground(new java.awt.Color(3, 155, 216));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nome.:");
        jLabel3.setMaximumSize(new java.awt.Dimension(67, 15));
        jLabel3.setMinimumSize(new java.awt.Dimension(67, 15));
        jLabel3.setPreferredSize(new java.awt.Dimension(67, 15));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(440, 34, 80, 15);

        jLabel4.setForeground(new java.awt.Color(3, 155, 216));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("S_Nome.:");
        jLabel4.setMaximumSize(new java.awt.Dimension(67, 15));
        jLabel4.setMinimumSize(new java.awt.Dimension(67, 15));
        jLabel4.setPreferredSize(new java.awt.Dimension(67, 15));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(440, 58, 80, 15);

        jLabel5.setForeground(new java.awt.Color(3, 155, 216));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Endereço.:");
        jLabel5.setMaximumSize(new java.awt.Dimension(67, 15));
        jLabel5.setMinimumSize(new java.awt.Dimension(67, 15));
        jLabel5.setPreferredSize(new java.awt.Dimension(67, 15));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(440, 82, 80, 15);

        jLabel7.setForeground(new java.awt.Color(3, 155, 216));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Telefone.:");
        jLabel7.setMaximumSize(new java.awt.Dimension(67, 15));
        jLabel7.setMinimumSize(new java.awt.Dimension(67, 15));
        jLabel7.setPreferredSize(new java.awt.Dimension(67, 15));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(440, 106, 80, 15);

        jLabel6.setForeground(new java.awt.Color(3, 155, 216));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Identificação.:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(440, 135, 80, 16);

        jLabel8.setForeground(new java.awt.Color(3, 155, 216));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Cidade.:");
        jLabel8.setMaximumSize(new java.awt.Dimension(67, 15));
        jLabel8.setMinimumSize(new java.awt.Dimension(67, 15));
        jLabel8.setPreferredSize(new java.awt.Dimension(67, 15));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(440, 162, 80, 15);

        jLabel9.setForeground(new java.awt.Color(3, 155, 216));
        jLabel9.setText("D Nasc.:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(650, 137, 50, 16);

        jLabel10.setForeground(new java.awt.Color(3, 155, 216));
        jLabel10.setText("Data.:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(660, 160, 40, 16);

        txtIDCliente.setBackground(new java.awt.Color(122, 126, 140));
        txtIDCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtIDCliente.setBorder(null);
        txtIDCliente.setCaretColor(new java.awt.Color(255, 255, 255));
        txtIDCliente.setEnabled(false);
        txtIDCliente.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtIDCliente);
        txtIDCliente.setBounds(530, 5, 50, 22);

        txtNome.setBackground(new java.awt.Color(122, 126, 140));
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(null);
        txtNome.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNome.setEnabled(false);
        txtNome.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtNome);
        txtNome.setBounds(530, 30, 340, 22);

        txtSNome.setBackground(new java.awt.Color(122, 126, 140));
        txtSNome.setForeground(new java.awt.Color(255, 255, 255));
        txtSNome.setBorder(null);
        txtSNome.setCaretColor(new java.awt.Color(255, 255, 255));
        txtSNome.setEnabled(false);
        txtSNome.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtSNome);
        txtSNome.setBounds(530, 54, 340, 22);

        txtEndereco.setBackground(new java.awt.Color(122, 126, 140));
        txtEndereco.setForeground(new java.awt.Color(255, 255, 255));
        txtEndereco.setBorder(null);
        txtEndereco.setEnabled(false);
        txtEndereco.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtEndereco);
        txtEndereco.setBounds(530, 79, 340, 22);

        txtTelefone.setBackground(new java.awt.Color(122, 126, 140));
        txtTelefone.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefone.setBorder(null);
        txtTelefone.setEnabled(false);
        txtTelefone.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(530, 104, 340, 22);

        cmbIdentificacao.setBackground(new java.awt.Color(122, 126, 140));
        cmbIdentificacao.setForeground(new java.awt.Color(255, 255, 255));
        cmbIdentificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Identificação", "CNH", "RG", "CPF" }));
        getContentPane().add(cmbIdentificacao);
        cmbIdentificacao.setBounds(530, 133, 110, 22);

        cmbCidade.setBackground(new java.awt.Color(122, 126, 140));
        cmbCidade.setForeground(new java.awt.Color(255, 255, 255));
        cmbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cidade", "Lages", "Blumenau", "Joinvile" }));
        cmbCidade.setEnabled(false);
        getContentPane().add(cmbCidade);
        cmbCidade.setBounds(530, 160, 110, 22);

        DData.setBackground(new java.awt.Color(122, 126, 140));
        DData.setForeground(new java.awt.Color(255, 255, 255));
        DData.setEnabled(false);
        getContentPane().add(DData);
        DData.setBounds(700, 160, 170, 22);

        DNascimento.setBackground(new java.awt.Color(122, 126, 140));
        DNascimento.setForeground(new java.awt.Color(255, 255, 255));
        DNascimento.setEnabled(false);
        getContentPane().add(DNascimento);
        DNascimento.setBounds(700, 133, 170, 22);

        btnPrimeiro.setBackground(new java.awt.Color(0, 0, 0));
        btnPrimeiro.setForeground(new java.awt.Color(3, 155, 216));
        btnPrimeiro.setText("Primeiro");
        btnPrimeiro.setBorder(null);
        btnPrimeiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrimeiro);
        btnPrimeiro.setBounds(540, 190, 73, 25);

        btnAnterior.setBackground(new java.awt.Color(0, 0, 0));
        btnAnterior.setForeground(new java.awt.Color(3, 155, 216));
        btnAnterior.setText("Anterior");
        btnAnterior.setBorder(null);
        btnAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnterior);
        btnAnterior.setBounds(620, 190, 73, 25);

        btnProximo.setBackground(new java.awt.Color(0, 0, 0));
        btnProximo.setForeground(new java.awt.Color(3, 155, 216));
        btnProximo.setText("Proximo");
        btnProximo.setBorder(null);
        btnProximo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });
        getContentPane().add(btnProximo);
        btnProximo.setBounds(700, 190, 73, 25);

        btnUltimo.setBackground(new java.awt.Color(0, 0, 0));
        btnUltimo.setForeground(new java.awt.Color(3, 155, 216));
        btnUltimo.setText("Ultimo");
        btnUltimo.setBorder(null);
        btnUltimo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });
        getContentPane().add(btnUltimo);
        btnUltimo.setBounds(780, 190, 73, 25);

        btnNovo.setBackground(new java.awt.Color(0, 0, 0));
        btnNovo.setForeground(new java.awt.Color(3, 155, 216));
        btnNovo.setText("Novo");
        btnNovo.setBorder(null);
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo);
        btnNovo.setBounds(540, 220, 73, 25);

        btnEditar.setBackground(new java.awt.Color(0, 0, 0));
        btnEditar.setForeground(new java.awt.Color(3, 155, 216));
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(620, 220, 73, 25);

        btnSalvar.setBackground(new java.awt.Color(0, 0, 0));
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
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(700, 220, 73, 25);

        btnExcluir.setBackground(new java.awt.Color(0, 0, 0));
        btnExcluir.setForeground(new java.awt.Color(3, 155, 216));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(null);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(780, 220, 73, 25);

        btnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelar.setForeground(new java.awt.Color(3, 155, 216));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(620, 250, 73, 25);

        btnPesquisar.setBackground(new java.awt.Color(0, 0, 0));
        btnPesquisar.setForeground(new java.awt.Color(3, 155, 216));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(null);
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(700, 250, 73, 25);

        tblTabela.setBackground(new java.awt.Color(0, 0, 0));
        tblTabela.setForeground(new java.awt.Color(3, 155, 216));
        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Cliente", "ID Tipo", "Nome", "Sobre-Nome", "Endereço", "Telefone", "Cidade", "Data Nascimento", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTabela.setGridColor(new java.awt.Color(122, 126, 140));
        tblTabela.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tblTabela.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblTabela.setShowGrid(false);
        jScrollPane1.setViewportView(tblTabela);
        if (tblTabela.getColumnModel().getColumnCount() > 0) {
            tblTabela.getColumnModel().getColumn(0).setMinWidth(80);
            tblTabela.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblTabela.getColumnModel().getColumn(0).setMaxWidth(80);
            tblTabela.getColumnModel().getColumn(1).setMinWidth(80);
            tblTabela.getColumnModel().getColumn(1).setPreferredWidth(80);
            tblTabela.getColumnModel().getColumn(1).setMaxWidth(80);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 290, 1360, 410);

        jLabel1.setBackground(new java.awt.Color(200, 22, 22));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Logos/014.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jLabel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-4, 0, 1370, 768);

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

        txtIDCliente.setEnabled(true);
        txtNome.setEnabled(true);
        txtSNome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        cmbIdentificacao.setEnabled(true);
        cmbCidade.setEnabled(true);
        DData.setEnabled(true);
        DNascimento.setEnabled(true);

        txtIDCliente.setText("");
        cmbIdentificacao.setSelectedIndex(0);
        txtNome.setText("");
        txtSNome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        cmbCidade.setSelectedIndex(0);
        DData.setDate(new Date());
        DNascimento.setDate(new Date());

        novo = true;
        txtIDCliente.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtIDCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Favor inserir um número de ID do cliente!");
            txtIDCliente.requestFocusInWindow();
            return;
        }

        if (cmbIdentificacao.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Favor selecionar uma identificação!");
            cmbIdentificacao.requestFocusInWindow();
            return;
        }

        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Favor digitar um nome!");
            txtNome.requestFocusInWindow();
            return;
        }

        if (txtSNome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Favor digitar o sobre nome!");
            txtSNome.requestFocusInWindow();
            return;
        }

        if (DData.getDate().after(new Date())) {
            JOptionPane.showMessageDialog(rootPane, "Favor digitar uma data de nascimento");
            DData.requestFocusInWindow();
            return;
        }

        if (novo) {
            if (dadosDB.existeCliente(txtIDCliente.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Este cliente já existe!");
                txtIDCliente.requestFocusInWindow();
                return;
            }
        } else {
            if (!dadosDB.existeCliente(txtIDCliente.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Este cliente não existe!");
                txtIDCliente.requestFocusInWindow();
                return;
            }
        }

        Cliente mCliente = new Cliente(txtIDCliente.getText(), cmbIdentificacao.getSelectedIndex(), txtNome.getText(), txtSNome.getText(), txtEndereco.getText(), txtTelefone.getText(), cmbCidade.getSelectedIndex(), DData.getDate(), DNascimento.getDate());

        String msg;
        if (novo) {
            msg = dadosDB.adicionarCliente(mCliente);
        } else {
            msg = dadosDB.editarCliente(mCliente);
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

        txtIDCliente.setEnabled(false);
        cmbIdentificacao.setEnabled(false);
        txtNome.setEnabled(false);
        txtSNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        cmbCidade.setEnabled(false);
        DData.setEnabled(false);
        DNascimento.setEnabled(false);

        preencherTabela();
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

        txtIDCliente.setEnabled(false);
        txtNome.setEnabled(false);
        txtSNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        cmbIdentificacao.setEnabled(false);
        cmbCidade.setEnabled(false);
        DData.setEnabled(false);
        DNascimento.setEnabled(false);

        txtIDCliente.setText(ID);
        txtNome.setText(Nome);
        txtSNome.setText(SNome);
        txtEndereco.setText(Endereco);
        txtTelefone.setText(Telefone);

        carregarPrimeiroRegistro();
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

        txtIDCliente.setEnabled(true);
        cmbIdentificacao.setEnabled(true);
        txtNome.setEnabled(true);
        txtSNome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        cmbCidade.setEnabled(true);
        DData.setEnabled(true);

        novo = false;
        cmbIdentificacao.requestFocus();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        preencherTabela();
        mostrarRegistro();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        cliAtual = 0;
        mostrarRegistro();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        cliAtual = dadosDB.numeroClientes() - 1;
        mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        cliAtual++;

        if (cliAtual == dadosDB.numeroClientes()) {
            cliAtual = 0;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        cliAtual--;
        if (cliAtual == -1) {
            cliAtual = dadosDB.numeroClientes() - 1;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deletar este cadastro?");
        if (resposta != 0) {
            return;
        }
        String msg;
        msg = dadosDB.deletarCliente(txtIDCliente.getText());
        JOptionPane.showMessageDialog(rootPane, msg);
        cliAtual = 0;
        preencherTabela();
        mostrarRegistro();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String cliente = JOptionPane.showInputDialog("Insira o código do cliente");
        if (cliente.equals("")) {
            return;
        }

        if (!dadosDB.existeCliente(cliente)) {
            JOptionPane.showMessageDialog(rootPane, "Este cliente não existe!");
            return;
        }
        int num = tblTabela.getRowCount();

        for (int i = 0; i < num; i++) {
            if (Utilidades.objectToString(tblTabela.getValueAt(i, 0)).equals(cliente)) {
                cliAtual = i;
                break;
            }
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void mostrarRegistro() {
        txtIDCliente.setText(Utilidades.objectToString(tblTabela.getValueAt(cliAtual, 0)));
        cmbIdentificacao.setSelectedIndex(tipoID(Utilidades.objectToString(tblTabela.getValueAt(cliAtual, 1))));
        txtNome.setText(Utilidades.objectToString(tblTabela.getValueAt(cliAtual, 2)));
        txtSNome.setText(Utilidades.objectToString(tblTabela.getValueAt(cliAtual, 3)));
        txtEndereco.setText(Utilidades.objectToString(tblTabela.getValueAt(cliAtual, 4)));
        txtTelefone.setText(Utilidades.objectToString(tblTabela.getValueAt(cliAtual, 5)));
        cmbCidade.setSelectedIndex(cidade(Utilidades.objectToString(tblTabela.getValueAt(cliAtual, 6))));
        DData.setDate(Utilidades.objectToDate(tblTabela.getValueAt(cliAtual, 7)));
        DNascimento.setDate(Utilidades.objectToDate(tblTabela.getValueAt(cliAtual, 8)));
    }

    private void preencherTabela() {
        try {
            String titulos[] = {"ID Cliente", "tipo ID", "Nome", "Sobro-Nome", "Endereço", "Telefone", "Cidade", "Data Nascimento", "Data Cadastro"};
            String registro[] = new String[9];
            mTabela = new DefaultTableModel(null, titulos);
            ResultSet rs = dadosDB.getClientes();

            while (rs.next()) {
                registro[0] = rs.getString("idClientes");
                registro[1] = tipoID(rs.getInt("idTipo"));
                registro[2] = rs.getString("nome");
                registro[3] = rs.getString("snome");
                registro[4] = rs.getString("endereco");
                registro[5] = rs.getString("telefone");
                registro[6] = cidade(rs.getInt("idCidade"));
                registro[7] = rs.getString("dataNascimento");
                registro[8] = rs.getString("dataCadastro");

                mTabela.addRow(registro);
            }
            tblTabela.setModel(mTabela);
        } catch (SQLException ex) {
            Logger.getLogger(UP_F04_Clientes.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    private void carregarPrimeiroRegistro() {
        ResultSet rs = dadosDB.getClientes();
        try {
            if (rs.next()) {
                ID = rs.getString("IDClientes");
                Nome = rs.getString("Nome");
                SNome = rs.getString("SNome");
                Endereco = rs.getString("Endereco");
                Telefone = rs.getString("Telefone");

                txtIDCliente.setText(ID);
                txtNome.setText(Nome);
                txtSNome.setText(SNome);
                txtEndereco.setText(Endereco);
                txtTelefone.setText(Telefone);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UP_F04_Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String tipoID(int id) {
        return switch (id) {
            case 1 ->
                "CNH";
            case 2 ->
                "RG";
            case 3 ->
                "CPF";
            default ->
                "Não definido!";
        };
    }

    private int tipoID(String tipo) {
        return switch (tipo) {
            case "CNH" ->
                1;
            case "RG" ->
                2;
            default ->
                3;
        };
    }

    private String cidade(int id) {
        return switch (id) {
            case 1 ->
                "Lages";
            case 2 ->
                "Blumenau";
            case 3 ->
                "Joinvile";
            default ->
                "Não definido!";
        };
    }

    private int cidade(String nome) {
        return switch (nome) {
            case "Lages" ->
                1;
            case "Blumenau" ->
                2;
            default ->
                3;
        };
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DData;
    private com.toedter.calendar.JDateChooser DNascimento;
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
    private javax.swing.JComboBox<String> cmbCidade;
    private javax.swing.JComboBox<String> cmbIdentificacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    /*private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/up_images/Icons/Icon.jpg")));
    }*/
}
