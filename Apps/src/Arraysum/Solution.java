package Arraysum;

public class Solution {

    public static int sum(int[] input) {

        int n = input.length;
        int i, s = 0;
        for (i = 0; i < n; i++)
            s = s + input[i];

        return s;

    }
}
