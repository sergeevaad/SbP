package org.example;

import java.util.Scanner;

public class z5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите вес на Земле");
        float weight = scan.nextFloat();
        System.out.print("Тот же вес на луне: " + weight*0.17);
    }
}
