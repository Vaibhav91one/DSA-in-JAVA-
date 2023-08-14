package Misc;
import java.util.Arrays;

public class NonRepeatingNumbers {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 2, 1, 4};
        System.out.println(Arrays.toString(Distinct(arr)));
    }

    public static int[] Distinct(int[] nums){
        int XOR = 0;
        int n = nums.length;
        int[] res = new int[2];
        for(int i = 0; i < n; i++){
         XOR = XOR ^ nums[i];
        }
        int Sn = XOR & -XOR;
        for(int i = 0; i < n; i++){
            if((nums[i] & Sn) != 0){
                res[0] = res[0] ^ nums[i];
            }
            else{
                res[1] = res[1] ^ nums[i];
            }
        }
        Arrays.sort(nums);
        return res;
    }
}
