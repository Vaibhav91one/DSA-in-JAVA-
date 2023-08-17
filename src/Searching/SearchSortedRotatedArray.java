package Searching;

public class SearchSortedRotatedArray {
    public static void main(String[] args){
        int[] nums = {2,5,6,0,0,1,2};
        int target = 3;
        System.out.println(search(nums,target));
    }

    public static int search(int[] nums, int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low + high)/2;

            if(nums[mid] == target) return mid;

            //handling sorted arrays
            if(nums[low] == nums[mid] && nums[high] == nums[mid]){
                low++;
                high--;
                continue;
            }

            if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target < nums[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(target > nums[mid] && target <= nums[high]){
                    low = mid + 1;
                }
                else{
                    high = mid -1;
                }
            }
        }
        return -1;
    }
}
