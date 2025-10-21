package controller;

import dao.VendaDAO;
import model.Cliente;
import model.Produto;
import java.util.Date;

public class VendaController {

    private final VendaDAO dao;

    public VendaController() {
        dao = new VendaDAO();
    }

    public int getNumeroVenda() {
        return dao.gerarNumeroVenda();
    }

    public Cliente getClientePorNome(String nome) {
        return dao.buscarClientePorNome(nome);
    }

    public Produto getProdutoPorNome(String nome) {
        return dao.buscarProdutoPorNome(nome);
    }

    public void adicionarVenda(int numeroVenda, int idCliente, Date data, double valorTotal, int quantidadeTotal,
            String nomeProduto, String descricaoProduto, int idFuncionario, int idFormaPagamento) {
        dao.salvarVenda(numeroVenda, idCliente, data, valorTotal, quantidadeTotal,
                nomeProduto, descricaoProduto, idFuncionario, idFormaPagamento);
    }

    public void adicionarDetalheVenda(int numeroVenda, int idProduto, double preco, int quantidade) {
        dao.salvarDetalheVenda(numeroVenda, idProduto, preco, quantidade);
    }
}
