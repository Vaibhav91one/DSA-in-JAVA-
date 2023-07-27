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

/*

Idea:
In the recursive fibonacci if n == 0 or n == 1 we return n
else we call fibonacci such that fib(n-1) + fib(n-2)
this call will keep executing unless n becomes 0 or 1

In the iterative one we start the loop from n = 2 because the n=0 and n=1 are defined as a,b and c is the result.
we keep doing c = a + b and a = b, b = c (we are changing a and b with the next values needed for the next fibonacci number)
*/
