package InsertionSort;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int start = 1;
        int end = arr.length - 1;
        int temp;
        while (start <= end) {
            int i = start - 1;
            temp = arr[start];

            while (i >= 0 && arr[i] > temp) {
                arr[i + 1] = arr[i];
                i -= 1;
            }
            arr[i + 1] = temp;
            start += 1;
        }
    }

    public static void printArray(int input[]) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + "");
        }
    }

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int input[] = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int b[] = takeInput();
        insertionSort(b);
        printArray(b);
    }
}
