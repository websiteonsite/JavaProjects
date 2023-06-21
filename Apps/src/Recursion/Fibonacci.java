package Recursion;

public class Fibonacci {
    public static int fib(int n) {
        if (n == 2 || n == 1) {
            return 1;
        }
        int fib_num_1 = fib(n - 1);
        int fib_num_2 = fib(n - 2);
        int Output = fib_num_1 + fib_num_2;
        return Output;
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
