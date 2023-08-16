package Searching;

public class SearchSortedRotatedArray {
    public static void main(String[] args){
        int[] nums = {3,1};
        int target = 1;
        System.out.println(search(nums,target));
    }

    public static int search(int[] nums, int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low + high)/2;
            System.out.println(mid);

            if(nums[mid] == target) return mid;

            if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target < nums[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                System.out.println(mid);

                if(target > nums[mid] && target <= nums[high]){
                    low = mid + 1;
                }
                else{
                    high = mid -1;
                }
                System.out.println(mid);

            }
        }
        return -1;
    }
}
