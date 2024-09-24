package up_classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dados {

    private ArrayList<Produto> listaDeProdutos;
    public Connection cnn;

    public Dados() {
        try {
            // Carrega o driver connector do MySQL Server - MySQL Workbench
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Carrega o driver JDBC do SQL Server - SSMS (Sql server management studio)
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Carrega as propriedades de configuração
            Properties props = new Properties();
            props.load(new FileInputStream("F:\\NETBEANS PROJECTS 2024\\Umbrella-Pharmaceutical-Inc\\config.properties"));
            //props.load(new FileInputStream("F:\\NETBEANS PROJECTS 2024\\Umbrella_Pharmaceutical_Inc\\SSMS-config.properties"));

            // Obtém as propriedades do arquivo
            String dbUrl = props.getProperty("db.url");
            String dbUser = props.getProperty("db.user");
            String dbPassword = props.getProperty("db.password");

            // Estabelece a conexão com o banco de dados
            cnn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            //cnn = DriverManager.getConnection(dbUrl);
        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, "Erro ao carregar o driver ou ler as propriedades", ex);
            cnn = null;
        } catch (SQLException ex) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, "Erro ao estabelecer a conexão com o banco de dados", ex);
            cnn = null;
        }

        listaDeProdutos = new ArrayList<>();
    }

    public static Connection getConnectionInstance() {
        Dados sgbd = new Dados();
        return sgbd.cnn;
    }

    /**
     * 01000100 01100101 01110110
     *
     * 01101110 01101001 01000100 01100101 01110110 01000111 01101001 01101111
     *
     * @param usuario
     * @param senha
     * @param chave
     * @return
     */
    public Boolean validarUsuario(String usuario, String senha, String chave) {
        try {
            String sql = "SELECT 1 FROM usuarios WHERE idusuario = ? AND senha = ? AND chave = ?";
            PreparedStatement preparedStatement = cnn.prepareStatement(sql);
            preparedStatement.setString(1, usuario);
            preparedStatement.setString(2, senha);
            preparedStatement.setString(3, chave);

            ResultSet rs = preparedStatement.executeQuery();

            return rs.next();
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, "Erro ao validar usuário", e);
            return false;
        }
    }

    public int getPerfil(String usuario) {
        Connection cnn = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            // Estabeleça a conexão com o banco de dados aqui (substitua as informações de conexão apropriadas)
            cnn = DriverManager.getConnection("jdbc:mysql://localhost/umbrella", "root", "xyx355@$Y");

            String sql = "SELECT idperfil FROM usuarios WHERE idusuario=?";
            st = cnn.prepareStatement(sql);
            st.setString(1, usuario);

            rs = st.executeQuery();

            if (rs.next()) {
                return rs.getInt("idperfil");
            } else {
                return -1;
            }
        } catch (SQLException e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Erro ao obter perfil do usuário", e);
            return -1;
        } finally {
            closeResources(cnn, st, rs);
        }
    }

    private void closeResources(Connection cnn, PreparedStatement st, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (cnn != null) {
                cnn.close();
            }
        } catch (SQLException e) {
            Logger.getLogger(getClass().getName()).log(Level.WARNING, "Erro ao fechar recursos", e);
        }
    }

    public boolean existeUsuario(String usuario) {
        try {
            String sql = "SELECT 1 FROM usuarios WHERE idusuario = ?";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, usuario);
            ResultSet rs = pstmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    public boolean existeCliente(String cliente) {
        try {
            String sql = "SELECT 1 FROM clientes WHERE idcliente = ?";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, cliente);
            ResultSet rs = pstmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    public boolean existeProduto(String produto) {
        try {
            String sql = "SELECT 1 FROM produtos WHERE idproduto = ?";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, produto);
            ResultSet rs = pstmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    public String adicionarUsuario(Usuario mUsuario) {
        try {
            String sql = "INSERT INTO usuarios (nome, sobrenome, senha, chave, idperfil) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, mUsuario.getNome());
            pstmt.setString(2, mUsuario.getSobrenome());
            pstmt.setString(3, mUsuario.getSenha());
            pstmt.setString(4, mUsuario.getChave());
            pstmt.setInt(5, mUsuario.getPerfil());

            pstmt.executeUpdate();
            return "Usuário cadastrado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível cadastrar este usuário";
        }
    }

    public String adicionarProduto(Produto mProduto) {
        try {
            String sql = "INSERT INTO produtos (produto, preco, descricao) VALUES (?, ?, ?)";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, mProduto.getProduto());
            pstmt.setDouble(2, mProduto.getPreco());
            pstmt.setString(3, mProduto.getDescricao());
            //pstmt.setDouble(3, mProduto.getImposto());
            //pstmt.setString(4, mProduto.getAnotacao());

            pstmt.executeUpdate();
            return "Produto cadastrado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível cadastrar este produto";
        }
    }

    public String adicionarCliente(Cliente mCliente) {
        try {
            String sql = "INSERT INTO clientes (nome, sobrenome, endereco, telefone, cidade, dataNascimento, dataCadastro) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, mCliente.getNome());
            pstmt.setString(2, mCliente.getSobrenome());
            pstmt.setString(3, mCliente.getEndereco());
            pstmt.setString(4, mCliente.getTelefone());
            pstmt.setInt(5, mCliente.getCidade());
            pstmt.setDate(6, new java.sql.Date(mCliente.getDataNascimento().getTime()));
            pstmt.setDate(7, new java.sql.Date(mCliente.getDataCadastro().getTime()));

            pstmt.executeUpdate();
            return "Cliente cadastrado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível cadastrar este cliente";
        }
    }

    public String editarUsuario(Usuario mUsuario) {
        try {
            String sql = "UPDATE usuarios SET nome = ?, sobrenome = ?, senha = ?, idperfil = ? WHERE idusuario = ?";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, mUsuario.getNome());
            pstmt.setString(2, mUsuario.getSobrenome());
            pstmt.setString(3, mUsuario.getSenha());
            pstmt.setInt(4, mUsuario.getPerfil());
            pstmt.setInt(5, mUsuario.getIdusuario());

            pstmt.executeUpdate();

            return "Usuário editado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível editar este usuário";
        }
    }

    public String editarProduto(Produto mProduto) {
        try {
            String sql = "UPDATE produtos SET descricao = ?, preco = ? WHERE idproduto = ?";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, mProduto.getDescricao());
            pstmt.setString(2, mProduto.getProduto());
            pstmt.setDouble(3, mProduto.getPreco());
            //pstmt.setDouble(3, mProduto.getImposto());
            //pstmt.setString(4, mProduto.getAnotacao());
            pstmt.setInt(4, mProduto.getIdProduto());

            pstmt.executeUpdate();

            return "Produto editado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível editar este produto";
        }
    }

    public String editarCliente(Cliente mCliente) {
        try {
            String sql = "UPDATE clientes SET nome = ?, sobrenome = ?, endereco = ?, telefone = ?, idcidade = ?, dataNascimento = ?, dataCadastro = ? WHERE idcliente = ?";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, mCliente.getNome());
            pstmt.setString(2, mCliente.getSobrenome());
            pstmt.setString(3, mCliente.getEndereco());
            pstmt.setString(4, mCliente.getTelefone());
            pstmt.setInt(5, mCliente.getCidade());
            pstmt.setDate(6, new java.sql.Date(mCliente.getDataNascimento().getTime()));
            pstmt.setDate(7, new java.sql.Date(mCliente.getDataCadastro().getTime()));
            pstmt.setInt(8, mCliente.getIdcliente());

            pstmt.executeUpdate();

            return "Cliente editado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível editar este cliente";
        }
    }

    public String deletarUsuario(String usuario) {
        try {
            String sql = "DELETE FROM usuarios WHERE idusuario = ?";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, usuario);
            pstmt.executeUpdate();
            return "Usuário deletado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível deletar este usuário";
        }
    }

    public String deletarCliente(String cliente) {
        try {
            String sql = "DELETE FROM clientes WHERE idcliente = ?";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, cliente);
            pstmt.executeUpdate();
            return "Cliente deletado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível deletar este cliente";
        }
    }

    public String deletarProduto(String produto) {
        try {
            String sql = "DELETE FROM produtos WHERE idproduto = ?";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, produto);
            pstmt.executeUpdate();
            return "Produto deletado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível deletar este produto";
        }
    }

    public ResultSet getUsuarios() {
        try {
            String sql = "SELECT * FROM usuarios";
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public ResultSet getClientes() {
        try {
            String sql = "SELECT * FROM clientes";
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public ResultSet getProdutos() {
        try {
            String sql = "SELECT * FROM produtos";
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public ResultSet getVenda() {
        try {
            String sql = "SELECT * FROM vendas";
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public ResultSet getConsulta(String sql) {
        try {
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public int numeroUsuarios() {
        try {
            String sql = "SELECT COUNT(*) AS num FROM usuarios";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("num");
            } else {
                return 0;
            }
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return 0;
        }
    }

    public int numeroClientes() {
        try {
            String sql = "SELECT COUNT(*) AS num FROM clientes";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("num");
            } else {
                return 0;
            }
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return 0;
        }
    }

    public int numeroProdutos() {
        try {
            String sql = "SELECT COUNT(*) AS num FROM produtos";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("num");
            } else {
                return 0;
            }
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return 0;
        }
    }

    public Produto getProduto(String idProduto) {
        try {
            Produto mProduto = null;
            String sql = "SELECT * FROM produtos WHERE idproduto = ?";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, idProduto);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                mProduto = new Produto(
                        Utilidades.stringToInt(rs.getString("idproduto")),
                        rs.getString("produto"),
                        rs.getInt("preco"),
                        rs.getString("descricao"));
            }
            return mProduto;
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public int getNumeroVenda() {
        try {
            String sql = "SELECT MAX(idvenda) AS numero FROM vendas";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                return rs.getInt("numero") + 1;
            } else {
                return 1;
            }
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return 1;
        }
    }

    public void adicionarVenda(int idVenda, int idCliente, Date data) {
        try {
            String sql = "INSERT INTO vendas (idvenda, idcliente, data) VALUES (?, ?, ?)";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setInt(1, idVenda);                      // Para idVenda
            pstmt.setInt(2, idCliente);                    // Para idCliente
            pstmt.setDate(3, new java.sql.Date(data.getTime())); // Para data
            pstmt.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void adicionarDetalheVenda(int idVenda, int idProduto, double preco, int quantidade) {
        try {
            String sql = "INSERT INTO detalhe_venda (idvenda, idproduto, preco, quantidade) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setInt(1, idVenda);                       // ID da venda
            pstmt.setInt(2, idProduto);                     // ID do produto
            pstmt.setDouble(3, preco);                      // Preço do produto
            pstmt.setInt(4, quantidade);                    // Quantidade
            pstmt.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public ResultSet getDetalhesVendas() {
        try {
            String sql = "SELECT * FROM detalhevendas";
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public void close() {
        if (cnn != null) {
            try {
                cnn.close();

            } catch (SQLException ex) {
                Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, "Erro ao fechar a conexão", ex);
            }
        }
    }

    public Connection getCnn() {
        return cnn;
    }

    ResultSet getTelefonesClientes() {
        try {
            String sql = "SELECT telefone FROM clientes";
            PreparedStatement pstmt = cnn.prepareStatement(sql);

            return pstmt.executeQuery();
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, "Erro ao obter telefones de clientes", e);
        }
        return null;
    }

    public Cliente getClientePorNome(String nomeCliente) {
        Cliente cliente = null;
        try {
            String sql = "SELECT * FROM clientes WHERE nome = ?";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, nomeCliente);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    cliente = new Cliente();
                    cliente.setIdCliente(rs.getInt("idcliente"));
                    cliente.setNome(rs.getString("nome"));
                    // Preencher outros atributos conforme necessário
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, "Erro ao buscar cliente por nome", e);
        }
        return cliente;
    }

    // Método para buscar produto pelo nome
    public Produto getProdutoPorNome(String nomeProduto) {
        for (Produto produto : listaDeProdutos) {
            if (produto.getDescricao().equalsIgnoreCase(nomeProduto)) {
                return produto;
            }
        }
        // Log opcional se necessário
        Logger.getLogger(Dados.class.getName()).log(Level.WARNING, "Produto não encontrado: " + nomeProduto);
        return null; // Retorna null se o produto não for encontrado
    }
}
/**
 * 01000100 01100101 01110110
 *
 * 01000111 01101001 01101111 01110110 01100001 01101110 01101001
 */
