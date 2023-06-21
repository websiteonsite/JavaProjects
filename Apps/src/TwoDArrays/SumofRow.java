package TwoDArrays;

public class SumofRow {
    public static void rowWiseSum(int[][] mat) {
        int rSum, i, j;
        for (i = 0; i < mat.length; i++) {
            rSum = 0;
            for (j = 0; j < mat[i].length; j++) {
                rSum += mat[i][j];

            }
            System.out.println(rSum + " ");
        }
    }
}
