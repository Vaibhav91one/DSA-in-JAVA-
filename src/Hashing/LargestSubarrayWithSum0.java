package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class LargestSubarrayWithSum0 {
    public static void main(String[] args){
        int N = 6;
        int[] A = {0,0,5,5,0,0};
        System.out.println(CountSubwithSum0(A,N));
    }

    public static int maxLen(int arr[], int n)
    {
        //Using Hashmap
        HashMap<Integer,Integer> s = new HashMap<Integer, Integer>();
        int prefix_sum = 0;
        int res = 0;

        for(int i = 0; i < n; i++){
        //calculating prefix sum
             prefix_sum += arr[i];

        // corner case when the sub array starts from the 0th index,
            //ex: {1,2,6} sum = 3, s = {1,3,9}, (prefix_sum - sum) ! found in s;
            // if we were given a sum, 0 would be replaced with that sum.
             if(prefix_sum == 0){
                 res = i+1;
             }
        // if this is the first occurrence of the prefix sum we add key as prefix value and value as index of this prefix sum.
             if(s.containsKey(prefix_sum) == false){
                 s.put(prefix_sum, i);
             }
             // if we were given a sum, 0 would be replaced with that sum.
             if(s.containsKey(prefix_sum - 0)){
//                 computing  the max length
                 res = Math.max(res,i - s.get(prefix_sum));
             }
        }
        return res;
    }

    public static long CountSubwithSum0(int arr[], int n)
    {
        //Using Hashmap to store prefix sum as key and prefix sum frequency as value
        HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();
        int prefix_sum = 0;
        long res = 0;

        for(int i = 0; i < n; i++){
            //calculating prefix sum
            prefix_sum += arr[i];

            // corner case when the sub array starts from the 0th index,
            //ex: {1,2,6} sum = 3, s = {1,3,9}, (prefix_sum - sum) ! found in s;
            // if we were given a sum, 0 would be replaced with that sum.
            if(prefix_sum == 0){
                res++;
            }
            // if this is prefix sum is present.
            if(s.containsKey(prefix_sum)){
                //add frequency of the prefix sum as if there is repetition of prefix sum than then the sum after the first prefix sum repetition element and before the curr prefix sum element(inclusive) will be the subarray with sum 0;
               res += s.get(prefix_sum);
               //incrementing the frequency of the subarray found
               s.put(prefix_sum, s.get(prefix_sum) + 1);
            }
            else{
                s.put(prefix_sum, 1);
            }
            // if we were given a sum, 0 would be replaced with that sum.
        }
        return res;
    }
}
