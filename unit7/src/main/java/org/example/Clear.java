package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Clear implements Command {
    @Override
    public void exec(String[] args) {
        try (Connection connection = DatabaseManager.newConnection();
             Statement statement = connection.createStatement()) {

            statement.executeUpdate("DELETE FROM tasks");

            statement.executeUpdate("ALTER TABLE tasks ALTER COLUMN uid RESTART WITH 1");

        } catch (SQLException e) {
            System.out.println("Ошибка при очистке таблицы: " + e.getMessage());
        }
    }

    @Override
    public String getName() {
        return "clear";
    }

    @Override
    public String getDescription() {
        return "удаляет все задачи из списка";
    }
}
