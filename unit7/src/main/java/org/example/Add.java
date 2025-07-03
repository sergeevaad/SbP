package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Add implements Command {

    @Override
    public void exec(String[] args) {
        if (args.length < 2 || args[1].isEmpty()) {
            System.out.println("Ошибка: укажите название задачи");
            return;
        }
        String sql = "INSERT INTO tasks (name, status) VALUES (?,'(В процессе)')";
        try (Connection connection = DatabaseManager.newConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, args[1]);
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Ошибка при добавлении задачи: " + e.getMessage());
        }
    }

    @Override
    public String getName() {
        return "add";
    }

    @Override
    public String getDescription() {
        return "добавление новой задачи в список";
    }
}
