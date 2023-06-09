package jm.task.core.jdbc.util;
import java.sql.*;

public class Util {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/mybase";
    private static final String USERNAME = "Administrator";
    private static final String PASSWORD = "admin";
    private static Connection connection = null;
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception ignored) {
        }
        return connection;
    }
    public static void close() {
        try {
            connection.close();
        } catch (SQLException ignored) {
        }
    }
}