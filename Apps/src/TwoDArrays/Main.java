package TwoDArrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int t, m, n;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) {
            n = sr.nextInt();
            m = sr.nextInt();
            int ar[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    ar[i][j] = sr.nextInt();
                }
                SumofRow.rowWiseSum(ar);
            }
        }

    }
}
