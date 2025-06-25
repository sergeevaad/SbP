package org.example;

import java.util.Scanner;

public class z6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scan.nextInt();
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                System.out.println("Это число не является простым");
                return;
            }
        }
        System.out.println("Это простое число");
    }
}
