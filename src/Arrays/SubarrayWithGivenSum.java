package Arrays;

import java.util.ArrayList;

public class SubarrayWithGivenSum {
    public static void main(String[] args){
        int N = 5;
        int S = 12;
        int A[] = {1,2,3,7,5};
        System.out.println(IsSumListStartEnd(A,N,S));
    }

    public static boolean IsSum(int arr[], int n , int s){
        int sum = 0;
        int sm2 = 0;
        ArrayList<Integer> Al = new ArrayList<Integer>();
        for(int e = 0; e < n; e++){
            while(sum > s && sm2 < e -1){
                sum -= arr[sm2];
                sm2++;
            }
            if(sum == s){
                System.out.println(sm2);
                System.out.println(e);
                return true;
            }
            if(e < n){
                sum += arr[e];
            }
        }
        return (sum == s);
    }
    public static ArrayList<Integer> IsSumListStartEnd(int arr[], int n , int s){
        int currentSum = arr[0], start = 0;
        ArrayList<Integer> Al = new ArrayList<Integer>();
        if(s == 0){
            Al.add(-1);
            return Al;
        }
        for(int i = 1; i <= n; i++){
            while(currentSum > s && start < i -1){
                currentSum -= arr[start];
                start++;
            }
            if(currentSum == s){
              Al.add(start + 1);
              Al.add(i);
              return Al;
            }
            if(i < n){
                currentSum += arr[i];
            }
        }
        Al.add(-1);
        return Al;
    }
}

/*
Idea for this is shared at my leetcode profile: https://leetcode.com/Lethal_Bypass/
 */
