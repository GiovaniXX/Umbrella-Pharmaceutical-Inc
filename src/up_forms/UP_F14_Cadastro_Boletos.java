package up_forms;

//import com.formdev.flatlaf.IntelliJTheme;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import up_classes.Boletos;
import up_classes.DadosDB;
import up_classes.Utilidades;

public class UP_F14_Cadastro_Boletos extends javax.swing.JInternalFrame {

    private DadosDB dadosDB;
    private final int boletoAtual = 0;
    private DefaultTableModel mTabela;

    private String IDBoleto;
    private String Cedente;
    private String CodigoBarras;
    private String DataVencimento;
    private String ValorPagar;

    public void setDadosDB(DadosDB dadosDB) {
        this.dadosDB = dadosDB;
    }

    public UP_F14_Cadastro_Boletos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCedente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoBarras = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDataVencimento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtValorPagar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnInserirDados = new javax.swing.JButton();
        btnExcluirBoleto = new javax.swing.JButton();
        btnCadastrarBoleto = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jpMarcas = new javax.swing.JPanel();
        jrbBoticario = new javax.swing.JRadioButton();
        jrbEudora = new javax.swing.JRadioButton();
        jrbAvon = new javax.swing.JRadioButton();
        jrbNatura = new javax.swing.JRadioButton();
        jrbGolfran = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDadosRegistros = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtIDboleto = new javax.swing.JTextField();
        lblHoraAtualSistema = new javax.swing.JLabel();
        btnLimparCampos = new javax.swing.JButton();

        setClosable(true);
        setTitle(".:Umbrella Pharmaceutical™ Cadastro de Boletos Bancarios");
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jLabel1.setText("Cedente.:");

        txtCedente.setEnabled(false);

        jLabel2.setText("Código de Barras.:");

        txtCodigoBarras.setEnabled(false);

        jLabel3.setText("Data de Vencimento.:");

        txtDataVencimento.setEnabled(false);

        jLabel4.setText("Valor a Pagar.:");

