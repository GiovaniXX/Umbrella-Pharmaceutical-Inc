package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;
import util.Conexao;

public class ClienteDAO {

    public boolean existeCliente(String idCliente) {
        String sql = "SELECT 1 FROM clientes WHERE idcliente = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, idCliente);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    public String adicionarCliente(Cliente cliente) {
        String sql = "INSERT INTO clientes (nome, sobrenome, email, endereco, telefone, cidade, dataCadastro) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cliente.getNome());
            pstmt.setString(2, cliente.getSobrenome());
            pstmt.setString(3, cliente.getEmail());
            pstmt.setString(4, cliente.getEndereco());
            pstmt.setString(5, cliente.getTelefone());
            pstmt.setInt(6, cliente.getIdCidade());
            pstmt.setDate(7, new java.sql.Date(cliente.getDataCadastro().getTime()));
            pstmt.executeUpdate();
            return "Cliente cadastrado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível cadastrar este cliente";
        }
    }

    public String editarCliente(Cliente cliente) {
        String sql = "UPDATE clientes SET nome = ?, sobrenome = ?, email = ?, endereco = ?, telefone = ?, idcidade = ?, dataCadastro = ? WHERE idcliente = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cliente.getNome());
            pstmt.setString(2, cliente.getSobrenome());
            pstmt.setString(3, cliente.getEmail());
            pstmt.setString(4, cliente.getEndereco());
            pstmt.setString(5, cliente.getTelefone());
            pstmt.setInt(6, cliente.getIdCidade());
            pstmt.setDate(7, new java.sql.Date(cliente.getDataCadastro().getTime()));
            pstmt.setInt(8, cliente.getIdCliente());
            pstmt.executeUpdate();
            return "Cliente editado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível editar este cliente";
        }
    }

    public String deletarCliente(String idCliente) {
        String sql = "DELETE FROM clientes WHERE idcliente = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, idCliente);
            pstmt.executeUpdate();
            return "Cliente deletado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível deletar este cliente";
        }
    }

    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM clientes";
        try (Connection conn = Conexao.getConnection(); Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idcliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setSobrenome(rs.getString("sobrenome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setIdCidade(rs.getInt("cidade"));
                cliente.setDataCadastro(rs.getDate("dataCadastro"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return clientes;
    }

    public int numeroClientes() {
        String sql = "SELECT COUNT(*) AS num FROM clientes";
        try (Connection conn = Conexao.getConnection(); Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            return rs.next() ? rs.getInt("num") : 0;
        } catch (SQLException e) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
            return 0;
        }
    }

    public List<String> getTelefonesClientes() {
        List<String> telefones = new ArrayList<>();
        String sql = "SELECT telefone FROM clientes";
        try (Connection conn = Conexao.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                telefones.add(rs.getString("telefone"));
            }
        } catch (SQLException e) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return telefones;
    }

    public Cliente getClientePorNome(String nomeCliente) {
        String sql = "SELECT * FROM clientes WHERE nome = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nomeCliente);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setIdCliente(rs.getInt("idcliente"));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setSobrenome(rs.getString("sobrenome"));
                    cliente.setEmail(rs.getString("email"));
                    cliente.setEndereco(rs.getString("endereco"));
                    cliente.setTelefone(rs.getString("telefone"));
                    cliente.setIdCidade(rs.getInt("cidade"));
                    cliente.setDataCadastro(rs.getDate("dataCadastro"));
                    return cliente;
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, "Erro ao buscar cliente por nome", e);
        }
        return null;
    }

    public String getNomeCidadePorId(int idCidade) {
        String sql = "SELECT nome FROM cidades WHERE idcidade = ?";
        try (Connection conn = Conexao.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idCidade);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("nome");
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return "";
    }
}
