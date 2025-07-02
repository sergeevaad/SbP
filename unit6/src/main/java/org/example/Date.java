package org.example;

import java.time.LocalDate;

@CommandInfo(name = "date", description = "выводит текущую дату")
public class Date implements Command {
    @Override
    public void execute() {
        System.out.println(LocalDate.now());
    }
}
