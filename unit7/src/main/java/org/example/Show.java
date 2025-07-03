package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Show implements Command {
    @Override
    public void exec(String[] args) {
        String sql = "SELECT uid, name, status FROM tasks";

        try (Connection connection = DatabaseManager.newConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                int uid = resultSet.getInt("uid");
                String name = resultSet.getString("name");
                String status = resultSet.getString("status");
                System.out.printf("%d %s %s%n", uid, name, status);

            }

        } catch (SQLException e) {
            System.out.println("Ошибка при получении задач: " + e.getMessage());
        }
    }

    @Override
    public String getName() {
        return "show";
    }

    @Override
    public String getDescription() {
        return "отображение списка задач";
    }
}
