package org.example;

import java.io.File;

public class Pwd implements Command {
    @Override
    public void execute() {
        System.out.println(new File("").getAbsolutePath());
    }

    public String getName() {
        return "pwd";
    }

    public String getDescription() {
        return "выводит теĸущий рабочий ĸаталог";
    }
}
