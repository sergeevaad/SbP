package org.example;

public class PaintExample {
    public static void main(String[] args){

        Point point = new Point(1,1);

        Circle circle = new Circle(point, 5);
        Rectangle rectangle = new Rectangle(point, 4, 5);
        Square square = new Square(point, 3);
        Triangle triangle = new Triangle(new Point(0, 0), new Point(1, 1), new Point(2, 0));

        circle.draw();
        System.out.println(rectangle.area());

        System.out.println("Площадь квадрата: " + FigureUtil.area(square));
        System.out.println("Периметр треугольника: " + FigureUtil.perimeter(triangle));

        FigureUtil.draw(circle);
        FigureUtil.draw(square, Color.RED);
    }
}
