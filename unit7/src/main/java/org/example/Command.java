package org.example;

public interface Command {
    public void exec(String[] args);

    String getName();

    String getDescription();
}
