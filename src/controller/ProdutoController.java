package controller;

import dao.ProdutoDAO;
import model.Produto;

import java.util.List;

public class ProdutoController {

    private final ProdutoDAO produtoDAO;

    public ProdutoController() {
        this.produtoDAO = new ProdutoDAO();
    }

    public boolean produtoExiste(String idProduto) {
        return produtoDAO.existeProduto(idProduto);
    }

    public String cadastrarProduto(Produto produto) {
        if (produtoExiste(String.valueOf(produto.getIdProduto()))) {
            return "Produto já existe";
        }
        return produtoDAO.adicionarProduto(produto);
    }

    public String atualizarProduto(Produto produto) {
        return produtoDAO.editarProduto(produto);
    }

    public String excluirProduto(String idProduto) {
        int id = Integer.parseInt(idProduto);
        return produtoDAO.deletarProduto(id);
    }

    public List<Produto> listarProdutos() {
        return produtoDAO.listarProdutos();
    }

    public Produto buscarPorId(int idProduto) {
        return produtoDAO.getProduto(String.valueOf(idProduto));
    }

    public Produto getProdutoPorNome(String nome) {
        return produtoDAO.getProdutoPorNome(nome);
    }

    public Produto getProdutoPorId(int idProduto) {
        return produtoDAO.getProdutoPorId(idProduto);
    }

    public int contarProdutos() {
        return produtoDAO.numeroProdutos();
    }
}
