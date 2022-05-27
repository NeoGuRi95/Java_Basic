package Chapter_2.Section2;

import Chapter_2.Section1.MyRectangle1;

public class MyRectangle2 {
    public MyPoint2 lu;
    public int width;
    public int height;

    public MyRectangle2(int x, int y, int w, int h) {
        lu = new MyPoint2(x, y);
        this.width = w;
        this.height = h;
    }

    public MyRectangle2(MyPoint2 p, int w, int h) {
        lu = p;
        this.width = w;
        this.height = h;
    }

    public int calcArea() {
        return width * height;
    }

    public String toString() {
        return "(" + lu.x + ", " + lu.y + ") " + width + " " + height;
    }
}
