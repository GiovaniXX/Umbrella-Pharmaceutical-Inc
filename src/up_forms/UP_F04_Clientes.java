package up_forms;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import up_classes.Cliente;
import java.sql.ResultSet;
import up_classes.Dados;
import up_classes.Utilidades;

public class UP_F04_Clientes extends javax.swing.JInternalFrame {

    private Dados dados;
    private int clienteAtual = 0;
    private boolean novo = false;
    private DefaultTableModel mTabela;

    private String id;
    private String identificacao;
    private String nome;
    private String sobrenome;
    private String endereco;
    private String telefone;
    private String cidade;
    private String dataNascimento;
    private String dataCadastro;

    public void setDados(Dados dados) {
        this.dados = dados;
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
        txtIdcliente = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtSNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        cmbIdentificacao = new javax.swing.JComboBox<>();
        cmbCidade = new javax.swing.JComboBox<>();
        jdcDataCadastro = new com.toedter.calendar.JDateChooser();
        jdcDataNascimento = new com.toedter.calendar.JDateChooser();
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
        jLabel9.setText("Data Nascimento.:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(760, 150, 100, 16);

        jLabel10.setForeground(new java.awt.Color(3, 155, 216));
        jLabel10.setText("Data Cadastro.:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(780, 170, 80, 16);

        txtIdcliente.setBackground(new java.awt.Color(30, 30, 30));
        txtIdcliente.setForeground(new java.awt.Color(255, 255, 255));
        txtIdcliente.setBorder(null);
        txtIdcliente.setCaretColor(new java.awt.Color(255, 255, 255));
        txtIdcliente.setEnabled(false);
        txtIdcliente.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtIdcliente);
        txtIdcliente.setBounds(530, 5, 50, 22);

        txtNome.setBackground(new java.awt.Color(30, 30, 30));
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(null);
        txtNome.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNome.setEnabled(false);
        txtNome.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtNome);
        txtNome.setBounds(530, 30, 510, 22);

        txtSNome.setBackground(new java.awt.Color(30, 30, 30));
        txtSNome.setForeground(new java.awt.Color(255, 255, 255));
        txtSNome.setBorder(null);
        txtSNome.setCaretColor(new java.awt.Color(255, 255, 255));
        txtSNome.setEnabled(false);
        txtSNome.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtSNome);
        txtSNome.setBounds(530, 54, 510, 22);

