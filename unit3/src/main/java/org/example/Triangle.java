package org.example;

public class Triangle extends Figure implements Drawable {
    private Point point2;
    private Point point3;

    public Triangle(Point startPoint, Point point2, Point point3) {
        super(startPoint);
        this.point2 = point2;
        this.point3 = point3;
    }

    private double side(Point a, Point b) {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    }

    @Override
    public double area() {
        double a = side(point, point2);
        double b = side(point2, point3);
        double c = side(point3, point);
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimeter() {
        return side(point, point2) + side(point2, point3) + side(point3, point);
    }

    public void draw() {
        draw(Color.BLACK);
    }

    public void draw(Color color) {
        System.out.printf("Нарисован треугольник с вершинами в точках %s, %s, %s, %s цветом\n",
                ("("+point.getX()+", "+point.getY()+")"), ("("+point2.getX()+", "+point2.getY()+")"),
                ("("+point3.getX()+", "+point3.getY()+")"), color.getColorName());
    }
}
