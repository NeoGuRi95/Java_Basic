package chapter_3.section4_2;

public class Circle extends Shape {

    public int radius;

    public Circle(int r) {
        super("Circle");
        this.radius = r;
    }

    @Override
    double computeArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double computePerimeter() {
        return 2.0 * Math.PI + radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
