package controller;

import dao.VendaDAO;
import java.math.BigDecimal;
import java.sql.Connection;
import model.Cliente;
import model.Produto;
import java.util.Date;

public class VendaController {

    Connection conn;
    private final VendaDAO dao;

    public VendaController(Connection conn) {
        if (conn == null) {
            throw new IllegalArgumentException("Conexão não pode ser nula");
        }
        this.conn = conn;
        this.dao = new VendaDAO(conn);
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

    public int adicionarVenda(int idUsuario, int numeroVenda, Date data, double valorTotal, int quantidade,
            int idCliente, String produto, String descricao, BigDecimal preco, int idProduto) {
        return dao.salvarVenda(idUsuario, numeroVenda, idCliente, data, valorTotal, quantidade, produto, descricao, preco, idProduto);
    }

    public void adicionarDetalheVenda(int idVenda, int idProduto, BigDecimal preco, int quantidade) {
        dao.salvarDetalheVenda(idVenda, idProduto, preco, quantidade);
    }
}
