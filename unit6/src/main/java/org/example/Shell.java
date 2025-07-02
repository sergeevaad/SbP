package org.example;

import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Shell {
    private Map<String, Command> commands = new HashMap<>();

    public Shell() {
        Reflections reflections = new Reflections("org.example");
        Set<Class<?>> commandClasses = reflections.getTypesAnnotatedWith(CommandInfo.class);
        for (Class<?> clazz : commandClasses) {
            try {
                CommandInfo info = clazz.getAnnotation(CommandInfo.class);
                String commandName = info.name();

                if (clazz == Help.class) {
                    commands.put(commandName, new Help(commands));
                } else {
                    Command command = (Command) clazz.getConstructor().newInstance();
                    commands.put(commandName, command);
                }
            } catch (Exception e) {
                System.err.println("Ошибка при создании команды " + clazz.getSimpleName() + ": " + e.getMessage());
            }
        }
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
