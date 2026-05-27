package controller;

import dao.VendaDAO;
import java.sql.Connection;
import model.Cliente;
import model.Produto;
import java.util.Date;
import java.util.List;
import model.ItemVenda;
import model.Venda;

public class VendaController {

    Connection conn;
    private VendaDAO vendaDAO;
    private VendaDAO dao;

    public VendaController(Connection conn) {
        if (conn == null) {
            throw new IllegalArgumentException("Conexão não pode ser nula");
        }
        this.conn = conn;
        this.dao = new VendaDAO(conn);
        this.vendaDAO = new VendaDAO(conn);
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
            int idCliente) {
        java.sql.Timestamp ts = new java.sql.Timestamp(data.getTime());
        return dao.salvarVenda(idUsuario, numeroVenda, idCliente, ts, valorTotal, quantidade);
    }

    public int adicionarVendaComItens(int idUsuario, int numeroVenda, Date data, double valorTotal, int quantidade,
            int idCliente, List<ItemVenda> itens) {
        java.sql.Timestamp ts = new java.sql.Timestamp(data.getTime());
        int idVenda = dao.salvarVenda(idUsuario, numeroVenda, idCliente, ts, valorTotal, quantidade);

        if (idVenda > 0) {
            dao.salvarItensVenda(idVenda, itens);
        }
        return idVenda;
    }

    public List<Venda> listarVendas() {
        return vendaDAO.buscarTodasVendas();
    }

    public String excluirVenda(int idVenda) {
        boolean sucesso = vendaDAO.deletarVendaPorId(idVenda);
        if (sucesso) {
            return "Venda excluída com sucesso!";
        } else {
            return "Erro ao tentar excluir a venda.";
        }
    }
}
