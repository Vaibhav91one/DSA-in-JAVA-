package GFGPOTD;

import java.util.Arrays;

public class Sep28 {
    public static void main(String[] args){
        int n = 6;
        int arr[] = {2,4,7,8,9,10};
        convertToWave(n,arr);
    }

    public static void convertToWave(int n, int[] a) {
        for(int i = 1; i < n; i = i+2){
            swap(a, i, i - 1);
        }

        System.out.println(Arrays.toString(a));
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
