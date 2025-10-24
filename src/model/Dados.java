package model;

import dao.VendaDAO;
import java.math.BigDecimal;
import model.Cliente;
import model.Produto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

public class Dados {

    private final VendaDAO vendaDAO;

    public Dados(Connection conn) {
        this.vendaDAO = new VendaDAO(conn);
    }

    public int getNumeroVenda() {
        return vendaDAO.gerarNumeroVenda();
    }

    public Cliente getClientePorNome(String nome) {
        return vendaDAO.buscarClientePorNome(nome);
    }

    public Produto getProdutoPorNome(String nome) {
        return vendaDAO.buscarProdutoPorNome(nome);
    }

    public List<String> getNomesClientes() {
        return vendaDAO.listarNomesClientes();
    }

    public List<String> getNomesProdutos() {
        return vendaDAO.listarNomesProdutos();
    }

    public void adicionarVenda(int idUsuario, int numeroVenda, int idCliente, java.util.Date data, double valorTotal,
            int quantidadeTotal, String nomeProduto, String descricaoProduto,
            BigDecimal preco, int idProduto) {
        vendaDAO.salvarVenda(idUsuario, numeroVenda, idCliente, data, valorTotal, quantidadeTotal,
                nomeProduto, descricaoProduto, preco, idProduto);
    }

    public void adicionarDetalheVenda(int numeroVenda, int idProduto, BigDecimal preco, int quantidade) {
        vendaDAO.salvarDetalheVenda(numeroVenda, idProduto, preco, quantidade);
    }
}
