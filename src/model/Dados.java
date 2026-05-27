package model;

import dao.VendaDAO;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
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
            int quantidadeTotal) {
        java.sql.Timestamp ts = new java.sql.Timestamp(data.getTime());
        vendaDAO.salvarVenda(idUsuario, numeroVenda, idCliente, ts, valorTotal, quantidadeTotal);
        //vendaDAO.salvarVenda(idUsuario, numeroVenda, idCliente, (Date) data, valorTotal, quantidadeTotal);
    }

    public void adicionarItensVenda(int idVenda, List<ItemVenda> itens) {
        vendaDAO.salvarItensVenda(idVenda, itens);
    }

}
