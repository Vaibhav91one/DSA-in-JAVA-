package LeetcodePOTD;

import java.util.Arrays;

public class Sep28 {
    public static void main(String[] args){
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    public static int[] sortArrayByParity(int[] nums) {
     int count = 0;
     int n = nums.length;
     for(int i = 0; i < n; i++){
         if(nums[i] % 2 == 0){
             swap(nums, count, i);
             count++;
         }
     }
     return nums;
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
