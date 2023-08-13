package Searching;

public class PeakElement {
    public static void main(String[] args){
        int N = 2;
        int arr[] = {6,5,4,3,2,3,2};
        System.out.println(peakElement(arr));
    }

    public static int peakElement(int[] nums)
    {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while(low <= high){
            int mid = (low + high)/2;

            if ((mid == 0 || nums[mid - 1] < nums[mid]) && (mid == n - 1 || nums[mid + 1] < nums[mid])){
                return mid;
            }

            if(mid > 0 && nums[mid -1] > nums[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }

}
