package org.example;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }

    public double area(){
        return Math.PI*Math.pow(radius,2);
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }

    public String toString(){
        return "Радиус: " + radius + "\nЦвет: "+ color+"\nПлощадь: "+area()+"\nПериметр: "+perimeter();
    }
}
