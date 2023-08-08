package Arrays;

public class Maximum_Consecutive__Binary {
    public static void main(String[] args){
        int[] nums = {1,1,0,1,1,1};
        System.out.println(MaxConsecutiveOnes(nums));
    }

    public static int MaxConsecutiveOnes(int[] nums){
        int res = 0;
        int curr = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                curr = 0;
            }
            else{
                curr++;
                res = Math.max(res, curr);
            }
        }
        return res;
    }
}

/*
Idea for this is shared at my leetcode profile: https://leetcode.com/Lethal_Bypass/
 */