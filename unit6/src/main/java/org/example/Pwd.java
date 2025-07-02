package org.example;

import java.io.File;

@CommandInfo(name = "pwd", description = "выводит теĸущий рабочий ĸаталог")
public class Pwd implements Command {
    @Override
    public void execute() {
        System.out.println(new File("").getAbsolutePath());
    }
}
