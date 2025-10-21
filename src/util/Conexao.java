package util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    private static HikariDataSource dataSource;

    static {
        try (InputStream input = Conexao.class.getClassLoader().getResourceAsStream("config.properties")) {
            Properties props = new Properties();
            props.load(input);

            HikariConfig config = new HikariConfig();
            config.setJdbcUrl(props.getProperty("db.url"));
            config.setUsername(props.getProperty("db.username"));
            config.setPassword(props.getProperty("db.password"));
            config.setDriverClassName(props.getProperty("db.driver"));

            config.setMaximumPoolSize(Integer.parseInt(props.getProperty("db.pool.maxPoolSize")));
            config.setMinimumIdle(Integer.parseInt(props.getProperty("db.pool.minIdle")));
            config.setIdleTimeout(Long.parseLong(props.getProperty("db.pool.idleTimeout")));
            config.setConnectionTimeout(Long.parseLong(props.getProperty("db.pool.connectionTimeout")));
            config.setMaxLifetime(Long.parseLong(props.getProperty("db.pool.maxLifetime")));

            dataSource = new HikariDataSource(config);
        } catch (IOException | NumberFormatException e) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, "Erro ao carregar configurações", e);
        }
    }

    public static Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, "Erro ao obter conexão", e);
            return null;
        }
    }
}
