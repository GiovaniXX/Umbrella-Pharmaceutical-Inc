package up_forms;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import up_classes.Cliente;
import java.sql.ResultSet;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import up_classes.Dados;
import up_classes.Utilidades;

public class UP_F04_Clientes extends javax.swing.JInternalFrame {

    private Dados dados;
    private int clienteAtual = 0;
    private boolean novo = false;
    private DefaultTableModel cTabela;

    private String id;
    private String nome;
    private String sobrenome;
    private String endereco;
    private String telefone;
    private String cidade;
    private String dataCadastro;

    public void setDados(Dados dados) {
        this.dados = dados;
    }

    public UP_F04_Clientes() {
        initComponents();
        cTabela = new DefaultTableModel(null, new String[]{"Id", "Produto", "Descrição", "Preço", "Quantidade", "Data"});
        tblTabela.setModel(cTabela);
        // Centraliza o texto nas colunas
        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < 6; i++) {
            tblTabela.getColumnModel().getColumn(i).setCellRenderer(dtcr);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIdcliente = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtSNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        cmbCidade = new javax.swing.JComboBox<>();
        jdcDataCadastro = new com.toedter.calendar.JDateChooser();
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
        setMaximumSize(new java.awt.Dimension(1440, 853));
        setMinimumSize(new java.awt.Dimension(1440, 853));
        setPreferredSize(new java.awt.Dimension(1440, 853));
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
        jLabel2.setText("ID.:");
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

        jLabel8.setForeground(new java.awt.Color(3, 155, 216));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Cidade.:");
        jLabel8.setMaximumSize(new java.awt.Dimension(67, 15));
        jLabel8.setMinimumSize(new java.awt.Dimension(67, 15));
        jLabel8.setPreferredSize(new java.awt.Dimension(67, 15));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(440, 137, 80, 15);

        jLabel10.setForeground(new java.awt.Color(3, 155, 216));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Data Cadastro.:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(770, 137, 90, 16);

        txtIdcliente.setBackground(new java.awt.Color(135, 135, 135));
        txtIdcliente.setForeground(new java.awt.Color(255, 255, 255));
        txtIdcliente.setBorder(null);
        txtIdcliente.setCaretColor(new java.awt.Color(3, 155, 216));
        txtIdcliente.setEnabled(false);
        txtIdcliente.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtIdcliente);
        txtIdcliente.setBounds(530, 5, 50, 22);

