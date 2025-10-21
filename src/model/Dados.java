package model;

import dao.VendaDAO;
import model.Cliente;
import model.Produto;
import java.sql.ResultSet;
import java.util.List;

public class Dados {

    private final VendaDAO vendaDAO = new VendaDAO();

    public int getNumeroVenda() {
        return vendaDAO.gerarNumeroVenda();
    }

    public Cliente getClientePorNome(String nome) {
        return vendaDAO.buscarClientePorNome(nome);
    }

    public Produto getProdutoPorNome(String nome) {
        return vendaDAO.buscarProdutoPorNome(nome);
    }

    public ResultSet getClientes() {
        return vendaDAO.listarClientes();
    }

    public ResultSet getProdutos() {
        return vendaDAO.listarProdutos();
    }

    public void adicionarVenda(int numeroVenda, int idCliente, java.util.Date data, double valorTotal, int quantidadeTotal,
            String nomeProduto, String descricaoProduto, int idFuncionario, int idFormaPagamento) {
        vendaDAO.salvarVenda(numeroVenda, idCliente, data, valorTotal, quantidadeTotal,
                nomeProduto, descricaoProduto, idFuncionario, idFormaPagamento);
    }

    public void adicionarDetalheVenda(int numeroVenda, int idProduto, double preco, int quantidade) {
        vendaDAO.salvarDetalheVenda(numeroVenda, idProduto, preco, quantidade);
    }
}
