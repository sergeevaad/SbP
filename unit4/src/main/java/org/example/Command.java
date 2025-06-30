package org.example;

public interface Command {
    void execute();

    String getName();

    String getDescription();
}
