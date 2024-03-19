import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// postgreSQL database connection
public class DBUtil {
    private static final String URL = "jdbc:postgresql://localhost:5432/a3";
    private static final String USER = "postgres";
    static final String PASSWORD = "postgres";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
