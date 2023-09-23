
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import java.sql.Connection;
import java.sql.SQLException;
import up_classes.Dados;

public class UserDAOTest {

    @Mock
    private Connection mockConnection;
    private Dados dados;

    @Before
    public void setUp() {
        mockConnection = mock(Connection.class);
        //Dados = new Dados(mockConnection);
    }

    @Test
    public void testErroConexaoFechada() {
        // Simule um erro de conexão fechada lançando uma exceção SQLException
        try {
            when(mockConnection.prepareStatement(anyString())).thenThrow(new SQLException("Connection closed"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Realize uma chamada ao método que deveria causar a exceção
        boolean result = dados.validarUsuario("id", "senha", "chave");

        // Verifique se o resultado indica que ocorreu um erro
        assertFalse(result);
    }
}
