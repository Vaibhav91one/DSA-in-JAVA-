package Arrays;

public class MaxLengthEvenOdd {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5};
        int[] nums2 = {42,43,44,43,44,43,44,45,46};
        int threshold = 4;
//        System.out.println(longestAlternativeSubarray(nums2));
        System.out.println(OddSumApproach(nums2));
        //        System.out.println(longestAlternatingSubarray(nums, threshold));
    }

    public static int longestAlternativeSubarray(int[] nums) {
        int res = 1;
        int curr = 1;
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if ((nums[i] % 2 == 0 && nums[i - 1] % 2 != 0) || (nums[i] % 2 != 0 && nums[i - 1] % 2 == 0)) {
                curr++;
                res = Math.max(res, curr);
            } else {
                curr = 1;
            }
        }
        return res ;
    }

    public static int OddSumApproach(int[] nums) {
        int res = 1;
        int curr = 1;
        int n = nums.length;

        for (int i = 0; i < n-1; i++) {
            if ((nums[i] + nums[i+1]) % 2 == 1) {
                curr++;
            } else {
                res = Math.max(res, curr);
                curr = 1;
            }
        }
        res = Math.max(res,curr);
        if(res == 1){
            return 0;
        }
        return res ;
    }

    //You are given a 0-indexed integer array nums and an integer threshold. Find the length of the longest subarray of nums starting at index l and ending at index r (0 <= l <= r < nums.length) that satisfies the following conditions:
    public static int longestAlternatingSubarray(int[] nums, int threshold) {
        int res = 0;
        int curr = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > threshold) {
                curr = 0;
            }
            else if ((i > 0 && nums[i] % 2 == 0 && nums[i - 1] % 2 != 0 ) || ( i > 0 && nums[i] % 2 != 0 && nums[i - 1] % 2 == 0)) {
                curr++;
                res = Math.max(res, curr);
            }
            else {
                curr = nums[i] % 2 == 0 ? 1 : 0;
            }
        }
        return res;
    }
}

