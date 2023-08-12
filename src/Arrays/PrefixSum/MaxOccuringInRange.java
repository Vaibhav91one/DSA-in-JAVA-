package Arrays.PrefixSum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.lang.reflect.Array;
public class MaxOccuringInRange {
    public static void main(String[] args) {
        int[] L = {1,4,3,1};
        int[] R = {15,8,5,4};
        int n = 4;
        System.out.println(maxOccured(L,R,n));
    }

    public static int maxOccured(int L[], int R[], int n) {
        int[] arr = new int[1000];

        for (int i = 0; i < n; i++) {
            arr[L[i]]++;
            arr[R[i] + 1]--;
        }

        int max = arr[0];
        int res = 0;

        for(int i = 1; i< 1000; i++){
            arr[i] += arr[i-1];
            if(max < arr[i]){
                max = arr[i];
                res = i;
            }
        }
        return res;
    }

    public static int maxOccuredGFG(int L[], int R[], int n, int maxx) {
        int[] arr = new int[maxx+1];

        for(int i = 0; i <= maxx; i++){
            arr[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            for(int j = L[i]; j <=R[i]; j++){
              arr[j]++;
            }
        }

        int max = 1;
        int res = 0;

        for(int i = 0; i<=maxx; i++){
            if(max < arr[i]){
                max = arr[i];
                res = i;
            }
        }
        return res;
    }
}

