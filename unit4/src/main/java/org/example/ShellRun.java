package org.example;

import java.util.Scanner;

public class ShellRun {
    public static void main(String[] args){
        Shell shell = new Shell();
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.print("> ");
            String input = scan.nextLine().trim().toLowerCase();

            if (input.isEmpty()) {
                continue;
            }

            if (shell.isExit(input)) {
                return;
            }

            shell.executeCmd(input);
        }
    }
}
