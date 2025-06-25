package org.example;


import java.util.Scanner;

public class z8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letter = "Q";
        while (true) {
            System.out.println("Guess the letter");
            String l = scan.nextLine().toUpperCase();
            if (l.charAt(0) == letter.charAt(0)) {
                System.out.println("Right");
                return;
            } else {
                if (l.charAt(0) < letter.charAt(0)) {
                    System.out.println("You're too low");
                } else {
                    System.out.println("You're too high");
                }
            }
        }
    }
}