        txtValorPagar.setEnabled(false);
        txtValorPagar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorPagarFocusLost(evt);
            }
        });

        btnInserirDados.setText("Inserir Dados");
        btnInserirDados.setActionCommand("Inserir Dados");
        btnInserirDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirDadosActionPerformed(evt);
            }
        });

        btnExcluirBoleto.setText("Excluir Boleto");
        btnExcluirBoleto.setMaximumSize(new java.awt.Dimension(117, 23));
        btnExcluirBoleto.setMinimumSize(new java.awt.Dimension(117, 23));
        btnExcluirBoleto.setPreferredSize(new java.awt.Dimension(117, 23));
        btnExcluirBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirBoletoActionPerformed(evt);
            }
        });

        btnCadastrarBoleto.setText("Cadastrar Boleto");
        btnCadastrarBoleto.setEnabled(false);
        btnCadastrarBoleto.setMaximumSize(new java.awt.Dimension(117, 23));
        btnCadastrarBoleto.setMinimumSize(new java.awt.Dimension(117, 23));
        btnCadastrarBoleto.setPreferredSize(new java.awt.Dimension(117, 23));
        btnCadastrarBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarBoletoActionPerformed(evt);
            }
        });

        jpMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("Marcas"));

        jrbBoticario.setText("Boticário");

        jrbEudora.setText("Eudora");

        jrbAvon.setText("Avon");

        jrbNatura.setText("Natura");

        jrbGolfran.setText("Golfran");

        javax.swing.GroupLayout jpMarcasLayout = new javax.swing.GroupLayout(jpMarcas);
        jpMarcas.setLayout(jpMarcasLayout);
        jpMarcasLayout.setHorizontalGroup(
            jpMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMarcasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbAvon)
                    .addGroup(jpMarcasLayout.createSequentialGroup()
                        .addGroup(jpMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbBoticario)
                            .addComponent(jrbEudora))
                        .addGap(18, 18, 18)
                        .addGroup(jpMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbNatura)
                            .addComponent(jrbGolfran))))
                .addContainerGap(356, Short.MAX_VALUE))
        );
        jpMarcasLayout.setVerticalGroup(
            jpMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMarcasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbBoticario)
                    .addComponent(jrbGolfran))
                .addGap(16, 16, 16)
                .addGroup(jpMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbEudora)
                    .addComponent(jrbNatura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbAvon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtDadosRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Boleto", "Cedente", "Código de Barras", "Data de Vencimento", "Valor a Pagar"
            }
        ));
        jScrollPane1.setViewportView(jtDadosRegistros);
        if (jtDadosRegistros.getColumnModel().getColumnCount() > 0) {
            jtDadosRegistros.getColumnModel().getColumn(0).setMinWidth(100);
            jtDadosRegistros.getColumnModel().getColumn(0).setPreferredWidth(100);
            jtDadosRegistros.getColumnModel().getColumn(0).setMaxWidth(100);
            jtDadosRegistros.getColumnModel().getColumn(3).setMinWidth(150);
            jtDadosRegistros.getColumnModel().getColumn(3).setPreferredWidth(150);
            jtDadosRegistros.getColumnModel().getColumn(3).setMaxWidth(150);
            jtDadosRegistros.getColumnModel().getColumn(4).setMinWidth(100);
            jtDadosRegistros.getColumnModel().getColumn(4).setPreferredWidth(100);
            jtDadosRegistros.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        jLabel5.setText("ID Boleto.:");

        txtIDboleto.setEnabled(false);

        btnLimparCampos.setText("Limpar Campos");
        btnLimparCampos.setMaximumSize(new java.awt.Dimension(117, 23));
        btnLimparCampos.setMinimumSize(new java.awt.Dimension(117, 23));
        btnLimparCampos.setPreferredSize(new java.awt.Dimension(117, 23));
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblHoraAtualSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel5)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtIDboleto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtValorPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCodigoBarras)
                                            .addComponent(txtDataVencimento)
                                            .addComponent(txtCedente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jpMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(btnInserirDados, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(697, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIDboleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCedente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserirDados)
                    .addComponent(btnExcluirBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblHoraAtualSistema))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirDadosActionPerformed
        IDBoleto.setEnabled(true);
        txtCedente.setEnabled(true);
        txtCodigoBarras.setEnabled(true);
        txtDataVencimento.setEnabled(true);
        txtValorPagar.setEnabled(true);
    }//GEN-LAST:event_btnInserirDadosActionPerformed

    private void btnExcluirBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirBoletoActionPerformed

    }//GEN-LAST:event_btnExcluirBoletoActionPerformed

    private void btnCadastrarBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarBoletoActionPerformed
        if (txtIDboleto.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Favor inserir um número de ID do boleto!");
            txtIDboleto.requestFocusInWindow();
            return;
        }

        if (txtCedente.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Favor digitar o cedente!");
            txtCedente.requestFocusInWindow();
            return;
        }

        if (txtCodigoBarras.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Favor digitar um código de barras!");
            txtCodigoBarras.requestFocusInWindow();
            return;
        }

        if (txtDataVencimento.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Favor digitar a data de vencimento!");
            txtDataVencimento.requestFocusInWindow();
            return;
        }

        if (txtValorPagar.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Favor digitar o valor a ser pago!");
            txtValorPagar.requestFocusInWindow();
            return;
        }

        Boletos mBoletos = new Boletos(Integer.parseInt(txtIDboleto.getText()), txtCedente.getText(), Double.parseDouble(txtCodigoBarras.getText()), Utilidades.StringtoDate(txtDataVencimento.getText()), Float.parseFloat(txtValorPagar.getText()));

        String msg;
        msg = dadosDB.cadastrarBoletoBoticario(mBoletos);
        JOptionPane.showMessageDialog(rootPane, msg);

        preencherTabela();
    }//GEN-LAST:event_btnCadastrarBoletoActionPerformed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        txtCedente.setText("");
        txtCodigoBarras.setText("");
        txtDataVencimento.setText("");
        txtValorPagar.setText("");

        txtCedente.requestFocus();
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void txtValorPagarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorPagarFocusLost
        btnCadastrarBoleto.setEnabled(true);
    }//GEN-LAST:event_txtValorPagarFocusLost

    private void mostrarRegistro() {
        txtIDboleto.setText(Utilidades.objectToString(jtDadosRegistros.getValueAt(boletoAtual, 0)));
        txtCodigoBarras.setText(Utilidades.objectToString(jtDadosRegistros.getValueAt(boletoAtual, 1)));
        txtDataVencimento.setText(Utilidades.objectToString(jtDadosRegistros.getValueAt(boletoAtual, 2)));
        txtValorPagar.setText(Utilidades.objectToString(jtDadosRegistros.getValueAt(boletoAtual, 3)));
    }

    private void preencherTabela() {
        try {
            String titulos[] = {"ID Boleto", "Cedente", "Código de Barras", "Data de Vencimento", "Valor a Pagar"};
            String registro[] = new String[5];
            mTabela = new DefaultTableModel(null, titulos);
            ResultSet rs = dadosDB.getBoletos();

            while (rs.next()) {
                registro[0] = rs.getString("idboleto");
                registro[1] = rs.getString("cedente");
                registro[2] = rs.getString("codigodebarras");
                registro[3] = rs.getString("datadevencimento");
                registro[4] = rs.getString("valorapagar");

                mTabela.addRow(registro);
            }
            jtDadosRegistros.setModel(mTabela);
        } catch (SQLException ex) {
            Logger.getLogger(UP_F14_Cadastro_Boletos.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    private void carregarPrimeiroRegistro() {
        ResultSet rs = dadosDB.getBoletos();
        try {
            if (rs.next()) {
                IDBoleto = rs.getString("IDBoletos");
                Cedente = rs.getString("Cedente");
                CodigoBarras = rs.getString("CodigoBarras");
                DataVencimento = rs.getString("DataVencimento");
                ValorPagar = rs.getString("ValorPagar");

                txtIDboleto.setText(IDBoleto);
                txtCedente.setText(Cedente);
                txtCodigoBarras.setText(CodigoBarras);
                txtDataVencimento.setText(DataVencimento);
                txtValorPagar.setText(ValorPagar);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UP_F14_Cadastro_Boletos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarBoleto;
    private javax.swing.JButton btnExcluirBoleto;
    private javax.swing.JButton btnInserirDados;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpMarcas;
    private javax.swing.JRadioButton jrbAvon;
    private javax.swing.JRadioButton jrbBoticario;
    private javax.swing.JRadioButton jrbEudora;
    private javax.swing.JRadioButton jrbGolfran;
    private javax.swing.JRadioButton jrbNatura;
    private javax.swing.JTable jtDadosRegistros;
    private javax.swing.JLabel lblHoraAtualSistema;
    private javax.swing.JTextField txtCedente;
    private javax.swing.JTextField txtCodigoBarras;
    private javax.swing.JTextField txtDataVencimento;
    private javax.swing.JTextField txtIDboleto;
    private javax.swing.JTextField txtValorPagar;
    // End of variables declaration//GEN-END:variables
}
