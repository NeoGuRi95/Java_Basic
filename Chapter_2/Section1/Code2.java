package Chapter_2.Section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code2 {

    static Person1[] members = new Person1[100];
    static int n = 0;

    public static void main(String[] args) {
        try {
            String fileName = "input.txt";
            Scanner inFile = new Scanner(new File(fileName));

            while (inFile.hasNext()) { // detect end of file
                String nm = inFile.next();
                String nb = inFile.next();

                members[n] = new Person1();
                members[n].name = nm;
                members[n].number = nb;
                n++;
            }

            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("No file");
            System.exit(1);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(members[i].name + ": " + members[i].number);
        }
    }
}
