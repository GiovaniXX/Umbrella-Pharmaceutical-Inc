package controller;

import dao.ClienteDAO;
import model.Cliente;

import java.util.List;

public class ClienteController {

    private final ClienteDAO dao;

    public ClienteController() {
        dao = new ClienteDAO();
    }

    public boolean clienteExiste(String idCliente) {
        return dao.existeCliente(idCliente);
    }

    public String cadastrarCliente(Cliente cliente) {
        if (clienteExiste(String.valueOf(cliente.getIdCliente()))) {
            return "Cliente já existe";
        }
        return dao.adicionarCliente(cliente);
    }

    public String atualizarCliente(Cliente cliente) {
        return dao.editarCliente(cliente);
    }

    public String excluirCliente(String idCliente) {
        return dao.deletarCliente(idCliente);
    }

    public List<Cliente> listarClientes() {
        return dao.listarClientes();
    }

//    public Cliente buscarPorNome(String nomeCliente) {
//        return dao.getClientePorNome(nomeCliente);
//    }

    public List<String> listarTelefones() {
        return dao.getTelefonesClientes();
    }

    public int contarClientes() {
        return dao.numeroClientes();
    }

    public String obterNomeCidadePorId(int idCidade) {
        return dao.getNomeCidadePorId(idCidade);
    }

    public Cliente getClientePorNome(String nome) {
        return dao.getClientePorNome(nome);
    }
}
