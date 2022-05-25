package section1;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        int number = 123;

        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter an integer: ");

        int input = kb.nextInt();

        if (input == number) {
            System.out.println("Number match! :-)");
        } else {
            System.out.println("Numbers do not match ! :-(");
        }

        kb.close();
    }
}