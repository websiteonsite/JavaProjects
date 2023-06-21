package Selectionsort;

public class Selection {
    public static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];

            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}