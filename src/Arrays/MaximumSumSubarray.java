package Arrays;

public class MaximumSumSubarray {
    public static void main(String[] args){
//        for min
//        int [] arr = {3,-4, 2,-3,-1, 7,-5};
//        int N = 7;
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxSum(nums));
//        System.out.println(MinSum(arr, N));
    }

    public static long MinSum(int[] a, int size){
        int Min_sum = a[0];
        int Min_Ending = a[0];

        for(int i = 1; i < size; i++){
            Min_Ending = Math.min(Min_Ending + a[i], a[i]);
            Min_sum = Math.min(Min_sum, Min_Ending);
        }
        return Min_sum;
    }

    public static int MaxSum(int[] nums) {
        int Max_sum = nums[0];
        int Max_Ending = nums[0];
        int n = nums.length;

        for(int i = 1; i < n; i++){
            Max_Ending = Math.max(Max_Ending + nums[i], nums[i]);
            Max_sum = Math.max(Max_sum, Max_Ending);
        }
        return Max_sum;
    }
}

/*
Idea for this is shared at my leetcode profile: https://leetcode.com/Lethal_Bypass/
 */
