package org.example;

import java.util.Scanner;

public class z9 {
    public static void main(String[] args) {
        double a=1,b=4,c=3;
        double D=Math.pow(b,2)-4*a*c;
        if (D<0){
            System.out.println("Корней нет");
        }else if(D==0){
            double x=-b/(2*a);
            System.out.println("Уравнение имеет 1 корень: "+x);
        }else{
            double x1=(-b-Math.sqrt(D))/(2*a);
            double x2=(-b+Math.sqrt(D))/(2*a);
            System.out.println("Уравнение имеет 2 корня: "+x1+" и "+x2);
        }
    }
}
