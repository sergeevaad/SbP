package org.example;

public class z4 {
    public static void main(String[] args) {
        int n = 123;
        int a = n, s = 0;
        while (a != 0) {
            s += a % 10;
            a /= 10;
        }
        System.out.printf("Сумма цифр числа %d = %d", n, s);
    }
}
