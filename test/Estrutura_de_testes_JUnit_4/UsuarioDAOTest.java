package Estrutura_de_testes_JUnit_4;

import dao.UsuarioDAO;
import model.Usuario;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static org.junit.Assert.*;

public class UsuarioDAOTest {

    private UsuarioDAO dao;

    @Before
    public void setUp() throws Exception {
        dao = new UsuarioDAO();
        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1", "sa", ""); Statement stmt = conn.createStatement()) {
            stmt.execute("DROP TABLE IF EXISTS usuarios");
            stmt.execute("CREATE TABLE usuarios ("
                    + "idUsuario INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nome VARCHAR(100),"
                    + "sobrenome VARCHAR(100),"
                    + "usuario VARCHAR(100),"
                    + "senha VARCHAR(50),"
                    + "chave VARCHAR(100),"
                    + "idPerfil INT)");
        }
    }

    @After
    public void tearDown() throws Exception {
        // Limpa a tabela após cada teste
        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1", "sa", ""); Statement stmt = conn.createStatement()) {
            stmt.execute("DELETE FROM usuarios");
        }
    }

    @Test
    public void testInserirUsuario() {
        Usuario usuario = new Usuario(
                0,
                "João",
                "Silva",
                "joaosilva",
                "senha123",
                "chaveABC",
                1
        );

        String resultado = dao.adicionarUsuario(usuario);
        assertEquals("Usuário cadastrado com sucesso!", resultado);

        boolean validado = dao.validarUsuario("joaosilva", "senha123", "chaveABC");
        assertTrue(validado);
    }
}

/*
✅ Checklist de Boas Práticas para DAOs e Testes
Estrutura da Tabela
Defina chave primária com AUTO_INCREMENT para IDs (idProduto, idUsuario, etc.).

Use tipos adequados (ex.: DECIMAL para preços, VARCHAR para textos).

Garanta restrições de integridade (NOT NULL, UNIQUE quando necessário).

DAO (Data Access Object)
Inserção (INSERT)

Use PreparedStatement com Statement.RETURN_GENERATED_KEYS.

Capture o ID gerado e atualize o objeto em memória.

Atualização (UPDATE)

Sempre use WHERE id = ? para evitar atualizar múltiplos registros.

Retorne mensagens diferentes para sucesso ou falha.

Exclusão (DELETE)

Use WHERE id = ?.

Retorne mensagens distintas: "excluído com sucesso" ou "não encontrado".

Busca (SELECT)

Prefira buscar por ID (único).

Se buscar por nome, esteja ciente de duplicatas.

Retorne null se não encontrar nada.

Listagem

Retorne uma lista de objetos preenchidos.

Nunca retorne null; se não houver registros, retorne lista vazia.

Testes de Integração (JUnit + H2/MySQL)
Preparação

Use @Before para recriar a tabela em memória (H2).

Use DROP TABLE IF EXISTS para evitar conflitos.

Isolamento

Cada teste deve começar com o banco limpo.

Evite depender de dados pré-existentes no PROD.

Validação

Sempre valide pelo ID único.

Evite validar por atributos duplicáveis (nome, email, etc.).

Mensagens

Teste tanto cenários de sucesso quanto de falha (ex.: tentar excluir ID inexistente).

Consistência

Garanta que os testes passem tanto em H2 quanto em MySQL.

Boas Práticas Extras
Centralize a conexão em uma classe utilitária (Conexao).

Use try-with-resources para fechar conexões automaticamente.

Logue erros com Logger, mas não exponha detalhes sensíveis.

Mantenha mensagens de retorno consistentes e claras.
*/
