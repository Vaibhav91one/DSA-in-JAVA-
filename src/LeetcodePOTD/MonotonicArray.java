package LeetcodePOTD;

public class MonotonicArray {
    public static void main(String[] args){
        int[] nums = {1,2,2,3};
        System.out.println(isMonotonic(nums));
    }
    public static boolean isMonotonic(int[] nums) {
        int n = nums.length;
        boolean decreasing = true;
        boolean increasing = true;
        for(int i = 1; i < n; i++){

            //increasing
           if(nums[i-1] < nums[i]){
               decreasing = false;
           }

           //decreasing
            if(nums[i-1] > nums[i]){
                increasing = false;
            }

            if(!decreasing && !increasing){
                return false;
            }
        }
        return true;
    }
}