        txtNome.setBackground(new java.awt.Color(135, 135, 135));
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(null);
        txtNome.setCaretColor(new java.awt.Color(3, 155, 216));
        txtNome.setEnabled(false);
        txtNome.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtNome);
        txtNome.setBounds(530, 30, 510, 22);

        txtSNome.setBackground(new java.awt.Color(135, 135, 135));
        txtSNome.setForeground(new java.awt.Color(255, 255, 255));
        txtSNome.setBorder(null);
        txtSNome.setCaretColor(new java.awt.Color(255, 255, 255));
        txtSNome.setEnabled(false);
        txtSNome.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtSNome);
        txtSNome.setBounds(530, 54, 510, 22);

        txtEndereco.setBackground(new java.awt.Color(135, 135, 135));
        txtEndereco.setForeground(new java.awt.Color(255, 255, 255));
        txtEndereco.setBorder(null);
        txtEndereco.setEnabled(false);
        txtEndereco.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtEndereco);
        txtEndereco.setBounds(530, 79, 510, 22);

        txtTelefone.setBackground(new java.awt.Color(135, 135, 135));
        txtTelefone.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefone.setBorder(null);
        txtTelefone.setEnabled(false);
        txtTelefone.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(530, 104, 510, 22);

        cmbCidade.setBackground(new java.awt.Color(30, 30, 30));
        cmbCidade.setForeground(new java.awt.Color(255, 255, 255));
        cmbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma cidade...", "Blumenau", "Chapecó", "Criciúma", "Florianópolis", "Itajaí", "Joinville", "Lages", "Jaraguá do Sul", "Balneário Camboriú", "São José" }));
        getContentPane().add(cmbCidade);
        cmbCidade.setBounds(530, 135, 210, 22);

        jdcDataCadastro.setBackground(new java.awt.Color(135, 135, 135));
        jdcDataCadastro.setForeground(new java.awt.Color(255, 255, 255));
        jdcDataCadastro.setEnabled(false);
        getContentPane().add(jdcDataCadastro);
        jdcDataCadastro.setBounds(870, 135, 170, 22);

        btnPrimeiro.setBackground(new java.awt.Color(122, 0, 0));
        btnPrimeiro.setForeground(new java.awt.Color(3, 155, 216));
        btnPrimeiro.setText("Primeiro");
        btnPrimeiro.setBorder(null);
        btnPrimeiro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrimeiro);
        btnPrimeiro.setBounds(620, 210, 73, 25);

        btnAnterior.setBackground(new java.awt.Color(122, 0, 0));
        btnAnterior.setForeground(new java.awt.Color(3, 155, 216));
        btnAnterior.setText("Anterior");
        btnAnterior.setBorder(null);
        btnAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnterior);
        btnAnterior.setBounds(700, 210, 73, 25);

        btnProximo.setBackground(new java.awt.Color(122, 0, 0));
        btnProximo.setForeground(new java.awt.Color(3, 155, 216));
        btnProximo.setText("Proximo");
        btnProximo.setBorder(null);
        btnProximo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });
        getContentPane().add(btnProximo);
        btnProximo.setBounds(780, 210, 73, 25);

        btnUltimo.setBackground(new java.awt.Color(122, 0, 0));
        btnUltimo.setForeground(new java.awt.Color(3, 155, 216));
        btnUltimo.setText("Ultimo");
        btnUltimo.setBorder(null);
        btnUltimo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });
        getContentPane().add(btnUltimo);
        btnUltimo.setBounds(860, 210, 73, 25);

        btnNovo.setBackground(new java.awt.Color(122, 0, 0));
        btnNovo.setForeground(new java.awt.Color(3, 155, 216));
        btnNovo.setText("Novo");
        btnNovo.setBorder(null);
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo);
        btnNovo.setBounds(620, 240, 73, 25);

        btnEditar.setBackground(new java.awt.Color(122, 0, 0));
        btnEditar.setForeground(new java.awt.Color(3, 155, 216));
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(700, 240, 73, 25);

        btnSalvar.setBackground(new java.awt.Color(122, 0, 0));
        btnSalvar.setForeground(new java.awt.Color(3, 155, 216));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(null);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(780, 240, 73, 25);

        btnExcluir.setBackground(new java.awt.Color(122, 0, 0));
        btnExcluir.setForeground(new java.awt.Color(3, 155, 216));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(null);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(860, 240, 73, 25);

        btnCancelar.setBackground(new java.awt.Color(122, 0, 0));
        btnCancelar.setForeground(new java.awt.Color(3, 155, 216));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(700, 270, 73, 25);

        btnPesquisar.setBackground(new java.awt.Color(122, 0, 0));
        btnPesquisar.setForeground(new java.awt.Color(3, 155, 216));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(null);
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(780, 270, 73, 25);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(462, 402));

        tblTabela.setBackground(new java.awt.Color(0, 0, 0));
        tblTabela.setForeground(new java.awt.Color(3, 155, 216));
        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sobrenome", "Endereço", "Cidade", "Telefone", "Data Cadastro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTabela.setGridColor(new java.awt.Color(0, 0, 0));
        tblTabela.setMaximumSize(new java.awt.Dimension(452, 402));
        tblTabela.setMinimumSize(new java.awt.Dimension(452, 402));
        tblTabela.setPreferredSize(new java.awt.Dimension(452, 402));
        tblTabela.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tblTabela.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblTabela.setShowGrid(false);
        jScrollPane1.setViewportView(tblTabela);
        if (tblTabela.getColumnModel().getColumnCount() > 0) {
            tblTabela.getColumnModel().getColumn(0).setMinWidth(50);
            tblTabela.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblTabela.getColumnModel().getColumn(0).setMaxWidth(50);
            tblTabela.getColumnModel().getColumn(6).setMinWidth(100);
            tblTabela.getColumnModel().getColumn(6).setPreferredWidth(100);
            tblTabela.getColumnModel().getColumn(6).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(5, 320, 1338, 360);

        jLabel1.setBackground(new java.awt.Color(200, 22, 22));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Logos/0014.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1440, 853);

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
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        cmbCidade.setEnabled(true);
        jdcDataCadastro.setEnabled(true);

        txtIdcliente.setText("");
        txtNome.setText("");
        txtSNome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        cmbCidade.setSelectedIndex(0);
        jdcDataCadastro.setDate(new Date());

        novo = true;
        txtIdcliente.requestFocus();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // Verifica se o nome foi fornecido
        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Insira o nome.");
            txtNome.requestFocusInWindow();
            return;
        }

        // Verifica se o sobrenome foi fornecido
        if (txtSNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Insira o sobre-nome.");
            txtSNome.requestFocusInWindow();
            return;
        }

        // Verifica se a data de cadastro é válida
        if (jdcDataCadastro.getDate() == null || jdcDataCadastro.getDate().after(new Date())) {
            JOptionPane.showMessageDialog(rootPane, "Insira uma data de cadastro válida.");
            jdcDataCadastro.requestFocusInWindow();
            return;
        }

        // Verifica a existência do cliente conforme o estado da operação (novo ou edição)
        boolean clienteExistente = dados.existeCliente(txtIdcliente.getText());
        if (novo && clienteExistente) {
            JOptionPane.showMessageDialog(rootPane, "Este cliente já existe.");
            txtIdcliente.requestFocusInWindow();
            return;
        } else if (!novo && !clienteExistente) {
            JOptionPane.showMessageDialog(rootPane, "Este cliente ainda não existe.");
            txtIdcliente.requestFocusInWindow();
            return;
        }

        // Cria um novo objeto Cliente
        Cliente mCliente = new Cliente(
                Utilidades.objectToInt(txtIdcliente.getText()),
                txtNome.getText(),
                txtSNome.getText(),
                txtEndereco.getText(),
                txtTelefone.getText(),
                cmbCidade.getSelectedIndex(),
                jdcDataCadastro.getDate());

        // Mensagem a ser exibida após a operação de adicionar ou editar
        String msg = novo ? dados.adicionarCliente(mCliente) : dados.editarCliente(mCliente);
        JOptionPane.showMessageDialog(rootPane, msg);

        // Atualiza o estado dos botões
        toggleButtonStatesAfterSave();

        // Limpa os campos de entrada
        clearInputFields();

        // Atualiza a tabela
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

        txtIdcliente.setEnabled(false);
        txtNome.setEnabled(false);
        txtSNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        cmbCidade.setEnabled(false);
        jdcDataCadastro.setEnabled(false);

        txtIdcliente.setText(id);
        txtNome.setText(nome);
        txtSNome.setText(sobrenome);
        txtEndereco.setText(endereco);
        txtTelefone.setText(telefone);

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
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        cmbCidade.setEnabled(true);
        jdcDataCadastro.setEnabled(true);

        novo = false;

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
        clienteAtual = 0;
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        clienteAtual = dados.numeroClientes() - 1;
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        clienteAtual++;

        if (clienteAtual == dados.numeroClientes()) {
            clienteAtual = 0;
        }
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        clienteAtual--;
        if (clienteAtual == -1) {
            clienteAtual = dados.numeroClientes() - 1;
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
        msg = dados.deletarCliente(txtIdcliente.getText());
        JOptionPane.showMessageDialog(rootPane, msg);
        clienteAtual = 0;
        preencherTabela();
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String cliente = JOptionPane.showInputDialog("Insira o código do cliente");

        if (cliente == null) {
            return;
        }

        if (cliente.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O código do cliente é obrigatório para a pesquisa");
            return;
        }

        if (!dados.existeCliente(cliente)) {
            JOptionPane.showMessageDialog(rootPane, "Este cliente não existe!");
            return;
        }

        int num = tblTabela.getRowCount();
        for (int i = 0; i < num; i++) {
            if (Utilidades.objectToString(tblTabela.getValueAt(i, 0)).equals(cliente)) {
                clienteAtual = i;
                break;
            }
        }
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void mostrarRegistro() {
        // Verificar se a tabela tem registros
        if (cTabela.getRowCount() > 0 && clienteAtual >= 0) {
            // Acessar e exibir o registro atual
            txtIdcliente.setText(Utilidades.objectToString(cTabela.getValueAt(clienteAtual, 0)));
            txtNome.setText(Utilidades.objectToString(cTabela.getValueAt(clienteAtual, 1)));
            txtSNome.setText(Utilidades.objectToString(cTabela.getValueAt(clienteAtual, 2)));
            txtEndereco.setText(Utilidades.objectToString(cTabela.getValueAt(clienteAtual, 3)));
            txtTelefone.setText(Utilidades.objectToString(cTabela.getValueAt(clienteAtual, 4)));
            cmbCidade.setSelectedIndex(cidade(Utilidades.objectToString(tblTabela.getValueAt(clienteAtual, 5))));
            jdcDataCadastro.setDate(Utilidades.objectToDate(cTabela.getValueAt(clienteAtual, 6)));
        } else {
            // Limpar os campos se não houver registros na tabela
            txtIdcliente.setText("");
            txtNome.setText("");
            txtSNome.setText("");
            txtEndereco.setText("");
            txtTelefone.setText("");
            cmbCidade.setSelectedIndex(0); // Seleciona o primeiro item ou pode manter vazio           
            jdcDataCadastro.setDate(null);

            // Exibir uma mensagem ou tratar de outra forma, se necessário
            System.out.println("A tabela está vazia. Nenhum registro para mostrar.");
        }
    }

    // Preenche os registros na tabela
    private void preencherTabela() {
        try {
            String titulos[] = {"ID", "Nome", "Sobrenome", "Endereco", "Telefone", "Cidade", "Data Cadastro"};
            String registro[] = new String[7];
            cTabela = new DefaultTableModel(null, titulos);
            ResultSet rs = dados.getClientes();

            while (rs.next()) {
                registro[0] = rs.getString("idcliente"); // Como está na base de dados
                registro[1] = rs.getString("nome");
                registro[2] = rs.getString("sobrenome");
                registro[3] = rs.getString("endereco");
                registro[4] = rs.getString("telefone");
                registro[5] = rs.getString("cidade");
                registro[6] = rs.getString("dataCadastro");
                cTabela.addRow(registro);
            }
            tblTabela.setModel(cTabela);
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void carregarPrimeiroRegistro() {
        ResultSet rs = (ResultSet) dados.getClientes();
        try {
            if (rs.next()) {
                id = rs.getString("idcliente");
                nome = rs.getString("nome");
                sobrenome = rs.getString("sobrenome");
                endereco = rs.getString("endereco");
                telefone = rs.getString("telefone");
                cidade = rs.getString("cidade");
                dataCadastro = rs.getString("dataCadastro");

                txtIdcliente.setText(id);
                txtNome.setText(nome);
                txtSNome.setText(sobrenome);
                txtEndereco.setText(endereco);
                txtTelefone.setText(telefone);
                cmbCidade.setSelectedItem(cidade);
                jdcDataCadastro.setDateFormatString(dataCadastro);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UP_F04_Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String cidade(int cidade) {
        return switch (cidade) {
            case 0 ->
                "Selecione a cidade";
            case 1 ->
                "Blumenau";
            case 2 ->
                "Chapecó";
            case 3 ->
                "Criciúma";
            case 4 ->
                "Florianópolis";
            case 5 ->
                "Itajaí";            
            case 6 ->
                "Lages";
            case 7 ->
                "Jaragua do Sul";
            case 8 ->
                "Balneário Camboriú";
            case 9 ->
                "São Jose";
            default ->
                "Não definido!";
        };
    }

    private int cidade(String cidade) {
        return switch (cidade) {
            case "Blumenau" ->
                1;
            case "Chapecó" ->
                2;
            case "Criciúma" ->
                3;
            case "Florianópolis" ->
                4;
            case "Itajaí" ->
                5;
            case "Lages" ->
                6;
            case "Jaragua do Sul" ->
                7;
            case "Balneário Camboriú" ->
                8;
            case "São Jose" ->
                9;                           
            default ->
                3;
        };
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcDataCadastro;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdcliente;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    // Método auxiliar para habilitar/desabilitar botões
    private void toggleButtonStatesAfterSave() {
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

        // Desabilita os campos de entrada
        txtIdcliente.setEnabled(false);
        txtNome.setEnabled(false);
        txtSNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        cmbCidade.setEnabled(false);
        jdcDataCadastro.setEnabled(false);
    }

    // Método auxiliar para limpar os campos de entrada
    private void clearInputFields() {
        txtIdcliente.setText("");
        txtNome.setText("");
        txtSNome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        cmbCidade.setSelectedIndex(0); // Reseta para a opção padrão       
        jdcDataCadastro.setDate(null); // Reseta a data
    }
}
