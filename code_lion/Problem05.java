package code_lion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem05 {

    static ArrayList<Integer> arr = new ArrayList<>();

    static void command() {
        System.out.println("[안내] 0을 입력하시면 입력이 종료 됩니다.");
        int n = 1;
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.print("숫자 " + n + " : ");
            int input = kb.nextInt();

            if (input == 0)
                break;
            else if (arr.contains(input))
                System.out.println("[입력오류] : 이미 입력된 숫자 입니다.");
            else {
                arr.add(input);
                n++;
            }
        }
        Collections.sort(arr);
    }

    static void printPrimeNumber() {
        String result = "결과 : ";

        for (int i = 0; i < arr.size(); i++) {
            if (isPrime(arr.get(i)))
                result += arr.get(i) + ", ";
        }
        result = result.substring(0, result.length() - 2);
        System.out.println(result);
    }

    static boolean isPrime(int k) {
        if (k<2) return false;

        for (int i=2; i*i<=k; i++)
            if (k%i == 0) return false;

        return true;
    }

    public static void main(String[] args) {
        command();
        printPrimeNumber();
    }
}
