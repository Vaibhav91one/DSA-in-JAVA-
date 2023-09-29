package GFGPOTD;
import java.util.ArrayList;
import java.util.Arrays;

public class Sep27 {
    public static void main(String[] args){
        int N = 4, M = 4;
        int arr[ ] = {1, 4, 5, 7};
        int brr[ ] = {10, 20, 30, 40};
        int X = 32;

        System.out.println(printClosest(arr,brr,N,M,X));
    }

    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        int i = 0, j = m-1;
        int diff = Integer.MAX_VALUE;
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(-1,-1));
        while(i < n && j >= 0 && i < j){
            int sum = arr[i] + brr[j];
            if(abs(sum, x) < diff){
                diff = abs(sum,x);
                al.set(0,arr[i]);
                al.set(1,brr[j]);
            }

            else if(sum < x) i++;
            else j--;
        }

        return al;
    }

    static int abs(int a, int b){
        if(a > b) return a - b;
        else return b - a;
    }
}
