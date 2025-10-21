package controller;

import dao.ProdutoDAO;
import model.Produto;

import java.util.List;

public class ProdutoController {

    private final ProdutoDAO dao;

    public ProdutoController() {
        dao = new ProdutoDAO();
    }

    public boolean produtoExiste(String idProduto) {
        return dao.existeProduto(idProduto);
    }

    public String cadastrarProduto(Produto produto) {
        if (produtoExiste(String.valueOf(produto.getIdProduto()))) {
            return "Produto já existe";
        }
        return dao.adicionarProduto(produto);
    }

    public String atualizarProduto(Produto produto) {
        return dao.editarProduto(produto);
    }

    public String excluirProduto(String idProduto) {
        return dao.deletarProduto(idProduto);
    }

    public List<Produto> listarProdutos() {
        return dao.listarProdutos();
    }

    public Produto buscarPorId(int idProduto) {
        return dao.getProduto(String.valueOf(idProduto));
    }

    public Produto getProdutoPorNome(String nome) {
        return dao.getProdutoPorNome(nome);
    }

    public String obterNomePorId(int idProduto) {
        return dao.getNomeProdutoPorId(idProduto);
    }

    public int contarProdutos() {
        return dao.numeroProdutos();
    }
}
