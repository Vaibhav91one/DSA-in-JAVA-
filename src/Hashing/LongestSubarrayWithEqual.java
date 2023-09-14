package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubarrayWithEqual {
    public static void main(String[] args){
        int N = 4;
        int A[] = {0,1,0,1};
        System.out.println(maxLen(A));
    }

    static int maxLen(int[] nums)
    {
        int N = nums.length;
        //changing 0s to -1 inorder to make this problem largestSubarraywithSum0
        for(int i = 0; i < N; i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }
        //Using Hashmap
        HashMap<Integer,Integer> s = new HashMap<Integer, Integer>();
        int prefix_sum = 0;
        int res = 0;

        for(int i = 0; i < N; i++){
            //calculating prefix sum
            prefix_sum += nums[i];

            // corner case when the sub array starts from the 0th index,
            //ex: {1,2,6} sum = 3, s = {1,3,9}, (prefix_sum - sum) ! found in s;
            // if we were given a sum, 0 would be replaced with that sum.
            if(prefix_sum == 0){
                res = i+1;
            }
            // if this is the first occurrence of the prefix sum we add key as prefix value and value as index of this prefix sum.
            if(!s.containsKey(prefix_sum)){
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
}
