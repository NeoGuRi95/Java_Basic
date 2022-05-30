package chapter_3.section4_2;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle(int w, int h) {
        super("Rectangle");
        width = w;
        height = h;
    }
    @Override
    double computeArea() {
        return (double)width * height;
    }

    @Override
    double computePerimeter() {
        return 2.0*(width + height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
