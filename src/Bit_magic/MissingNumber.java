package Bit_magic;

public class MissingNumber {
    public static void main(String[] args){
        int[] nums = {1,2,3,5};
        int n = 5;
        System.out.println(MissingNumber(nums, n));
    }

    public static int MissingNumber(int[] nums, int n){
        int res = 0;
        for(int i = 0; i < n -1; i++){
            res = res ^ nums[i];
        }
        for(int i = 0; i <= n; i++){
            res = res ^ i;
        }
        return res;
    }
}
