package org.example;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time implements Command{
    @Override
    public void execute() {
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm")));
    }

    public String getName(){
        return "time";
    }

    public String getDescription(){
        return "выводит теĸущее время";
    }
}
