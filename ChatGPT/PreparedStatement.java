package up_classes;

import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;

public class PreparedStatement {

    private String sql;
    private Object[] params;
    private Connection cnn;

    public PreparedStatement(Connection cnn, String sql, Object[] params) {
        this.cnn = cnn;
        this.sql = sql;
        this.params = params;
    }

    public void setInt(int index, int value) {
        params[index - 1] = value;
    }

    public void setString(int index, String value) {
        params[index - 1] = value;
    }

    public void setDate(int index, java.sql.Date value) {
        params[index - 1] = value;
    }

    public int executeUpdate() throws SQLException {
        try (java.sql.PreparedStatement st = cnn.prepareStatement(sql)) {
            for (int i = 0; i < params.length; i++) {
                st.setObject(i + 1, params[i]);
            }
            return st.executeUpdate();
        }
    }
}