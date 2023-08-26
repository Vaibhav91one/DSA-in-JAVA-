package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(int[] nums, int target) {
//        Using hashmap to store key as elements and value as their index
        HashMap<Integer,Integer> s = new HashMap<>();
        //answer will be a pair, so only two elements
        int[] pair = new int[2];

        for(int i = 0; i < nums.length; i++){
//            checking hashmap for target - nums[i]
            if(s.containsKey(target - nums[i])){
                pair[0] = i;
                pair[1] = s.get(target - nums[i]);
//                returning the first found pair
                return pair;
            }
            //if s do not contain the array element putting it in the array
            else{
                s.put(nums[i], i);
            }
        }
//        returning empty array if pair not found
        return pair;
    }
}
