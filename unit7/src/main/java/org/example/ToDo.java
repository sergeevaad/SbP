package org.example;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class ToDo {
    private final Map<String, Command> commands = new HashMap<>();

    public ToDo() {
        try {
            DatabaseManager.initDatabase();
        } catch (SQLException e) {
            System.out.println("Ошибка при создании базы: " + e.getMessage());
        }
        commands.put("add", new Add());
        commands.put("show", new Show());
        commands.put("done", new Done());
        commands.put("help", new Help(commands));
        commands.put("clear", new Clear());
        commands.put("exit", new Exit());
    }

    public void execCommand(String input) {
        String[] parts = input.split(" ", 2);
        String commandName = parts[0];

        Command command = commands.get(commandName);
        if (command != null) {
            command.exec(parts);
        } else {
            System.out.printf("Ошибка: неизвестная команда '%s'\n", commandName);
        }
    }
}
