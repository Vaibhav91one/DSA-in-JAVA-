package Hashing;

import java.util.HashMap;

public class SubarraySumEqualK {
     public static void main(String[] args){

     }
    public static long CountSubwithSum0(int Arr[], int k)
    {
        int N = Arr.length;
        //Using Hashmap to store prefix sum as key and prefix sum frequency as value
        HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();
        int prefix_sum = 0;
        int res = 0;
        for(int i = 0; i < N; i++){
            //calculating prefix sum
            prefix_sum += Arr[i];

            // corner case when the sub array starts from the 0th index,
            //ex: {1,2,6} sum = 3, s = {1,3,9}, (prefix_sum - sum) ! found in s;
            // if we were given a sum, 0 would be replaced with that sum.
            if(prefix_sum == k){
                res++;
            }
            // if this is prefix sum - k is present.
            if(s.containsKey(prefix_sum - k)){
                //add frequency of the prefix sum as if there is repetition of prefix sum than then the sum after the first prefix sum repetition element and before the curr prefix sum element(inclusive) will be the subarray with sum 0;
                res += s.get(prefix_sum - k);
            }
            //adding the prefix sum if not present and incrementing the frequency of the subarray if present
            s.put(prefix_sum, s.getOrDefault(prefix_sum, 0) + 1);

            // if we were given a sum, 0 would be replaced with that sum.
        }
        return res;
    }
}
