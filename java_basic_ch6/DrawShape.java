package java_basic_ch6;

import java.util.Arrays;

public class DrawShape {
    public static void main(String[] args) {
        Point[] p = {   new Point(100, 100),
                        new Point(140, 50),
                        new Point(200, 100)};
        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point(150, 150), 50);

        System.out.println(t.toString());
        System.out.println(c.toString());
    }
}

class Shape {
    String color = "black";

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point() {
        this(0, 0);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Circle extends Shape {
    Point center;
    int r;

    Circle() {
        this(new Point(0, 0), 100);
    }

    Circle(Point p, int r) {
        this.center = p;
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center.toString() +
                ", r=" + r +
                ", color='" + color + '\'' +
                '}';
    }
}

class Triangle extends Shape {
    Point[] p = new Point[3];

    Triangle(Point[] p) {
            this.p = p;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "p=" + Arrays.toString(p) +
                ", color='" + color + '\'' +
                '}';
    }
}