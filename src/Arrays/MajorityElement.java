package Arrays;
import java.util.HashMap;
public class MajorityElement {
    public static void main(String[] args){
        int N = 5;
        int A[] = {3,1,3,3,2};
        System.out.println(MajorElement(A));
    }

    public static int MajorElement(int[] nums){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int size = nums.length;
        int res = 0;
        int count = 1;
        for(int i = 1; i < size; i++){
            if(nums[res] == nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                res = i;
                count = 1;
            }
        }

        count = 0;
        for(int i = 0; i < size; i++){
            if(nums[res] == nums[i]){
                count++;
            }
        }

        if(count <= size/2) return -1;
        return  nums[res];
    }
}

/*
Idea for this is shared at my leetcode profile: https://leetcode.com/Lethal_Bypass/
 */
