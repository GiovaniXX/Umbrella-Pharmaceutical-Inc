package controller;

import dao.CidadeDAO;
import model.Cidade;

import java.util.List;

public class CidadeController {

    private final CidadeDAO dao;

    public CidadeController() {
        dao = new CidadeDAO();
    }

    public boolean cidadeExiste(int idCidade) {
        return dao.existeCidade(idCidade);
    }

    public String cadastrarCidade(Cidade cidade) {
        if (cidadeExiste(cidade.getIdCidade())) {
            return "Cidade já cadastrada";
        }
        return dao.adicionarCidade(cidade);
    }

    public String atualizarCidade(Cidade cidade) {
        return dao.editarCidade(cidade);
    }

    public String excluirCidade(int idCidade) {
        return dao.deletarCidade(idCidade);
    }

    public Cidade buscarPorId(int idCidade) {
        return dao.getCidadePorId(idCidade);
    }

    public Cidade buscarPorNome(String nomeCidade) {
        return dao.getCidadePorNome(nomeCidade);
    }

    public List<Cidade> listarCidades() {
        return dao.listarCidades();
    }

    public int contarCidades() {
        return dao.numeroCidades();
    }
}
