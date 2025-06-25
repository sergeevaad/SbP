package org.example;

import java.util.Scanner;

public class z3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        String a = scan.nextLine();
        for (int i = 0; i < a.length() / 2; i++) {
            if (a.charAt(i) != a.charAt(a.length() - i - 1)) {
                System.out.println("Это не палиндром!");
                return;
            }
        }
        System.out.println("Это палиндром!");
    }
}
