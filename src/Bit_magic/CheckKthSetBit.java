package Bit_magic;

public class CheckKthSetBit {
    public static void main(String[] args){
        int n = 5;
        int k = 1;
        System.out.println(LeftShiftMethod(n,k));
        System.out.println(RightShiftMethod(n,k));
    }

    public static boolean LeftShiftMethod(int n, int k){
        return (n & (1 << k)) != 0;
    }

    public static boolean RightShiftMethod(int n, int k){
        return ((n >> k) & 1) == 1;
    }
}

/*
Idea:
We can solve this using Left shift and right shift

In left shift we take 1 which is 0...001 (32 bit representation) and we left shift it k times
then, perform Bitwise And operation with n which in this case would be 5 which is 0...101.
Now the resultant would be a non-zero as shown below:
n          0..101 = 5
1 << K     0..100 = 4
res        0.0100 = 4

In right shift we take n which is 5 0...101 (32 bit representation) and we right shift it k times
then, perform Bitwise And operation with 1 0...001.
We are just checking the last bit for set or not set.
Now the resultant would be a 1 if set else less than 0 as shown below:
n          0..001 = 1
1 << K     0..001 = 1
res        0.0100 = 1
 */