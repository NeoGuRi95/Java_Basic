package Chapter_1.section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrimeMatrix {
    static int n;
    static int[][] grid;

    public static void main(String[] args) {
        try {
            Scanner inFile = new Scanner(new File("data.txt"));
            n = inFile.nextInt();
            grid = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = inFile.nextInt();
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        findPrimeNumber();
    }

    static int[] offSetX = {0,1,1,1,0,-1,-1,-1};
    static int[] offSetY = {-1,-1,0,1,1,1,0,-1};

    public static int getDigit(int x, int y, int dir, int k) {
        int newX = x + k*offSetX[dir];
        int newY = x + k*offSetY[dir];
        if (newX < 0 || newX >= grid.length || newY < 0 || newY >= grid.length) return -1;
        else return grid[newX][newY];
    }

    public static int computeValue(int x, int y, int dir, int len) {
        int value = 0, digit;
        for (int i = 0; i < len; i++) {
            digit = getDigit(x, y, dir, i);
            if (digit == -1)
                return -1;
            value = value*10 + digit;
        }
        return value;
    }

    public static boolean isPrime(int k) {
        if (k<2) return false;

        for (int i=2; i*i<=k; i++)
            if (k%i == 0) return false;

        return true;
    }

    public static void findPrimeNumber() {
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                for (int dir = 0; dir < 8; dir++) {
                    for (int length = 1; length <= n; length++) {
                        int value = computeValue(x, y, dir, length);
                        if (value != -1 && isPrime(value))
                            System.out.println(value);
                    }
                }
            }
        }
    }
}
