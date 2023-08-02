package Bit_magic;
import  java.util.Scanner;
public class CountSetBits {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = s.nextInt();
        System.out.println("Input Taken Computing..");
//        int res = CSBitsNaive(n);
        int res = CSBitsBrianAlgo(n);
        System.out.println(res);
    }

    public static int CSBitsNaive(int n) {
        int count = 0;
//        Using Bitwise
        while (n > 0) {
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }

    public static int CSBitsBrianAlgo(int n){
        int res = 0;
        while(n > 0){
            n = n & (n-1);
            res = res + 1;
        }
        return res;
    }
}

/*
Idea:

In naive solution,
We use a while loop until n > 0
in the while loop we keep adding n & 1 to the count, why n & 1 because it will return 1 if the last bit is set.
and then we assign n = n << 1 right shifting.
and then return count
This works in O(total bits in n)

In efficient solution we use Brian Kernighan’s algorithm:
in this algorithm we see we add change n such that n = n & (n - 1) and then we increment the count. why n = n & (n-1).
because when we perform n - 1, the last set bit will be changed to zero and bits to the right of the changed bits will get zero
ex: n = 40 00...101000
and n- 1 = 00...100111 which is 39
&   op   = 00...100000 which is 32
and now if we perform it one more time

n   = 32 = 00...100000
n-1 = 31 = 00...011111
&   = 00 = 00...000000
This works in O(set bit count);

There is one more approach which is using a look-up table which is rather complex and does some pre-processing but works in O(1)
I still have difficulty understanding it. Will look into it.
 */