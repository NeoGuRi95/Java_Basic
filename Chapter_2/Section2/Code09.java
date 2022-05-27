package Chapter_2.Section2;

import Chapter_2.Section1.MyPoint1;
import Chapter_2.Section1.MyRectangle1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code09 {

    static MyRectangle2[] rects = new MyRectangle2[100];
    static int n = 0;

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("data2.txt"));
            while (in.hasNext())
                rects[n++] = new MyRectangle2(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());

            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("No data file.");
            System.exit(1);
        }

        bubbleSort();

        for (int i = 0; i < n; i++) {
            System.out.println(rects[i].toString());
        }
    }

    public static void bubbleSort() {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (rects[j].calcArea() > rects[j+1].calcArea()) {
                    MyRectangle2 tmp = rects[j];
                    rects[j] = rects[j + 1];
                    rects[j + 1] = tmp;
                }
            }
        }
    }
}
