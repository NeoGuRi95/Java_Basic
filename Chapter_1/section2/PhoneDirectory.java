package Chapter_1.section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PhoneDirectory {
    public static void main(String[] args) {

        String[] name = new String[1000];
        String[] number = new String[1000];
        int n = 0;

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

        for (int i = 0; i < n; i++) {
            System.out.println(name[i] + ": " + number[i]);
        }
    }
}
