package Recursion;

public class factorial {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int smallOutput = fact(n - 1);
        int Output = n * smallOutput;
        return Output;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
