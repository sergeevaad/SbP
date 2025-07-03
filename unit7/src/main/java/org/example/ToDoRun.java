package org.example;

import java.util.Scanner;

public class ToDoRun {
    public static void main(String[] args) {
        ToDo toDo = new ToDo();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                continue;
            }

            toDo.execCommand(input);
        }
    }
}
