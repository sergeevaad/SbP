package org.example;

public class Circle extends Figure implements Drawable{
    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void draw() {
        draw(Color.BLACK);
    }

    public void draw(Color color) {
        System.out.printf("Нарисован круг с центром в точке %s, радиусом %.2f, %s цветом\n",
                ("("+point.getX()+", "+point.getY()+")"), radius, color.getColorName());
    }
}
