package Hashing;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args){
        int N = 7;
        int[] arr = {2,6,1,9,4,5,3};
        System.out.println(findLongestConseqSubseq(arr));
    }

    static int findLongestConseqSubseq(int nums[])
    {
        int N = nums.length;
        //creating a hashset to store distinct elements as we sequence no repetitions
        HashSet<Integer> h = new HashSet<>();
        //curr longest subsequence
        int curr = 0;
        //max longest subsequence
        int res = 0;
        //adding all elements to hastable
        for(int i = 0; i < N; i++){
            h.add(nums[i]);
        }

        for(int i = 0 ; i< N; i++){
            //if this is the starting point of any subsequence
            if(!h.contains(nums[i] - 1)){
                //initializing this element as starting point
                curr = 1;
                //checking if the next element in sequence is present
                while(h.contains(nums[i]+curr)){
                    curr++;
                }
                //updating longest subsequence
                res = Math.max(res,curr);
            }
        }
        return res;
    }
}
