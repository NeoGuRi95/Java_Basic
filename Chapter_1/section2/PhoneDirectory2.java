package Chapter_1.section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PhoneDirectory2 {

    static String[] name = new String[1000];
    static String[] number = new String[1000];
    static int n = 0;

    public static void main(String[] args) {
        try {
            String fileName = "input.txt";
            Scanner inFile = new Scanner(new File(fileName));

            while (inFile.hasNext()) { // detect end of file
                name[n] = inFile.next();
                number[n] = inFile.next();
                n++;
            }

            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("No file");
            System.exit(1);
        }

        bubbleSort();

        for (int i = 0; i < n; i++) {
            System.out.println(name[i] + ": " + number[i]);
        }
    }

    public static void bubbleSort() {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (name[j].compareTo(name[j + 1]) > 0) { //j > j+1
                    //swap name
                    String tmp = name[j];
                    name[j] = name[j+1];
                    name[j+1] = tmp;

                    //swap number
                    tmp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = tmp;
                }
            }
        }
    }
}
