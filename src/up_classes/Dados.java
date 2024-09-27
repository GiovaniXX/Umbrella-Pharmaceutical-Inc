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
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dados {

    // Lista de produtos
    private final ArrayList<Produto> listaDeProdutos;
    // Conexão com o banco de dados
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

        // Inicializa a lista de produtos
        listaDeProdutos = new ArrayList<>();
    }

    // Método para obter a instância da conexão com o banco de dados
    public static Connection getConnectionInstance() {
        Dados sgbd = new Dados();
        return sgbd.cnn;
    }

    /**
     * 01000100 01100101 01110110
     *
     * 01101110 01101001 01000100 01100101 01110110 01000111 01101001 01101111
     *
     * Método para validar um usuário com base em seu ID, senha e chave.
     *
     * @param usuario O ID do usuário.
     * @param senha A senha do usuário.
     * @param chave A chave de validação do usuário.
     * @return Verdadeiro se o usuário for válido, falso caso contrário.
     */
    public Boolean validarUsuario(String usuario, String senha, String chave) {
        try {
            String sql = "SELECT 1 FROM usuarios WHERE idusuario = ? AND senha = ? AND chave = ?";
            PreparedStatement preparedStatement = cnn.prepareStatement(sql);
            preparedStatement.setString(1, usuario);
            preparedStatement.setString(2, senha);
            preparedStatement.setString(3, chave);

            ResultSet rs = preparedStatement.executeQuery();
            // Retorna verdadeiro se o usuário existir
            return rs.next();
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, "Erro ao validar usuário", e);
            return false;
        }
    }

    // Método para obter o perfil do usuário baseado no ID do usuário
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
                // Retorna o id do perfil
                return rs.getInt("idperfil");
            } else {
                // Retorna -1 se o usuário não for encontrado
                return -1;
            }
        } catch (SQLException e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Erro ao obter perfil do usuário", e);
            return -1;
        } finally {
            // Fecha recursos
            closeResources(cnn, st, rs);
        }
    }

    // Método privado para fechar recursos de banco de dados
    private void closeResources(Connection cnn, PreparedStatement st, ResultSet rs) {
        try {
            if (rs != null) {
                // Fecha ResultSet
                rs.close();
            }
            if (st != null) {
                // Fecha PreparedStatement
                st.close();
            }
            if (cnn != null) {
                // Fecha a conexão
                cnn.close();
            }
        } catch (SQLException e) {
            Logger.getLogger(getClass().getName()).log(Level.WARNING, "Erro ao fechar recursos", e);
        }
    }

    // Método para verificar se um usuário existe no banco de dados
    public boolean existeUsuario(String usuario) {
        try {
            String sql = "SELECT 1 FROM usuarios WHERE idusuario = ?";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, usuario);
            ResultSet rs = pstmt.executeQuery();
            // Retorna verdadeiro se o usuário existir
            return rs.next();
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    // Método para verificar se um cliente existe no banco de dados
    public boolean existeCliente(String cliente) {
        try {
            String sql = "SELECT 1 FROM clientes WHERE idcliente = ?";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, cliente);
            ResultSet rs = pstmt.executeQuery();
            // Retorna verdadeiro se o cliente existir
            return rs.next();
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    // Método para verificar se um produto existe no banco de dados
    public boolean existeProduto(String produto) {
        try {
            String sql = "SELECT 1 FROM produtos WHERE idproduto = ?";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, produto);
            ResultSet rs = pstmt.executeQuery();
            // Retorna verdadeiro se o produto existir
            return rs.next();
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    // Método para adicionar um novo usuário ao banco de dados
    public String adicionarUsuario(Usuario mUsuario) {
        try {
            String sql = "INSERT INTO usuarios (nome, sobrenome, senha, chave, idperfil) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, mUsuario.getNome());
            pstmt.setString(2, mUsuario.getSobrenome());
            pstmt.setString(3, mUsuario.getSenha());
            pstmt.setString(4, mUsuario.getChave());
            pstmt.setInt(5, mUsuario.getPerfil());

            // Executa a inserção
            pstmt.executeUpdate();
            // Mensagem de sucesso
            return "Usuário cadastrado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            // Mensagem de erro
            return "Não foi possível cadastrar este usuário";
        }
    }

    // Método para adicionar um novo produto ao banco de dados
    public String adicionarProduto(Produto mProduto) {
        try {
            String sql = "INSERT INTO produtos (produto, preco, descricao) VALUES (?, ?, ?)";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, mProduto.getProduto());
            pstmt.setDouble(2, mProduto.getPreco());
            pstmt.setString(3, mProduto.getDescricao());
            //pstmt.setString(4, mProduto.getAnotacao());

            // Executa a inserção
            pstmt.executeUpdate();
            // Mensagem de sucesso
            return "Produto cadastrado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            // Mensagem de erro
            return "Não foi possível cadastrar este produto";
        }
    }

    // Método para adicionar um novo cliente ao banco de dados
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

            // Executa a inserção
            pstmt.executeUpdate();
            // Mensagem de sucesso
            return "Cliente cadastrado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            // Mensagem de erro
            return "Não foi possível cadastrar este cliente";
        }
    }

    // Método para editar as informações de um usuário
    public String editarUsuario(Usuario mUsuario) {
        try {
            String sql = "UPDATE usuarios SET nome = ?, sobrenome = ?, senha = ?, idperfil = ? WHERE idusuario = ?";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, mUsuario.getNome());
            pstmt.setString(2, mUsuario.getSobrenome());
            pstmt.setString(3, mUsuario.getSenha());
            pstmt.setInt(4, mUsuario.getPerfil());
            pstmt.setInt(5, mUsuario.getIdusuario());

            // Executa a atualização
            pstmt.executeUpdate();
            // Mensagem de sucesso
            return "Usuário editado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            // Mensagem de erro
            return "Não foi possível editar este usuário";
        }
    }

    // Método para editar as informações de um produto
    public String editarProduto(Produto mProduto) {
        try {
            String sql = "UPDATE produtos SET descricao = ?, preco = ? WHERE idproduto = ?";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, mProduto.getDescricao());
            pstmt.setString(2, mProduto.getProduto());
            pstmt.setDouble(3, mProduto.getPreco());
            //pstmt.setString(4, mProduto.getAnotacao());
            pstmt.setInt(4, mProduto.getIdProduto());

            // Executa a atualização
            pstmt.executeUpdate();
            // Mensagem de sucesso
            return "Produto editado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            // Mensagem de erro
            return "Não foi possível editar este produto";
        }
    }

    // Método para editar as informações de um cliente
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

            // Executa a atualização
            pstmt.executeUpdate();
            // Mensagem de sucesso
            return "Cliente editado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            // Mensagem de erro
            return "Não foi possível editar este cliente";
        }
    }

    // Método para excluir um usuário do banco de dados
    public String deletarUsuario(String usuario) {
        try {
            String sql = "DELETE FROM usuarios WHERE idusuario = ?";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, usuario);

            // Executa a exclusão
            pstmt.executeUpdate();
            return "Usuário deletado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível deletar este usuário";
        }
    }

    // Método para excluir um cliente do banco de dados
    public String deletarCliente(String cliente) {
        try {
            String sql = "DELETE FROM clientes WHERE idcliente = ?";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, cliente);

            // Executa a exclusão
            pstmt.executeUpdate();
            // Mensagem de sucesso
            return "Cliente deletado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            // Mensagem de erro
            return "Não foi possível deletar este cliente";
        }
    }

    // Método para excluir um produto do banco de dados
    public String deletarProduto(String produto) {
        try {
            String sql = "DELETE FROM produtos WHERE idproduto = ?";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, produto);

            // Executa a exclusão
            pstmt.executeUpdate();
            // Mensagem de sucesso
            return "Produto deletado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            // Mensagem de erro
            return "Não foi possível deletar este produto";
        }
    }

    // Método para obter todos os usuários do banco de dados
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
    //-------------------------------------------------------------------------------------
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

    public void adicionarVenda(int idVenda, int idCliente, Date data, double preco, int quantidade) {
        try {
            String sql = "INSERT INTO vendas (idvenda, idcliente, data, preco, quantidade) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setInt(1, idVenda);                      // Para idVenda
            pstmt.setInt(2, idCliente);                    // Para idCliente
            pstmt.setDate(3, new java.sql.Date(data.getTime())); // Para data
            pstmt.setDouble(4, preco);                     // Para preco
            pstmt.setInt(5, quantidade);                   // Para quantidade
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

    // Método para obter os telefones dos clientes
    public List<String> getTelefonesClientes() {
        // Lista para armazenar telefones
        List<String> telefones = new ArrayList<>();
        try {
            // Consulta para obter telefones
            String sql = "SELECT telefone FROM clientes";
            Statement stmt = cnn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                // Adiciona telefone à lista
                telefones.add(rs.getString("telefone"));
            }
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
        }
        return telefones; // Retorna a lista de telefones
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

    // Método para buscar produto pelo Id
    public Produto getProdutoPorId(int idProduto) {
        for (Produto produto : listaDeProdutos) {
            if (produto.getIdProduto() == idProduto) {
                return produto;
            }
        }
        // Log opcional se necessário
        Logger.getLogger(Dados.class.getName()).log(Level.WARNING, "Produto não encontrado");
        // Retorna null se o produto não for encontrado
        return null;
    }

    // Método para buscar produto pelo nome
    public Produto getProdutoPorNome(String nomeProduto) {
        Produto produto = null;
        try {
            String sql = "SELECT * FROM produtos WHERE produto = ?";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, nomeProduto);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    produto = new Produto(
                            rs.getInt("idproduto"),
                            rs.getString("produto"),
                            rs.getDouble("preco"),
                            rs.getString("descricao")
                    );
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, "Erro ao buscar produto por nome", e);
        }
        if (produto == null) {
            Logger.getLogger(Dados.class.getName()).log(Level.WARNING, "Produto não encontrado");
        }
        return produto;
    }
}
