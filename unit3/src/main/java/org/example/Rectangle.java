package org.example;

public class Rectangle extends Figure implements Drawable{
    private double width;
    private double leng;

    public Rectangle(Point start, double width, double leng) {
        super(start);
        this.width = width;
        this.leng = leng;
    }

    @Override
    public double area() {
        return width* leng;
    }

    @Override
    public double perimeter() {
        return 2*(width+ leng);
    }

    public void draw() {
        draw(Color.BLACK);
    }

    public void draw(Color color) {
        System.out.printf("Нарисован прямоугольник с началом в точке %s, шириной %.2f, длиной %.2f, %s цветом\n",
                ("("+point.getX()+", "+point.getY()+")"), width, leng, color.getColorName());
    }
}