        txtEndereco.setBackground(new java.awt.Color(30, 30, 30));
        txtEndereco.setForeground(new java.awt.Color(255, 255, 255));
        txtEndereco.setBorder(null);
        txtEndereco.setEnabled(false);
        txtEndereco.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtEndereco);
        txtEndereco.setBounds(530, 79, 510, 22);

        txtTelefone.setBackground(new java.awt.Color(30, 30, 30));
        txtTelefone.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefone.setBorder(null);
        txtTelefone.setEnabled(false);
        txtTelefone.setPreferredSize(new java.awt.Dimension(71, 22));
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(530, 104, 510, 22);

        cmbIdentificacao.setBackground(new java.awt.Color(30, 30, 30));
        cmbIdentificacao.setForeground(new java.awt.Color(255, 255, 255));
        cmbIdentificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Identificação", "CNH", "RG", "CPF" }));
        getContentPane().add(cmbIdentificacao);
        cmbIdentificacao.setBounds(530, 133, 210, 22);

        cmbCidade.setBackground(new java.awt.Color(30, 30, 30));
        cmbCidade.setForeground(new java.awt.Color(255, 255, 255));
        cmbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cidade", "Abadia de Goiás (GO)", "Abadia dos Dourados (MG)", "Abadiânia (GO)", "Abaeté (MG)", "Abaetetuba (PA)", "Abaiara (CE)", "Abaíra (BA)", "Abaré (BA)", "Abatiá (PR)", "Abdon Batista (SC)", "Abelardo Luz (SC)", "Abel Figueiredo (PA)", "Abre Campo (MG)", "Abreu e Lima (PE)", "Abreulândia (TO)", "Acaiaca (MG)", "Açailândia (MA)", "Acajutiba (BA)", "Acará (PA)", "Acarape (CE)", "Acaraú (CE)", "Acari (RN)", "Acauã (PI)", "Aceguá (RS)", "Acopiara (CE)", "Acorizal (MT)", "Acrelândia (AC)", "Acreúna (GO)", "Açucena (MG)", "Adamantina (SP)", "Adelândia (GO)", "Adolfo (SP)", "Adrianópolis (PR)", "Adustina (BA)", "Afogados da Ingazeira (PE)", "Afonso Bezerra (RN)", "Afonso Cláudio (ES)", "Afonso Cunha (MA)", "Afrânio (PE)", "Afuá (PA)", "Agrestina (PE)", "Agricolândia (PI)", "Agrolândia (SC)", "Agronômica (SC)", "Água Azul do Norte (PA)", "Água Boa (MG)", "Água Boa (MT)", "Água Branca (AL)", "Água Branca (PB)", "Água Branca (PI)", "Água Clara (MS)", "Água Comprida (MG)", "Água Doce (SC)", "Água Doce do Maranhão (MA)", "Água Doce do Norte (ES)", "Água Fria (BA)", "Água Fria de Goiás (GO)", "Aguaí (SP)", "Água Limpa (GO)", "Aguanil (MG)", "Água Nova (RN)", "Água Preta (PE)", "Água Santa (RS)", "Águas Belas (PE)", "Águas da Prata (SP)", "Águas de Chapecó (SC)", "Águas de Lindóia (SP)", "Águas de Santa Bárbara (SP)", "Águas de São Pedro (SP)", "Águas Formosas (MG)", "Águas Frias (SC)", "Águas Lindas de Goiás (GO)", "Águas Mornas (SC)", "Águas Vermelhas (MG)", "Agudo (RS)", "Agudos (SP)", "Agudos do Sul (PR)", "Águia Branca (ES)", "Aguiar (PB)", "Aguiarnópolis (TO)", "Aimorés (MG)", "Aiquara (BA)", "Aiuaba (CE)", "Aiuruoca (MG)", "Ajuricaba (RS)", "Alagoa (MG)", "Alagoa Grande (PB)", "Alagoa Nova (PB)", "Alagoinha (PB)", "Alagoinha (PE)", "Alagoinha do Piauí (PI)", "Alagoinhas (BA)", "Alambari (SP)", "Albertina (MG)", "Alcântara (MA)", "Alcântaras (CE)", "Alcantil (PB)", "Alcinópolis (MS)", "Alcobaça (BA)", "Aldeias Altas (MA)", "Alecrim (RS)", "Alegre (ES)", "Alegrete (RS)", "Alegrete do Piauí (PI)", "Alegria (RS)", "Além Paraíba (MG)", "Alenquer (PA)", "Alexandria (RN)", "Alexânia (GO)", "Alfenas (MG)", "Alfredo Chaves (ES)", "Alfredo Marcondes (SP)", "Alfredo Vasconcelos (MG)", "Alfredo Wagner (SC)", "Algodão de Jandaíra (PB)", "Alhandra (PB)", "Aliança (PE)", "Aliança do Tocantins (TO)", "Almadina (BA)", "Almas (TO)", "Almenara (MG)", "Almeirim (PA)", "Almino Afonso (RN)", "Almirante Tamandaré (PR)", "Almirante Tamandaré do Sul (RS)", "Aloândia (GO)", "Alpercata (MG)", "Alpestre (RS)", "Alpinópolis (MG)", "Alta Floresta (MT)", "Alta Floresta d'Oeste (RO)", "Altair (SP)", "Altamira (PA)", "Altamira do Maranhão (MA)", "Altamira do Paraná (PR)", "Altaneira (CE)", "Alterosa (MG)", "Altinho (PE)", "Altinópolis (SP)", "Alto Alegre (RR)", "Alto Alegre (RS)", "Alto Alegre (SP)", "Alto Alegre do Maranhão (MA)", "Alto Alegre do Pindaré (MA)", "Alto Alegre dos Parecis (RO)", "Alto Araguaia (MT)", "Alto Bela Vista (SC)", "Alto Caparaó (MG)", "Alto da Boa Vista (MT)", "Alto do Rodrigues (RN)", "Alto Feliz (RS)", "Alto Garças (MT)", "Alto Horizonte (GO)", "Alto Jequitibá (MG)", "Alto Longá (PI)", "Altônia (PR)", "Alto Paraguai (MT)", "Alto Paraíso (PR)", "Alto Paraíso (RO)", "Alto Paraíso de Goiás (GO)", "Alto Paraná (PR)", "Alto Parnaíba (MA)", "Alto Piquiri (PR)", "Alto Rio Doce (MG)", "Alto Rio Novo (ES)", "Altos (PI)", "Alto Santo (CE)", "Alto Taquari (MT)", "Alumínio (SP)", "Alvarães (AM)", "Alvarenga (MG)", "Álvares Florence (SP)", "Álvares Machado (SP)", "Álvaro de Carvalho (SP)", "Alvinlândia (SP)", "Alvinópolis (MG)", "Alvorada (RS)", "Alvorada (TO)", "Alvorada de Minas (MG)", "Alvorada d'Oeste (RO)", "Alvorada do Gurgueia (PI)", "Alvorada do Norte (GO)", "Alvorada do Sul (PR)", "Amajari (RR)", "Amambai (MS)", "Amapá (AP)", "Amapá do Maranhão (MA)", "Amaporã (PR)", "Amaraji (PE)", "Amaral Ferrador (RS)", "Amaralina (GO)", "Amarante (PI)", "Amarante do Maranhão (MA)", "Amargosa (BA)", "Amaturá (AM)", "Amélia Rodrigues (BA)", "América Dourada (BA)", "Americana (SP)", "Americano do Brasil (GO)", "Américo Brasiliense (SP)", "Américo de Campos (SP)", "Ametista do Sul (RS)", "Amontada (CE)", "Amorinópolis (GO)", "Amparo (PB)", "Amparo (SP)", "Amparo da Serra (MG)", "Amparo do São Francisco (SE)", "Ampére (PR)", "Anadia (AL)", "Anagé (BA)", "Anahy (PR)", "Anajás (PA)", "Anajatuba (MA)", "Analândia (SP)", "Anamã (AM)", "Ananás (TO)", "Ananindeua (PA)", "Anápolis (GO)", "Anapu (PA)", "Anapurus (MA)", "Anastácio (MS)", "Anaurilândia (MS)", "Anchieta (ES)", "Anchieta (SC)", "Andaraí (BA)", "Andirá (PR)", "Andorinha (BA)", "Andradas (MG)", "Andradina (SP)", "André da Rocha (RS)", "Andrelândia (MG)", "Angatuba (SP)", "Angelândia (MG)", "Angélica (MS)", "Angelim (PE)", "Angelina (SC)", "Angical (BA)", "Angical do Piauí (PI)", "Angico (TO)", "Angicos (RN)", "Angra dos Reis (RJ)", "Anguera (BA)", "Ângulo (PR)", "Anhanguera (GO)", "Anhembi (SP)", "Anhumas (SP)", "Anicuns (GO)", "Anísio de Abreu (PI)", "Anita Garibaldi (SC)", "Anitápolis (SC)", "Anori (AM)", "Anta Gorda (RS)", "Antas (BA)", "Antonina (PR)", "Antonina do Norte (CE)", "Antônio Almeida (PI)", "Antônio Cardoso (BA)", "Antônio Carlos (MG)", "Antônio Carlos (SC)", "Antônio Dias (MG)", "Antônio Gonçalves (BA)", "Antônio João (MS)", "Antônio Martins (RN)", "Antônio Olinto (PR)", "Antônio Prado (RS)", "Antônio Prado de Minas (MG)", "Aparecida (PB)", "Aparecida (SP)", "Aparecida de Goiânia (GO)", "Aparecida d'Oeste (SP)", "Aparecida do Rio Doce (GO)", "Aparecida do Rio Negro (TO)", "Aparecida do Taboado (MS)", "Aperibé (RJ)", "Apiacá (ES)", "Apiacás (MT)", "Apiaí (SP)", "Apicum-Açu (MA)", "Apiúna (SC)", "Apodi (RN)", "Aporá (BA)", "Aporé (GO)", "Apuarema (BA)", "Apucarana (PR)", "Apuí (AM)", "Apuiarés (CE)", "Aquidabã (SE)", "Aquidauana (MS)", "Aquiraz (CE)", "Arabutã (SC)", "Araçagi (PB)", "Araçaí (MG)", "Aracaju (SE)", "Araçariguama (SP)", "Araçás (BA)", "Aracati (CE)", "Aracatu (BA)", "Araçatuba (SP)", "Araci (BA)", "Aracitaba (MG)", "Aracoiaba (CE)", "Araçoiaba (PE)", "Araçoiaba da Serra (SP)", "Aracruz (ES)", "Araçu (GO)", "Araçuaí (MG)", "Aragarças (GO)", "Aragoiânia (GO)", "Aragominas (TO)", "Araguacema (TO)", "Araguaçu (TO)", "Araguaiana (MT)", "Araguaína (TO)", "Araguainha (MT)", "Araguanã (MA)", "Araguanã (TO)", "Araguapaz (GO)", "Araguari (MG)", "Araguatins (TO)", "Araioses (MA)", "Aral Moreira (MS)", "Aramari (BA)", "Arambaré (RS)", "Arame (MA)", "Aramina (SP)", "Arandu (SP)", "Arantina (MG)", "Arapeí (SP)", "Arapiraca (AL)", "Arapoema (TO)", "Araponga (MG)", "Arapongas (PR)", "Araporã (MG)", "Arapoti (PR)", "Arapuá (MG)", "Arapuã (PR)", "Araputanga (MT)", "Araquari (SC)", "Arara (PB)", "Araranguá (SC)", "Araraquara (SP)", "Araras (SP)", "Ararendá (CE)", "Arari (MA)", "Araricá (RS)", "Araripe (CE)", "Araripina (PE)", "Araruama (RJ)", "Araruna (PB)", "Araruna (PR)", "Arataca (BA)", "Aratiba (RS)", "Aratuba (CE)", "Aratuípe (BA)", "Arauá (SE)", "Araucária (PR)", "Araújos (MG)", "Araxá (MG)", "Arceburgo (MG)", "Arco-Íris (SP)", "Arcos (MG)", "Arcoverde (PE)", "Areado (MG)", "Areal (RJ)", "Arealva (SP)", "Areia (PB)", "Areia Branca (RN)", "Areia Branca (SE)", "Areia de Baraúnas (PB)", "Areial (PB)", "Areias (SP)", "Areiópolis (SP)", "Arenápolis (MT)", "Arenópolis (GO)", "Arez (Rio Grande do Norte) (RN)", "Argirita (MG)", "Aricanduva (MG)", "Arinos (MG)", "Aripuanã (MT)", "Ariquemes (RO)", "Ariranha (SP)", "Ariranha do Ivaí (PR)", "Armação dos Búzios (RJ)", "Armazém (SC)", "Arneiroz (CE)", "Aroazes (PI)", "Aroeiras (PB)", "Aroeiras do Itaim (PI)", "Arraial (PI)", "Arraial do Cabo (RJ)", "Arraias (TO)", "Arroio do Meio (RS)", "Arroio do Padre (RS)", "Arroio do Sal (RS)", "Arroio dos Ratos (RS)", "Arroio do Tigre (RS)", "Arroio Grande (RS)", "Arroio Trinta (SC)", "Artur Nogueira (SP)", "Aruanã (GO)", "Arujá (SP)", "Arvoredo (SC)", "Arvorezinha (RS)", "Ascurra (SC)", "Aspásia (SP)", "Assaí (PR)", "Assaré (CE)", "Assis (SP)", "Assis Brasil (AC)", "Assis Chateaubriand (PR)", "Assu (RN)", "Assunção do Piauí (PI)", "Assunção (PB)", "Astolfo Dutra (MG)", "Astorga (PR)", "Atalaia (AL)", "Atalaia (PR)", "Atalaia do Norte (AM)", "Atalanta (SC)", "Ataléia (MG)", "Atibaia (SP)", "Atílio Vivácqua (ES)", "Augustinópolis (TO)", "Augusto Corrêa (PA)", "Augusto de Lima (MG)", "Augusto Pestana (RS)", "Áurea (RS)", "Aurelino Leal (BA)", "Auriflama (SP)", "Aurilândia (GO)", "Aurora (CE)", "Aurora (SC)", "Aurora do Pará (PA)", "Aurora do Tocantins (TO)", "Autazes (AM)", "Avaí (SP)", "Avanhandava (SP)", "Avaré (SP)", "Aveiro (PA)", "Avelino Lopes (PI)", "Avelinópolis (GO)", "Axixá (MA)", "Axixá do Tocantins (TO)", "Babaçulândia (TO)", "Bacabal (MA)", "Bacabeira (MA)", "Bacuri (MA)", "Bacurituba (MA)", "Bady Bassitt (SP)", "Baependi (MG)", "Bagé (RS)", "Bagre (PA)", "Baía da Traição (PB)", "Baía Formosa (RN)", "Baianópolis (BA)", "Baião (PA)", "Baixa Grande (BA)", "Baixa Grande do Ribeiro (PI)", "Baixio (CE)", "Baixo Guandu (ES)", "Balbinos (SP)", "Baldim (MG)", "Baliza (GO)", "Balneário Arroio do Silva (SC)", "Balneário Barra do Sul (SC)", "Balneário Camboriú (SC)", "Balneário Gaivota (SC)", "Balneário Piçarras (SC)", "Balneário Pinhal (RS)", "Balneário Rincão (SC)", "Balsa Nova (PR)", "Bálsamo (SP)", "Balsas (MA)", "Bambuí (MG)", "Banabuiú (CE)", "Bananal (SP)", "Bananeiras (PB)", "Bandeira (MG)", "Bandeira do Sul (MG)", "Bandeirante (SC)", "Bandeirantes (MS)", "Bandeirantes (PR)", "Bandeirantes do Tocantins (TO)", "Bannach (PA)", "Banzaê (BA)", "Barão (RS)", "Barão de Antonina (SP)", "Barão de Cocais (MG)", "Barão de Cotegipe (RS)", "Barão de Grajaú (MA)", "Barão de Melgaço (MT)", "Barão de Monte Alto (MG)", "Barão do Triunfo (RS)", "Baraúna (PB)", "Baraúna (RN)", "Barbacena (MG)", "Barbalha (CE)", "Barbosa (SP)", "Barbosa Ferraz (PR)", "Barcarena (PA)", "Barcelona (RN)", "Barcelos (AM)", "Bariri (SP)", "Barra (BA)", "Barra Bonita (SC)", "Barra Bonita (SP)", "Barracão (PR)", "Barracão (RS)", "Barra da Estiva (BA)", "Barra d'Alcântara (PI)", "Barra de Guabiraba (PE)", "Barra de Santana (PB)", "Barra de Santa Rosa (PB)", "Barra de Santo Antônio (AL)", "Barra de São Francisco (ES)", "Barra de São Miguel (AL)", "Barra de São Miguel (PB)", "Barra do Bugres (MT)", "Barra do Chapéu (SP)", "Barra do Choça (BA)", "Barra do Corda (MA)", "Barra do Garças (MT)", "Barra do Guarita (RS)", "Barra do Jacaré (PR)", "Barra do Mendes (BA)", "Barra do Ouro (TO)", "Barra do Piraí (RJ)", "Barra do Quaraí (RS)", "Barra do Ribeiro (RS)", "Barra do Rio Azul (RS)", "Barra do Rocha (BA)", "Barra dos Coqueiros (SE)", "Barra do Turvo (SP)", "Barra Funda (RS)", "Barra Longa (MG)", "Barra Mansa (RJ)", "Barras (PI)", "Barra Velha (SC)", "Barreira (CE)", "Barreiras (BA)", "Barreiras do Piauí (PI)", "Barreirinha (AM)", "Barreirinhas (MA)", "Barreiros (PE)", "Barretos (SP)", "Barrinha (SP)", "Barro (CE)", "Barro Alto (BA)", "Barro Alto (GO)", "Barrocas (BA)", "Barro Duro (PI)", "Barrolândia (TO)", "Barro Preto (BA)", "Barroquinha (CE)", "Barros Cassal (RS)", "Barroso (MG)", "Barueri (SP)", "Bastos (SP)", "Bataguassu (MS)", "Batalha (AL)", "Batalha (PI)", "Batatais (SP)", "Batayporã (MS)", "Baturité (CE)", "Bauru (SP)", "Bayeux (PB)", "Bebedouro (SP)", "Beberibe (CE)", "Bela Cruz (CE)", "Belágua (MA)", "Bela Vista (MS)", "Bela Vista da Caroba (PR)", "Bela Vista de Goiás (GO)", "Bela Vista de Minas (MG)", "Bela Vista do Maranhão (MA)", "Bela Vista do Paraíso (PR)", "Bela Vista do Piauí (PI)", "Bela Vista do Toldo (SC)", "Belém (AL)", "Belém (PA)", "Belém (PB)", "Belém de Maria (PE)", "Belém do Brejo do Cruz (PB)", "Belém do Piauí (PI)", "Belém do São Francisco (PE)", "Belford Roxo (RJ)", "Belmiro Braga (MG)", "Belmonte (BA)", "Belmonte (SC)", "Belo Campo (BA)", "Belo Horizonte (MG)", "Belo Jardim (PE)", "Belo Monte (AL)", "Belo Oriente (MG)", "Belo Vale (MG)", "Belterra (PA)", "Beneditinos (PI)", "Benedito Leite (MA)", "Benedito Novo (SC)", "Benevides (PA)", "Benjamin Constant (AM)", "Benjamin Constant do Sul (RS)", "Bento de Abreu (SP)", "Bento Fernandes (RN)", "Bento Gonçalves (RS)", "Bequimão (MA)", "Berilo (MG)", "Berizal (MG)", "Bernardino Batista (PB)", "Bernardino de Campos (SP)", "Bernardo do Mearim (MA)", "Bernardo Sayão (TO)", "Bertioga (SP)", "Bertolínia (PI)", "Bertópolis (MG)", "Beruri (AM)", "Betânia (PE)", "Betânia do Piauí (PI)", "Betim (MG)", "Bezerros (PE)", "Bias Fortes (MG)", "Bicas (MG)", "Biguaçu (SC)", "Bilac (SP)", "Biquinhas (MG)", "Birigui (SP)", "Biritiba Mirim (SP)", "Biritinga (BA)", "Bituruna (PR)", "Blumenau (SC)", "Boa Esperança (ES)", "Boa Esperança (MG)", "Boa Esperança (PR)", "Boa Esperança do Iguaçu (PR)", "Boa Esperança do Sul (SP)", "Boa Hora (PI)", "Boa Nova (BA)", "Boa Saúde (RN)", "Boa Ventura (PB)", "Boa Ventura de São Roque (PR)", "Boa Viagem (CE)", "Boa Vista (PB)", "Boa Vista (RR)", "Boa Vista da Aparecida (PR)", "Boa Vista das Missões (RS)", "Boa Vista do Buricá (RS)", "Boa Vista do Cadeado (RS)", "Boa Vista do Gurupi (MA)", "Boa Vista do Incra (RS)", "Boa Vista do Ramos (AM)", "Boa Vista do Sul (RS)", "Boa Vista do Tupim (BA)", "Boca da Mata (AL)", "Boca do Acre (AM)", "Bocaina (PI)", "Bocaina (SP)", "Bocaina de Minas (MG)", "Bocaina do Sul (SC)", "Bocaiuva (MG)", "Bocaiúva do Sul (PR)", "Bodó (RN)", "Bodocó (PE)", "Bodoquena (MS)", "Bofete (SP)", "Boituva (SP)", "Bombinhas (SC)", "Bom Conselho (PE)", "Bom Despacho (MG)", "Bom Jardim (MA)", "Bom Jardim (PE)", "Bom Jardim (RJ)", "Bom Jardim da Serra (SC)", "Bom Jardim de Goiás (GO)", "Bom Jardim de Minas (MG)", "Bom Jesus (PB)", "Bom Jesus (PI)", "Bom Jesus (RN)", "Bom Jesus (RS)", "Bom Jesus (SC)", "Bom Jesus da Lapa (BA)", "Bom Jesus da Penha (MG)", "Bom Jesus da Serra (BA)", "Bom Jesus das Selvas (MA)", "Bom Jesus de Goiás (GO)", "Bom Jesus do Amparo (MG)", "Bom Jesus do Araguaia (MT)", "Bom Jesus do Galho (MG)", "Bom Jesus do Itabapoana (RJ)", "Bom Jesus do Norte (ES)", "Bom Jesus do Oeste (SC)", "Bom Jesus dos Perdões (SP)", "Bom Jesus do Sul (PR)", "Bom Jesus do Tocantins (PA)", "Bom Jesus do Tocantins (TO)", "Bom Lugar (MA)", "Bom Princípio (RS)", "Bom Princípio do Piauí (PI)", "Bom Progresso (RS)", "Bom Repouso (MG)", "Bom Retiro (SC)", "Bom Retiro do Sul (RS)", "Bom Sucesso (MG)", "Bom Sucesso (PB)", "Bom Sucesso (PR)", "Bom Sucesso de Itararé (SP)", "Bom Sucesso do Sul (PR)", "Bonfim (MG)", "Bonfim (RR)", "Bonfim do Piauí (PI)", "Bonfinópolis (GO)", "Bonfinópolis de Minas (MG)", "Boninal (BA)", "Bonito (BA)", "Bonito (MS)", "Bonito (PA)", "Bonito (PE)", "Bonito de Minas (MG)", "Bonito de Santa Fé (PB)", "Bonópolis (GO)", "Boqueirão (PB)", "Boqueirão do Leão (RS)", "Boqueirão do Piauí (PI)", "Boquim (SE)", "Boquira (BA)", "Borá (SP)", "Boraceia (SP)", "Borba (AM)", "Borborema (PB)", "Borborema (SP)", "Borda da Mata (MG)", "Borebi (SP)", "Borrazópolis (PR)", "Bossoroca (RS)", "Botelhos (MG)", "Botucatu (SP)", "Botumirim (MG)", "Botuporã (BA)", "Botuverá (SC)", "Bozano (RS)", "Braço do Norte (SC)", "Braço do Trombudo (SC)", "Braga (RS)", "Bragança (PA)", "Bragança Paulista (SP)", "Braganey (PR)", "Branquinha (AL)", "Brasilândia (MS)", "Brasilândia de Minas (MG)", "Brasilândia do Sul (PR)", "Brasilândia do Tocantins (TO)", "Brasiléia (AC)", "Brasileira (PI)", "Brasília de Minas (MG)", "Brasil Novo (PA)", "Brasnorte (MT)", "Brasópolis (MG)", "Brás Pires (MG)", "Braúna (SP)", "Braúnas (MG)", "Brazabrantes (GO)", "Brejão (PE)", "Brejetuba (ES)", "Brejinho (PE)", "Brejinho (RN)", "Brejinho de Nazaré (TO)", "Brejo (MA)", "Brejo Alegre (SP)", "Brejo da Madre de Deus (PE)", "Brejo de Areia (MA)", "Brejo do Cruz (PB)", "Brejo do Piauí (PI)", "Brejo dos Santos (PB)", "Brejões (BA)", "Brejo Grande (SE)", "Brejo Grande do Araguaia (PA)", "Brejolândia (BA)", "Brejo Santo (CE)", "Breu Branco (PA)", "Breves (PA)", "Britânia (GO)", "Brochier (RS)", "Brodowski (SP)", "Brotas (SP)", "Brotas de Macaúbas (BA)", "Brumadinho (MG)", "Brumado (BA)", "Brunópolis (SC)", "Brusque (SC)", "Bueno Brandão (MG)", "Buenópolis (MG)", "Buenos Aires (PE)", "Buerarema (BA)", "Bugre (MG)", "Buíque (PE)", "Bujari (AC)", "Bujaru (PA)", "Buri (SP)", "Buritama (SP)", "Buriti (MA)", "Buriti Alegre (GO)", "Buriti Bravo (MA)", "Buriticupu (MA)", "Buriti de Goiás (GO)", "Buriti dos Lopes (PI)", "Buriti dos Montes (PI)", "Buriti do Tocantins (TO)", "Buritinópolis (GO)", "Buritirama (BA)", "Buritirana (MA)", "Buritis (MG)", "Buritis (RO)", "Buritizal (SP)", "Buritizeiro (MG)", "Butiá (RS)", "Caapiranga (AM)", "Caaporã (PB)", "Caarapó (MS)", "Caatiba (BA)", "Cabaceiras (PB)", "Cabaceiras do Paraguaçu (BA)", "Cabeceira Grande (MG)", "Cabeceiras (GO)", "Cabeceiras do Piauí (PI)", "Cabedelo (PB)", "Cabixi (RO)", "Cabo de Santo Agostinho (PE)", "Cabo Frio (RJ)", "Cabo Verde (MG)", "Cabrália Paulista (SP)", "Cabreúva (SP)", "Cabrobó (PE)", "Caçador (SC)", "Caçapava (SP)", "Caçapava do Sul (RS)", "Cacaulândia (RO)", "Cacequi (RS)", "Cáceres (MT)", "Cachoeira (BA)", "Cachoeira Alta (GO)", "Cachoeira da Prata (MG)", "Cachoeira de Goiás (GO)", "Cachoeira de Minas (MG)", "Cachoeira de Pajeú (MG)", "Cachoeira do Arari (PA)", "Cachoeira do Piriá (PA)", "Cachoeira dos Índios (PB)", "Cachoeira do Sul (RS)", "Cachoeira Dourada (GO)", "Cachoeira Dourada (MG)", "Cachoeira Grande (MA)", "Cachoeira Paulista (SP)", "Cachoeiras de Macacu (RJ)", "Cachoeirinha (PE)", "Cachoeirinha (RS)", "Cachoeirinha (TO)", "Cachoeiro de Itapemirim (ES)", "Cacimba de Areia (PB)", "Cacimba de Dentro (PB)", "Cacimbas (PB)", "Cacimbinhas (AL)", "Cacique Doble (RS)", "Cacoal (RO)", "Caconde (SP)", "Caçu (GO)", "Caculé (BA)", "Caém (BA)", "Caetanópolis (MG)", "Caetanos (BA)", "Caeté (MG)", "Caetés (PE)", "Caetité (BA)", "Cafarnaum (BA)", "Cafeara (PR)", "Cafelândia (PR)", "Cafelândia (SP)", "Cafezal do Sul (PR)", "Caiabu (SP)", "Caiana (MG)", "Caiapônia (GO)", "Caibaté (RS)", "Caibi (SC)", "Caiçara (PB)", "Caiçara (RS)", "Caiçara do Norte (RN)", "Caiçara do Rio do Vento (RN)", "Caicó (RN)", "Caieiras (SP)", "Cairu (BA)", "Caiuá (SP)", "Cajamar (SP)", "Cajapió (MA)", "Cajari (MA)", "Cajati (SP)", "Cajazeiras (PB)", "Cajazeiras do Piauí (PI)", "Cajazeirinhas (PB)", "Cajobi (SP)", "Cajueiro (AL)", "Cajueiro da Praia (PI)", "Cajuri (MG)", "Cajuru (SP)", "Calçado (PE)", "Calçoene (AP)", "Caldas (MG)", "Caldas Brandão (PB)", "Caldas Novas (GO)", "Caldazinha (GO)", "Caldeirão Grande (BA)", "Caldeirão Grande do Piauí (PI)", "Califórnia (PR)", "Calmon (SC)", "Calumbi (PE)", "Camacan (BA)", "Camaçari (BA)", "Camacho (MG)", "Camalaú (PB)", "Camamu (BA)", "Camanducaia (MG)", "Camapuã (MS)", "Camaquã (RS)", "Camaragibe (PE)", "Camargo (RS)", "Cambará (PR)", "Cambará do Sul (RS)", "Cambé (PR)", "Cambira (PR)", "Camboriú (SC)", "Cambuci (RJ)", "Cambuí (MG)", "Cambuquira (MG)", "Cametá (PA)", "Camocim (CE)", "Camocim de São Félix (PE)", "Campanário (MG)", "Campanha (MG)", "Campestre (AL)", "Campestre (MG)", "Campestre da Serra (RS)", "Campestre de Goiás (GO)", "Campestre do Maranhão (MA)", "Campinaçu (GO)", "Campina da Lagoa (PR)", "Campina das Missões (RS)", "Campina do Monte Alegre (SP)", "Campina do Simão (PR)", "Campina Grande (PB)", "Campina Grande do Sul (PR)", "Campinápolis (MT)", "Campinas (SP)", "Campinas do Piauí (PI)", "Campinas do Sul (RS)", "Campina Verde (MG)", "Campinorte (GO)", "Campo Alegre (AL)", "Campo Alegre (SC)", "Campo Alegre de Goiás (GO)", "Campo Alegre de Lourdes (BA)", "Campo Alegre do Fidalgo (PI)", "Campo Azul (MG)", "Campo Belo (MG)", "Campo Belo do Sul (SC)", "Campo Bom (RS)", "Campo Bonito (PR)", "Campo do Brito (SE)", "Campo do Meio (MG)", "Campo do Tenente (PR)", "Campo Erê (SC)", "Campo Florido (MG)", "Campo Formoso (BA)", "Campo Grande (AL)", "Campo Grande (MS)", "Campo Grande (RN)", "Campo Grande do Piauí (PI)", "Campo Largo (PR)", "Campo Largo do Piauí (PI)", "Campo Limpo de Goiás (GO)", "Campo Limpo Paulista (SP)", "Campo Magro (PR)", "Campo Maior (PI)", "Campo Mourão (PR)", "Campo Novo (RS)", "Campo Novo de Rondônia (RO)", "Campo Novo do Parecis (MT)", "Campo Redondo (RN)", "Campos Altos (MG)", "Campos Belos (GO)", "Campos Borges (RS)", "Campos de Júlio (MT)", "Campos do Jordão (SP)", "Campos dos Goytacazes (RJ)", "Campos Gerais (MG)", "Campos Lindos (TO)", "Campos Novos (SC)", "Campos Novos Paulista (SP)", "Campos Sales (CE)", "Campos Verdes (GO)", "Campo Verde (MT)", "Camutanga (PE)", "Canaã (MG)", "Canaã dos Carajás (PA)", "Canabrava do Norte (MT)", "Cananéia (SP)", "Canapi (AL)", "Canápolis (BA)", "Canápolis (MG)", "Canarana (BA)", "Canarana (MT)", "Canas (SP)", "Cana Verde (MG)", "Canavieira (PI)", "Canavieiras (BA)", "Candeal (BA)", "Candeias (BA)", "Candeias (MG)", "Candeias do Jamari (RO)", "Candelária (RS)", "Candiba (BA)", "Cândido de Abreu (PR)", "Cândido Godói (RS)", "Cândido Mendes (MA)", "Cândido Mota (SP)", "Cândido Rodrigues (SP)", "Cândido Sales (BA)", "Candiota (RS)", "Candói (PR)", "Canela (RS)", "Canelinha (SC)", "Canguaretama (RN)", "Canguçu (RS)", "Canhoba (SE)", "Canhotinho (PE)", "Canindé (CE)", "Canindé de São Francisco (SE)", "Canitar (SP)", "Canoas (RS)", "Canoinhas (SC)", "Cansanção (BA)", "Cantagalo (MG)", "Cantagalo (PR)", "Cantagalo (RJ)", "Cantanhede (MA)", "Cantá (RR)", "Canto do Buriti (PI)", "Canudos (BA)", "Canudos do Vale (RS)", "Canutama (AM)", "Capanema (PA)", "Capanema (PR)", "Capão Alto (SC)", "Capão Bonito (SP)", "Capão Bonito do Sul (RS)", "Capão da Canoa (RS)", "Capão do Cipó (RS)", "Capão do Leão (RS)", "Caparaó (MG)", "Capela (AL)", "Capela (SE)", "Capela de Santana (RS)", "Capela do Alto (SP)", "Capela do Alto Alegre (BA)", "Capela Nova (MG)", "Capelinha (MG)", "Capetinga (MG)", "Capim (PB)", "Capim Branco (MG)", "Capim Grosso (BA)", "Capinópolis (MG)", "Capinzal (SC)", "Capinzal do Norte (MA)", "Capistrano (CE)", "Capitão (RS)", "Capitão Andrade (MG)", "Capitão de Campos (PI)", "Capitão Enéas (MG)", "Capitão Gervásio Oliveira (PI)", "Capitão Leônidas Marques (PR)", "Capitão Poço (PA)", "Capitólio (MG)", "Capivari (SP)", "Capivari de Baixo (SC)", "Capivari do Sul (RS)", "Capixaba (AC)", "Capoeiras (PE)", "Caputira (MG)", "Caraá (RS)", "Caracaraí (RR)", "Caracol (MS)", "Caracol (PI)", "Caraguatatuba (SP)", "Caraí (MG)", "Caraíbas (BA)", "Carambeí (PR)", "Caranaíba (MG)", "Carandaí (MG)", "Carangola (MG)", "Carapebus (RJ)", "Carapicuíba (SP)", "Caratinga (MG)", "Carauari (AM)", "Caraúbas (PB)", "Caraúbas (RN)", "Caraúbas do Piauí (PI)", "Caravelas (BA)", "Carazinho (RS)", "Carbonita (MG)", "Cardeal da Silva (BA)", "Cardoso (SP)", "Cardoso Moreira (RJ)", "Careaçu (MG)", "Careiro (AM)", "Careiro da Várzea (AM)", "Cariacica (ES)", "Caridade (CE)", "Caridade do Piauí (PI)", "Carinhanha (BA)", "Carira (SE)", "Cariré (CE)", "Caririaçu (CE)", "Cariri do Tocantins (TO)", "Cariús (CE)", "Carlinda (MT)", "Carlópolis (PR)", "Carlos Barbosa (RS)", "Carlos Chagas (MG)", "Carlos Gomes (RS)", "Carmésia (MG)", "Carmo (RJ)", "Carmo da Cachoeira (MG)", "Carmo da Mata (MG)", "Carmo de Minas (MG)", "Carmo do Cajuru (MG)", "Carmo do Paranaíba (MG)", "Carmo do Rio Claro (MG)", "Carmo do Rio Verde (GO)", "Carmolândia (TO)", "Carmópolis (SE)", "Carmópolis de Minas (MG)", "Carnaíba (PE)", "Carnaúba dos Dantas (RN)", "Carnaubais (RN)", "Carnaubal (CE)", "Carnaubeira da Penha (PE)", "Carneirinho (MG)", "Carneiros (AL)", "Caroebe (RR)", "Carolina (MA)", "Carpina (PE)", "Carrancas (MG)", "Carrapateira (PB)", "Carrasco Bonito (TO)", "Caruaru (PE)", "Carutapera (MA)", "Carvalhópolis (MG)", "Carvalhos (MG)", "Casa Branca (SP)", "Casa Grande (MG)", "Casa Nova (BA)", "Casca (RS)", "Cascalho Rico (MG)", "Cascavel (CE)", "Cascavel (PR)", "Caseara (TO)", "Caseiros (RS)", "Casimiro de Abreu (RJ)", "Casinhas (PE)", "Casserengue (PB)", "Cássia (MG)", "Cássia dos Coqueiros (SP)", "Cassilândia (MS)", "Castanhal (PA)", "Castanheira (MT)", "Castanheiras (RO)", "Castelândia (GO)", "Castelo (ES)", "Castelo do Piauí (PI)", "Castilho (SP)", "Castro (PR)", "Castro Alves (BA)", "Cataguases (MG)", "Catalão (GO)", "Catanduva (SP)", "Catanduvas (PR)", "Catanduvas (SC)", "Catarina (CE)", "Catas Altas (MG)", "Catas Altas da Noruega (MG)", "Catende (PE)", "Catiguá (SP)", "Catingueira (PB)", "Catolândia (BA)", "Catolé do Rocha (PB)", "Catu (BA)", "Catuípe (RS)", "Catuji (MG)", "Catunda (CE)", "Caturaí (GO)", "Caturama (BA)", "Caturité (PB)", "Catuti (MG)", "Caucaia (CE)", "Cavalcante (GO)", "Caxambu (MG)", "Caxambu do Sul (SC)", "Caxias (MA)", "Caxias do Sul (RS)", "Caxingó (PI)", "Ceará-Mirim (RN)", "Cedral (MA)", "Cedral (SP)", "Cedro (CE)", "Cedro (PE)", "Cedro de São João (SE)", "Cedro do Abaeté (MG)", "Celso Ramos (SC)", "Centenário (RS)", "Centenário (TO)", "Centenário do Sul (PR)", "Central (BA)", "Central de Minas (MG)", "Central do Maranhão (MA)", "Centralina (MG)", "Centro do Guilherme (MA)", "Centro Novo do Maranhão (MA)", "Cerejeiras (RO)", "Ceres (GO)", "Cerqueira César (SP)", "Cerquilho (SP)", "Cerrito (RS)", "Cerro Azul (PR)", "Cerro Branco (RS)", "Cerro Corá (RN)", "Cerro Grande (RS)", "Cerro Grande do Sul (RS)", "Cerro Largo (RS)", "Cerro Negro (SC)", "Cesário Lange (SP)", "Céu Azul (PR)", "Cezarina (GO)", "Chácara (MG)", "Chã de Alegria (PE)", "Chã Grande (PE)", "Chalé (MG)", "Chapada (RS)", "Chapada de Areia (TO)", "Chapada da Natividade (TO)", "Chapada do Norte (MG)", "Chapada dos Guimarães (MT)", "Chapada Gaúcha (MG)", "Chapadão do Céu (GO)", "Chapadão do Lageado (SC)", "Chapadão do Sul (MS)", "Chapadinha (MA)", "Chapecó (SC)", "Chã Preta (AL)", "Charqueada (SP)", "Charqueadas (RS)", "Charrua (RS)", "Chaval (CE)", "Chavantes (SP)", "Chaves (PA)", "Chiador (MG)", "Chiapetta (RS)", "Chopinzinho (PR)", "Choró (CE)", "Chorozinho (CE)", "Chorrochó (BA)", "Chuí (RS)", "Chupinguaia (RO)", "Chuvisca (RS)", "Cianorte (PR)", "Cícero Dantas (BA)", "Cidade Gaúcha (PR)", "Cidade Ocidental (GO)", "Cidelândia (MA)", "Cidreira (RS)", "Cipó (BA)", "Cipotânea (MG)", "Ciríaco (RS)", "Claraval (MG)", "Claro dos Poções (MG)", "Cláudia (MT)", "Cláudio (MG)", "Clementina (SP)", "Clevelândia (PR)", "Coaraci (BA)", "Coari (AM)", "Cocal (PI)", "Cocal de Telha (PI)", "Cocal dos Alves (PI)", "Cocal do Sul (SC)", "Cocalinho (MT)", "Cocalzinho de Goiás (GO)", "Cocos (BA)", "Codajás (AM)", "Codó (MA)", "Coelho Neto (MA)", "Coimbra (MG)", "Coité do Noia (AL)", "Coivaras (PI)", "Colares (PA)", "Colatina (ES)", "Colíder (MT)", "Colina (SP)", "Colinas (MA)", "Colinas (RS)", "Colinas do Sul (GO)", "Colinas do Tocantins (TO)", "Colméia (TO)", "Colniza (MT)", "Colômbia (SP)", "Colombo (PR)", "Colônia do Gurgueia (PI)", "Colônia do Piauí (PI)", "Colônia Leopoldina (AL)", "Colorado (PR)", "Colorado (RS)", "Colorado do Oeste (RO)", "Coluna (MG)", "Combinado (TO)", "Comendador Gomes (MG)", "Comendador Levy Gasparian (RJ)", "Comercinho (MG)", "Comodoro (MT)", "Conceição (PB)", "Conceição da Aparecida (MG)", "Conceição da Barra de Minas (MG)", "Conceição da Barra (ES)", "Conceição da Feira (BA)", "Conceição das Alagoas (MG)", "Conceição das Pedras (MG)", "Conceição de Ipanema (MG)", "Conceição de Macabu (RJ)", "Conceição do Almeida (BA)", "Conceição do Araguaia (PA)", "Conceição do Canindé (PI)", "Conceição do Castelo (ES)", "Conceição do Coité (BA)", "Conceição do Jacuípe (BA)", "Conceição do Lago Açu (MA)", "Conceição do Mato Dentro (MG)", "Conceição do Pará (MG)", "Conceição do Rio Verde (MG)", "Conceição dos Ouros (MG)", "Conceição do Tocantins (TO)", "Conchal (SP)", "Conchas (SP)", "Concórdia (SC)", "Concórdia do Pará (PA)", "Condado (PB)", "Condado (PE)", "Conde (BA)", "Conde (PB)", "Condeúba (BA)", "Condor (RS)", "Cônego Marinho (MG)", "Confins (MG)", "Confresa (MT)", "Congo (PB)", "Congonhal (MG)", "Congonhas (MG)", "Congonhas do Norte (MG)", "Congonhinhas (PR)", "Conquista (MG)", "Conquista d'Oeste (MT)", "Conselheiro Lafaiete (MG)", "Conselheiro Mairinck (PR)", "Conselheiro Pena (MG)", "Consolação (MG)", "Constantina (RS)", "Contagem (MG)", "Contenda (PR)", "Contendas do Sincorá (BA)", "Coqueiral (MG)", "Coqueiro Baixo (RS)", "Coqueiros do Sul (RS)", "Coqueiro Seco (AL)", "Coração de Jesus (MG)", "Coração de Maria (BA)", "Corbélia (PR)", "Cordeiro (RJ)", "Cordeirópolis (SP)", "Cordeiros (BA)", "Cordilheira Alta (SC)", "Cordisburgo (MG)", "Cordislândia (MG)", "Coreaú (CE)", "Coremas (PB)", "Corguinho (MS)", "Coribe (BA)", "Corinto (MG)", "Cornélio Procópio (PR)", "Coroaci (MG)", "Coroados (SP)", "Coroatá (MA)", "Coromandel (MG)", "Coronel Barros (RS)", "Coronel Bicaco (RS)", "Coronel Domingos Soares (PR)", "Coronel Ezequiel (RN)", "Coronel Fabriciano (MG)", "Coronel Freitas (SC)", "Coronel João Pessoa (RN)", "Coronel João Sá (BA)", "Coronel José Dias (PI)", "Coronel Macedo (SP)", "Coronel Martins (SC)", "Coronel Murta (MG)", "Coronel Pacheco (MG)", "Coronel Pilar (RS)", "Coronel Sapucaia (MS)", "Coronel Vivida (PR)", "Coronel Xavier Chaves (MG)", "Córrego Danta (MG)", "Córrego do Bom Jesus (MG)", "Córrego do Ouro (GO)", "Córrego Fundo (MG)", "Córrego Novo (MG)", "Correia Pinto (SC)", "Corrente (PI)", "Correntes (PE)", "Correntina (BA)", "Cortês (PE)", "Corumbá (MS)", "Corumbá de Goiás (GO)", "Corumbaíba (GO)", "Corumbataí (SP)", "Corumbataí do Sul (PR)", "Corumbiara (RO)", "Corupá (SC)", "Coruripe (AL)", "Cosmópolis (SP)", "Cosmorama (SP)", "Costa Marques (RO)", "Costa Rica (MS)", "Cotegipe (BA)", "Cotia (SP)", "Cotiporã (RS)", "Cotriguaçu (MT)", "Couto Magalhães (TO)", "Couto de Magalhães de Minas (MG)", "Coxilha (RS)", "Coxim (município) (MS)", "Coxixola (PB)", "Craíbas (AL)", "Crateús (CE)", "Crato (CE)", "Cravinhos (SP)", "Cravolândia (BA)", "Criciúma (SC)", "Crisólita (MG)", "Crisópolis (BA)", "Crissiumal (RS)", "Cristais (MG)", "Cristais Paulista (SP)", "Cristal (RS)", "Cristalândia (TO)", "Cristalândia do Piauí (PI)", "Cristal do Sul (RS)", "Cristália (MG)", "Cristalina (GO)", "Cristiano Otoni (MG)", "Cristianópolis (GO)", "Cristina (MG)", "Cristinápolis (SE)", "Cristino Castro (PI)", "Cristópolis (BA)", "Crixás (GO)", "Crixás do Tocantins (TO)", "Croatá (CE)", "Cromínia (GO)", "Crucilândia (MG)", "Cruz (CE)", "Cruzália (SP)", "Cruz Alta (RS)", "Cruzaltense (RS)", "Cruz das Almas (BA)", "Cruz do Espírito Santo (PB)", "Cruzeiro (SP)", "Cruzeiro da Fortaleza (MG)", "Cruzeiro do Iguaçu (PR)", "Cruzeiro do Oeste (PR)", "Cruzeiro do Sul (AC)", "Cruzeiro do Sul (PR)", "Cruzeiro do Sul (RS)", "Cruzeta (RN)", "Cruzília (MG)", "Cruz Machado (PR)", "Cruzmaltina (PR)", "Cubatão (SP)", "Cubati (PB)", "Cuiabá (MT)", "Cuité (PB)", "Cuité de Mamanguape (PB)", "Cuitegi (PB)", "Cujubim (RO)", "Cumari (GO)", "Cumaru (PE)", "Cumaru do Norte (PA)", "Cumbe (SE)", "Cunha (SP)", "Cunha Porã (SC)", "Cunhataí (SC)", "Cuparaque (MG)", "Cupira (PE)", "Curaçá (BA)", "Curimatá (PI)", "Curionópolis (PA)", "Curitiba (PR)", "Curitibanos (SC)", "Curiúva (PR)", "Currais (PI)", "Currais Novos (RN)", "Curral de Cima (PB)", "Curral de Dentro (MG)", "Curralinho (PA)", "Curralinhos (PI)", "Curral Novo do Piauí (PI)", "Curral Velho (PB)", "Curuá (PA)", "Curuçá (PA)", "Cururupu (MA)", "Curvelândia (MT)", "Curvelo (MG)", "Custódia (PE)", "Cutias (AP)", "Damianópolis (GO)", "Damião (PB)", "Damolândia (GO)", "Darcinópolis (TO)", "Dário Meira (BA)", "Datas (MG)", "David Canabarro (RS)", "Davinópolis (GO)", "Davinópolis (MA)", "Delfim Moreira (MG)", "Delfinópolis (MG)", "Delmiro Gouveia (AL)", "Delta (MG)", "Demerval Lobão (PI)", "Denise (MT)", "Deodápolis (MS)", "Deputado Irapuan Pinheiro (CE)", "Derrubadas (RS)", "Descalvado (SP)", "Descanso (SC)", "Descoberto (MG)", "Desterro (PB)", "Desterro de Entre Rios (MG)", "Desterro do Melo (MG)", "Dezesseis de Novembro (RS)", "Diadema (SP)", "Diamante (PB)", "Diamante d'Oeste (PR)", "Diamante do Norte (PR)", "Diamante do Sul (PR)", "Diamantina (MG)", "Diamantino (MT)", "Dianópolis (TO)", "Dias d'Ávila (BA)", "Dilermando de Aguiar (RS)", "Diogo de Vasconcelos (MG)", "Dionísio (MG)", "Dionísio Cerqueira (SC)", "Diorama (GO)", "Dirce Reis (SP)", "Dirceu Arcoverde (PI)", "Divina Pastora (SE)", "Divinésia (MG)", "Divino (MG)", "Divino das Laranjeiras (MG)", "Divino de São Lourenço (ES)", "Divinolândia (SP)", "Divinolândia de Minas (MG)", "Divinópolis (MG)", "Divinópolis de Goiás (GO)", "Divinópolis do Tocantins (TO)", "Divisa Alegre (MG)", "Divisa Nova (MG)", "Divisópolis (MG)", "Dobrada (SP)", "Dois Córregos (SP)", "Dois Irmãos (RS)", "Dois Irmãos das Missões (RS)", "Dois Irmãos do Buriti (MS)", "Dois Irmãos do Tocantins (TO)", "Dois Lajeados (RS)", "Dois Riachos (AL)", "Dois Vizinhos (PR)", "Dolcinópolis (SP)", "Dom Aquino (MT)", "Dom Basílio (BA)", "Dom Bosco (MG)", "Dom Cavati (MG)", "Dom Eliseu (PA)", "Dom Expedito Lopes (PI)", "Dom Feliciano (RS)", "Domingos Martins (ES)", "Domingos Mourão (PI)", "Dom Inocêncio (PI)", "Dom Joaquim (MG)", "Dom Macedo Costa (BA)", "Dom Pedrito (RS)", "Dom Pedro (MA)", "Dom Pedro de Alcântara (RS)", "Dom Silvério (MG)", "Dom Viçoso (MG)", "Dona Emma (SC)", "Dona Euzébia (MG)", "Dona Francisca (RS)", "Dona Inês (PB)", "Dores de Campos (MG)", "Dores de Guanhães (MG)", "Dores do Indaiá (MG)", "Dores do Rio Preto (ES)", "Dores do Turvo (MG)", "Doresópolis (MG)", "Dormentes (PE)", "Douradina (MS)", "Douradina (PR)", "Dourado (SP)", "Douradoquara (MG)", "Dourados (MS)", "Doutor Camargo (PR)", "Doutor Maurício Cardoso (RS)", "Doutor Pedrinho (SC)", "Doutor Ricardo (RS)", "Doutor Severiano (RN)", "Doutor Ulysses (PR)", "Doverlândia (GO)", "Dracena (SP)", "Duartina (SP)", "Duas Barras (RJ)", "Duas Estradas (PB)", "Dueré (TO)", "Dumont (SP)", "Duque Bacelar (MA)", "Duque de Caxias (RJ)", "Durandé (MG)", "Echaporã (SP)", "Ecoporanga (ES)", "Edealina (GO)", "Edéia (GO)", "Eirunepé (AM)", "Eldorado (MS)", "Eldorado (SP)", "Eldorado do Carajás (PA)", "Eldorado do Sul (RS)", "Elesbão Veloso (PI)", "Elias Fausto (SP)", "Eliseu Martins (PI)", "Elisiário (SP)", "Elísio Medrado (BA)", "Elói Mendes (MG)", "Emas (PB)", "Embaúba (SP)", "Embu das Artes (SP)", "Embu-Guaçu (SP)", "Emilianópolis (SP)", "Encantado (RS)", "Encanto (RN)", "Encruzilhada (BA)", "Encruzilhada do Sul (RS)", "Enéas Marques (PR)", "Engenheiro Beltrão (PR)", "Engenheiro Caldas (MG)", "Engenheiro Coelho (SP)", "Engenheiro Navarro (MG)", "Engenheiro Paulo de Frontin (RJ)", "Engenho Velho (RS)", "Entre Folhas (MG)", "Entre Ijuís (RS)", "Entre Rios (BA)", "Entre Rios (SC)", "Entre Rios de Minas (MG)", "Entre Rios do Oeste (PR)", "Entre Rios do Sul (RS)", "Envira (AM)", "Epitaciolândia (AC)", "Equador (RN)", "Erebango (RS)", "Erechim (RS)", "Ereré (CE)", "Érico Cardoso (BA)", "Ermo (SC)", "Ernestina (RS)", "Erval Grande (RS)", "Ervália (MG)", "Erval Seco (RS)", "Erval Velho (SC)", "Escada (PE)", "Esmeralda (RS)", "Esmeraldas (MG)", "Espera Feliz (MG)", "Esperança (PB)", "Esperança do Sul (RS)", "Esperança Nova (PR)", "Esperantina (PI)", "Esperantina (TO)", "Esperantinópolis (MA)", "Espigão Alto do Iguaçu (PR)", "Espigão d'Oeste (RO)", "Espinosa (MG)", "Espírito Santo (RN)", "Espírito Santo do Dourado (MG)", "Espírito Santo do Pinhal (SP)", "Espírito Santo do Turvo (SP)", "Esplanada (BA)", "Espumoso (RS)", "Estação (RS)", "Estância (SE)", "Estância Velha (RS)", "Esteio (RS)", "Estiva (MG)", "Estiva Gerbi (SP)", "Estreito (MA)", "Estrela (RS)", "Estrela Dalva (MG)", "Estrela de Alagoas (AL)", "Estrela d'Oeste (SP)", "Estrela do Indaiá (MG)", "Estrela do Norte (GO)", "Estrela do Norte (SP)", "Estrela do Sul (MG)", "Estrela Velha (RS)", "Euclides da Cunha (BA)", "Euclides da Cunha Paulista (SP)", "Eugênio de Castro (RS)", "Eugenópolis (MG)", "Eunápolis (BA)", "Eusébio (CE)", "Ewbank da Câmara (MG)", "Extrema (MG)", "Extremoz (RN)", "Exu (PE)", "Fagundes (PB)", "Fagundes Varela (RS)", "Faina (GO)", "Fama (MG)", "Faria Lemos (MG)", "Farias Brito (CE)", "Faro (PA)", "Farol (PR)", "Farroupilha (RS)", "Fartura (SP)", "Fartura do Piauí (PI)", "Fátima (BA)", "Fátima (TO)", "Fátima do Sul (MS)", "Faxinal (PR)", "Faxinal dos Guedes (SC)", "Faxinal do Soturno (RS)", "Faxinalzinho (RS)", "Fazenda Nova (GO)", "Fazenda Rio Grande (PR)", "Fazenda Vilanova (RS)", "Feijó (AC)", "Feira da Mata (BA)", "Feira de Santana (BA)", "Feira Grande (AL)", "Feira Nova (PE)", "Feira Nova (SE)", "Feira Nova do Maranhão (MA)", "Felício dos Santos (MG)", "Felipe Guerra (RN)", "Felisburgo (MG)", "Felixlândia (MG)", "Feliz (RS)", "Feliz Deserto (AL)", "Feliz Natal (MT)", "Fênix (PR)", "Fernandes Pinheiro (PR)", "Fernandes Tourinho (MG)", "Fernando Falcão (MA)", "Fernando Pedroza (RN)", "Fernandópolis (SP)", "Fernando Prestes (SP)", "Fernão (SP)", "Ferraz de Vasconcelos (SP)", "Ferreira Gomes (AP)", "Ferreiros (PE)", "Ferros (MG)", "Fervedouro (MG)", "Figueira (PR)", "Figueirão (MS)", "Figueirópolis (TO)", "Figueirópolis d'Oeste (MT)", "Filadélfia (BA)", "Filadélfia (TO)", "Firmino Alves (BA)", "Firminópolis (GO)", "Flexeiras (AL)", "Floraí (PR)", "Florânia (RN)", "Flora Rica (SP)", "Flor da Serra do Sul (PR)", "Flor do Sertão (SC)", "Floreal (SP)", "Flores (PE)", "Flores da Cunha (RS)", "Flores de Goiás (GO)", "Flores do Piauí (PI)", "Floresta (PE)", "Floresta (PR)", "Floresta Azul (BA)", "Floresta do Araguaia (PA)", "Floresta do Piauí (PI)", "Florestal (MG)", "Florestópolis (PR)", "Floriano (PI)", "Floriano Peixoto (RS)", "Florianópolis (SC)", "Flórida (PR)", "Flórida Paulista (SP)", "Florínea (SP)", "Fonte Boa (AM)", "Fontoura Xavier (RS)", "Formiga (MG)", "Formigueiro (RS)", "Formosa (GO)", "Formosa da Serra Negra (MA)", "Formosa do Oeste (PR)", "Formosa do Rio Preto (BA)", "Formosa do Sul (SC)", "Formoso (GO)", "Formoso (MG)", "Formoso do Araguaia (TO)", "Forquetinha (RS)", "Forquilha (CE)", "Forquilhinha (SC)", "Fortaleza (CE)", "Fortaleza de Minas (MG)", "Fortaleza dos Nogueiras (MA)", "Fortaleza dos Valos (RS)", "Fortim (CE)", "Fortuna (MA)", "Fortuna de Minas (MG)", "Foz do Iguaçu (PR)", "Foz do Jordão (PR)", "Fraiburgo (SC)", "Franca (SP)", "Francinópolis (PI)", "Francisco Alves (PR)", "Francisco Ayres (PI)", "Francisco Badaró (MG)", "Francisco Beltrão (PR)", "Francisco Dantas (RN)", "Francisco Dumont (MG)", "Francisco Macedo (PI)", "Francisco Morato (SP)", "Franciscópolis (MG)", "Francisco Sá (MG)", "Francisco Santos (PI)", "Franco da Rocha (SP)", "Frecheirinha (CE)", "Frederico Westphalen (RS)", "Frei Gaspar (MG)", "Frei Inocêncio (MG)", "Frei Lagonegro (MG)", "Frei Martinho (PB)", "Frei Miguelinho (PE)", "Frei Paulo (SE)", "Frei Rogério (SC)", "Fronteira (MG)", "Fronteira dos Vales (MG)", "Fronteiras (PI)", "Fruta de Leite (MG)", "Frutal (MG)", "Frutuoso Gomes (RN)", "Fundão (ES)", "Funilândia (MG)", "Gabriel Monteiro (SP)", "Gado Bravo (PB)", "Gália (SP)", "Galileia (MG)", "Galinhos (RN)", "Galvão (SC)", "Gameleira (PE)", "Gameleira de Goiás (GO)", "Gameleiras (MG)", "Gandu (BA)", "Garanhuns (PE)", "Gararu (SE)", "Garça (SP)", "Garibaldi (RS)", "Garopaba (SC)", "Garrafão do Norte (PA)", "Garruchos (RS)", "Garuva (SC)", "Gaspar (SC)", "Gastão Vidigal (SP)", "Gaúcha do Norte (MT)", "Gaurama (RS)", "Gavião (BA)", "Gavião Peixoto (SP)", "Geminiano (PI)", "General Câmara (RS)", "General Carneiro (MT)", "General Carneiro (PR)", "General Maynard (SE)", "General Salgado (SP)", "General Sampaio (CE)", "Gentil (RS)", "Gentio do Ouro (BA)", "Getulina (SP)", "Getúlio Vargas (RS)", "Gilbués (PI)", "Girau do Ponciano (AL)", "Giruá (RS)", "Glaucilândia (MG)", "Glicério (SP)", "Glória (BA)", "Glória de Dourados (MS)", "Glória d'Oeste (MT)", "Glória do Goitá (PE)", "Glorinha (RS)", "Godofredo Viana (MA)", "Godoy Moreira (PR)", "Goiabeira (MG)", "Goiana (PE)", "Goianá (MG)", "Goianápolis (GO)", "Goiandira (GO)", "Goianésia (GO)", "Goianésia do Pará (PA)", "Goiânia (GO)", "Goianinha (RN)", "Goianira (GO)", "Goianorte (TO)", "Goiás (GO)", "Goiatins (TO)", "Goiatuba (GO)", "Goioerê (PR)", "Goioxim (PR)", "Gonçalves (MG)", "Gonçalves Dias (MA)", "Gongogi (BA)", "Gonzaga (MG)", "Gouveia (MG)", "Gouvelândia (GO)", "Governador Archer (MA)", "Governador Celso Ramos (SC)", "Governador Dix-Sept Rosado (RN)", "Governador Edison Lobão (MA)", "Governador Eugênio Barros (MA)", "Governador Jorge Teixeira (RO)", "Governador Lindenberg (ES)", "Governador Luiz Rocha (MA)", "Governador Mangabeira (BA)", "Governador Newton Bello (MA)", "Governador Nunes Freire (MA)", "Governador Valadares (MG)", "Graça (CE)", "Graça Aranha (MA)", "Graccho Cardoso (SE)", "Grajaú (MA)", "Gramado (RS)", "Gramado dos Loureiros (RS)", "Gramado Xavier (RS)", "Grandes Rios (PR)", "Granito (PE)", "Granja (CE)", "Granjeiro (CE)", "Grão Mogol (MG)", "Grão-Pará (SC)", "Gravatá (PE)", "Gravataí (RS)", "Gravatal (SC)", "Groaíras (CE)", "Grossos (RN)", "Grupiara (MG)", "Guabiju (RS)", "Guabiruba (SC)", "Guaçuí (ES)", "Guadalupe (PI)", "Guaíba (RS)", "Guaiçara (SP)", "Guaimbê (SP)", "Guaíra (PR)", "Guaíra (SP)", "Guairaçá (PR)", "Guaiúba (CE)", "Guajará (AM)", "Guajará-Mirim (RO)", "Guajeru (BA)", "Guamaré (RN)", "Guamiranga (PR)", "Guanambi (BA)", "Guanhães (MG)", "Guapé (MG)", "Guapiaçu (SP)", "Guapiara (SP)", "Guapimirim (RJ)", "Guapirama (PR)", "Guapó (GO)", "Guaporema (PR)", "Guaporé (RS)", "Guará (SP)", "Guarabira (PB)", "Guaraçaí (SP)", "Guaraci (PR)", "Guaraci (SP)", "Guaraciaba (MG)", "Guaraciaba (SC)", "Guaraciaba do Norte (CE)", "Guaraciama (MG)", "Guaraí (TO)", "Guaraíta (GO)", "Guaramiranga (CE)", "Guaramirim (SC)", "Guaranésia (MG)", "Guarani (MG)", "Guaraniaçu (PR)", "Guarani das Missões (RS)", "Guarani de Goiás (GO)", "Guarani d'Oeste (SP)", "Guarantã (SP)", "Guarantã do Norte (MT)", "Guarapari (ES)", "Guarapuava (PR)", "Guaraqueçaba (PR)", "Guarará (MG)", "Guararapes (SP)", "Guararema (SP)", "Guaratinga (BA)", "Guaratinguetá (SP)", "Guaratuba (PR)", "Guarda-Mor (MG)", "Guareí (SP)", "Guariba (SP)", "Guaribas (PI)", "Guarinos (GO)", "Guarujá (SP)", "Guarujá do Sul (SC)", "Guarulhos (SP)", "Guatambu (SC)", "Guatapará (SP)", "Guaxupé (MG)", "Guia Lopes da Laguna (MS)", "Guidoval (MG)", "Guimarães (MA)", "Guimarânia (MG)", "Guiratinga (MT)", "Guiricema (MG)", "Gurinhatã (MG)", "Gurinhém (PB)", "Gurjão (PB)", "Gurupá (PA)", "Gurupi (TO)", "Guzolândia (SP)", "Harmonia (RS)", "Heitoraí (GO)", "Heliodora (MG)", "Heliópolis (BA)", "Herculândia (SP)", "Herval (RS)", "Herval d'Oeste (SC)", "Herveiras (RS)", "Hidrolândia (CE)", "Hidrolândia (GO)", "Hidrolina (GO)", "Holambra (SP)", "Honório Serpa (PR)", "Horizonte (CE)", "Horizontina (RS)", "Hortolândia (SP)", "Hugo Napoleão (PI)", "Hulha Negra (RS)", "Humaitá (AM)", "Humaitá (RS)", "Humberto de Campos (MA)", "Iacanga (SP)", "Iaciara (GO)", "Iacri (SP)", "Iaçu (BA)", "Iapu (MG)", "Iaras (SP)", "Iati (PE)", "Ibaiti (PR)", "Ibarama (RS)", "Ibaté (SP)", "Ibaretama (CE)", "Ibateguara (AL)", "Ibatiba (ES)", "Ibema (PR)", "Ibertioga (MG)", "Ibiá (MG)", "Ibiaçá (RS)", "Ibiaí (MG)", "Ibiam (SC)", "Ibiapina (CE)", "Ibiara (PB)", "Ibiassucê (BA)", "Ibicaraí (BA)", "Ibicaré (SC)", "Ibicoara (BA)", "Ibicuí (BA)", "Ibicuitinga (CE)", "Ibimirim (PE)", "Ibipeba (BA)", "Ibipitanga (BA)", "Ibiporã (PR)", "Ibiquera (BA)", "Ibirá (SP)", "Ibiracatu (MG)", "Ibiraci (MG)", "Ibiraçu (ES)", "Ibiraiaras (RS)", "Ibirajuba (PE)", "Ibirama (SC)", "Ibirapitanga (BA)", "Ibirapuã (BA)", "Ibirapuitã (RS)", "Ibirarema (SP)", "Ibirataia (BA)", "Ibirité (MG)", "Ibirubá (RS)", "Ibitiara (BA)", "Ibitinga (SP)", "Ibitirama (ES)", "Ibititá (BA)", "Ibitiúra de Minas (MG)", "Ibituruna (MG)", "Ibiúna (SP)", "Ibotirama (BA)", "Icapuí (CE)", "Içara (SC)", "Icaraí de Minas (MG)", "Icaraíma (PR)", "Icatu (MA)", "Icém (SP)", "Ichu (BA)", "Icó (CE)", "Iconha (ES)", "Ielmo Marinho (RN)", "Iepê (SP)", "Igaci (AL)", "Igaporã (BA)", "Igaraçu do Tietê (SP)", "Igaracy (PB)", "Igarapava (SP)", "Igarapé (MG)", "Igarapé-Açu (PA)", "Igarapé do Meio (MA)", "Igarapé Grande (MA)", "Igarapé-Miri (PA)", "Igarassu (PE)", "Igaratá (SP)", "Igaratinga (MG)", "Igrapiúna (BA)", "Igreja Nova (AL)", "Igrejinha (RS)", "Iguaba Grande (RJ)", "Iguaí (BA)", "Iguape (SP)", "Iguaracy (PE)", "Iguaraçu (PR)", "Iguatama (MG)", "Iguatemi (MS)", "Iguatu (CE)", "Iguatu (PR)", "Ijaci (MG)", "Ijuí (RS)", "Ilhabela (SP)", "Ilha Comprida (SP)", "Ilha das Flores (SE)", "Ilha de Itamaracá (PE)", "Ilha Grande (PI)", "Ilha Solteira (SP)", "Ilhéus (BA)", "Ilhota (SC)", "Ilicínea (MG)", "Ilópolis (RS)", "Imaculada (PB)", "Imaruí (SC)", "Imbaú (PR)", "Imbé (RS)", "Imbé de Minas (MG)", "Imbituba (SC)", "Imbituva (PR)", "Imbuia (SC)", "Imigrante (Rio Grande do Sul) (RS)", "Imperatriz (MA)", "Inaciolândia (GO)", "Inácio Martins (PR)", "Inajá (PE)", "Inajá (PR)", "Inconfidentes (MG)", "Indaiabira (MG)", "Indaial (SC)", "Indaiatuba (SP)", "Independência (CE)", "Independência (RS)", "Indiana (SP)", "Indianópolis (MG)", "Indianópolis (PR)", "Indiaporã (SP)", "Indiara (GO)", "Indiaroba (SE)", "Indiavaí (MT)", "Ingá (PB)", "Ingaí (MG)", "Ingazeira (PE)", "Inhacorá (RS)", "Inhambupe (BA)", "Inhangapi (PA)", "Inhapi (AL)", "Inhapim (MG)", "Inhaúma (MG)", "Inhuma (PI)", "Inhumas (GO)", "Inimutaba (MG)", "Inocência (município) (MS)", "Inúbia Paulista (SP)", "Iomerê (SC)", "Ipaba (MG)", "Ipameri (GO)", "Ipanema (MG)", "Ipanguaçu (RN)", "Ipaporanga (CE)", "Ipatinga (MG)", "Ipaussu (SP)", "Ipaumirim (CE)", "Ipê (RS)", "Ipecaetá (BA)", "Iperó (SP)", "Ipeúna (SP)", "Ipiaçu (MG)", "Ipiaú (BA)", "Ipiguá (SP)", "Ipira (SC)", "Ipirá (BA)", "Ipiranga (PR)", "Ipiranga de Goiás (GO)", "Ipiranga do Norte (MT)", "Ipiranga do Piauí (PI)", "Ipiranga do Sul (RS)", "Ipixuna (AM)", "Ipixuna do Pará (PA)", "Ipojuca (PE)", "Iporá (GO)", "Iporã (PR)", "Iporã do Oeste (SC)", "Iporanga (SP)", "Ipu (CE)", "Ipuã (SP)", "Ipuaçu (SC)", "Ipubi (PE)", "Ipueira (RN)", "Ipueiras (CE)", "Ipueiras (TO)", "Ipuiuna (MG)", "Ipumirim (SC)", "Ipupiara (BA)", "Iracema (CE)", "Iracema (RR)", "Iracema do Oeste (PR)", "Iracemápolis (SP)", "Iraceminha (SC)", "Iraí (RS)", "Iraí de Minas (MG)", "Irajuba (BA)", "Iramaia (BA)", "Iranduba (AM)", "Irani (SC)", "Irapuã (SP)", "Irapuru (SP)", "Iraquara (BA)", "Irará (BA)", "Irati (PR)", "Irati (SC)", "Irauçuba (CE)", "Irecê (BA)", "Iretama (PR)", "Irineópolis (SC)", "Irituia (PA)", "Irupi (ES)", "Isaías Coelho (PI)", "Israelândia (GO)", "Itá (SC)", "Itaara (RS)", "Itabaiana (PB)", "Itabaiana (SE)", "Itabaianinha (SE)", "Itabela (BA)", "Itaberaba (BA)", "Itaberá (SP)", "Itaberaí (GO)", "Itabi (SE)", "Itabira (MG)", "Itabirinha (MG)", "Itabirito (MG)", "Itaboraí (RJ)", "Itabuna (BA)", "Itacajá (TO)", "Itacambira (MG)", "Itacarambi (MG)", "Itacaré (BA)", "Itacoatiara (AM)", "Itacuruba (PE)", "Itacurubi (RS)", "Itaetê (BA)", "Itagi (BA)", "Itagibá (BA)", "Itagimirim (BA)", "Itaguaçu da Bahia (BA)", "Itaguaçu (ES)", "Itaguaí (RJ)", "Itaguajé (PR)", "Itaguara (MG)", "Itaguari (GO)", "Itaguaru (GO)", "Itaguatins (TO)", "Itaí (SP)", "Itaíba (PE)", "Itaiçaba (CE)", "Itainópolis (PI)", "Itaiópolis (SC)", "Itaipava do Grajaú (MA)", "Itaipé (MG)", "Itaipulândia (PR)", "Itaitinga (CE)", "Itaituba (PA)", "Itajá (GO)", "Itajá (RN)", "Itajaí (SC)", "Itajobi (SP)", "Itaju (SP)", "Itajubá (MG)", "Itaju do Colônia (BA)", "Itajuípe (BA)", "Italva (RJ)", "Itamaraju (BA)", "Itamarandiba (MG)", "Itamarati (AM)", "Itamarati de Minas (MG)", "Itamari (BA)", "Itambacuri (MG)", "Itambaracá (PR)", "Itambé (BA)", "Itambé (PE)", "Itambé (PR)", "Itambé do Mato Dentro (MG)", "Itamogi (MG)", "Itamonte (MG)", "Itanagra (BA)", "Itanhaém (SP)", "Itanhandu (MG)", "Itanhangá (MT)", "Itanhém (BA)", "Itanhomi (MG)", "Itaobim (MG)", "Itaocara (RJ)", "Itaoca (SP)", "Itapaci (GO)", "Itapajé (CE)", "Itapagipe (MG)", "Itaparica (BA)", "Itapé (BA)", "Itapebi (BA)", "Itapecerica (MG)", "Itapecerica da Serra (SP)", "Itapecuru-Mirim (MA)", "Itapejara d'Oeste (PR)", "Itapema (SC)", "Itapemirim (ES)", "Itaperuçu (PR)", "Itaperuna (RJ)", "Itapetim (PE)", "Itapetinga (BA)", "Itapetininga (SP)", "Itapeva (MG)", "Itapeva (SP)", "Itapevi (SP)", "Itapicuru (BA)", "Itapipoca (CE)", "Itapira (SP)", "Itapiranga (AM)", "Itapiranga (SC)", "Itapirapuã (GO)", "Itapirapuã Paulista (SP)", "Itapiratins (TO)", "Itapissuma (PE)", "Itapitanga (BA)", "Itapiúna (CE)", "Itapoá (SC)", "Itápolis (SP)", "Itaporã (MS)", "Itaporã do Tocantins (TO)", "Itaporanga (PB)", "Itaporanga (SP)", "Itaporanga d'Ajuda (SE)", "Itapororoca (PB)", "Itapuã do Oeste (RO)", "Itapuca (RS)", "Itapuí (SP)", "Itapura (SP)", "Itapuranga (GO)", "Itaquaquecetuba (SP)", "Itaquara (BA)", "Itaqui (RS)", "Itaquiraí (MS)", "Itaquitinga (PE)", "Itarana (ES)", "Itarantim (BA)", "Itararé (SP)", "Itarema (CE)", "Itariri (SP)", "Itarumã (GO)", "Itati (RS)", "Itatiaia (RJ)", "Itatiaiuçu (MG)", "Itatiba (SP)", "Itatiba do Sul (RS)", "Itatim (BA)", "Itatinga (SP)", "Itatira (CE)", "Itatuba (PB)", "Itaú (RN)", "Itaubal (AP)", "Itaúba (MT)", "Itauçu (GO)", "Itaú de Minas (MG)", "Itaueira (PI)", "Itaúna (MG)", "Itaúna do Sul (PR)", "Itaverava (MG)", "Itinga (MG)", "Itinga do Maranhão (MA)", "Itiquira (MT)", "Itirapina (SP)", "Itirapuã (SP)", "Itiruçu (BA)", "Itiúba (BA)", "Itobi (SP)", "Itororó (BA)", "Itu (SP)", "Ituaçu (BA)", "Ituberá (BA)", "Itueta (MG)", "Ituiutaba (MG)", "Itumbiara (GO)", "Itumirim (MG)", "Itupeva (SP)", "Itupiranga (PA)", "Ituporanga (SC)", "Iturama (MG)", "Itutinga (MG)", "Ituverava (SP)", "Iuiú (BA)", "Iúna (ES)", "Ivaí (PR)", "Ivaiporã (PR)", "Ivaté (PR)", "Ivatuba (PR)", "Ivinhema (MS)", "Ivolândia (GO)", "Ivorá (RS)", "Ivoti (RS)", "Jaboatão dos Guararapes (PE)", "Jaborá (SC)", "Jaborandi (BA)", "Jaborandi (SP)", "Jaboticaba (RS)", "Jaboticabal (SP)", "Jaboticatubas (MG)", "Jaboti (PR)", "Jaçanã (RN)", "Jacaraci (BA)", "Jacaraú (PB)", "Jacareacanga (PA)", "Jacaré dos Homens (AL)", "Jacareí (SP)", "Jacarezinho (PR)", "Jaci (SP)", "Jaciara (MT)", "Jacinto (MG)", "Jacinto Machado (SC)", "Jacobina (BA)", "Jacobina do Piauí (PI)", "Jacuí (MG)", "Jacuípe (AL)", "Jacuizinho (RS)", "Jacundá (PA)", "Jacupiranga (SP)", "Jacutinga (MG)", "Jacutinga (RS)", "Jaguapitã (PR)", "Jaguaquara (BA)", "Jaguaraçu (MG)", "Jaguarão (RS)", "Jaguarari (BA)", "Jaguaré (ES)", "Jaguaretama (CE)", "Jaguari (RS)", "Jaguariaíva (PR)", "Jaguaribara (CE)", "Jaguaribe (CE)", "Jaguaripe (BA)", "Jaguariúna (SP)", "Jaguaruana (CE)", "Jaguaruna (SC)", "Jaíba (MG)", "Jaicós (PI)", "Jales (SP)", "Jambeiro (SP)", "Jampruca (MG)", "Janaúba (MG)", "Jandaia (GO)", "Jandaia do Sul (PR)", "Jandaíra (BA)", "Jandaíra (RN)", "Jandira (SP)", "Janduís (RN)", "Jangada (MT)", "Janiópolis (PR)", "Januária (MG)", "Japaraíba (MG)", "Japaratinga (AL)", "Japaratuba (SE)", "Japeri (RJ)", "Japi (RN)", "Japira (PR)", "Japoatã (SE)", "Japonvar (MG)", "Japorã (MS)", "Japurá (AM)", "Japurá (PR)", "Jaqueira (PE)", "Jaquirana (RS)", "Jaraguá (GO)", "Jaraguá do Sul (SC)", "Jaraguari (MS)", "Jaramataia (AL)", "Jardim (CE)", "Jardim (MS)", "Jardim Alegre (PR)", "Jardim de Angicos (RN)", "Jardim de Piranhas (RN)", "Jardim do Mulato (PI)", "Jardim do Seridó (RN)", "Jardim Olinda (PR)", "Jardinópolis (SC)", "Jardinópolis (SP)", "Jari (RS)", "Jarinu (SP)", "Jaru (RO)", "Jataí (GO)", "Jataizinho (PR)", "Jataúba (PE)", "Jateí (MS)", "Jati (CE)", "Jatobá (MA)", "Jatobá (PE)", "Jatobá do Piauí (PI)", "Jaú (SP)", "Jaú do Tocantins (TO)", "Jaupaci (GO)", "Jauru (MT)", "Jeceaba (MG)", "Jenipapo de Minas (MG)", "Jenipapo dos Vieiras (MA)", "Jequeri (MG)", "Jequiá da Praia (AL)", "Jequié (BA)", "Jequitaí (MG)", "Jequitibá (MG)", "Jequitinhonha (MG)", "Jeremoabo (BA)", "Jericó (PB)", "Jeriquara (SP)", "Jerônimo Monteiro (ES)", "Jerumenha (PI)", "Jesuânia (MG)", "Jesuítas (PR)", "Jesúpolis (GO)", "Jijoca de Jericoacoara (CE)", "Ji-Paraná (RO)", "Jiquiriçá (BA)", "Jitaúna (BA)", "Joaçaba (SC)", "Joaíma (MG)", "Joanésia (MG)", "Joanópolis (SP)", "João Alfredo (PE)", "João Câmara (RN)", "João Costa (PI)", "João Dias (RN)", "João Dourado (BA)", "João Lisboa (MA)", "João Monlevade (MG)", "João Neiva (ES)", "João Pessoa (PB)", "João Pinheiro (MG)", "João Ramalho (SP)", "Joaquim Felício (MG)", "Joaquim Gomes (AL)", "Joaquim Nabuco (PE)", "Joaquim Pires (PI)", "Joaquim Távora (PR)", "Joca Claudino (PB)", "Joca Marques (PI)", "Jóia (RS)", "Joinville (SC)", "Jordânia (MG)", "Jordão (AC)", "José Boiteux (SC)", "José Bonifácio (SP)", "José da Penha (RN)", "José de Freitas (PI)", "José Gonçalves de Minas (MG)", "Joselândia (MA)", "Josenópolis (MG)", "José Raydan (MG)", "Joviânia (GO)", "Juara (MT)", "Juarez Távora (PB)", "Juarina (TO)", "Juatuba (MG)", "Juazeirinho (PB)", "Juazeiro (BA)", "Juazeiro do Norte (CE)", "Juazeiro do Piauí (PI)", "Jucás (CE)", "Jucati (PE)", "Jucuruçu (BA)", "Jucurutu (RN)", "Juína (MT)", "Juiz de Fora (MG)", "Júlio Borges (PI)", "Júlio de Castilhos (RS)", "Júlio Mesquita (SP)", "Jumirim (SP)", "Junco do Maranhão (MA)", "Junco do Seridó (PB)", "Jundiá (AL)", "Jundiá (RN)", "Jundiaí (SP)", "Jundiaí do Sul (PR)", "Junqueiro (AL)", "Junqueirópolis (SP)", "Jupi (PE)", "Jupiá (SC)", "Juquiá (SP)", "Juquitiba (SP)", "Juramento (MG)", "Juranda (PR)", "Jurema (PE)", "Jurema (PI)", "Juripiranga (PB)", "Juru (PB)", "Juruá (AM)", "Juruaia (MG)", "Juruena (MT)", "Juruti (PA)", "Juscimeira (MT)", "Jussara (BA)", "Jussara (GO)", "Jussara (PR)", "Jussari (BA)", "Jussiape (BA)", "Jutaí (AM)", "Juti (MS)", "Juvenília (MG)", "Kaloré (PR)", "Lábrea (AM)", "Lacerdópolis (SC)", "Ladainha (MG)", "Ladário (MS)", "Lafaiete Coutinho (BA)", "Lagamar (MG)", "Lagarto (SE)", "Lages (SC)", "Lagoa (PB)", "Lagoa Alegre (PI)", "Lagoa Bonita do Sul (RS)", "Lagoa da Canoa (AL)", "Lagoa da Confusão (TO)", "Lagoa d'Anta (RN)", "Lagoa da Prata (MG)", "Lagoa de Dentro (PB)", "Lagoa de Itaenga (PE)", "Lagoa de Pedras (RN)", "Lagoa de São Francisco (PI)", "Lagoa de Velhos (RN)", "Lagoa do Barro do Piauí (PI)", "Lagoa do Carro (PE)", "Lagoa do Mato (MA)", "Lagoa do Ouro (PE)", "Lagoa do Piauí (PI)", "Lagoa dos Gatos (PE)", "Lagoa do Sítio (PI)", "Lagoa dos Patos (MG)", "Lagoa dos Três Cantos (RS)", "Lagoa do Tocantins (TO)", "Lagoa Dourada (MG)", "Lagoa Formosa (MG)", "Lagoa Grande (MG)", "Lagoa Grande (PE)", "Lagoa Grande do Maranhão (MA)", "Lagoa Nova (RN)", "Lagoão (RS)", "Lagoa Real (BA)", "Lagoa Salgada (RN)", "Lagoa Santa (GO)", "Lagoa Santa (MG)", "Lagoa Seca (PB)", "Lagoa Vermelha (RS)", "Lago da Pedra (MA)", "Lago do Junco (MA)", "Lago dos Rodrigues (MA)", "Lagoinha (SP)", "Lagoinha do Piauí (PI)", "Lago Verde (MA)", "Laguna (SC)", "Laguna Carapã (MS)", "Laje (BA)", "Lajeado (RS)", "Lajeado (TO)", "Lajeado do Bugre (RS)", "Lajeado Grande (SC)", "Lajeado Novo (MA)", "Lajedão (BA)", "Lajedinho (BA)", "Lajedo (PE)", "Lajedo do Tabocal (BA)", "Laje do Muriaé (RJ)", "Lajes (RN)", "Lajes Pintadas (RN)", "Lajinha (MG)", "Lamarão (BA)", "Lambari (MG)", "Lambari d'Oeste (MT)", "Lamim (MG)", "Landri Sales (PI)", "Lapa (PR)", "Lapão (BA)", "Laranja da Terra (ES)", "Laranjal (MG)", "Laranjal (PR)", "Laranjal do Jari (AP)", "Laranjal Paulista (SP)", "Laranjeiras (SE)", "Laranjeiras do Sul (PR)", "Lassance (MG)", "Lastro (PB)", "Laurentino (SC)", "Lauro de Freitas (BA)", "Lauro Müller (SC)", "Lavandeira (TO)", "Lavínia (SP)", "Lavras (MG)", "Lavras da Mangabeira (CE)", "Lavras do Sul (RS)", "Lavrinhas (SP)", "Leandro Ferreira (MG)", "Lebon Régis (SC)", "Leme (SP)", "Leme do Prado (MG)", "Lençóis (BA)", "Lençóis Paulista (SP)", "Leoberto Leal (SC)", "Leopoldina (MG)", "Leopoldo de Bulhões (GO)", "Leópolis (PR)", "Liberato Salzano (RS)", "Liberdade (MG)", "Licínio de Almeida (BA)", "Lidianópolis (PR)", "Lima Campos (MA)", "Lima Duarte (MG)", "Limeira (SP)", "Limeira do Oeste (MG)", "Limoeiro (PE)", "Limoeiro de Anadia (AL)", "Limoeiro do Ajuru (PA)", "Limoeiro do Norte (CE)", "Lindoeste (PR)", "Lindóia (SP)", "Lindóia do Sul (SC)", "Lindolfo Collor (RS)", "Linha Nova (RS)", "Linhares (ES)", "Lins (SP)", "Livramento (PB)", "Livramento de Nossa Senhora (BA)", "Lizarda (TO)", "Loanda (PR)", "Lobato (PR)", "Logradouro (PB)", "Londrina (PR)", "Lontra (MG)", "Lontras (SC)", "Lorena (SP)", "Loreto (MA)", "Lourdes (SP)", "Louveira (SP)", "Lucas do Rio Verde (MT)", "Lucélia (SP)", "Lucena (PB)", "Lucianópolis (SP)", "Luciara (MT)", "Lucrécia (RN)", "Luiz Antônio (SP)", "Luisburgo (MG)", "Luiz Alves (SC)", "Luís Correia (PI)", "Luís Domingues (MA)", "Luís Eduardo Magalhães (BA)", "Luís Gomes (RN)", "Luisiana (PR)", "Luisiânia (SP)", "Luislândia (MG)", "Luminárias (MG)", "Lunardelli (PR)", "Lupércio (SP)", "Lupionópolis (PR)", "Lutécia (SP)", "Luz (MG)", "Luzerna (SC)", "Luziânia (GO)", "Luzilândia (PI)", "Luzinópolis (TO)", "Macaé (RJ)", "Macaíba (RN)", "Macajuba (BA)", "Maçambará (RS)", "Macambira (SE)", "Macapá (AP)", "Macaparana (PE)", "Macarani (BA)", "Macatuba (SP)", "Macau (RN)", "Macaubal (SP)", "Macaúbas (BA)", "Macedônia (SP)", "Maceió (AL)", "Machacalis (MG)", "Machadinho (RS)", "Machadinho d'Oeste (RO)", "Machado (MG)", "Machados (PE)", "Macieira (SC)", "Macuco (RJ)", "Macururé (BA)", "Madalena (CE)", "Madeiro (PI)", "Madre de Deus (BA)", "Madre de Deus de Minas (MG)", "Mãe d'Água (PB)", "Mãe do Rio (PA)", "Maetinga (BA)", "Mafra (SC)", "Magalhães Barata (PA)", "Magalhães de Almeida (MA)", "Magda (SP)", "Magé (RJ)", "Maiquinique (BA)", "Mairi (BA)", "Mairinque (SP)", "Mairiporã (SP)", "Mairipotaba (GO)", "Major Gercino (SC)", "Major Izidoro (AL)", "Major Sales (RN)", "Major Vieira (SC)", "Malacacheta (MG)", "Malhada (BA)", "Malhada de Pedras (BA)", "Malhada dos Bois (SE)", "Malhador (SE)", "Mallet (PR)", "Malta (PB)", "Mamanguape (PB)", "Mambaí (GO)", "Mamborê (PR)", "Mamonas (MG)", "Mampituba (RS)", "Manacapuru (AM)", "Manaíra (PB)", "Manaquiri (AM)", "Manari (PE)", "Manaus (AM)", "Mâncio Lima (AC)", "Mandaguaçu (PR)", "Mandaguari (PR)", "Mandirituba (PR)", "Manduri (SP)", "Manfrinópolis (PR)", "Manga (MG)", "Mangaratiba (RJ)", "Mangueirinha (PR)", "Manhuaçu (MG)", "Manhumirim (MG)", "Manicoré (AM)", "Manoel Emídio (PI)", "Manoel Ribas (PR)", "Manoel Urbano (AC)", "Manoel Viana (RS)", "Manoel Vitorino (BA)", "Mansidão (BA)", "Mantena (MG)", "Mantenópolis (ES)", "Maquiné (RS)", "Maraã (AM)", "Marabá (PA)", "Marabá Paulista (SP)", "Maracaçumé (MA)", "Maracaí (SP)", "Maracajá (SC)", "Maracaju (MS)", "Maracanã (PA)", "Maracanaú (CE)", "Maracás (BA)", "Maragogi (AL)", "Maragogipe (BA)", "Maraial (PE)", "Marajá do Sena (MA)", "Maranguape (CE)", "Maranhãozinho (MA)", "Marapanim (PA)", "Marapoama (SP)", "Mara Rosa (GO)", "Maratá (RS)", "Marataízes (ES)", "Maraú (BA)", "Marau (RS)", "Maravilha (AL)", "Maravilha (SC)", "Maravilhas (MG)", "Marcação (PB)", "Marcelândia (MT)", "Marcelino Ramos (RS)", "Marcelino Vieira (RN)", "Marcionílio Souza (BA)", "Marco (CE)", "Marcolândia (PI)", "Marcos Parente (PI)", "Mar de Espanha (MG)", "Marechal Cândido Rondon (PR)", "Marechal Deodoro (AL)", "Marechal Floriano (ES)", "Marechal Thaumaturgo (AC)", "Marema (SC)", "Mari (PB)", "Maria da Fé (MG)", "Maria Helena (PR)", "Marialva (PR)", "Mariana (MG)", "Mariana Pimentel (RS)", "Mariano Moro (RS)", "Marianópolis do Tocantins (TO)", "Mariápolis (SP)", "Maribondo (AL)", "Maricá (RJ)", "Marilac (MG)", "Marilândia (ES)", "Marilândia do Sul (PR)", "Marilena (PR)", "Marília (SP)", "Mariluz (PR)", "Maringá (PR)", "Marinópolis (SP)", "Mário Campos (MG)", "Mariópolis (PR)", "Maripá (PR)", "Maripá de Minas (MG)", "Marituba (PA)", "Marizópolis (PB)", "Marliéria (MG)", "Marmeleiro (PR)", "Marmelópolis (MG)", "Marques de Souza (RS)", "Marquinho (PR)", "Martinho Campos (MG)", "Martinópole (CE)", "Martinópolis (SP)", "Martins (RN)", "Martins Soares (MG)", "Maruim (SE)", "Marumbi (PR)", "Mar Vermelho (AL)", "Marzagão (GO)", "Mascote (BA)", "Massapê (CE)", "Massapê do Piauí (PI)", "Massaranduba (PB)", "Massaranduba (SC)", "Mata (RS)", "Mata de São João (BA)", "Mata Grande (AL)", "Matão (SP)", "Mataraca (PB)", "Mata Roma (MA)", "Mata Verde (MG)", "Mateiros (TO)", "Matelândia (PR)", "Materlândia (MG)", "Mateus Leme (MG)", "Mathias Lobato (MG)", "Matias Barbosa (MG)", "Matias Cardoso (MG)", "Matias Olímpio (PI)", "Matina (BA)", "Matinha (MA)", "Matinhas (PB)", "Matinhos (PR)", "Matipó (MG)", "Mato Castelhano (RS)", "Matões (MA)", "Matões do Norte (MA)", "Mato Grosso (PB)", "Mato Leitão (RS)", "Mato Queimado (RS)", "Mato Rico (PR)", "Matos Costa (SC)", "Mato Verde (MG)", "Matozinhos (MG)", "Matrinchã (GO)", "Matriz de Camaragibe (AL)", "Matupá (MT)", "Matureia (PB)", "Matutina (MG)", "Mauá (SP)", "Mauá da Serra (PR)", "Maués (AM)", "Maurilândia (GO)", "Maurilândia do Tocantins (TO)", "Mauriti (CE)", "Maxaranguape (RN)", "Maximiliano de Almeida (RS)", "Mazagão (AP)", "Medeiros (MG)", "Medeiros Neto (BA)", "Medianeira (PR)", "Medicilândia (PA)", "Medina (MG)", "Meleiro (SC)", "Melgaço (PA)", "Mendes (RJ)", "Mendes Pimentel (MG)", "Mendonça (SP)", "Mercedes (PR)", "Mercês (MG)", "Meridiano (SP)", "Meruoca (CE)", "Mesópolis (SP)", "Mesquita (MG)", "Mesquita (RJ)", "Messias (AL)", "Messias Targino (RN)", "Miguel Alves (PI)", "Miguel Calmon (BA)", "Miguel Leão (PI)", "Miguelópolis (SP)", "Miguel Pereira (RJ)", "Milagres (BA)", "Milagres (CE)", "Milagres do Maranhão (MA)", "Milhã (CE)", "Milton Brandão (PI)", "Mimoso de Goiás (GO)", "Mimoso do Sul (ES)", "Minaçu (GO)", "Minador do Negrão (AL)", "Minas do Leão (RS)", "Minas Novas (MG)", "Minduri (MG)", "Mineiros (GO)", "Mineiros do Tietê (SP)", "Ministro Andreazza (RO)", "Mirabela (MG)", "Miracatu (SP)", "Miracema (RJ)", "Miracema do Tocantins (TO)", "Mirador (MA)", "Mirador (PR)", "Miradouro (MG)", "Mira Estrela (SP)", "Miraguaí (RS)", "Miraí (MG)", "Miraíma (CE)", "Miranda (MS)", "Miranda do Norte (MA)", "Mirandiba (PE)", "Mirandópolis (SP)", "Mirangaba (BA)", "Miranorte (TO)", "Mirante (BA)", "Mirante da Serra (RO)", "Mirante do Paranapanema (SP)", "Miraselva (PR)", "Mirassol (SP)", "Mirassolândia (SP)", "Mirassol d'Oeste (MT)", "Miravânia (MG)", "Mirim Doce (SC)", "Mirinzal (MA)", "Missal (PR)", "Missão Velha (CE)", "Mocajuba (PA)", "Mococa (SP)", "Modelo (SC)", "Moeda (MG)", "Moema (MG)", "Mogeiro (PB)", "Mogi das Cruzes (SP)", "Mogi Guaçu (SP)", "Mogi Mirim (SP)", "Moiporá (GO)", "Moita Bonita (SE)", "Moju (PA)", "Mojuí dos Campos (PA)", "Mombaça (CE)", "Mombuca (SP)", "Monção (MA)", "Monções (SP)", "Mondaí (SC)", "Mongaguá (SP)", "Monjolos (MG)", "Monsenhor Gil (PI)", "Monsenhor Hipólito (PI)", "Monsenhor Paulo (MG)", "Monsenhor Tabosa (CE)", "Montadas (PB)", "Montalvânia (MG)", "Montanha (ES)", "Montanhas (RN)", "Montauri (RS)", "Monte Alegre (PA)", "Monte Alegre (RN)", "Monte Alegre de Goiás (GO)", "Monte Alegre de Minas (MG)", "Monte Alegre de Sergipe (SE)", "Monte Alegre do Piauí (PI)", "Monte Alegre dos Campos (RS)", "Monte Alegre do Sul (SP)", "Monte Alto (SP)", "Monte Aprazível (SP)", "Monte Azul (MG)", "Monte Azul Paulista (SP)", "Monte Belo (MG)", "Monte Belo do Sul (RS)", "Monte Carlo (SC)", "Monte Carmelo (MG)", "Monte Castelo (SC)", "Monte Castelo (SP)", "Monte das Gameleiras (RN)", "Monte do Carmo (TO)", "Monte Formoso (MG)", "Monte Horebe (PB)", "Monteiro (PB)", "Monteiro Lobato (SP)", "Monteirópolis (AL)", "Monte Mor (SP)", "Montenegro (RS)", "Monte Negro (RO)", "Montes Altos (MA)", "Monte Santo (BA)", "Monte Santo de Minas (MG)", "Monte Santo do Tocantins (TO)", "Montes Claros (MG)", "Montes Claros de Goiás (GO)", "Monte Sião (MG)", "Montezuma (MG)", "Montividiu (GO)", "Montividiu do Norte (GO)", "Morada Nova (CE)", "Morada Nova de Minas (MG)", "Moraújo (CE)", "Moreilândia (PE)", "Moreira Sales (PR)", "Moreno (PE)", "Mormaço (RS)", "Morpará (BA)", "Morretes (PR)", "Morrinhos (CE)", "Morrinhos (GO)", "Morrinhos do Sul (RS)", "Morro Agudo (SP)", "Morro Agudo de Goiás (GO)", "Morro Cabeça no Tempo (PI)", "Morro da Fumaça (SC)", "Morro da Garça (MG)", "Morro do Chapéu (BA)", "Morro do Chapéu do Piauí (PI)", "Morro do Pilar (MG)", "Morro Grande (SC)", "Morro Redondo (RS)", "Morro Reuter (RS)", "Morros (MA)", "Mortugaba (BA)", "Morungaba (SP)", "Mossâmedes (GO)", "Mossoró (RN)", "Mostardas (RS)", "Motuca (SP)", "Mozarlândia (GO)", "Muaná (PA)", "Mucajaí (RR)", "Mucambo (CE)", "Mucugê (BA)", "Muçum (RS)", "Mucuri (BA)", "Mucurici (ES)", "Muitos Capões (RS)", "Muliterno (RS)", "Mulungu (CE)", "Mulungu (PB)", "Mulungu do Morro (BA)", "Mundo Novo (BA)", "Mundo Novo (GO)", "Mundo Novo (MS)", "Munhoz (MG)", "Munhoz de Mello (PR)", "Muniz Ferreira (BA)", "Muniz Freire (ES)", "Muquém do São Francisco (BA)", "Muqui (ES)", "Muriaé (MG)", "Muribeca (SE)", "Murici (AL)", "Murici dos Portelas (PI)", "Muricilândia (TO)", "Muritiba (BA)", "Murutinga do Sul (SP)", "Mutuípe (BA)", "Mutum (MG)", "Mutunópolis (GO)", "Muzambinho (MG)", "Nacip Raydan (MG)", "Nantes (SP)", "Nanuque (MG)", "Não-Me-Toque (RS)", "Naque (MG)", "Narandiba (SP)", "Natal (RN)", "Natalândia (MG)", "Natércia (MG)", "Natividade (RJ)", "Natividade (TO)", "Natividade da Serra (SP)", "Natuba (PB)", "Navegantes (SC)", "Naviraí (MS)", "Nazaré (BA)", "Nazaré (TO)", "Nazaré da Mata (PE)", "Nazaré do Piauí (PI)", "Nazareno (MG)", "Nazaré Paulista (SP)", "Nazarezinho (PB)", "Nazária (PI)", "Nazário (GO)", "Neópolis (SE)", "Nepomuceno (MG)", "Nerópolis (GO)", "Neves Paulista (SP)", "Nhamundá (AM)", "Nhandeara (SP)", "Nicolau Vergueiro (RS)", "Nilo Peçanha (BA)", "Nilópolis (RJ)", "Nina Rodrigues (MA)", "Ninheira (MG)", "Nioaque (MS)", "Nipoã (SP)", "Niquelândia (GO)", "Nísia Floresta (RN)", "Niterói (RJ)", "Nobres (MT)", "Nonoai (RS)", "Nordestina (BA)", "Normandia (RR)", "Nortelândia (MT)", "Nossa Senhora Aparecida (SE)", "Nossa Senhora da Glória (SE)", "Nossa Senhora das Dores (SE)", "Nossa Senhora das Graças (PR)", "Nossa Senhora de Lourdes (SE)", "Nossa Senhora de Nazaré (PI)", "Nossa Senhora do Livramento (MT)", "Nossa Senhora do Socorro (SE)", "Nossa Senhora dos Remédios (PI)", "Nova Aliança (SP)", "Nova Aliança do Ivaí (PR)", "Nova Alvorada (RS)", "Nova Alvorada do Sul (MS)", "Nova América (GO)", "Nova América da Colina (PR)", "Nova Andradina (MS)", "Nova Araçá (RS)", "Nova Aurora (GO)", "Nova Aurora (PR)", "Nova Bandeirantes (MT)", "Nova Bassano (RS)", "Nova Belém (MG)", "Nova Boa Vista (RS)", "Nova Brasilândia (MT)", "Nova Brasilândia d'Oeste (RO)", "Nova Bréscia (RS)", "Nova Campina (SP)", "Nova Canaã (BA)", "Nova Canaã do Norte (MT)", "Nova Canaã Paulista (SP)", "Nova Candelária (RS)", "Nova Cantu (PR)", "Nova Castilho (SP)", "Nova Colinas (MA)", "Nova Crixás (GO)", "Nova Cruz (RN)", "Nova Era (MG)", "Nova Erechim (SC)", "Nova Esperança (PR)", "Nova Esperança do Piriá (PA)", "Nova Esperança do Sudoeste (PR)", "Nova Esperança do Sul (RS)", "Nova Europa (SP)", "Nova Fátima (BA)", "Nova Fátima (PR)", "Nova Floresta (PB)", "Nova Friburgo (RJ)", "Nova Glória (GO)", "Nova Granada (SP)", "Nova Guarita (MT)", "Nova Guataporanga (SP)", "Nova Hartz (RS)", "Nova Ibiá (BA)", "Nova Iguaçu (RJ)", "Nova Iguaçu de Goiás (GO)", "Nova Independência (SP)", "Nova Iorque (MA)", "Nova Ipixuna (PA)", "Novais (SP)", "Nova Itaberaba (SC)", "Nova Itarana (BA)", "Nova Lacerda (MT)", "Nova Laranjeiras (PR)", "Nova Lima (MG)", "Nova Londrina (PR)", "Nova Luzitânia (SP)", "Nova Mamoré (RO)", "Nova Marilândia (MT)", "Nova Maringá (MT)", "Nova Módica (MG)", "Nova Monte Verde (MT)", "Nova Mutum (MT)", "Nova Nazaré (MT)", "Nova Odessa (SP)", "Nova Olímpia (MT)", "Nova Olímpia (PR)", "Nova Olinda (CE)", "Nova Olinda (PB)", "Nova Olinda (TO)", "Nova Olinda do Maranhão (MA)", "Nova Olinda do Norte (AM)", "Nova Pádua (RS)", "Nova Palma (RS)", "Nova Palmeira (PB)", "Nova Petrópolis (RS)", "Nova Ponte (MG)", "Nova Porteirinha (MG)", "Nova Prata (RS)", "Nova Prata do Iguaçu (PR)", "Nova Ramada (RS)", "Nova Redenção (BA)", "Nova Resende (MG)", "Nova Roma (GO)", "Nova Roma do Sul (RS)", "Nova Rosalândia (TO)", "Nova Russas (CE)", "Nova Santa Bárbara (PR)", "Nova Santa Helena (MT)", "Nova Santa Rita (PI)", "Nova Santa Rita (RS)", "Nova Santa Rosa (PR)", "Nova Serrana (MG)", "Nova Soure (BA)", "Nova Tebas (PR)", "Nova Timboteua (PA)", "Nova Trento (SC)", "Nova Ubiratã (MT)", "Nova União (MG)", "Nova União (RO)", "Nova Venécia (ES)", "Nova Veneza (GO)", "Nova Veneza (SC)", "Nova Viçosa (BA)", "Nova Xavantina (MT)", "Novo Acordo (TO)", "Novo Alegre (TO)", "Novo Aripuanã (AM)", "Novo Airão (AM)", "Novo Barreiro (RS)", "Novo Brasil (GO)", "Novo Cabrais (RS)", "Novo Cruzeiro (MG)", "Novo Gama (GO)", "Novo Hamburgo (RS)", "Novo Horizonte (BA)", "Novo Horizonte (SC)", "Novo Horizonte (SP)", "Novo Horizonte do Norte (MT)", "Novo Horizonte do Oeste (RO)", "Novo Horizonte do Sul (MS)", "Novo Itacolomi (PR)", "Novo Jardim (TO)", "Novo Lino (AL)", "Novo Machado (RS)", "Novo Mundo (MT)", "Novo Oriente (CE)", "Novo Oriente de Minas (MG)", "Novo Oriente do Piauí (PI)", "Novo Planalto (GO)", "Novo Progresso (PA)", "Novo Repartimento (PA)", "Novorizonte (MG)", "Novo Santo Antônio (MT)", "Novo Santo Antônio (PI)", "Novo São Joaquim (MT)", "Novo Tiradentes (RS)", "Novo Triunfo (BA)", "Novo Xingu (RS)", "Nuporanga (SP)", "Óbidos (PA)", "Ocara (CE)", "Ocauçu (SP)", "Oeiras (PI)", "Oeiras do Pará (PA)", "Oiapoque (AP)", "Olaria (MG)", "Óleo (SP)", "Olho d'Água (PB)", "Olho d'Água das Cunhãs (MA)", "Olho d'Água das Flores (AL)", "Olho d'Água do Borges (RN)", "Olho d'Água do Casado (AL)", "Olho d'Água do Piauí (PI)", "Olho d'Água Grande (AL)", "Olhos-d'Água (MG)", "Olímpia (SP)", "Olímpio Noronha (MG)", "Olinda (PE)", "Olinda Nova do Maranhão (MA)", "Olindina (BA)", "Olivedos (PB)", "Oliveira (MG)", "Oliveira de Fátima (TO)", "Oliveira dos Brejinhos (BA)", "Oliveira Fortes (MG)", "Olivença (AL)", "Onça de Pitangui (MG)", "Onda Verde (SP)", "Oratórios (MG)", "Oriente (SP)", "Orindiúva (SP)", "Oriximiná (PA)", "Orizânia (MG)", "Orizona (GO)", "Orlândia (SP)", "Orleans (SC)", "Orobó (PE)", "Orocó (PE)", "Orós (CE)", "Ortigueira (PR)", "Osasco (SP)", "Oscar Bressane (SP)", "Osório (RS)", "Osvaldo Cruz (SP)", "Otacílio Costa (SC)", "Ourém (PA)", "Ouriçangas (BA)", "Ouricuri (PE)", "Ourilândia do Norte (PA)", "Ourinhos (SP)", "Ourizona (PR)", "Ouro (SC)", "Ouro Branco (AL)", "Ouro Branco (MG)", "Ouro Branco (RN)", "Ouroeste (SP)", "Ouro Fino (MG)", "Ourolândia (BA)", "Ouro Preto (MG)", "Ouro Preto do Oeste (RO)", "Ouro Velho (PB)", "Ouro Verde (SC)", "Ouro Verde (SP)", "Ouro Verde de Goiás (GO)", "Ouro Verde de Minas (MG)", "Ouro Verde do Oeste (PR)", "Ouvidor (GO)", "Pacaembu (SP)", "Pacajá (PA)", "Pacajus (CE)", "Pacaraima (RR)", "Pacatuba (CE)", "Pacatuba (SE)", "Paço do Lumiar (MA)", "Pacoti (CE)", "Pacujá (CE)", "Padre Bernardo (GO)", "Padre Carvalho (MG)", "Padre Marcos (PI)", "Padre Paraíso (MG)", "Paes Landim (PI)", "Paial (SC)", "Paiçandu (PR)", "Paim Filho (RS)", "Paineiras (MG)", "Painel (SC)", "Pains (MG)", "Pai Pedro (MG)", "Paiva (MG)", "Pajeú do Piauí (PI)", "Palestina (AL)", "Palestina (SP)", "Palestina de Goiás (GO)", "Palestina do Pará (PA)", "Palhano (CE)", "Palhoça (SC)", "Palma (MG)", "Palmácia (CE)", "Palmares (PE)", "Palmares do Sul (RS)", "Palmares Paulista (SP)", "Palmas (PR)", "Palmas (TO)", "Palmas de Monte Alto (BA)", "Palma Sola (SC)", "Palmeira (PR)", "Palmeira (SC)", "Palmeira das Missões (RS)", "Palmeira d'Oeste (SP)", "Palmeira do Piauí (PI)", "Palmeira dos Índios (AL)", "Palmeirais (PI)", "Palmeirândia (MA)", "Palmeirante (TO)", "Palmeiras (BA)", "Palmeiras de Goiás (GO)", "Palmeiras do Tocantins (TO)", "Palmeirina (PE)", "Palmeirópolis (TO)", "Palmelo (GO)", "Palminópolis (GO)", "Palmital (PR)", "Palmital (SP)", "Palmitinho (RS)", "Palmitos (SC)", "Palmópolis (MG)", "Palotina (PR)", "Panamá (GO)", "Panambi (RS)", "Pancas (ES)", "Panelas (PE)", "Panorama (SP)", "Pantano Grande (RS)", "Pão de Açúcar (AL)", "Papagaios (MG)", "Papanduva (SC)", "Paquetá (PI)", "Paracambi (RJ)", "Paracatu (MG)", "Paracuru (CE)", "Pará de Minas (MG)", "Paragominas (PA)", "Paraguaçu (MG)", "Paraguaçu Paulista (SP)", "Paraí (RS)", "Paraíba do Sul (RJ)", "Paraibano (MA)", "Paraibuna (SP)", "Paraipaba (CE)", "Paraíso (SC)", "Paraíso (SP)", "Paraíso das Águas (MS)", "Paraíso do Norte (PR)", "Paraíso do Sul (RS)", "Paraíso do Tocantins (TO)", "Paraisópolis (MG)", "Parambu (CE)", "Paramirim (BA)", "Paramoti (CE)", "Paraná (RN)", "Paranã (TO)", "Paranacity (PR)", "Paranaguá (PR)", "Paranaíba (MS)", "Paranaiguara (GO)", "Paranaíta (MT)", "Paranapanema (SP)", "Paranapoema (PR)", "Paranapuã (SP)", "Paranatama (PE)", "Paranatinga (MT)", "Paranavaí (PR)", "Paranhos (MS)", "Paraopeba (MG)", "Parapuã (SP)", "Parari (PB)", "Paratinga (BA)", "Paraty (RJ)", "Paraú (RN)", "Parauapebas (PA)", "Paraúna (GO)", "Parazinho (RN)", "Pardinho (SP)", "Pareci Novo (RS)", "Parecis (RO)", "Parelhas (RN)", "Pariconha (AL)", "Parintins (AM)", "Paripiranga (BA)", "Paripueira (AL)", "Pariquera-Açu (SP)", "Parisi (SP)", "Parnaguá (PI)", "Parnaíba (PI)", "Parnamirim (PE)", "Parnamirim (RN)", "Parnarama (MA)", "Parobé (RS)", "Passabém (MG)", "Passa-e-Fica (RN)", "Passagem (PB)", "Passagem (RN)", "Passagem Franca (MA)", "Passagem Franca do Piauí (PI)", "Passa Quatro (MG)", "Passa-Sete (RS)", "Passa Tempo (MG)", "Passa Vinte (MG)", "Passira (PE)", "Passo de Camaragibe (AL)", "Passo de Torres (SC)", "Passo do Sobrado (RS)", "Passo Fundo (RS)", "Passos (MG)", "Passos Maia (SC)", "Pastos Bons (MA)", "Patis (MG)", "Pato Bragado (PR)", "Pato Branco (PR)", "Patos (PB)", "Patos de Minas (MG)", "Patos do Piauí (PI)", "Patrocínio (Minas_Gerais) (MG)", "Patrocínio do Muriaé (MG)", "Patrocínio Paulista (SP)", "Patu (RN)", "Paty do Alferes (RJ)", "Pau Brasil (BA)", "Paudalho (PE)", "Pau-d'Arco (PA)", "Pau-d'Arco (TO)", "Pau d'Arco do Piauí (PI)", "Pau dos Ferros (RN)", "Pauini (AM)", "Paula Cândido (MG)", "Paula Freitas (PR)", "Paulicéia (SP)", "Paulínia (SP)", "Paulino Neves (MA)", "Paulista (PB)", "Paulista (PE)", "Paulistana (PI)", "Paulistânia (SP)", "Paulistas (MG)", "Paulo Afonso (BA)", "Paulo Bento (RS)", "Paulo de Faria (SP)", "Paulo Frontin (PR)", "Paulo Jacinto (AL)", "Paulo Lopes (SC)", "Paulo Ramos (MA)", "Pavão (MG)", "Paverama (RS)", "Pavussu (PI)", "Peabiru (PR)", "Peçanha (MG)", "Pederneiras (SP)", "Pé de Serra (BA)", "Pedra (PE)", "Pedra Azul (MG)", "Pedra Bela (SP)", "Pedra Bonita (MG)", "Pedra Branca (CE)", "Pedra Branca (PB)", "Pedra Branca do Amapari (AP)", "Pedra do Anta (MG)", "Pedra do Indaiá (MG)", "Pedra Dourada (MG)", "Pedra Grande (RN)", "Pedra Lavrada (PB)", "Pedralva (MG)", "Pedra Mole (SE)", "Pedranópolis (SP)", "Pedrão (BA)", "Pedra Preta (MT)", "Pedra Preta (RN)", "Pedras Altas (RS)", "Pedras de Fogo (PB)", "Pedras de Maria da Cruz (MG)", "Pedras Grandes (SC)", "Pedregulho (SP)", "Pedreira (SP)", "Pedreiras (MA)", "Pedrinhas (SE)", "Pedrinhas Paulista (SP)", "Pedrinópolis (MG)", "Pedro Afonso (TO)", "Pedro Alexandre (BA)", "Pedro Avelino (RN)", "Pedro Canário (ES)", "Pedro de Toledo (SP)", "Pedro do Rosário (MA)", "Pedro Gomes (MS)", "Pedro II (PI)", "Pedro Laurentino (PI)", "Pedro Leopoldo (MG)", "Pedro Osório (RS)", "Pedro Régis (PB)", "Pedro Teixeira (MG)", "Pedro Velho (RN)", "Peixe (TO)", "Peixe-Boi (PA)", "Peixoto de Azevedo (MT)", "Pejuçara (RS)", "Pelotas (RS)", "Penaforte (CE)", "Penalva (MA)", "Penápolis (SP)", "Pendências (RN)", "Penedo (AL)", "Penha (SC)", "Pentecoste (CE)", "Pequeri (MG)", "Pequi (MG)", "Pequizeiro (TO)", "Perdigão (MG)", "Perdizes (MG)", "Perdões (MG)", "Pereira Barreto (SP)", "Pereiras (SP)", "Pereiro (CE)", "Peri Mirim (MA)", "Periquito (MG)", "Peritiba (SC)", "Peritoró (MA)", "Perobal (PR)", "Pérola (PR)", "Pérola d'Oeste (PR)", "Perolândia (GO)", "Peruíbe (SP)", "Pescador (MG)", "Pescaria Brava (SC)", "Pesqueira (PE)", "Petrolândia (PE)", "Petrolândia (SC)", "Petrolina (PE)", "Petrolina de Goiás (GO)", "Petrópolis (RJ)", "Piaçabuçu (AL)", "Piacatu (SP)", "Piancó (PB)", "Piatã (BA)", "Piau (MG)", "Picada Café (RS)", "Piçarra (PA)", "Picos (PI)", "Picuí (PB)", "Piedade (SP)", "Piedade de Caratinga (MG)", "Piedade de Ponte Nova (MG)", "Piedade do Rio Grande (MG)", "Piedade dos Gerais (MG)", "Piên (PR)", "Pilão Arcado (BA)", "Pilar (AL)", "Pilar (PB)", "Pilar de Goiás (GO)", "Pilar do Sul (SP)", "Pilões (PB)", "Pilões (RN)", "Pilõezinhos (PB)", "Pimenta (MG)", "Pimenta Bueno (RO)", "Pimenteiras (PI)", "Pimenteiras do Oeste (RO)", "Pindaí (BA)", "Pindamonhangaba (SP)", "Pindaré-Mirim (MA)", "Pindoba (AL)", "Pindobaçu (BA)", "Pindorama (SP)", "Pindorama do Tocantins (TO)", "Pindoretama (CE)", "Pingo-d'Água (MG)", "Pinhais (PR)", "Pinhal (RS)", "Pinhalão (PR)", "Pinhal da Serra (RS)", "Pinhal de São Bento (PR)", "Pinhal Grande (RS)", "Pinhalzinho (SC)", "Pinhalzinho (SP)", "Pinhão (PR)", "Pinhão (SE)", "Pinheiral (RJ)", "Pinheirinho do Vale (RS)", "Pinheiro (MA)", "Pinheiro Machado (RS)", "Pinheiro Preto (SC)", "Pinheiros (ES)", "Pintadas (BA)", "Pinto Bandeira (RS)", "Pintópolis (MG)", "Pio IX (PI)", "Pio XII (MA)", "Piquerobi (SP)", "Piquet Carneiro (CE)", "Piquete (SP)", "Piracaia (SP)", "Piracanjuba (GO)", "Piracema (MG)", "Piracicaba (SP)", "Piracuruca (PI)", "Piraí (RJ)", "Piraí do Norte (BA)", "Piraí do Sul (PR)", "Piraju (SP)", "Pirajuba (MG)", "Pirajuí (SP)", "Pirambu (SE)", "Piranga (MG)", "Pirangi (SP)", "Piranguçu (MG)", "Piranguinho (MG)", "Piranhas (AL)", "Piranhas (GO)", "Pirapemas (MA)", "Pirapetinga (MG)", "Pirapó (RS)", "Pirapora (MG)", "Pirapora do Bom Jesus (SP)", "Pirapozinho (SP)", "Piraquara (PR)", "Piraquê (TO)", "Pirassununga (SP)", "Piratini (RS)", "Piratininga (SP)", "Piratuba (SC)", "Piraúba (MG)", "Pirenópolis (GO)", "Pires do Rio (GO)", "Pires Ferreira (CE)", "Piripá (BA)", "Piripiri (PI)", "Piritiba (BA)", "Pirpirituba (PB)", "Pitanga (PR)", "Pitangueiras (PR)", "Pitangueiras (SP)", "Pitangui (MG)", "Pitimbu (PB)", "Pium (TO)", "Piúma (ES)", "Piumhi (MG)", "Placas (PA)", "Plácido de Castro (AC)", "Planaltina (GO)", "Planaltina do Paraná (PR)", "Planaltino (BA)", "Planalto (BA)", "Planalto (PR)", "Planalto (RS)", "Planalto (SP)", "Planalto Alegre (SC)", "Planalto da Serra (MT)", "Planura (MG)", "Platina (SP)", "Poá (SP)", "Poção (PE)", "Poção de Pedras (MA)", "Pocinhos (PB)", "Poço Branco (RN)", "Poço Dantas (PB)", "Poço das Antas (RS)", "Poço das Trincheiras (AL)", "Poço de José de Moura (PB)", "Poções (BA)", "Poço Fundo (MG)", "Poconé (MT)", "Poço Redondo (SE)", "Poços de Caldas (MG)", "Poço Verde (SE)", "Pocrane (MG)", "Pojuca (BA)", "Poloni (SP)", "Pombal (PB)", "Pombos (PE)", "Pomerode (SC)", "Pompeia (SP)", "Pompéu (MG)", "Pongaí (SP)", "Ponta de Pedras (PA)", "Ponta Grossa (PR)", "Pontal (SP)", "Pontal do Araguaia (MT)", "Pontal do Paraná (PR)", "Pontalina (GO)", "Pontalinda (SP)", "Pontão (RS)", "Ponta Porã (MS)", "Ponte Alta (SC)", "Ponte Alta do Bom Jesus (TO)", "Ponte Alta do Norte (SC)", "Ponte Alta do Tocantins (TO)", "Ponte Branca (MT)", "Ponte Nova (MG)", "Ponte Preta (RS)", "Pontes e Lacerda (MT)", "Ponte Serrada (SC)", "Pontes Gestal (SP)", "Ponto Belo (ES)", "Ponto Chique (MG)", "Ponto dos Volantes (MG)", "Ponto Novo (BA)", "Populina (SP)", "Porangaba (SP)", "Poranga (CE)", "Porangatu (GO)", "Porciúncula (RJ)", "Porecatu (PR)", "Portalegre (RN)", "Portão (RS)", "Porteirão (GO)", "Porteiras (CE)", "Porteirinha (MG)", "Portel (PA)", "Portelândia (GO)", "Porto (PI)", "Porto Acre (AC)", "Porto Alegre (RS)", "Porto Alegre do Norte (MT)", "Porto Alegre do Piauí (PI)", "Porto Alegre do Tocantins (TO)", "Porto Amazonas (PR)", "Porto Barreiro (PR)", "Porto Belo (SC)", "Porto Calvo (AL)", "Porto da Folha (SE)", "Porto de Moz (PA)", "Porto de Pedras (AL)", "Porto do Mangue (RN)", "Porto dos Gaúchos (MT)", "Porto Esperidião (MT)", "Porto Estrela (MT)", "Porto Feliz (SP)", "Porto Ferreira (SP)", "Porto Firme (MG)", "Porto Franco (MA)", "Porto Grande (AP)", "Porto Lucena (RS)", "Porto Mauá (RS)", "Porto Murtinho (MS)", "Porto Nacional (TO)", "Porto Real (RJ)", "Porto Real do Colégio (AL)", "Porto Rico (PR)", "Porto Rico do Maranhão (MA)", "Porto Seguro (BA)", "Porto União (SC)", "Porto Velho (RO)", "Porto Vera Cruz (RS)", "Porto Vitória (PR)", "Porto Walter (AC)", "Porto Xavier (RS)", "Posse (GO)", "Poté (MG)", "Potengi (CE)", "Potim (SP)", "Potiraguá (BA)", "Potirendaba (SP)", "Potiretama (CE)", "Pouso Alegre (MG)", "Pouso Alto (MG)", "Pouso Novo (RS)", "Pouso Redondo (SC)", "Poxoréu (MT)", "Pracinha (SP)", "Pracuúba (AP)", "Prado (BA)", "Prado Ferreira (PR)", "Pradópolis (SP)", "Prados (MG)", "Praia Grande (SC)", "Praia Grande (SP)", "Praia Norte (TO)", "Prainha (PA)", "Pranchita (PR)", "Prata (MG)", "Prata (PB)", "Prata do Piauí (PI)", "Pratânia (SP)", "Pratápolis (MG)", "Pratinha (MG)", "Presidente Alves (SP)", "Presidente Bernardes (MG)", "Presidente Bernardes (SP)", "Presidente Castelo Branco (PR)", "Presidente Castello Branco (SC)", "Presidente Dutra (BA)", "Presidente Dutra (MA)", "Presidente Epitácio (SP)", "Presidente Figueiredo (AM)", "Presidente Getúlio (SC)", "Presidente Jânio Quadros (BA)", "Presidente Juscelino (MA)", "Presidente Juscelino (MG)", "Presidente Kennedy (ES)", "Presidente Kennedy (TO)", "Presidente Kubitschek (MG)", "Presidente Lucena (RS)", "Presidente Médici (MA)", "Presidente Médici (RO)", "Presidente Nereu (SC)", "Presidente Olegário (MG)", "Presidente Prudente (SP)", "Presidente Sarney (MA)", "Presidente Tancredo Neves (BA)", "Presidente Vargas (MA)", "Presidente Venceslau (SP)", "Primavera (PA)", "Primavera (PE)", "Primavera de Rondônia (RO)", "Primavera do Leste (MT)", "Primeira Cruz (MA)", "Primeiro de Maio (PR)", "Princesa (SC)", "Princesa Isabel (PB)", "Professor Jamil (GO)", "Progresso (RS)", "Promissão (SP)", "Propriá (SE)", "Protásio Alves (RS)", "Prudente de Morais (MG)", "Prudentópolis (PR)", "Pugmil (TO)", "Pureza (RN)", "Putinga (RS)", "Puxinanã (PB)", "Quadra (SP)", "Quaraí (RS)", "Quartel Geral (MG)", "Quarto Centenário (PR)", "Quatá (SP)", "Quatiguá (PR)", "Quatipuru (PA)", "Quatis (RJ)", "Quatro Barras (PR)", "Quatro Irmãos (RS)", "Quatro Pontes (PR)", "Quebrangulo (AL)", "Quedas do Iguaçu (PR)", "Queimada Nova (PI)", "Queimadas (BA)", "Queimadas (PB)", "Queimados (RJ)", "Queiroz (SP)", "Queluzito (MG)", "Queluz (SP)", "Querência do Norte (PR)", "Querência (MT)", "Quevedos (RS)", "Quijingue (BA)", "Quilombo (SC)", "Quinta do Sol (PR)", "Quintana (SP)", "Quinze de Novembro (RS)", "Quipapá (PE)", "Quirinópolis (GO)", "Quissamã (RJ)", "Quitandinha (PR)", "Quiterianópolis (CE)", "Quixaba (PB)", "Quixaba (PE)", "Quixabeira (BA)", "Quixadá (CE)", "Quixelô (CE)", "Quixeramobim (CE)", "Quixeré (CE)", "Rafael Fernandes (RN)", "Rafael Godeiro (RN)", "Rafael Jambeiro (BA)", "Rafard (SP)", "Ramilândia (PR)", "Rancharia (SP)", "Rancho Alegre d'Oeste (PR)", "Rancho Alegre (PR)", "Rancho Queimado (SC)", "Raposa (MA)", "Raposos (MG)", "Raul Soares (MG)", "Realeza (PR)", "Rebouças (PR)", "Recife (PE)", "Recreio (MG)", "Recursolândia (TO)", "Redenção (CE)", "Redenção (PA)", "Redenção da Serra (SP)", "Redenção do Gurgueia (PI)", "Redentora (RS)", "Reduto (MG)", "Regeneração (PI)", "Regente Feijó (SP)", "Reginópolis (SP)", "Registro (SP)", "Relvado (RS)", "Remanso (BA)", "Remígio (PB)", "Renascença (PR)", "Reriutaba (CE)", "Resende (RJ)", "Resende Costa (MG)", "Reserva do Cabaçal (MT)", "Reserva do Iguaçu (PR)", "Reserva (PR)", "Resplendor (MG)", "Ressaquinha (MG)", "Restinga (SP)", "Restinga Sêca (RS)", "Retirolândia (BA)", "Riachão (MA)", "Riachão (PB)", "Riachão das Neves (BA)", "Riachão do Bacamarte (PB)", "Riachão do Dantas (SE)", "Riachão do Jacuípe (BA)", "Riachão do Poço (PB)", "Riachinho (MG)", "Riachinho (TO)", "Riacho da Cruz (RN)", "Riacho das Almas (PE)", "Riacho de Santana (BA)", "Riacho de Santana (RN)", "Riacho de Santo Antônio (PB)", "Riacho dos Cavalos (PB)", "Riacho dos Machados (MG)", "Riacho Frio (PI)", "Riachuelo (RN)", "Riachuelo (SE)", "Rialma (GO)", "Rianápolis (GO)", "Ribamar Fiquene (MA)", "Ribas do Rio Pardo (MS)", "Ribeira (SP)", "Ribeira do Amparo (BA)", "Ribeira do Piauí (PI)", "Ribeira do Pombal (BA)", "Ribeirão (PE)", "Ribeirão Bonito (SP)", "Ribeirão Branco (SP)", "Ribeirão Cascalheira (MT)", "Ribeirão Claro (PR)", "Ribeirão Corrente (SP)", "Ribeirão das Neves (MG)", "Ribeirão do Largo (BA)", "Ribeirão do Pinhal (PR)", "Ribeirão dos Índios (SP)", "Ribeirão do Sul (SP)", "Ribeirão Grande (SP)", "Ribeirão Pires (SP)", "Ribeirão Preto (SP)", "Ribeirão Vermelho (MG)", "Ribeirãozinho (MT)", "Ribeiro Gonçalves (PI)", "Ribeirópolis (SE)", "Rifaina (SP)", "Rincão (SP)", "Rinópolis (SP)", "Rio Acima (MG)", "Rio Azul (PR)", "Rio Bananal (ES)", "Rio Bom (PR)", "Rio Bonito (RJ)", "Rio Bonito do Iguaçu (PR)", "Rio Branco (AC)", "Rio Branco (MT)", "Rio Branco do Ivaí (PR)", "Rio Branco do Sul (PR)", "Rio Brilhante (MS)", "Rio Casca (MG)", "Rio Claro (RJ)", "Rio Claro (SP)", "Rio Crespo (RO)", "Rio da Conceição (TO)", "Rio das Antas (SC)", "Rio das Flores (RJ)", "Rio das Ostras (RJ)", "Rio das Pedras (SP)", "Rio de Contas (BA)", "Rio de Janeiro (RJ)", "Rio do Antônio (BA)", "Rio do Campo (SC)", "Rio Doce (MG)", "Rio do Fogo (RN)", "Rio do Oeste (SC)", "Rio do Pires (BA)", "Rio do Prado (MG)", "Rio dos Bois (TO)", "Rio dos Cedros (SC)", "Rio dos Índios (RS)", "Rio do Sul (SC)", "Rio Espera (MG)", "Rio Formoso (PE)", "Rio Fortuna (SC)", "Rio Grande (RS)", "Rio Grande da Serra (SP)", "Rio Grande do Piauí (PI)", "Riolândia (SP)", "Rio Largo (AL)", "Rio Manso (MG)", "Rio Maria (PA)", "Rio Negrinho (SC)", "Rio Negro (MS)", "Rio Negro (PR)", "Rio Novo (MG)", "Rio Novo do Sul (ES)", "Rio Paranaíba (MG)", "Rio Pardo (RS)", "Rio Pardo de Minas (MG)", "Rio Piracicaba (MG)", "Rio Pomba (MG)", "Rio Preto (MG)", "Rio Preto da Eva (AM)", "Rio Quente (GO)", "Rio Real (BA)", "Rio Rufino (SC)", "Rio Sono (TO)", "Rio Tinto (PB)", "Rio Verde (GO)", "Rio Verde de Mato Grosso (MS)", "Rio Vermelho (MG)", "Riozinho (RS)", "Riqueza (SC)", "Ritápolis (MG)", "Riversul (SP)", "Roca Sales (RS)", "Rochedo (MS)", "Rochedo de Minas (MG)", "Rodeio (SC)", "Rodeio Bonito (RS)", "Rodeiro (MG)", "Rodelas (BA)", "Rodolfo Fernandes (RN)", "Rodrigues Alves (AC)", "Rolador (RS)", "Rolândia (PR)", "Rolante (RS)", "Rolim de Moura (RO)", "Romaria (MG)", "Romelândia (SC)", "Roncador (PR)", "Ronda Alta (RS)", "Rondinha (RS)", "Rondolândia (MT)", "Rondon (PR)", "Rondon do Pará (PA)", "Rondonópolis (MT)", "Roque Gonzales (RS)", "Rorainópolis (RR)", "Rosana (SP)", "Rosário (MA)", "Rosário da Limeira (MG)", "Rosário do Catete (SE)", "Rosário do Ivaí (PR)", "Rosário do Sul (RS)", "Rosário Oeste (MT)", "Roseira (SP)", "Roteiro (AL)", "Rubelita (MG)", "Rubiácea (SP)", "Rubiataba (GO)", "Rubim (MG)", "Rubineia (SP)", "Rurópolis (PA)", "Russas (CE)", "Ruy Barbosa (BA)", "Ruy Barbosa (RN)", "Sabará (MG)", "Sabáudia (PR)", "Sabino (SP)", "Sabinópolis (MG)", "Saboeiro (CE)", "Sacramento (MG)", "Sagrada Família (RS)", "Sagres (SP)", "Sairé (PE)", "Saldanha Marinho (RS)", "Sales (SP)", "Sales Oliveira (SP)", "Salesópolis (SP)", "Salete (SC)", "Salgadinho (PB)", "Salgadinho (PE)", "Salgado (SE)", "Salgado de São Félix (PB)", "Salgado Filho (PR)", "Salgueiro (PE)", "Salinas (MG)", "Salinas da Margarida (BA)", "Salinópolis (PA)", "Salitre (CE)", "Salmourão (SP)", "Saloá (PE)", "Saltinho (SC)", "Saltinho (SP)", "Salto (SP)", "Salto da Divisa (MG)", "Salto de Pirapora (SP)", "Salto do Céu (MT)", "Salto do Itararé (PR)", "Salto do Jacuí (RS)", "Salto do Lontra (PR)", "Salto Grande (SP)", "Salto Veloso (SC)", "Salvador (BA)", "Salvador das Missões (RS)", "Salvador do Sul (RS)", "Salvaterra (PA)", "Sambaíba (MA)", "Sampaio (TO)", "Sananduva (RS)", "Sanclerlândia (GO)", "Sandolândia (TO)", "Sandovalina (SP)", "Sangão (SC)", "Sanharó (PE)", "Santa Adélia (SP)", "Santa Albertina (SP)", "Santa Amélia (PR)", "Santa Bárbara (BA)", "Santa Bárbara (MG)", "Santa Bárbara de Goiás (GO)", "Santa Bárbara d'Oeste (SP)", "Santa Bárbara do Leste (MG)", "Santa Bárbara do Monte Verde (MG)", "Santa Bárbara do Pará (PA)", "Santa Bárbara do Sul (RS)", "Santa Bárbara do Tugúrio (MG)", "Santa Branca (SP)", "Santa Brígida (BA)", "Santa Carmem (MT)", "Santa Cecília (PB)", "Santa Cecília (SC)", "Santa Cecília do Pavão (PR)", "Santa Cecília do Sul (RS)", "Santa Clara d'Oeste (SP)", "Santa Clara do Sul (RS)", "Santa Cruz (PB)", "Santa Cruz (PE)", "Santa Cruz (RN)", "Santa Cruz Cabrália (BA)", "Santa Cruz da Baixa Verde (PE)", "Santa Cruz da Conceição (SP)", "Santa Cruz da Esperança (SP)", "Santa Cruz da Vitória (BA)", "Santa Cruz das Palmeiras (SP)", "Santa Cruz de Goiás (GO)", "Santa Cruz de Minas (MG)", "Santa Cruz de Monte Castelo (PR)", "Santa Cruz de Salinas (MG)", "Santa Cruz do Arari (PA)", "Santa Cruz do Capibaribe (PE)", "Santa Cruz do Escalvado (MG)", "Santa Cruz do Piauí (PI)", "Santa Cruz do Rio Pardo (SP)", "Santa Cruz do Sul (RS)", "Santa Cruz do Xingu (MT)", "Santa Cruz dos Milagres (PI)", "Santa Efigênia de Minas (MG)", "Santa Ernestina (SP)", "Santa Fé (PR)", "Santa Fé de Goiás (GO)", "Santa Fé de Minas (MG)", "Santa Fé do Araguaia (TO)", "Santa Fé do Sul (SP)", "Santa Filomena (PE)", "Santa Filomena (PI)", "Santa Filomena do Maranhão (MA)", "Santa Gertrudes (SP)", "Santa Helena (MA)", "Santa Helena (PB)", "Santa Helena (PR)", "Santa Helena (SC)", "Santa Helena de Goiás (GO)", "Santa Helena de Minas (MG)", "Santa Inês (BA)", "Santa Inês (MA)", "Santa Inês (PB)", "Santa Inês (PR)", "Santa Isabel (GO)", "Santa Isabel (SP)", "Santa Isabel do Ivaí (PR)", "Santa Izabel do Pará (PA)", "Santa Isabel do Rio Negro (AM)", "Santa Izabel do Oeste (PR)", "Santa Juliana (MG)", "Santa Leopoldina (ES)", "Santa Lúcia (PR)", "Santa Lúcia (SP)", "Santaluz (BA)", "Santa Luz (PI)", "Santa Luzia (BA)", "Santa Luzia (MA)", "Santa Luzia (MG)", "Santa Luzia (PB)", "Santa Luzia d'Oeste (RO)", "Santa Luzia do Itanhi (SE)", "Santa Luzia do Norte (AL)", "Santa Luzia do Pará (PA)", "Santa Luzia do Paruá (MA)", "Santa Margarida (MG)", "Santa Margarida do Sul (RS)", "Santa Maria (RN)", "Santa Maria (RS)", "Santa Maria da Boa Vista (PE)", "Santa Maria das Barreiras (PA)", "Santa Maria da Serra (SP)", "Santa Maria da Vitória (BA)", "Santa Maria de Itabira (MG)", "Santa Maria do Cambucá (PE)", "Santa Maria do Herval (RS)", "Santa Maria de Jetibá (ES)", "Santa Maria do Oeste (PR)", "Santa Maria do Pará (PA)", "Santa Maria do Salto (MG)", "Santa Maria do Suaçuí (MG)", "Santa Maria do Tocantins (TO)", "Santa Maria Madalena (RJ)", "Santa Mariana (PR)", "Santa Mercedes (SP)", "Santa Mônica (PR)", "Santana (AP)", "Santana (BA)", "Santana da Boa Vista (RS)", "Santana da Ponte Pensa (SP)", "Santana da Vargem (MG)", "Santana de Cataguases (MG)", "Santana de Mangueira (PB)", "Santana de Parnaíba (SP)", "Santana de Pirapama (MG)", "Santana do Acaraú (CE)", "Santana do Araguaia (PA)", "Santana do Cariri (CE)", "Santana do Deserto (MG)", "Santana do Garambéu (MG)", "Santana do Ipanema (AL)", "Santana do Itararé (PR)", "Santana do Jacaré (MG)", "Sant'Ana do Livramento (RS)", "Santana do Manhuaçu (MG)", "Santana do Maranhão (MA)", "Santana do Matos (RN)", "Santana do Mundaú (AL)", "Santana do Paraíso (MG)", "Santana do Piauí (PI)", "Santana do Riacho (MG)", "Santana do São Francisco (SE)", "Santana do Seridó (RN)", "Santana dos Garrotes (PB)", "Santana dos Montes (MG)", "Santanópolis (BA)", "Santa Quitéria (CE)", "Santa Quitéria do Maranhão (MA)", "Santarém (PA)", "Santarém Novo (PA)", "Santa Rita (MA)", "Santa Rita (PB)", "Santa Rita de Caldas (MG)", "Santa Rita de Cássia (BA)", "Santa Rita de Jacutinga (MG)", "Santa Rita de Minas (MG)", "Santa Rita do Araguaia (GO)", "Santa Rita d'Oeste (SP)", "Santa Rita de Ibitipoca (MG)", "Santa Rita do Itueto (MG)", "Santa Rita do Novo Destino (GO)", "Santa Rita do Pardo (MS)", "Santa Rita do Passa Quatro (SP)", "Santa Rita do Sapucaí (MG)", "Santa Rita do Tocantins (TO)", "Santa Rita do Trivelato (MT)", "Santa Rosa (RS)", "Santa Rosa da Serra (MG)", "Santa Rosa de Goiás (GO)", "Santa Rosa de Lima (SC)", "Santa Rosa de Lima (SE)", "Santa Rosa de Viterbo (SP)", "Santa Rosa do Piauí (PI)", "Santa Rosa do Purus (AC)", "Santa Rosa do Sul (SC)", "Santa Rosa do Tocantins (TO)", "Santa Salete (SP)", "Santa Teresa (ES)", "Santa Teresinha (BA)", "Santa Tereza (RS)", "Santa Tereza de Goiás (GO)", "Santa Tereza do Oeste (PR)", "Santa Tereza do Tocantins (TO)", "Santa Terezinha (MT)", "Santa Terezinha (PB)", "Santa Terezinha (PE)", "Santa Terezinha (SC)", "Santa Terezinha de Goiás (GO)", "Santa Terezinha de Itaipu (PR)", "Santa Terezinha do Progresso (SC)", "Santa Terezinha do Tocantins (TO)", "Santa Vitória (MG)", "Santa Vitória do Palmar (RS)", "Santiago (RS)", "Santiago do Sul (SC)", "Santo Afonso (MT)", "Santo Amaro (BA)", "Santo Amaro da Imperatriz (SC)", "Santo Amaro das Brotas (SE)", "Santo Amaro do Maranhão (MA)", "Santo Anastácio (SP)", "Santo André (PB)", "Santo André (SP)", "Santo Ângelo (RS)", "Santo Antônio (RN)", "Santo Antônio da Alegria (SP)", "Santo Antônio da Barra (GO)", "Santo Antônio da Patrulha (RS)", "Santo Antônio da Platina (PR)", "Santo Antônio das Missões (RS)", "Santo Antônio de Goiás (GO)", "Santo Antônio de Jesus (BA)", "Santo Antônio de Lisboa (PI)", "Santo Antônio de Pádua (RJ)", "Santo Antônio de Posse (SP)", "Santo Antônio do Amparo (MG)", "Santo Antônio do Aracanguá (SP)", "Santo Antônio do Aventureiro (MG)", "Santo Antônio do Caiuá (PR)", "Santo Antônio do Descoberto (GO)", "Santo Antônio do Grama (MG)", "Santo Antônio do Içá (AM)", "Santo Antônio do Itambé (MG)", "Santo Antônio do Jacinto (MG)", "Santo Antônio do Jardim (SP)", "Santo Antônio do Leste (MT)", "Santo Antônio de Leverger (MT)", "Santo Antônio do Monte (MG)", "Santo Antônio do Palma (RS)", "Santo Antônio do Paraíso (PR)", "Santo Antônio do Pinhal (SP)", "Santo Antônio do Planalto (RS)", "Santo Antônio do Retiro (MG)", "Santo Antônio do Rio Abaixo (MG)", "Santo Antônio dos Lopes (MA)", "Santo Antônio dos Milagres (PI)", "Santo Antônio do Sudoeste (PR)", "Santo Antônio do Tauá (PA)", "Santo Augusto (RS)", "Santo Cristo (RS)", "Santo Estêvão (BA)", "Santo Expedito (SP)", "Santo Expedito do Sul (RS)", "Santo Hipólito (MG)", "Santo Inácio (PR)", "Santo Inácio do Piauí (PI)", "Santópolis do Aguapeí (SP)", "Santos (SP)", "Santos Dumont (MG)", "São Benedito (CE)", "São Benedito do Rio Preto (MA)", "São Benedito do Sul (PE)", "São Bento (MA)", "São Bento (PB)", "São Bento Abade (MG)", "São Bento de Pombal (PB)", "São Bento do Norte (RN)", "São Bento do Sapucaí (SP)", "São Bento do Sul (SC)", "São Bento do Tocantins (TO)", "São Bento do Trairi (RN)", "São Bento do Una (PE)", "São Bernardino (SC)", "São Bernardo (MA)", "São Bernardo do Campo (SP)", "São Bonifácio (SC)", "São Borja (RS)", "São Brás (AL)", "São Brás do Suaçuí (MG)", "São Braz do Piauí (PI)", "São Caetano (PE)", "São Caetano de Odivelas (PA)", "São Caetano do Sul (SP)", "São Carlos (SC)", "São Carlos (SP)", "São Carlos do Ivaí (PR)", "São Cristóvão (SE)", "São Cristóvão do Sul (SC)", "São Desidério (BA)", "São Domingos (BA)", "São Domingos (GO)", "São Domingos (PB)", "São Domingos (SC)", "São Domingos (SE)", "São Domingos das Dores (MG)", "São Domingos do Araguaia (PA)", "São Domingos do Azeitão (MA)", "São Domingos do Capim (PA)", "São Domingos do Cariri (PB)", "São Domingos do Maranhão (MA)", "São Domingos do Norte (ES)", "São Domingos do Prata (MG)", "São Domingos do Sul (RS)", "São Felipe (BA)", "São Felipe d'Oeste (RO)", "São Félix (BA)", "São Félix de Balsas (MA)", "São Félix de Minas (MG)", "São Félix do Araguaia (MT)", "São Félix do Coribe (BA)", "São Félix do Piauí (PI)", "São Félix do Tocantins (TO)", "São Félix do Xingu (PA)", "São Fernando (RN)", "São Fidélis (RJ)", "São Francisco (MG)", "São Francisco (PB)", "São Francisco (SE)", "São Francisco (SP)", "São Francisco de Assis (RS)", "São Francisco de Assis do Piauí (PI)", "São Francisco de Goiás (GO)", "São Francisco de Itabapoana (RJ)", "São Francisco de Paula (MG)", "São Francisco de Paula (RS)", "São Francisco de Sales (MG)", "São Francisco do Brejão (MA)", "São Francisco do Conde (BA)", "São Francisco do Glória (MG)", "São Francisco do Guaporé (RO)", "São Francisco do Maranhão (MA)", "São Francisco do Oeste (RN)", "São Francisco do Pará (PA)", "São Francisco do Piauí (PI)", "São Francisco do Sul (SC)", "São Gabriel (BA)", "São Gabriel (RS)", "São Gabriel da Cachoeira (AM)", "São Gabriel da Palha (ES)", "São Gabriel do Oeste (MS)", "São Geraldo (MG)", "São Geraldo da Piedade (MG)", "São Geraldo do Araguaia (PA)", "São Geraldo do Baixio (MG)", "São Gonçalo (RJ)", "São Gonçalo do Abaeté (MG)", "São Gonçalo do Amarante (CE)", "São Gonçalo do Amarante (RN)", "São Gonçalo do Gurgueia (PI)", "São Gonçalo do Pará (MG)", "São Gonçalo do Piauí (PI)", "São Gonçalo do Rio Abaixo (MG)", "São Gonçalo do Rio Preto (MG)", "São Gonçalo do Sapucaí (MG)", "São Gonçalo dos Campos (BA)", "São Gotardo (MG)", "São Jerônimo (RS)", "São Jerônimo da Serra (PR)", "São João (PE)", "São João (PR)", "São João Batista (MA)", "São João Batista (SC)", "São João Batista do Glória (MG)", "São João da Baliza (RR)", "São João da Barra (RJ)", "São João da Boa Vista (SP)", "São João da Canabrava (PI)", "São João da Fronteira (PI)", "São João da Lagoa (MG)", "São João d'Aliança (GO)", "São João da Mata (MG)", "São João da Paraúna (GO)", "São João da Ponta (PA)", "São João da Ponte (MG)", "São João das Duas Pontes (SP)", "São João da Serra (PI)", "São João das Missões (MG)", "São João da Urtiga (RS)", "São João da Varjota (PI)", "São João de Iracema (SP)", "São João del-Rei (MG)", "São João de Meriti (RJ)", "São João de Pirabas (PA)", "São João do Araguaia (PA)", "São João do Arraial (PI)", "São João do Caiuá (PR)", "São João do Cariri (PB)", "São João do Caru (MA)", "São João do Itaperiú (SC)", "São João do Ivaí (PR)", "São João do Jaguaribe (CE)", "São João do Manhuaçu (MG)", "São João do Manteninha (MG)", "São João do Oeste (SC)", "São João do Oriente (MG)", "São João do Pacuí (MG)", "São João do Paraíso (MA)", "São João do Paraíso (MG)", "São João do Pau-d'Alho (SP)", "São João do Piauí (PI)", "São João do Polêsine (RS)", "São João do Rio do Peixe (PB)", "São João do Sabugi (RN)", "São João do Soter (MA)", "São João dos Patos (MA)", "São João do Sul (SC)", "São João do Tigre (PB)", "São João do Triunfo (PR)", "São João Evangelista (MG)", "São João Nepomuceno (MG)", "São Joaquim (SC)", "São Joaquim da Barra (SP)", "São Joaquim de Bicas (MG)", "São Joaquim do Monte (PE)", "São Jorge (RS)", "São Jorge d'Oeste (PR)", "São Jorge do Ivaí (PR)", "São Jorge do Patrocínio (PR)", "São José (SC)", "São José da Barra (MG)", "São José da Bela Vista (SP)", "São José da Boa Vista (PR)", "São José da Coroa Grande (PE)", "São José da Lagoa Tapada (PB)", "São José da Laje (AL)", "São José da Lapa (MG)", "São José da Safira (MG)", "São José das Missões (RS)", "São José das Palmeiras (PR)", "São José da Tapera (AL)", "São José da Varginha (MG)", "São José da Vitória (BA)", "São José de Caiana (PB)", "São José de Espinharas (PB)", "São José de Mipibu (RN)", "São José de Piranhas (PB)", "São José de Princesa (PB)", "São José de Ribamar (MA)", "São José de Ubá (RJ)", "São José do Alegre (MG)", "São José do Barreiro (SP)", "São José do Belmonte (PE)", "São José do Bonfim (PB)", "São José do Brejo do Cruz (PB)", "São José do Calçado (ES)", "São José do Campestre (RN)", "São José do Cedro (SC)", "São José do Cerrito (SC)", "São José do Divino (MG)", "São José do Divino (PI)", "São José do Egito (PE)", "São José do Goiabal (MG)", "São José do Herval (RS)", "São José do Hortêncio (RS)", "São José do Inhacorá (RS)", "São José do Jacuípe (BA)", "São José do Jacuri (MG)", "São José do Mantimento (MG)", "São José do Norte (RS)", "São José do Ouro (RS)", "São José do Peixe (PI)", "São José do Piauí (PI)", "São José do Povo (MT)", "São José do Rio Claro (MT)", "São José do Rio Pardo (SP)", "São José do Rio Preto (SP)", "São José do Sabugi (PB)", "São José dos Ausentes (RS)", "São José dos Basílios (MA)", "São José dos Campos (SP)", "São José dos Cordeiros (PB)", "São José do Seridó (RN)", "São José dos Pinhais (PR)", "São José dos Quatro Marcos (MT)", "São José dos Ramos (PB)", "São José do Sul (RS)", "São José do Vale do Rio Preto (RJ)", "São José do Xingu (MT)", "São Julião (PI)", "São Leopoldo (RS)", "São Lourenço (MG)", "São Lourenço da Mata (PE)", "São Lourenço da Serra (SP)", "São Lourenço do Oeste (SC)", "São Lourenço do Piauí (PI)", "São Lourenço do Sul (RS)", "São Ludgero (SC)", "São Luís (MA)", "São Luís de Montes Belos (GO)", "São Luís do Curu (CE)", "São Luiz do Norte (GO)", "São Luís do Piauí (PI)", "São Luís do Quitunde (AL)", "São Luiz (RR)", "São Luiz do Paraitinga (SP)", "São Luiz Gonzaga (RS)", "São Luís Gonzaga do Maranhão (MA)", "São Mamede (PB)", "São Manoel do Paraná (PR)", "São Manuel (SP)", "São Marcos (RS)", "São Martinho (RS)", "São Martinho (SC)", "São Martinho da Serra (RS)", "São Mateus (ES)", "São Mateus do Maranhão (MA)", "São Mateus do Sul (PR)", "São Miguel (RN)", "São Miguel Arcanjo (SP)", "São Miguel da Baixa Grande (PI)", "São Miguel da Boa Vista (SC)", "São Miguel das Matas (BA)", "São Miguel das Missões (RS)", "São Miguel de Taipu (PB)", "São Miguel do Aleixo (SE)", "São Miguel do Anta (MG)", "São Miguel do Araguaia (GO)", "São Miguel do Fidalgo (PI)", "São Miguel do Gostoso (RN)", "São Miguel do Guamá (PA)", "São Miguel do Guaporé (RO)", "São Miguel do Iguaçu (PR)", "São Miguel do Oeste (SC)", "São Miguel do Passa-Quatro (GO)", "São Miguel dos Campos (AL)", "São Miguel dos Milagres (AL)", "São Miguel do Tapuio (PI)", "São Miguel do Tocantins (TO)", "São Nicolau (RS)", "São Patrício (GO)", "São Paulo (SP)", "São Paulo das Missões (RS)", "São Paulo de Olivença (AM)", "São Paulo do Potengi (RN)", "São Pedro (RN)", "São Pedro (SP)", "São Pedro da Água Branca (MA)", "São Pedro da Aldeia (RJ)", "São Pedro da Cipa (MT)", "São Pedro da Serra (RS)", "São Pedro das Missões (RS)", "São Pedro da União (MG)", "São Pedro de Alcântara (SC)", "São Pedro do Butiá (RS)", "São Pedro do Iguaçu (PR)", "São Pedro do Ivaí (PR)", "São Pedro do Paraná (PR)", "São Pedro do Piauí (PI)", "São Pedro dos Crentes (MA)", "São Pedro dos Ferros (MG)", "São Pedro do Suaçuí (MG)", "São Pedro do Sul (RS)", "São Pedro do Turvo (SP)", "São Rafael (RN)", "São Raimundo das Mangabeiras (MA)", "São Raimundo do Doca Bezerra (MA)", "São Raimundo Nonato (PI)", "São Roberto (MA)", "São Romão (MG)", "São Roque (SP)", "São Roque de Minas (MG)", "São Roque do Canaã (ES)", "São Salvador do Tocantins (TO)", "São Sebastião (AL)", "São Sebastião (SP)", "São Sebastião da Amoreira (PR)", "São Sebastião da Bela Vista (MG)", "São Sebastião da Boa Vista (PA)", "São Sebastião da Grama (SP)", "São Sebastião da Vargem Alegre (MG)", "São Sebastião de Lagoa de Roça (PB)", "São Sebastião do Alto (RJ)", "São Sebastião do Anta (MG)", "São Sebastião do Caí (RS)", "São Sebastião do Maranhão (MG)", "São Sebastião do Oeste (MG)", "São Sebastião do Paraíso (MG)", "São Sebastião do Passé (BA)", "São Sebastião do Rio Preto (MG)", "São Sebastião do Rio Verde (MG)", "São Sebastião do Tocantins (TO)", "São Sebastião do Uatumã (AM)", "São Sebastião do Umbuzeiro (PB)", "São Sepé (RS)", "São Simão (GO)", "São Simão (SP)", "São Tomé das Letras (MG)", "São Tiago (MG)", "São Tomás de Aquino (MG)", "São Tomé (PR)", "São Tomé (RN)", "São Valentim (RS)", "São Valentim do Sul (RS)", "São Valério (TO)", "São Valério do Sul (RS)", "São Vendelino (RS)", "São Vicente (RN)", "São Vicente (SP)", "São Vicente de Minas (MG)", "São Vicente do Seridó (PB)", "São Vicente do Sul (RS)", "São Vicente Ferrer (MA)", "São Vicente Férrer (PE)", "Sapé (PB)", "Sapeaçu (BA)", "Sapezal (MT)", "Sapiranga (RS)", "Sapopema (PR)", "Sapucaia (PA)", "Sapucaia (RJ)", "Sapucaia do Sul (RS)", "Sapucaí-Mirim (MG)", "Saquarema (RJ)", "Sarandi (PR)", "Sarandi (RS)", "Sarapuí (SP)", "Sardoá (MG)", "Sarutaiá (SP)", "Sarzedo (MG)", "Sátiro Dias (BA)", "Satuba (AL)", "Satubinha (MA)", "Saubara (BA)", "Saudade do Iguaçu (PR)", "Saudades (SC)", "Saúde (BA)", "Schroeder (SC)", "Seabra (BA)", "Seara (SC)", "Sebastianópolis do Sul (SP)", "Sebastião Barros (PI)", "Sebastião Laranjeiras (BA)", "Sebastião Leal (PI)", "Seberi (RS)", "Sede Nova (RS)", "Segredo (RS)", "Selbach (RS)", "Selvíria (MS)", "Sem-Peixe (MG)", "Senador Alexandre Costa (MA)", "Senador Amaral (MG)", "Senador Canedo (GO)", "Senador Cortes (MG)", "Senador Elói de Souza (RN)", "Senador Firmino (MG)", "Senador Georgino Avelino (RN)", "Senador Guiomard (AC)", "Senador José Bento (MG)", "Senador José Porfírio (PA)", "Senador La Rocque (MA)", "Senador Modestino Gonçalves (MG)", "Senador Pompeu (CE)", "Senador Rui Palmeira (AL)", "Senador Sá (CE)", "Senador Salgado Filho (RS)", "Sena Madureira (AC)", "Sengés (PR)", "Senhora de Oliveira (MG)", "Senhora do Porto (MG)", "Senhora dos Remédios (MG)", "Senhor do Bonfim (BA)", "Sentinela do Sul (RS)", "Sento Sé (BA)", "Serafina Corrêa (RS)", "Sericita (MG", "Seringueiras (RO)", "Sério (RS)", "Seritinga (MG)", "Seropédica (RJ)", "Serra (ES)", "Serra Alta (SC)", "Serra Azul (SP)", "Serra Azul de Minas (MG)", "Serra Branca (PB)", "Serra Caiada (RN)", "Serra da Raiz (PB)", "Serra da Saudade (MG)", "Serra de São Bento (RN)", "Serra do Mel (RN)", "Serra do Navio (AP)", "Serra do Ramalho (BA)", "Serra dos Aimorés (MG)", "Serra do Salitre (MG)", "Serra Dourada (BA)", "Serra Grande (PB)", "Serrana (SP)", "Serrania (MG)", "Serra Negra (SP)", "Serra Negra do Norte (RN)", "Serrano do Maranhão (MA)", "Serranópolis (GO)", "Serranópolis de Minas (MG)", "Serranópolis do Iguaçu (PR)", "Serranos (MG)", "Serra Nova Dourada (MT)", "Serra Preta (BA)", "Serra Redonda (PB)", "Serraria (PB)", "Serra Talhada (PE)", "Serrinha (BA)", "Serrinha (RN)", "Serrinha dos Pintos (RN)", "Serrita (PE)", "Serro (MG)", "Serrolândia (BA)", "Sertaneja (PR)", "Sertânia (PE)", "Sertanópolis (PR)", "Sertão (RS)", "Sertão Santana (RS)", "Sertãozinho (PB)", "Sertãozinho (SP)", "Sete Barras (SP)", "Sete de Setembro (RS)", "Sete Lagoas (MG)", "Sete Quedas (MS)", "Setubinha (MG)", "Severiano de Almeida (RS)", "Severiano Melo (RN)", "Severínia (SP)", "Siderópolis (SC)", "Sidrolândia (MS)", "Sigefredo Pacheco (PI)", "Silva Jardim (RJ)", "Silvânia (GO)", "Silvanópolis (TO)", "Silveira Martins (RS)", "Silveirânia (MG)", "Silveiras (SP)", "Silves (AM)", "Silvianópolis (MG)", "Simão Dias (SE)", "Simão Pereira (MG)", "Simões (PI)", "Simões Filho (BA)", "Simolândia (GO)", "Simonésia (MG)", "Simplício Mendes (PI)", "Sinimbu (RS)", "Sinop (MT)", "Siqueira Campos (PR)", "Sirinhaém (PE)", "Siriri (SE)", "Sítio d'Abadia (GO)", "Sítio do Mato (BA)", "Sítio do Quinto (BA)", "Sítio Novo (MA)", "Sítio Novo (RN)", "Sítio Novo do Tocantins (TO)", "Sobradinho (BA)", "Sobradinho (RS)", "Sobrado (PB)", "Sobral (CE)", "Sobrália (MG)", "Socorro (SP)", "Socorro do Piauí (PI)", "Solânea (PB)", "Soledade (PB)", "Soledade (RS)", "Soledade de Minas (MG)", "Solidão (PE)", "Solonópole (CE)", "Sombrio (SC)", "Sonora (MS)", "Sooretama (ES)", "Sorocaba (SP)", "Sorriso (MT)", "Sossêgo (PB)", "Soure (PA)", "Sousa (PB)", "Souto Soares (BA)", "Sucupira (TO)", "Sucupira do Norte (MA)", "Sucupira do Riachão (MA)", "Sud Mennucci (SP)", "Sul Brasil (SC)", "Sulina (PR)", "Sumaré (SP)", "Sumé (PB)", "Sumidouro (RJ)", "Surubim (PE)", "Sussuapara (PI)", "Suzanápolis (SP)", "Suzano (SP)", "Tabaí (RS)", "Tabaporã (MT)", "Tabapuã (SP)", "Tabatinga (AM)", "Tabatinga (SP)", "Tabira (PE)", "Taboão da Serra (SP)", "Tabocão (TO)", "Tabocas do Brejo Velho (BA)", "Taboleiro Grande (RN)", "Tabuleiro do Norte (CE)", "Tabuleiro (MG)", "Tacaimbó (PE)", "Tacaratu (PE)", "Taciba (SP)", "Tacima (PB)", "Tacuru (MS)", "Taguaí (SP)", "Taguatinga (TO)", "Taiaçu (SP)", "Tailândia (PA)", "Taiobeiras (MG)", "Taió (SC)", "Taipas do Tocantins (TO)", "Taipu (RN)", "Taiuva (SP)", "Talismã (TO)", "Tamandaré (PE)", "Tamarana (PR)", "Tambaú (SP)", "Tamboara (PR)", "Tamboril (CE)", "Tamboril do Piauí (PI)", "Tanabi (SP)", "Tangará (RN)", "Tangará (SC)", "Tangará da Serra (MT)", "Tanguá (RJ)", "Tanhaçu (BA)", "Tanque d'Arca (AL)", "Tanque do Piauí (PI)", "Tanque Novo (BA)", "Tanquinho (BA)", "Taparuba (MG)", "Tapauá (AM)", "Tapejara (PR)", "Tapejara (RS)", "Tapera (RS)", "Taperoá (BA)", "Taperoá (PB)", "Tapes (RS)", "Tapira (MG)", "Tapira (PR)", "Tapiraí (MG)", "Tapiraí (SP)", "Tapiramutá (BA)", "Tapiratiba (SP)", "Tapurah (MT)", "Taquara (RS)", "Taquaraçu de Minas (MG)", "Taquaral (SP)", "Taquaral de Goiás (GO)", "Taquarana (AL)", "Taquari (RS)", "Taquaritinga (SP)", "Taquaritinga do Norte (PE)", "Taquarituba (SP)", "Taquarivaí (SP)", "Taquaruçu do Sul (RS)", "Taquarussu (MS)", "Tarabai (SP)", "Tarauacá (AC)", "Tarrafas (CE)", "Tartarugalzinho (AP)", "Tarumã (SP)", "Tarumirim (MG)", "Tasso Fragoso (MA)", "Tatuí (SP)", "Tauá (CE)", "Taubaté (SP)", "Tavares (PB)", "Tavares (RS)", "Tefé (AM)", "Teixeira (PB)", "Teixeira de Freitas (BA)", "Teixeira Soares (PR)", "Teixeiras (MG)", "Teixeirópolis (RO)", "Tejuçuoca (CE)", "Tejupá (SP)", "Telêmaco Borba (PR)", "Telha (SE)", "Tenente Ananias (RN)", "Tenente Laurentino Cruz (RN)", "Tenente Portela (RS)", "Tenório (PB)", "Teodoro Sampaio (BA)", "Teodoro Sampaio (SP)", "Teofilândia (BA)", "Teófilo Otoni (MG)", "Teolândia (BA)", "Teotônio Vilela (AL)", "Terenos (MS)", "Teresina (PI)", "Teresina de Goiás (GO)", "Teresópolis (RJ)", "Terezinha (PE)", "Terezópolis de Goiás (GO)", "Terra Alta (PA)", "Terra Boa (PR)", "Terra de Areia (RS)", "Terra Nova (BA)", "Terra Nova (PE)", "Terra Nova do Norte (MT)", "Terra Rica (PR)", "Terra Roxa (PR)", "Terra Roxa (SP)", "Terra Santa (PA)", "Tesouro (MT)", "Teutônia (RS)", "Theobroma (RO)", "Tianguá (CE)", "Tibagi (PR)", "Tibau do Sul (RN)", "Tibau (RN)", "Tietê (SP)", "Tigrinhos (SC)", "Tijucas (SC)", "Tijucas do Sul (PR)", "Timbaúba (PE)", "Timbaúba dos Batistas (RN)", "Timbé do Sul (SC)", "Timbiras (MA)", "Timbó (SC)", "Timbó Grande (SC)", "Timburi (SP)", "Timon (MA)", "Timóteo (MG)", "Tio Hugo (RS)", "Tiradentes (MG)", "Tiradentes do Sul (RS)", "Tiros (MG)", "Tobias Barreto (SE)", "Tocantínia (TO)", "Tocantinópolis (TO)", "Tocantins (MG)", "Tocos do Moji (MG)", "Toledo (MG)", "Toledo (PR)", "Tomar do Geru (SE)", "Tomazina (PR)", "Tombos (MG)", "Tomé-Açu (PA)", "Tonantins (AM)", "Toritama (PE)", "Torixoréu (MT)", "Toropi (RS)", "Torre de Pedra (SP)", "Torres (RS)", "Torrinha (SP)", "Touros (RN)", "Trabiju (SP)", "Tracuateua (PA)", "Tracunhaém (PE)", "Traipu (AL)", "Trairão (PA)", "Trairi (CE)", "Trajano de Moraes (RJ)", "Tramandaí (RS)", "Travesseiro (RS)", "Tremedal (BA)", "Tremembé (SP)", "Três Arroios (RS)", "Três Barras do Paraná (PR)", "Três Barras (SC)", "Três Cachoeiras (RS)", "Três Corações (MG)", "Três Coroas (RS)", "Três de Maio (RS)", "Três Forquilhas (RS)", "Três Fronteiras (SP)", "Três Lagoas (MS)", "Três Marias (MG)", "Três Palmeiras (RS)", "Três Passos (RS)", "Três Pontas (MG)", "Três Ranchos (GO)", "Três Rios (RJ)", "Treviso (SC)", "Treze de Maio (SC)", "Treze Tílias (SC)", "Trizidela do Vale (MA)", "Trindade (GO)", "Trindade (PE)", "Trindade do Sul (RS)", "Triunfo (PB)", "Triunfo (PE)", "Triunfo (RS)", "Triunfo Potiguar (RN)", "Trombas (GO)", "Trombudo Central (SC)", "Tubarão (SC)", "Tucano (BA)", "Tucumã (PA)", "Tucunduva (RS)", "Tucuruí (PA)", "Tufilândia (MA)", "Tuiuti (SP)", "Tumiritinga (MG)", "Tunápolis (SC)", "Tunas do Paraná (PR)", "Tunas (RS)", "Tuneiras do Oeste (PR)", "Tuntum (MA)", "Tupaciguara (MG)", "Tupanatinga (PE)", "Tupanci do Sul (RS)", "Tupanciretã (RS)", "Tupandi (RS)", "Tuparendi (RS)", "Tuparetama (PE)", "Tupã (SP)", "Tupãssi (PR)", "Tupi Paulista (SP)", "Tupirama (TO)", "Tupiratins (TO)", "Turiaçu (MA)", "Turilândia (MA)", "Turiúba (SP)", "Turmalina (MG)", "Turmalina (SP)", "Turuçu (RS)", "Tururu (CE)", "Turvânia (GO)", "Turvelândia (GO)", "Turvo (PR)", "Turvo (SC)", "Turvolândia (MG)", "Tutóia (MA)", "Uarini (AM)", "Uauá (BA)", "Ubá (MG)", "Ubaí (MG)", "Ubaíra (BA)", "Ubaitaba (BA)", "Ubajara (CE)", "Ubaporanga (MG)", "Ubarana (SP)", "Ubatã (BA)", "Ubatuba (SP)", "Uberaba (MG)", "Uberlândia (MG)", "Ubirajara (SP)", "Ubiratã (PR)", "Ubiretama (RS)", "Uchoa (SP)", "Uibaí (BA)", "Uiramutã (RR)", "Uirapuru (GO)", "Uiraúna (PB)", "Ulianópolis (PA)", "Umari (CE)", "Umarizal (RN)", "Umbaúba (SE)", "Umburanas (BA)", "Umburatiba (MG)", "Umbuzeiro (PB)", "Umirim (CE)", "Umuarama (PR)", "Una (BA)", "Unaí (MG)", "União (PI)", "União da Serra (RS)", "União da Vitória (PR)", "União de Minas (MG)", "União do Oeste (SC)", "União dos Palmares (AL)", "União do Sul (MT)", "União Paulista (SP)", "Uniflor (PR)", "Unistalda (RS)", "Upanema (RN)", "Uraí (PR)", "Urandi (BA)", "Urânia (SP)", "Urbano Santos (MA)", "Uru (SP)", "Uruaçu (GO)", "Uruana (GO)", "Uruana de Minas (MG)", "Uruará (PA)", "Urubici (SC)", "Uruburetama (CE)", "Urucânia (MG)", "Urucará (AM)", "Uruçuca (BA)", "Uruçuí (PI)", "Urucuia (MG)", "Urucurituba (AM)", "Uruguaiana (RS)", "Uruoca (CE)", "Urupá (RO)", "Urupema (SC)", "Urupês (SP)", "Urussanga (SC)", "Urutaí (GO)", "Utinga (BA)", "Vacaria (RS)", "Vale de São Domingos (MT)", "Vale do Anari (RO)", "Vale do Paraíso (RO)", "Vale do Sol (RS)", "Valença (BA)", "Valença (RJ)", "Valença do Piauí (PI)", "Valente (BA)", "Valentim Gentil (SP)", "Vale Real (RS)", "Vale Verde (RS)", "Valinhos (SP)", "Valparaíso (SP)", "Valparaíso de Goiás (GO)", "Vanini (RS)", "Vargeão (SC)", "Vargem (SC)", "Vargem (SP)", "Vargem Alegre (MG)", "Vargem Alta (ES)", "Vargem Bonita (MG)", "Vargem Bonita (SC)", "Vargem Grande (MA)", "Vargem Grande do Rio Pardo (MG)", "Vargem Grande do Sul (SP)", "Vargem Grande Paulista (SP)", "Varginha (MG)", "Varjão (GO)", "Varjão de Minas (MG)", "Varjota (CE)", "Varre-Sai (RJ)", "Várzea (PB)", "Várzea (RN)", "Várzea Alegre (CE)", "Várzea Branca (PI)", "Várzea da Palma (MG)", "Várzea da Roça (BA)", "Várzea do Poço (BA)", "Várzea Grande (MT)", "Várzea Grande (PI)", "Várzea Nova (BA)", "Várzea Paulista (SP)", "Varzedo (BA)", "Varzelândia (MG)", "Vassouras (RJ)", "Vazante (MG)", "Venâncio Aires (RS)", "Venda Nova do Imigrante (ES)", "Venha-Ver (RN)", "Ventania (PR)", "Venturosa (PE)", "Vera (MT)", "Vera Cruz (BA)", "Vera Cruz (RN)", "Vera Cruz (RS)", "Vera Cruz (SP)", "Vera Cruz do Oeste (PR)", "Vera Mendes (PI)", "Veranópolis (RS)", "Verdejante (PE)", "Verdelândia (MG)", "Verê (PR)", "Vereda (BA)", "Veredinha (MG)", "Veríssimo (MG)", "Vermelho Novo (MG)", "Vertente do Lério (PE)", "Vertentes (PE)", "Vespasiano (MG)", "Vespasiano Corrêa (RS)", "Viadutos (RS)", "Viamão (RS)", "Viana (ES)", "Viana (MA)", "Vianópolis (GO)", "Vicência (PE)", "Vicente Dutra (RS)", "Vicentina (MS)", "Vicentinópolis (GO)", "Viçosa (AL)", "Viçosa (MG)", "Viçosa (RN)", "Viçosa do Ceará (CE)", "Victor Graeff (RS)", "Vidal Ramos (SC)", "Videira (SC)", "Vieiras (MG)", "Vieirópolis (PB)", "Vigia (PA)", "Vila Bela da Santíssima Trindade (MT)", "Vila Boa (GO)", "Vila Flores (RS)", "Vila Flor (RN)", "Vila Lângaro (RS)", "Vila Maria (RS)", "Vila Nova do Piauí (PI)", "Vila Nova dos Martírios (MA)", "Vila Nova do Sul (RS)", "Vila Pavão (ES)", "Vila Propício (GO)", "Vila Rica (MT)", "Vila Valério (ES)", "Vila Velha (ES)", "Vilhena (RO)", "Vinhedo (SP)", "Viradouro (SP)", "Virgem da Lapa (MG)", "Virgínia (MG)", "Virginópolis (MG)", "Virgolândia (MG)", "Virmond (PR)", "Visconde do Rio Branco (MG)", "Vista Alegre (RS)", "Vista Alegre do Alto (SP)", "Vista Alegre do Prata (RS)", "Vista Gaúcha (RS)", "Vista Serrana (PB)", "Vitória (ES)", "Vitória Brasil (SP)", "Vitória da Conquista (BA)", "Vitória das Missões (RS)", "Vitória de Santo Antão (PE)", "Vitória do Jari (AP)", "Vitória do Mearim (MA)", "Vitória do Xingu (PA)", "Vitorino (PR)", "Vitorino Freire (MA)", "Vitor Meireles (SC)", "Viseu (PA)", "Volta Grande (MG)", "Volta Redonda (RJ)", "Votorantim (SP)", "Votuporanga (SP)", "Wagner (BA)", "Wall Ferraz (PI)", "Wanderlândia (TO)", "Wanderley (BA)", "Wenceslau Braz (MG)", "Wenceslau Braz (PR)", "Wenceslau Guimarães (BA)", "Westfália (RS)", "Witmarsum (SC)", "Xambioá (TO)", "Xambrê (PR)", "Xangri-lá (RS)", "Xanxerê (SC)", "Xapuri (AC)", "Xavantina (SC)", "Xaxim (SC)", "Xexéu (PE)", "Xinguara (PA)", "Xique-Xique (BA)", "Zabelê (PB)", "Zacarias (SP)", "Zé Doca (MA)", "Zortéa (SC)" }));
        getContentPane().add(cmbCidade);
        cmbCidade.setBounds(530, 160, 210, 22);

        jdcDataCadastro.setBackground(new java.awt.Color(30, 30, 30));
        jdcDataCadastro.setForeground(new java.awt.Color(255, 255, 255));
        jdcDataCadastro.setEnabled(false);
        getContentPane().add(jdcDataCadastro);
        jdcDataCadastro.setBounds(870, 170, 170, 22);

        jdcDataNascimento.setBackground(new java.awt.Color(30, 30, 30));
        jdcDataNascimento.setForeground(new java.awt.Color(255, 255, 255));
        jdcDataNascimento.setEnabled(false);
        getContentPane().add(jdcDataNascimento);
        jdcDataNascimento.setBounds(870, 140, 170, 22);

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
        getContentPane().add(btnPrimeiro);
        btnPrimeiro.setBounds(620, 210, 73, 25);

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
        getContentPane().add(btnAnterior);
        btnAnterior.setBounds(700, 210, 73, 25);

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
        getContentPane().add(btnProximo);
        btnProximo.setBounds(780, 210, 73, 25);

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
        getContentPane().add(btnUltimo);
        btnUltimo.setBounds(860, 210, 73, 25);

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
        getContentPane().add(btnNovo);
        btnNovo.setBounds(620, 240, 73, 25);

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
        getContentPane().add(btnEditar);
        btnEditar.setBounds(700, 240, 73, 25);

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
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(780, 240, 73, 25);

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
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(860, 240, 73, 25);

        btnCancelar.setBackground(new java.awt.Color(122, 0, 0));
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
        btnCancelar.setBounds(700, 270, 73, 25);

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
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(780, 270, 73, 25);

        tblTabela.setBackground(new java.awt.Color(0, 0, 0));
        tblTabela.setForeground(new java.awt.Color(3, 155, 216));
        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Identificação", "Nome", "Sobrenome", "Endereço", "Telefone", "Cidade", "Data Nascimento", "Data Cadastro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTabela.setGridColor(new java.awt.Color(0, 0, 0));
        tblTabela.setMaximumSize(new java.awt.Dimension(685, 520));
        tblTabela.setMinimumSize(new java.awt.Dimension(685, 520));
        tblTabela.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tblTabela.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblTabela.setShowGrid(false);
        jScrollPane1.setViewportView(tblTabela);
        if (tblTabela.getColumnModel().getColumnCount() > 0) {
            tblTabela.getColumnModel().getColumn(0).setMinWidth(50);
            tblTabela.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblTabela.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 320, 1360, 380);

        jLabel1.setBackground(new java.awt.Color(200, 22, 22));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up_images/Logos/014.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        txtNome.setEnabled(true);
        txtSNome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        cmbIdentificacao.setEnabled(true);
        cmbCidade.setEnabled(true);
        jdcDataCadastro.setEnabled(true);
        jdcDataNascimento.setEnabled(true);

        txtIdcliente.setText("");
        cmbIdentificacao.setSelectedIndex(0);
        txtNome.setText("");
        txtSNome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        cmbCidade.setSelectedIndex(0);
        jdcDataCadastro.setDate(new Date());
        jdcDataNascimento.setDate(new Date());

        novo = true;
        txtIdcliente.requestFocus();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (cmbIdentificacao.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione a identificação");
            cmbIdentificacao.requestFocusInWindow();
            return;
        }

        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Insira o nome");
            txtNome.requestFocusInWindow();
            return;
        }

        if (txtSNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Insira o sobre-nome");
            txtSNome.requestFocusInWindow();
            return;
        }

        if (jdcDataNascimento.getDate().after(new Date())) {
            JOptionPane.showMessageDialog(rootPane, "Insira a data de nascimento");
            jdcDataNascimento.requestFocusInWindow();
            return;
        }

        if (jdcDataCadastro.getDate().after(new Date())) {
            JOptionPane.showMessageDialog(rootPane, "Insira a data de cadastro");
            jdcDataCadastro.requestFocusInWindow();
            return;
        }

        if (novo) {
            if (dados.existeCliente(txtIdcliente.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Este cliente já existe");
                txtIdcliente.requestFocusInWindow();
                return;
            }
        } else {
            if (!dados.existeCliente(txtIdcliente.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Este cliente ainda não existe");
                txtIdcliente.requestFocusInWindow();
                return;
            }
        }

        Cliente mCliente = new Cliente(
                Utilidades.objectToInt(txtIdcliente.getText()),
                cmbIdentificacao.getSelectedIndex(),
                txtNome.getText(),
                txtSNome.getText(),
                txtEndereco.getText(),
                txtTelefone.getText(),
                cmbCidade.getSelectedIndex(),
                jdcDataNascimento.getDate(),
                jdcDataCadastro.getDate());

        String msg;
        if (novo) {
            msg = dados.adicionarCliente(mCliente);
        } else {
            msg = dados.editarCliente(mCliente);
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

        txtIdcliente.setEnabled(false);
        cmbIdentificacao.setEnabled(false);
        txtNome.setEnabled(false);
        txtSNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        cmbCidade.setEnabled(false);
        jdcDataNascimento.setEnabled(false);
        jdcDataCadastro.setEnabled(false);

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
        cmbIdentificacao.setEnabled(false);
        cmbCidade.setEnabled(false);
        jdcDataCadastro.setEnabled(false);
        jdcDataNascimento.setEnabled(false);

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

        cmbIdentificacao.setEnabled(true);
        txtNome.setEnabled(true);
        txtSNome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        cmbCidade.setEnabled(true);
        jdcDataCadastro.setEnabled(true);

        novo = false;
        cmbIdentificacao.requestFocus();

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
        txtIdcliente.setText(Utilidades.objectToString(tblTabela.getValueAt(clienteAtual, 0)));
        cmbIdentificacao.setSelectedIndex(tipo(Utilidades.objectToString(tblTabela.getValueAt(clienteAtual, 1))));
        txtNome.setText(Utilidades.objectToString(tblTabela.getValueAt(clienteAtual, 2)));
        txtSNome.setText(Utilidades.objectToString(tblTabela.getValueAt(clienteAtual, 3)));
        txtEndereco.setText(Utilidades.objectToString(tblTabela.getValueAt(clienteAtual, 4)));
        txtTelefone.setText(Utilidades.objectToString(tblTabela.getValueAt(clienteAtual, 5)));
        cmbCidade.setSelectedIndex(cidade(Utilidades.objectToString(tblTabela.getValueAt(clienteAtual, 6))));
        jdcDataNascimento.setDate(Utilidades.objectToDate(tblTabela.getValueAt(clienteAtual, 7)));
        jdcDataCadastro.setDate(Utilidades.objectToDate(tblTabela.getValueAt(clienteAtual, 8)));
    }

    private void preencherTabela() {
        try {
            String titulos[] = {"ID Cliente", "Tipo", "Nome", "S-Nome", "Endereco", "Telefone", "Cidade", "D-Nascimento", "D-Cadastro"};
            String registro[] = new String[9];
            mTabela = new DefaultTableModel(null, titulos);
            ResultSet rs = dados.getClientes();

            while (rs.next()) {
                registro[0] = rs.getString("idcliente");
                registro[1] = tipo(rs.getInt("idtipo"));
                registro[2] = rs.getString("nome");
                registro[3] = rs.getString("sobrenome");
                registro[4] = rs.getString("endereco");
                registro[5] = rs.getString("telefone");
                registro[6] = cidade(rs.getInt("idcidade"));
                registro[7] = rs.getString("dataNascimento");
                registro[8] = rs.getString("dataCadastro");
                mTabela.addRow(registro);
            }
            tblTabela.setModel(mTabela);
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void carregarPrimeiroRegistro() {
        ResultSet rs = (ResultSet) dados.getClientes();
        try {
            if (rs.next()) {
                id = rs.getString("idcliente");
                identificacao = rs.getString("idtipo");
                nome = rs.getString("nome");
                sobrenome = rs.getString("sobrenome");
                endereco = rs.getString("endereco");
                telefone = rs.getString("telefone");
                cidade = rs.getString("idcidade");
                dataNascimento = rs.getString("dataNascimento");
                dataCadastro = rs.getString("dataCadastro");

                txtIdcliente.setText(id);
                cmbIdentificacao.setSelectedItem(identificacao);
                txtNome.setText(nome);
                txtSNome.setText(sobrenome);
                txtEndereco.setText(endereco);
                txtTelefone.setText(telefone);
                cmbCidade.setSelectedItem(cidade);
                jdcDataNascimento.setDateFormatString(dataNascimento);
                jdcDataCadastro.setDateFormatString(dataCadastro);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UP_F04_Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String tipo(int tipo) {
        return switch (tipo) {
            case 0 ->
                "CNH";
            case 1 ->
                "RG";
            case 2 ->
                "CPF";
            default ->
                "Não definido!";
        };
    }

    private int tipo(String tipo) {
        return switch (tipo) {
            case "Identificacao" ->
                0;
            case "CPF" ->
                1;
            case "RG" ->
                2;
            default ->
                2;
        };
    }

    private String cidade(int cidade) {
        return switch (cidade) {
            case 0 ->
                "Selecione a cidade";
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

    private int cidade(String cidade) {
        return switch (cidade) {
            case "Lages" ->
                1;
            case "Blumenau" ->
                2;
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
    private com.toedter.calendar.JDateChooser jdcDataCadastro;
    private com.toedter.calendar.JDateChooser jdcDataNascimento;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdcliente;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
/**
 * 01000111 01101001 01101111 01110110 01100001 01101110 01101110 01101001
 */
