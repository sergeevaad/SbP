package org.example;

import java.sql.*;

public class DatabaseManager {
    private static final String URL = "jdbc:h2:./unit7/tododb";
    private static final String USER = "sa";
    private static final String PASSWORD = "";

    public static Connection newConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void initDatabase() throws SQLException {
        try (Connection connection = newConnection()) {
            createTable(connection);
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        String sql = """
                CREATE TABLE IF NOT EXISTS tasks (
                uid INT PRIMARY KEY AUTO_INCREMENT,
                name VARCHAR(255) NOT NULL,
                status VARCHAR(50) NOT NULL
                )
                """;

        try (Statement statement = connection.createStatement()) {
            statement.execute(sql);
        }
    }
}
