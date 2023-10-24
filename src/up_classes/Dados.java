package up_classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dados {

    public Connection cnn;

    public Dados() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Properties props = new Properties();
            props.load(new FileInputStream("E:\\Projetos java\\Umbrella_Pharmaceutical_Inc\\config.properties"));
            String dbUrl = props.getProperty("db.url");
            String dbUser = props.getProperty("db.user");
            String dbPassword = props.getProperty("db.password");

            cnn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, "Erro ao carregar o driver ou ler as propriedades", ex);
            cnn = null;
        } catch (SQLException ex) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, "Erro ao estabelecer a conexão com o banco de dados", ex);
            cnn = null;
        }
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
            cnn = DriverManager.getConnection("jdbc:mysql://localhost/umbrella", "root", "xyx387@$$gVc");

            String sql = "SELECT perfil FROM usuarios WHERE idusuario=?";
            st = cnn.prepareStatement(sql);
            st.setString(1, usuario);

            rs = st.executeQuery();

            if (rs.next()) {
                return rs.getInt("perfil");
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

    /**
     * GvC-Desenvolvimentos™ Programmer: Giovani V. Chaves
     *
     * Utilizei Logger para registrar exceções com níveis adequados de
     * severidade.
     *
     * Movi a lógica de fechamento de recursos para um método separado
     * (closeResources) para evitar duplicação de código.
     *
     * A exceção no fechamento de recursos também é registrada adequadamente com
     * o Logger.
     *
     * Evitei o uso de Throwable.printStackTrace(), o que é uma prática de
     * tratamento de exceções mais apropriada em código profissional.
     */
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
            String sql = "INSERT INTO usuarios (nome, sobrenome, senha, chave, perfil) VALUES (?, ?, ?, ?, ?)";
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
            String sql = "INSERT INTO produtos (descricao, preco, imposto, anotacao) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, mProduto.getDescricao());
            pstmt.setDouble(2, mProduto.getPreco());
            pstmt.setDouble(3, mProduto.getImposto());
            pstmt.setString(4, mProduto.getAnotacao());

            pstmt.executeUpdate();
            return "Produto cadastrado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível cadastrar este produto";
        }
    }

    public String adicionarCliente(Cliente mCliente) {
        try {
            String sql = "INSERT INTO clientes (tipo, nome, sobrenome, endereco, telefone, cidade, dataNascimento, dataCadastro) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setInt(1, mCliente.getTipo());
            pstmt.setString(2, mCliente.getNome());
            pstmt.setString(3, mCliente.getSobrenome());
            pstmt.setString(4, mCliente.getEndereco());
            pstmt.setString(5, mCliente.getTelefone());
            pstmt.setInt(6, mCliente.getCidade());
            pstmt.setDate(7, new java.sql.Date(mCliente.getDataNascimento().getTime()));
            pstmt.setDate(8, new java.sql.Date(mCliente.getDataCadastro().getTime()));

            pstmt.executeUpdate();
            return "Cliente cadastrado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível cadastrar este cliente";
        }
    }

    public String editarUsuario(Usuario mUsuario) {
        try {
            String sql = "UPDATE usuarios SET nome = ?, sobrenome = ?, senha = ?, perfil = ? WHERE idusuario = ?";
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
            String sql = "UPDATE produtos SET descricao = ?, preco = ?, imposto = ?, anotacao = ? WHERE idproduto = ?";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setString(1, mProduto.getDescricao());
            pstmt.setDouble(2, mProduto.getPreco());
            pstmt.setDouble(3, mProduto.getImposto());
            pstmt.setString(4, mProduto.getAnotacao());
            pstmt.setInt(5, mProduto.getIdProduto());

            pstmt.executeUpdate();

            return "Produto editado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível editar este produto";
        }
    }

    public String editarCliente(Cliente mCliente) {
        try {
            String sql = "UPDATE clientes SET tipo = ?, nome = ?, sobrenome = ?, endereco = ?, telefone = ?, cidade = ?, dataNascimento = ?, dataCadastro = ? WHERE idcliente = ?";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setInt(1, mCliente.getTipo());
            pstmt.setString(2, mCliente.getNome());
            pstmt.setString(3, mCliente.getSobrenome());
            pstmt.setString(4, mCliente.getEndereco());
            pstmt.setString(5, mCliente.getTelefone());
            pstmt.setInt(6, mCliente.getCidade());
            pstmt.setDate(7, new java.sql.Date(mCliente.getDataNascimento().getTime()));
            pstmt.setDate(8, new java.sql.Date(mCliente.getDataCadastro().getTime()));
            pstmt.setInt(9, mCliente.getIdcliente());

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
                        rs.getString("descricao"),
                        rs.getInt("preco"),
                        rs.getInt("imposto"),
                        rs.getString("anotacao"));
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

    public void adicionarVenda(int idvenda, int cliente, Date data) {
        try {
            String sql = "INSERT INTO vendas VALUES (?, ?, ?)";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setInt(1, idvenda);
            pstmt.setInt(2, cliente);
            pstmt.setDate(3, new java.sql.Date(data.getTime()));
            pstmt.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void adicionarDetalheVenda(int idvenda, int linha, int produto, String descricao, double preco, int quantidade) {
        try {
            String sql = "INSERT INTO detalhevendas (idvenda, linha, produto, descricao, preco, quantidade) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = cnn.prepareStatement(sql);
            pstmt.setInt(1, idvenda);
            pstmt.setInt(2, linha);
            pstmt.setInt(3, produto);
            pstmt.setString(4, descricao);
            pstmt.setDouble(5, preco);
            pstmt.setInt(6, quantidade);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
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
}
/**
 * 01000100 01100101 01110110
 *
 * 01000111 01101001 01101111 01110110 01100001 01101110 01101001
 */
