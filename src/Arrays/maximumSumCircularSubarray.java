package Arrays;

public class maximumSumCircularSubarray {
    public static void main(String[] args){
        int N = 7;
        int[] arr = {8,-8,9,-9,10,-11,12};
        System.out.println(MaximumCircularSum(arr));
    }

    public static int MaximumSumSub(int[] arr, int n){
        int max_sum = arr[0];
        int max_ending = arr[0];

        for(int i = 1; i < n; i++){
            max_ending = Math.max(max_ending + arr[i], arr[i]);
            max_sum = Math.max(max_ending, max_sum);
        }
        return max_sum;
    }

    public static int MaximumCircularSum(int[] nums){
        int n = nums.length;
        int max_normal = MaximumSumSub(nums, n);
        int array_sum = 0;
        if(max_normal < 0){
            return max_normal;
        }
        for(int i = 0; i < n; i++){
            array_sum += nums[i];
            nums[i] = -nums[i];
        }

        int max_circular = array_sum + MaximumSumSub(nums,n);
        return Math.max(max_circular, max_normal);
    }
}

/*
Idea for this is shared at my leetcode profile: https://leetcode.com/Lethal_Bypass/
 */
