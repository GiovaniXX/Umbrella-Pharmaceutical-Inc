
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TesteConexaoComProperties {

    public static void main(String[] args) {
        Properties props = new Properties();

        try (FileInputStream fis = new FileInputStream("H:\\Projetos Java 2025\\Umbrella-Pharmaceutical-Inc\\config.properties")) {
            props.load(fis);

            String url = props.getProperty("db.url");
            String user = props.getProperty("db.user");
            String password = props.getProperty("db.password");

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Conexão estabelecida com sucesso!");
            conn.close();

        } catch (IOException e) {
            System.err.println("⚠️ Erro ao carregar o config.properties: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("❌ Erro na conexão com o banco: " + e.getMessage());
        }
    }
}
