package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Done implements Command {
    @Override
    public void exec(String[] args) {
        if (args.length < 2) {
            System.out.println("Ошибка: укажите ID задачи");
            return;
        }

        int taskUID = Integer.parseInt(args[1]);
        String sql = "UPDATE tasks SET status = '(Готово)' WHERE uid = ?";

        try (Connection connection = DatabaseManager.newConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, taskUID);
            int updateCount = statement.executeUpdate();

            if (updateCount == 0) {
                System.out.println("Задача с UID " + taskUID + " не найдена");
            }

        } catch (SQLException e) {
            System.out.println("Ошибка при обновлении задачи: " + e.getMessage());
        }
    }

    @Override
    public String getName() {
        return "done";
    }

    @Override
    public String getDescription() {
        return "завершение задачи";
    }
}
