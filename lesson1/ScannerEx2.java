package lesson1;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        String str = "Hello";
        String input = null;
        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter an string: ");
        input = kb.next();

        if (str.equals(input)) {
            System.out.println("Strings match! :-)");
        } else {
            System.out.println("Strings do not match ! :-(");
        }

        kb.close();
    }
}