package org.example;

@CommandInfo(name = "exit", description = "завершает работу приложения")
public class Exit implements Command {
    @Override
    public void execute() {
        System.exit(0);
    }
}
