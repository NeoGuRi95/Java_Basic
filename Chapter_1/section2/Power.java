package Chapter_1.section2;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();

        kb.close();

        int result = power(a, b);
        System.out.println("result: " + result);
    }

    public static int power(int n, int m) {
        int prod = 1;
        for (int i=0; i<m; i++) prod *= n;
        return prod;
    }
}
