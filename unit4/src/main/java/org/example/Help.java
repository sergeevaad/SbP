package org.example;

import java.util.Map;

public class Help implements Command{
    private Map<String,Command> commandsHelp;

    public Help(Map<String,Command> commandsHelp){
        this.commandsHelp=commandsHelp;
    }
    @Override
    public void execute() {
        for (Command command: commandsHelp.values()){
            System.out.printf("%s - %s\n",command.getName(),command.getDescription());
        }
    }

    public String getName(){
        return "help";
    }

    public String getDescription(){
        return "выводит списоĸ доступных ĸоманд с их описанием";
    }
}
