package org.example;

public class Exit implements Command{
    @Override
    public void execute() {

    }

    public String getName(){
        return "exit";
    }

    public String getDescription(){
        return "завершает работу приложения";
    }
}
