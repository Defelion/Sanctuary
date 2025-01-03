package dk.hbp.def.hub.datamanager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    private String URL;
    private String user;
    private String pass;

    public Conn() throws IOException {
        URL = "jdbc:postgresql://localhost:5432/OperationDB";
        user = "sem4pro";
        pass = "Pro2024";
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("PostgreSQL JDBC driver not found", e);
        }
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, user, pass);
    }

    public String getURL() { return URL; }
    public String getUser() { return user; }
    public String getPass() { return pass; }
}
