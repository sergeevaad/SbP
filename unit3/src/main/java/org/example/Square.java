package org.example;

public class Square extends Rectangle {
    private double side;

    public Square(Point start, double side) {
        super(start,side,side);
        this.side=side;
    }

    public void draw() {
        draw(Color.BLACK);
    }

    public void draw(Color color) {
        System.out.printf("Нарисован квадрат с началом в точке %s, со стороной %.2f, %s цветом\n",
                ("("+point.getX()+", "+point.getY()+")"), side, color.getColorName());
    }
}
