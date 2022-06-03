package java_basic_ch7;

public class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1, 2, 3);

        System.out.println("p3.x = " + p3.x);
        System.out.println("p3.y = " + p3.y);
        System.out.println("p3.z = " + p3.z);
    }
}

class Point3 {
    int x = 10;
    int y = 20;

    Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point3 {
    int z = 30;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
