package java_basic_ch6;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 2, 1, 4, 8, 5};

        sortArr(arr);
        printArr(arr);
    }

    public static void sortArr(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i : arr)
            System.out.print(i + ", ");
        System.out.print("]");
    }
}
