package org.example;

public class Exit implements Command {
    @Override
    public void exec(String[] args) {
        System.exit(0);
    }

    @Override
    public String getName() {
        return "exit";
    }

    @Override
    public String getDescription() {
        return "завершает работу приложения";
    }
}
