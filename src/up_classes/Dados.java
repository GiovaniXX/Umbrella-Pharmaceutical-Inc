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
            props.load(new FileInputStream("E:/PROJETOS JAVA 2023/NetBeans/Umbrella_Pharmaceutical_Inc/config.properties"));
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
            String sql = "select (1) from usuarios where idUsuario='" + usuario + "' and senha ='" + senha + "' and chave ='" + chave + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
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
            // Estabeleçe a conexão com o banco de dados aqui (substitua as informações de conexão apropriadas)
            cnn = DriverManager.getConnection("jdbc:mysql://localhost/umbrella", "root", "PerfectWorld2023@$");

            String sql = "select perfil from usuarios where idUsuario=?";
            st = cnn.prepareStatement(sql);
            st.setString(1, usuario);

            rs = st.executeQuery();

            if (rs.next()) {
                return rs.getInt("perfil");
            } else {
                return -1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        } finally {
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
                e.printStackTrace();
            }
        }
    }
//    public int getPerfil(String usuario) {
//        try {
//            String sql = "select perfil from usuarios where idUsuario='"
//                    + usuario + "'";
//            Statement st = cnn.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            if (rs.next()) {
//                return rs.getInt("perfil");
//            } else {
//                return -1;
//
//            }
//        } catch (SQLException e) {
//            Logger.getLogger(Dados.class
//                    .getName()).log(Level.SEVERE, null, e);
//            return -1;
//        }
//    }

    public boolean existeUsuario(String usuario) {
        try {
            String sql = "select (1) from usuarios where idUsuario ='"
                    + usuario + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs.next();

        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    public boolean existeCliente(String cliente) {
        try {
            String sql = "select (1) from clientes where idCliente ='"
                    + cliente + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs.next();

        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    public boolean existeProduto(String produto) {
        try {
            String sql = "select (1) from produtos where idProduto ='"
                    + produto + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs.next();

        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    public String adicionarUsuario(Usuario mUsuario) {
        try {
            String sql = "INSERT INTO usuarios (nome, sobrenome, senha, idPerfil) VALUES ('"
                    + mUsuario.getNome() + "', '"
                    + mUsuario.getSobrenome() + "', '"
                    + mUsuario.getSenha() + "', '"
                    + mUsuario.getPerfil() + "')";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Usuario cadastrado com sucesso";

        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
            return "Não foi possível cadastrar este usuário";
        }
    }

    public String adicionarProduto(Produto mProduto) {
        try {
            String sql = "INSERT INTO produtos (descricao, preco, imposto, anotacao) VALUES ('"
                    + mProduto.getDescricao() + "', '"
                    + mProduto.getPreco() + ", "
                    + mProduto.getImposto() + ", '"
                    + mProduto.getAnotacao() + "')";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Produto cadastrado com sucesso";

        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
            return "Não foi possível cadastrar este usuário";
        }
    }

    public String adicionarCliente(Cliente mCliente) {
        try {
            String sql = "INSERT INTO clientes (tipo, nome, sobrenome, endereco, telefone, cidade, dataNascimento, dataCadastro) VALUES ('"
                    + mCliente.getTipo() + "', '"
                    + mCliente.getNome() + "', '"
                    + mCliente.getSobrenome() + ", "
                    + mCliente.getEndereco() + ", '"
                    + mCliente.getTelefone() + ", '"
                    + mCliente.getCidade() + ", '"
                    + Utilidades.formatDate(mCliente.getDataNascimento()) + ", '"
                    + Utilidades.formatDate(mCliente.getDataCadastro()) + "')";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Cliente cadastrado com sucesso";

        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
            return "Não foi possível cadastrar este cliente";
        }
    }

    public String editarUsuario(Usuario mUsuario) {
        try {
            String sql = "UPDATE usuarios SET "
                    + "nome = '" + mUsuario.getNome() + "', "
                    + "sobrenome = '" + mUsuario.getSobrenome() + "', "
                    + "senha = '" + mUsuario.getSenha() + "', "
                    + "idPerfil = '" + mUsuario.getPerfil() + "' "
                    + "WHERE idUsuario = '" + mUsuario.getIdusuario() + "'";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Usuario editado com sucesso";

        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
            return "Não foi possível editar este usuário";
        }
    }

    public String editarProduto(Produto mProduto) {
        try {
            String sql = "UPDATE produtos SET "
                    + "descricao = '" + mProduto.getDescricao() + "', "
                    + "preco = '" + mProduto.getPreco() + "', "
                    + "imposto = '" + mProduto.getImposto() + "', "
                    + "anotacao = '" + mProduto.getAnotacao() + "' "
                    + "WHERE idProduto = '" + mProduto.getIdProduto() + "'";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Produto editado com sucesso";

        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
            return "Não foi possível editar este produto";
        }
    }

    public String editarCliente(Cliente mCliente) {
        try {
            String sql = "INSERT INTO clientes (tipo, nome, sobrenome, endereco, telefone, cidade, dataNascimento, dataCadastro) VALUES ('"
                    + mCliente.getTipo() + "', '"
                    + mCliente.getNome() + "', '"
                    + mCliente.getSobrenome() + ", "
                    + mCliente.getEndereco() + ", '"
                    + mCliente.getTelefone() + ", '"
                    + mCliente.getCidade() + ", '"
                    + Utilidades.formatDate(mCliente.getDataNascimento()) + ", '"
                    + Utilidades.formatDate(mCliente.getDataCadastro()) + "', "
                    + "where idCliente = '" + mCliente.getIdcliente() + "'";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Cliente editado com sucesso";

        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
            return "Não foi possível editar este cliente";
        }
    }

    public String deletarUsuario(String usuario) {
        try {
            String sql = "delete from usuarios where idUsuario = '" + usuario + "'";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Usuário deletado com sucesso";

        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
            return "Não foi possível deletar este usuário";
        }
    }

    public String deletarCliente(String cliente) {
        try {
            String sql = "delete from clientes where idCliente = '" + cliente + "'";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Cliente deletado com sucesso";

        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
            return "Não foi possível deletar este cliente";
        }
    }

    public String deletarProduto(String produto) {
        try {
            String sql = "delete from produtos where idProduto = '" + produto + "'";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Produto deletado com sucesso";

        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
            return "Não foi possível deletar este produto";
        }
    }

    public ResultSet getUsuarios() {
        try {
            String sql = "select * from usuarios";
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);

        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public ResultSet getClientes() {
        try {
            String sql = "select * from clientes";
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);

        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public ResultSet getFatura() {
        try {
            String sql = "select * from fatura";
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);

        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public ResultSet getConsulta(String sql) {
        try {
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);

        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public ResultSet getProdutos() {
        try {
            String sql = "select * from produtos";
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);

        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public int numeroUsuarios() {
        try {
            String sql = "select count(*) as num from usuarios";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("num");
            } else {
                return 0;

            }
        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
            return 0;
        }
    }

    public int numeroClientes() {
        try {
            String sql = "select count(*) as num from clientes";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("num");
            } else {
                return 0;

            }
        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
            return 0;
        }
    }

    public int numeroProdutos() {
        try {
            String sql = "select count(*) as num from produtos";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("num");
            } else {
                return 0;

            }
        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
            return 0;
        }
    }

    public Produto getProduto(String idProduto) {
        try {
            Produto mProduto = null;
            String sql = "select * from produtos " + "where idProduto = '" + idProduto + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                mProduto = new Produto(
                        rs.getString("idproduto"),
                        rs.getString("descricao"),
                        rs.getInt("preco"),
                        rs.getInt("imposto"),
                        rs.getString("anotacao"));
            }
            return mProduto;

        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public int getNumeroFatura() {
        try {
            String sql = "SELECT MAX(idFatura) as numero FROM fatura";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                return rs.getInt("numero") + 1;
            } else {
                return 1;

            }
        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
            return 1;
        }
    }

    public void adicionarFatura(int idFatura, String idCliente, Date data) {
        try {
            String sql = "INSERT INTO fatura VALUES ("
                    + idFatura + ", '"
                    + idCliente + "', '"
                    + Utilidades.formatDate(data) + "')";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
        }
    }

    public void adicionarDetalheFatura(int idFatura, int idLinha, String idProduto, String descricao, int preco, int quantidade) {
        try {
            String sql = "INSERT INTO detalhefatura (idFatura, idLinha, idProduto, descricao, preco, quantidade) VALUES ("
                    + idFatura + ", "
                    + idLinha + ", '"
                    + idProduto + "', '"
                    + descricao + "', "
                    + preco + ", "
                    + quantidade + ")";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException e) {
            Logger.getLogger(Dados.class
                    .getName()).log(Level.SEVERE, null, e);
        }
    }

    public void close() {
        if (cnn != null) {
            try {
                cnn.close();

            } catch (SQLException ex) {
                Logger.getLogger(Dados.class
                        .getName()).log(Level.SEVERE, "Erro ao fechar a conexão", ex);
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
