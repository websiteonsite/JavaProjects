package Recursion;

public class SumofNnaturalnumbers {
    public static int sumn(int n) {
        if (n == 0) {
            return 0;
        }

        int smallOutput = sumn(n - 1);
        int Output = n + smallOutput;
        return Output;
    }

    public static void main(String[] args) {
        System.out.println(sumn(5));
    }
}
