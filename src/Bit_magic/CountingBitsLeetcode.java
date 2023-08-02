package Bit_magic;

import java.util.Arrays;

public class CountingBitsLeetcode {
    public static void main(String[] args){
        int n = 2;
        int[] arr = new int[n + 1];
        for(int i = 0; i < n + 1; i++){
            arr[i] = CountBits(i);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int CountBits(int n){
        int res = 0;
        while(n > 0){
            n = n & (n-1);
            res = res + 1;
        }
        return res;
    }
}
