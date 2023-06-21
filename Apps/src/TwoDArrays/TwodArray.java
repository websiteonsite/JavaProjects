package TwoDArrays;

import java.util.Scanner;

public class TwodArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int rows = s.nextInt();
        System.out.println("Enter the no of cols:");
        int cols = s.nextInt();
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter the element at" + i + "row" + j + "column");
                arr[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(arr[i][j] + "");
            }
            System.out.println();
        }
    }
}
