package Chapter_1.section2;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = kb.nextInt();
        }

        kb.close();

        bubbleSort(n, data);

        System.out.println("Sorted data: ");
        for (int i = 0; i < n; i++)
            System.out.println(data[i]);
    }

    public static void bubbleSort(int n, int[] arr) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j);
                }
            }
        }
    }

    public static void swap(int[] arr, int index) {
        int tmp = arr[index];
        arr[index]= arr[index + 1];
        arr[index + 1] = tmp;
    }
}
