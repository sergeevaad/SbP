package org.example;

import java.util.Scanner;

public class z10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scan.nextInt();
        String[] e = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] dec = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
        System.out.println("Ваше число в римской записи: " + dec[n / 10] + e[n % 10]);
    }
}
