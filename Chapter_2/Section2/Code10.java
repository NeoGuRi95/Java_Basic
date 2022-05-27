package Chapter_2.Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code10 {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("data3.txt"));
            int n = in.nextInt();
            OrthoPolygon thePolygon = new OrthoPolygon(n);
            for (int i = 0; i < n; i++)
                thePolygon.addVertex(in.nextInt(), in.nextInt());
            MyPoint2 thePoint = new MyPoint2(in.nextInt(), in.nextInt());
            in.close();
            if (thePolygon.contains(thePoint)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file data.");
            System.exit(1);
        }

    }
}
