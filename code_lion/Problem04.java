package code_lion;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem04 {

    static ArrayList<Integer> arrList = new ArrayList<>();
    static void command() {
        System.out.println("0을 입력하시면 입력이 종료 됩니다.");
        int input;
        Scanner kb = new Scanner(System.in);
        while (true) {
            System.out.print("숫자 " + (arrList.size() + 1) + " : ");
            while (!kb.hasNextInt()) {
                kb.next();
                System.out.println("[입력오류] : 숫자로 입력해주세요.");
                System.out.print("숫자 " + (arrList.size() + 1) + " : ");
            }
            input = kb.nextInt();
            if (input != 0)
                arrList.add(input);
            else
                break;
        }
    }

    static void printArrayList() {
        String result = "결과 : ";

        for (int i = 0; i < arrList.size(); i++) {
            result += arrList.get(i) + ", ";
        }
        result = result.substring(0, result.length() - 2);
        System.out.println(result);
    }

    public static void main(String[] args) {
        command();
        printArrayList();
    }
}
