package org.example;

import java.util.Map;

@CommandInfo(name = "help", description = "выводит списоĸ доступных ĸоманд с их описанием")
public class Help implements Command {
    private Map<String, Command> commandsHelp;

    public Help(Map<String, Command> commandsHelp) {
        this.commandsHelp = commandsHelp;
    }

    @Override
    public void execute() {
        for (Command command : commandsHelp.values()) {
            CommandInfo info = command.getClass().getAnnotation(CommandInfo.class);
            System.out.printf("%s - %s\n", info.name(), info.description());
        }
    }
}
