package up_forms;

import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import up_classes.DadosDB;
import up_classes.Utilidades;

public class UP_F14_Cadastro_Boletos extends javax.swing.JInternalFrame {

    private final Timer timer;
    public DadosDB dadosDB;

    public void setDadosDB(DadosDB dadosDB) {
        this.dadosDB = dadosDB;
    }

    public UP_F14_Cadastro_Boletos() {
        initComponents();
        timer = new Timer(1000, (ActionEvent e) -> {
            atualizarDataHoraAtual();
        });
        timer.start();
        atualizarDataHoraAtual();
    }

    private void atualizarDataHoraAtual() {
        SimpleDateFormat formatoDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dataHoraAtual = new Date();
        String dataHoraAtualFormatada = formatoDataHora.format(dataHoraAtual);
        jLabel_DataHoraAtualSistema.setText(dataHoraAtualFormatada);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_Cedente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_CodigoBarras = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_ValorPagamento = new javax.swing.JTextField();
        jButton_CadastrarBoletosBancoDados = new javax.swing.JButton();
        jButton_ExcluirBoletos = new javax.swing.JButton();
        jButton_LimparCampos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Tabela = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        lblHoraAtualSistema = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_DataHoraAtualSistema = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jComboBox_Empresas = new javax.swing.JComboBox<>();
        jTextField_DataVencimento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Situacao = new javax.swing.JTextField();

        setClosable(true);
        setTitle(".:Umbrella Pharmaceutical™ Cadastro de Boletos Bancarios");
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setNormalBounds(new java.awt.Rectangle(0, 0, 1366, 0));
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jLabel1.setText("Cedente.:");

        jLabel2.setText("Código de Barras.:");

        jLabel3.setText("Data Vencimento.:");

        jLabel4.setText("Valor Pagamento.:");

        jButton_CadastrarBoletosBancoDados.setText("Cadastrar Boletos Banco Dados");
        jButton_CadastrarBoletosBancoDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CadastrarBoletosBancoDadosActionPerformed(evt);
            }
        });

        jButton_ExcluirBoletos.setText("Excluir Boleto");
        jButton_ExcluirBoletos.setEnabled(false);
        jButton_ExcluirBoletos.setMaximumSize(new java.awt.Dimension(117, 23));
        jButton_ExcluirBoletos.setMinimumSize(new java.awt.Dimension(117, 23));
        jButton_ExcluirBoletos.setPreferredSize(new java.awt.Dimension(117, 23));
        jButton_ExcluirBoletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExcluirBoletosActionPerformed(evt);
            }
        });

        jButton_LimparCampos.setText("Limpar Campos");
        jButton_LimparCampos.setEnabled(false);
        jButton_LimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LimparCamposActionPerformed(evt);
            }
        });

        jTable_Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Boleto", "Cedente", "Código de Barras", "Data de Vencimento", "Valor a Pagar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Tabela.setMinimumSize(new java.awt.Dimension(500, 80));
        jScrollPane1.setViewportView(jTable_Tabela);
        if (jTable_Tabela.getColumnModel().getColumnCount() > 0) {
            jTable_Tabela.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable_Tabela.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTable_Tabela.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        jLabel5.setText("Empresas.:");

        jLabel6.setText("Data Hora Atual.:");

        jLabel_DataHoraAtualSistema.setPreferredSize(new java.awt.Dimension(0, 16));

        jComboBox_Empresas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "Boticario", "Natura", "Eudora", "Golfran" }));

        jLabel7.setText("Situação.:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel_DataHoraAtualSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel5))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_CodigoBarras)
                            .addComponent(jComboBox_Empresas, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Cedente, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField_DataVencimento))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField_ValorPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(111, 111, 111)
                            .addComponent(jButton_CadastrarBoletosBancoDados)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton_LimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton_ExcluirBoletos, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField_Situacao, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(417, 417, 417)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lblHoraAtualSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel_DataHoraAtualSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(lblHoraAtualSistema))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox_Empresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_Cedente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_CodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_DataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_ValorPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Situacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_CadastrarBoletosBancoDados)
                            .addComponent(jButton_LimparCampos)
                            .addComponent(jButton_ExcluirBoletos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CadastrarBoletosBancoDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CadastrarBoletosBancoDadosActionPerformed
        try {
            String cedente = jTextField_Cedente.getText();
            double codigoBarras = Utilidades.convertStringToDouble(Utilidades.extractNumber(jTextField_CodigoBarras.getText()));
            Date dataVencimento = Utilidades.convertStringToDate(jTextField_DataVencimento.getText());
            float valorPagamento = (float) Utilidades.parseFloatWithComma(jTextField_ValorPagamento.getText());
            String situacao = jTextField_Situacao.getText();

            DadosDB dadosDB = new DadosDB();

            // Obter a opção selecionada no jComboBox_Empresas
            String empresaSelecionada = (String) jComboBox_Empresas.getSelectedItem();

            // Verificar se nenhuma empresa foi selecionada
            if (empresaSelecionada == null || empresaSelecionada.isEmpty()) {
                // Exibir mensagem de erro ao usuário
                JOptionPane.showMessageDialog(this, "Selecione uma empresa primeiro.");
                return;
            }

            // Chamar o método apropriado com base na empresa selecionada
            switch (empresaSelecionada) {
                case "Avon" -> {
                    DadosDB.cadastrarInformacoesAvon(cedente, codigoBarras, dataVencimento, valorPagamento, situacao);
                    DadosDB.atualizarTabelaAvon((DefaultTableModel) jTable_Tabela.getModel());
                }
                case "Boticário" -> {
                    DadosDB.cadastrarInformacoesBoticario(cedente, codigoBarras, dataVencimento, valorPagamento, situacao);
                    DadosDB.atualizarTabelaBoticario((DefaultTableModel) jTable_Tabela.getModel());
                }
                case "Eudora" -> {
                    DadosDB.cadastrarInformacoesEudora(cedente, codigoBarras, dataVencimento, valorPagamento, situacao);
                    DadosDB.atualizarTabelaEudora((DefaultTableModel) jTable_Tabela.getModel());
                }
                case "Golfran" -> {
                    DadosDB.cadastrarInformacoesGolfran(cedente, codigoBarras, dataVencimento, valorPagamento, situacao);
                    DadosDB.atualizarTabelaGolfran((DefaultTableModel) jTable_Tabela.getModel());
                }
                case "Natura" -> {
                    DadosDB.cadastrarInformacoesNatura(cedente, codigoBarras, dataVencimento, valorPagamento, situacao);
                    DadosDB.atualizarTabelaNatura((DefaultTableModel) jTable_Tabela.getModel());
                }
            }
            // Exibir mensagem de sucesso ao usuário
            JOptionPane.showMessageDialog(this, "Boleto cadastrado com sucesso!");
        } catch (ParseException ex) {
            Logger.getLogger(UP_F13_Pesquisar_Boletos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_CadastrarBoletosBancoDadosActionPerformed

    private void jButton_ExcluirBoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExcluirBoletosActionPerformed

    }//GEN-LAST:event_jButton_ExcluirBoletosActionPerformed

    private void jButton_LimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimparCamposActionPerformed
        jTextField_Cedente.setText("");
        jTextField_CodigoBarras.setText("");
        jTextField_DataVencimento.setText("");
        jTextField_ValorPagamento.setText("");
    }//GEN-LAST:event_jButton_LimparCamposActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_CadastrarBoletosBancoDados;
    private javax.swing.JButton jButton_ExcluirBoletos;
    private javax.swing.JButton jButton_LimparCampos;
    private javax.swing.JComboBox<String> jComboBox_Empresas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_DataHoraAtualSistema;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable_Tabela;
    private javax.swing.JTextField jTextField_Cedente;
    private javax.swing.JTextField jTextField_CodigoBarras;
    private javax.swing.JTextField jTextField_DataVencimento;
    private javax.swing.JTextField jTextField_Situacao;
    private javax.swing.JTextField jTextField_ValorPagamento;
    private javax.swing.JLabel lblHoraAtualSistema;
    // End of variables declaration//GEN-END:variables
}
