package Arrays;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(PrintFibonacciRecursive(i) + " ");
        }
        PrintFibonacciIterative(n);
    }

    public static int PrintFibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return PrintFibonacciRecursive(n - 1) + PrintFibonacciRecursive(n - 2);
    }

    public static void PrintFibonacciIterative(int n) {
        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 2; i <= n; i++) {
            if (i <= 1)
                c = i;
            else {
                c = b + a;
                a = b;
                b = c;
            }
        }
        System.out.println(c);
    }
}
