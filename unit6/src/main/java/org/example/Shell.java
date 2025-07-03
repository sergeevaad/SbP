package org.example;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Shell {
    private Map<String, Command> commands = new HashMap<>();

    public Shell() {
        findCommands();
    }

    private void findCommands(){
        String packageName = "org.example";
        String packagePath = packageName.replace('.', '/');
        URL packageUrl = getClass().getClassLoader().getResource(packagePath);

        if (packageUrl == null) {
            System.out.println("Package not found: " + packageName);
            return;
        }

        File packageDir = new File(packageUrl.getFile());
        File[] classFiles = packageDir.listFiles((dir, name) -> name.endsWith(".class"));

        if (classFiles != null) {
            for (File file : classFiles) {
                String className = packageName + '.' + file.getName().replace(".class", "");
                registerCommand(className);
            }
        }
    }


    private void registerCommand(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            CommandInfo info = clazz.getAnnotation(CommandInfo.class);

            if (info != null && !clazz.equals(Help.class)) {
                commands.put(info.name(), (Command) clazz.getConstructor().newInstance());
            }else if (info != null){
                commands.put(info.name(), new Help(commands));
            }
        } catch (Exception e) {
            System.out.println("Ошибка при регистрации команды: " + className);
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
