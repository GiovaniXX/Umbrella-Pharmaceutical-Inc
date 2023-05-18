package up_classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DadosDB {

    public Connection cnn;

    public DadosDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Properties props = new Properties();
            props.load(new FileInputStream("E:/PROJETOS JAVA 2023/Umbrella_Pharmaceutical_Inc/config.properties"));
            String dbUrl = props.getProperty("db.url");
            String dbUser = props.getProperty("db.user");
            String dbPassword = props.getProperty("db.password");
            cnn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean validarUsuario(String usuario, String senha, String chave) {
        String sql = "SELECT 1 FROM tbusuarios WHERE idUsuario = ? AND senha = ? AND chave = ?";
        try (var ps = cnn.prepareStatement(sql)) {
            ps.setString(1, usuario);
            ps.setString(2, senha);
            ps.setString(3, chave);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int getPerfil(String usuario) {
        String sql = "SELECT idPerfil FROM tbusuarios WHERE idUsuario = ?";
        try (var ps = cnn.prepareStatement(sql)) {
            ps.setString(1, usuario);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("idPerfil");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public boolean existeUsuario(String usuario) {
        String sql = "SELECT COUNT(*) FROM tbusuarios WHERE idUsuario = ?";
        try (var ps = cnn.prepareStatement(sql)) {
            ps.setString(1, usuario);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next() && rs.getInt(1) > 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean existeCliente(String cliente) {
        String sql = "SELECT COUNT(*) FROM tbclientes WHERE idClientes = ?";
        try (var ps = cnn.prepareStatement(sql)) {
            ps.setString(1, cliente);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next() && rs.getInt(1) > 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean existeProduto(String produto) {
        String sql = "SELECT COUNT(*) FROM tbprodutos WHERE idProduto = ?";
        try (var ps = cnn.prepareStatement(sql)) {
            ps.setString(1, produto);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next() && rs.getInt(1) > 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //---------------------------------------------------------------------------------------------------------------------//
    public String adicionarUsuario(Usuario mUsuario) {
        String query = "INSERT INTO tbusuarios (idUsuario, nome, snome, senha, chave, idPerfil) VALUES (?, ?, ?, ?, ?, ?)";
        try (var ps = cnn.prepareStatement(query)) {
            ps.setString(1, mUsuario.getIdUsuario());
            ps.setString(2, mUsuario.getNome());
            ps.setString(3, mUsuario.getSnome());
            ps.setString(4, mUsuario.getSenha());
            ps.setString(5, mUsuario.getChave());
            ps.setInt(6, mUsuario.getPerfil());
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected == 1) {
                return "Usuário cadastrado com sucesso!";
            } else {
                return "Usuário não pode ser cadastrado!";
            }
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
            return "Usuário não pode ser cadastrado devido a um erro de comunicação com o SGBD!";
        }
    }

    public String adicionarProduto(Produto mProduto) {
        String query = "INSERT INTO tbprodutos (idProduto, descricao, preco, idImposto, notas) VALUES (?, ?, ?, ?, ?)";
        try (var ps = cnn.prepareStatement(query)) {
            ps.setInt(1, mProduto.getIdProduto());
            ps.setString(2, mProduto.getDescricao());
            ps.setFloat(3, mProduto.getPreco());
            ps.setDouble(4, mProduto.getImposto());
            ps.setString(5, mProduto.getAnotacao());           
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected == 1) {
                return "Produto cadastrado com sucesso!";
            } else {
                return "Produto não pode ser cadastrado!";
            }
        } catch (SQLException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Não foi possível cadastrar o produto", ex);
            return "Produto não pode ser cadastrado devido a um erro de comunicação com o SGBD!";
        }
    }

    public String adicionarCliente(Cliente mCliente) {
        String query = "INSERT INTO tbclientes (idClientes, idTipo, nome, snome, endereco, telefone, idCidade, dataNascimento, dataCadastro) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (var ps = cnn.prepareStatement(query)) {
            ps.setString(1, mCliente.getIdCliente());
            ps.setInt(2, mCliente.getIdTipo());
            ps.setString(3, mCliente.getNome());
            ps.setString(4, mCliente.getSNome());
            ps.setString(5, mCliente.getEndereco());
            ps.setString(6, mCliente.getTelefone());
            ps.setInt(7, mCliente.getIdCidade());
            ps.setString(8, Utilidades.formatDate(mCliente.getDNascimento()));
            ps.setString(9, Utilidades.formatDate(mCliente.getData()));
            ps.executeUpdate();
            return "Cliente cadastrado com sucesso!";
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
            return "Cliente não pode ser cadastrado devido a um erro de comunicação com o SGBD!";
        }
    }
    //------------------------------------------------------------------------------------------------------------------//
    //------------------------------------------------------------------------------------------------------------------//
    public String cadastrarBoletoBoticario(Boletos mBoletos) {
        String query = "INSERT INTO tbboticario (idboleto, cedente, codigoBarras, dataVencimento, valorPagamento) VALUES (?, ?, ?, ?, ?)";
        try (var ps = cnn.prepareStatement(query)) {
            ps.setInt(1, (mBoletos.getIDBoleto()));
            ps.setString(2, mBoletos.getCedente());
            ps.setDouble(3, mBoletos.getCodigoBarras());
            ps.setDate(4, (java.sql.Date) mBoletos.getDataVencimento());
            ps.setFloat(5, mBoletos.getValorpagar());
            ps.executeUpdate();
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected == 1) {
                return "Boleto cadastrado com sucesso!";
            } else {
                return "Boleto não pode ser cadastrado!";
            }
        } catch (SQLException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Não foi possível cadastrar o boleto", ex);
            return "Boleto não pode ser cadastrado devido a um erro de comunicação com o SGBD!";
        }
    }

    //-----------------------------------------------------------------------------------------------------------------//
    public String editarUsuario(Usuario mUsuario) {
        String sql = "UPDATE tbusuario SET nome = ?, snome = ?, senha = ?, chave = ?, idPerfil = ? WHERE idUsuario = ?";
        try (var ps = cnn.prepareStatement(sql)) {
            ps.setString(1, mUsuario.getNome());
            ps.setString(2, mUsuario.getSnome());
            ps.setString(3, mUsuario.getSenha());
            ps.setString(4, mUsuario.getChave());
            ps.setInt(5, mUsuario.getPerfil());
            ps.setInt(6, Integer.parseInt(mUsuario.getIdUsuario()));
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected == 1) {
                return "Usuário editado com sucesso";
            } else {
                return "Não foi possível editar este usuário!";
            }
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
            return "Não foi possível editar este usuário devido a um erro de comunicação com o SGBD!";
        }
    }

    public String editarCliente(Cliente mCliente) {
        String sql = "UPDATE tbclientes SET idTipo = ?, nome = ?, snome = ?, endereco = ?, telefone = ?, idCidade = ?, dataNascimento = ?, dataCadastro = ? WHERE idClientes = ?";
        try (var ps = cnn.prepareStatement(sql)) {
            ps.setInt(1, mCliente.getIdTipo());
            ps.setString(2, mCliente.getNome());
            ps.setString(3, mCliente.getSNome());
            ps.setString(4, mCliente.getEndereco());
            ps.setString(5, mCliente.getTelefone());
            ps.setInt(6, mCliente.getIdCidade());
            ps.setString(7, Utilidades.formatDate(mCliente.getDNascimento()));
            ps.setString(8, Utilidades.formatDate(mCliente.getData()));
            ps.setInt(9, Integer.parseInt(mCliente.getIdCliente()));
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected == 1) {
                return "Cliente editado com sucesso";
            } else {
                return "Não foi possível editar este cliente!";
            }
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
            return "Não foi possível editar este cliente devido a um erro de comunicação com o SGBD!";
        }
    }

    public String editarProduto(Produto mProduto) {
        String sql = "UPDATE tbprodutos SET descricao = ?, preco = ?, idImposto = ?, notas = ? WHERE idProduto = ?";
        try (var ps = cnn.prepareStatement(sql)) {
            ps.setString(1, mProduto.getDescricao());
            ps.setFloat(2, mProduto.getPreco());
            ps.setInt(3, mProduto.getImposto());
            ps.setString(4, mProduto.getAnotacao());
            ps.setInt(5, mProduto.getIdProduto());
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                return "Produto editado com sucesso";
            } else {
                return "Não foi possível editar este produto!";
            }
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
            return "Não foi possível editar este produto devido a um erro de comunicação com o SGBD!";
        }
    }

    public String deletarUsuario(String usuarioId) {
        try {
            String sql = "DELETE FROM tbusuarios WHERE idUsuario = ?";
            var ps = cnn.prepareStatement(sql);
            ps.setString(1, usuarioId);
            ps.executeUpdate();

            return "Usuário deletado com sucesso!";
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
            return "Não foi possível deletar este usuário!";
        }
    }

    public String deletarCliente(String idCliente) {
        String sql = "DELETE FROM tbclientes WHERE idCliente = ?";
        try (var ps = cnn.prepareStatement(sql)) {
            ps.setString(1, idCliente);
            int rowsDeleted = ps.executeUpdate();

            if (rowsDeleted > 0) {
                return "Cliente deletado com sucesso!";
            } else {
                return "Não foi possível encontrar um cliente com o id informado!";
            }
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
            return "Não foi possível deletar este cliente!";
        }
    }

    public String deletarProduto(String idProduto) {
        String sql = "DELETE FROM tbprodutos WHERE idProduto = ?";
        try (var ps = cnn.prepareStatement(sql)) {
            ps.setString(1, idProduto);
            int result = ps.executeUpdate();

            if (result > 0) {
                return "Produto deletado com sucesso!";
            } else {
                return "Não foi possível deletar este produto!";
            }

        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
            return "Não foi possível deletar este produto!";
        }
    }

    //---------------------------------------------------------------------------------------------------//
    public String deletarBoleto(String IDBoleto) {
        String sql = "DELETE FROM tbboticario WHERE idboleto = ?";
        try (var ps = cnn.prepareStatement(sql)) {
            ps.setString(1, IDBoleto);
            int result = ps.executeUpdate();

            if (result > 0) {
                return "Boleto deletado com sucesso!";
            } else {
                return "Não foi possível deletar este boleto!";
            }

        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
            return "Não foi possível deletar este boleto!";
        }
    }

    //---------------------------------------------------------------------------------------------------//
    public ResultSet getUsuarios() {
        try {
            String sql = "SELECT * FROM tbusuarios";
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ResultSet getClientes() {
        try {
            String sql = "SELECT * FROM tbclientes";

            Statement st = cnn.createStatement();
            return st.executeQuery(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }
    }

    public ResultSet getProdutos() {
        try {
            String sql = "SELECT * FROM tbprodutos";

            Statement st = cnn.createStatement();
            return st.executeQuery(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }
    }

    public ResultSet getVendas() {
        try {
            String sql = "SELECT * FROM tbvendas";

            Statement st = cnn.createStatement();
            return st.executeQuery(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }
    }

    //-----------------------------------------------------------------------------------------------------//
    public ResultSet getBoletos() {
        try {
            String sql = "SELECT * FROM tbboticario";

            Statement st = cnn.createStatement();
            return st.executeQuery(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }
    }
    //-----------------------------------------------------------------------------------------------------//

    public ResultSet getConsulta(String sql) {
        try {
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }
    }

    public int numeroUsuarios() {
        try {
            String sql = "SELECT COUNT(*) AS num FROM tbusuarios";

            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                return rs.getInt("num");
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public int numeroClientes() {
        try {
            String sql = "SELECT COUNT(*) AS num FROM tbclientes";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                return rs.getInt("num");
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public int numeroProdutos() {
        try {
            String sql = "SELECT COUNT(*) AS num FROM tbprodutos";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                return rs.getInt("num");
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    //-----------------------------------------------------------------------------------------------------//
    public int numeroBoletos() {
        try {
            String sql = "SELECT COUNT(*) AS num FROM tbboticario";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                return rs.getInt("num");
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    //-----------------------------------------------------------------------------------------------------//

    public Produto getProduto(String idProduto) {
        try {
            Produto mProduto = null;
            String sql = "SELECT * FROM tbprodutos " + "WHERE idProduto = '" + idProduto + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                mProduto = new Produto(
                        rs.getInt("idProduto"),
                        rs.getString("descricao"),
                        rs.getFloat("preco"),
                        rs.getInt("idImposto"),
                        rs.getString("notas"));
            }
            return mProduto;
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int getNumeroVenda() {
        try {
            String sql = "select max(idVenda) as from tbvendas";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                return rs.getInt("num") + 1;
            } else {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }

    //---------------------------------------------------------------------------------------------------//
    public int getNumeroBoleto() {
        try {
            String sql = "SELECT MAX(idboleto) AS FROM tbboticario";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                return rs.getInt("num") + 1;
            } else {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }
    //---------------------------------------------------------------------------------------------------//

    public void adicionarVendas(int idVenda, String idCliente, Date fdata) {
        try {
            String sql = "INSERT INTO tbvendas VALUES("
                    + idVenda + ", '"
                    + idCliente + "', '"
                    + Utilidades.formatDate(fdata) + "') ";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void adicionarDetalheVendas(int idVenda, int idLinha, String idProduto, String descricao, int preco, int quantidade) {
        try {
            String sql = "INSET INTO tbdetalhevendas VALUES("
                    + idVenda + ", "
                    + idLinha + ", '"
                    + idProduto + "', '"
                    + descricao + "', "
                    + preco + ", "
                    + quantidade + ")";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void trocarSenha(String usuario, String senha) {
        try {
            String chave = null;
            String sql = "UPDATE tbusuarios SET"
                    + "senha = '" + senha + "' "
                    + "chave = '" + chave + "' "
                    + "WHERE idUsuario = '" + usuario + "'";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
