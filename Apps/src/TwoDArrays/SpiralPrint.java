package TwoDArrays;

public class SpiralPrint {

    public static void spiralPrint(int arr[][]) {
        if (arr.length == 0)
            return;
        int rowmin = 0, colmin = 0, rowmax = arr.length - 1, colmax = arr[0].length - 1;
        while (rowmin <= rowmax && colmin <= colmax) {
            for (int col = colmin; rowmin <= rowmax && col <= colmax; ++col) {
                System.out.print(arr[rowmin][col] + " ");
            }
            ++rowmin;
            for (int row = rowmin; colmin <= colmax && row <= rowmax; ++row) {
                System.out.print(arr[row][colmax] + " ");
            }
            --colmax;
            for (int col = colmax; rowmin <= rowmax && col >= colmin; --col) {
                System.out.print(arr[rowmax][col] + " ");
            }
            --rowmax;
            for (int row = rowmax; colmin <= colmax && row >= rowmin; --row) {
                System.out.print(arr[row][colmin] + " ");
            }
            ++colmin;
        }
    }
}