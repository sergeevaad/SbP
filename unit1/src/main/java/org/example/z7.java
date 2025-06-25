package org.example;

import java.util.Scanner;

public class z7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько членов последовательности вывести");
        int n = scan.nextInt();
        if (n == 1) {
            System.out.println(0);
        } else {
            int a = 0, b = 1;
            System.out.print(a + " " + b + " ");
            for (int i = 2; i <= n - 1; i++) {
                int temp = b;
                b = a + b;
                a = temp;
                System.out.print(b + " ");
            }
        }
    }
}
