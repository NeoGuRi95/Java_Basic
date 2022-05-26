package Chapter_2.Section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code3 {

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

        bubbleSort();

        for (int i = 0; i < n; i++) {
            System.out.println(members[i].name + ": " + members[i].number);
        }
    }

    public static void bubbleSort() {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (members[j].name.compareTo(members[j + 1].name) > 0) {
                    swap(members, j);
                }
            }
        }
    }

    public static void swap(Person1[] data, int i) {
        Person1 tmp = data[i];
        data[i] = data[i + 1];
        data[i + 1] = tmp;
    }
}
