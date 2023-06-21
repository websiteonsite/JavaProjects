package TwoDArrays;

public class ZigZagArray {
    public static void wavePrint(int mat[][]) {
        // Your code goes here
        if (mat.length == 0) {
            return;
        }
        for (int i = 0; i < mat[0].length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j <= mat.length - 1; j++) {
                    System.out.print(mat[j][i] + " ");
                }
            } else if (i % 2 != 0) {
                for (int j = mat.length - 1; j >= 0; j--) {
                    System.out.print(mat[j][i] + " ");
                }
            }
        }
    }
}
