
import org.junit.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import static org.junit.Assert.assertNotNull;

public class TesteConexaoComProperties {

    @Test
    public void testConexao() {
        Properties props = new Properties();

        try (FileInputStream fis = new FileInputStream("E:\\Projetos Java 2025\\Umbrella-Pharmaceutical-Inc\\src\\config.properties")) {
            props.load(fis);

            String url = props.getProperty("db.url");
            String user = props.getProperty("db.username");
            String password = props.getProperty("db.password");

            try (Connection conn = DriverManager.getConnection(url, user, password)) {
                System.out.println("✅ Conexão estabelecida com sucesso!");
                assertNotNull(conn); // valida que a conexão não é nula
            }

        } catch (IOException e) {
            System.err.println("⚠️ Erro ao carregar o config.properties: " + e.getMessage());
            throw new RuntimeException(e);
        } catch (SQLException e) {
            System.err.println("❌ Erro na conexão com o banco: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
