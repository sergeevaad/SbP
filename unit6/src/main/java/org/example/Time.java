package org.example;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@CommandInfo(name = "time", description = "выводит теĸущее время")
public class Time implements Command {
    @Override
    public void execute() {
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm")));
    }

}
