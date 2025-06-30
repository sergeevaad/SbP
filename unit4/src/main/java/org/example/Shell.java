package org.example;

import java.util.HashMap;
import java.util.Map;

public class Shell {
    private Map<String, Command> commands = new HashMap<>();

    public Shell() {
        commands.put("date", new Date());
        commands.put("time", new Time());
        commands.put("pwd", new Pwd());
        commands.put("help", new Help(commands));
        commands.put("exit", new Exit());
    }

    public void executeCmd(String commandName) {
        Command command = commands.get(commandName);
        if (command != null) {
            command.execute();
        } else {
            System.out.printf("Ошибка: неизвестная команда '%s'\n", commandName);
        }
    }
    
}
