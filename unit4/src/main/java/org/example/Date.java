package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Date implements Command {
    @Override
    public void execute() {
        System.out.println(LocalDate.now());
    }

    public String getName(){
        return "date";
    }

    public String getDescription(){
        return "выводит теĸущую дату";
    }
}
