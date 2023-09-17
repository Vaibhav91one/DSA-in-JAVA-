package Misc;

public class SlidingWindowMaximum {
    public static void main(String[] args){
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        maxSlidingWindow(nums,k);
    }

    public static void maxSlidingWindow(int[] nums, int k) {
         int[] max = new int[nums.length];

         int maxElement = nums[0];

         for(int i = 1; i < k; i++){
             maxElement = Math.max(nums[i], maxElement);
         }

         for(int i = k; i < nums.length; i++){

         }
        System.out.println(maxElement);
    }

}

//Not done
