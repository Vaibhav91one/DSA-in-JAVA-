package Bit_magic;

import java.util.List;
import java.util.ArrayList;

public class PowerSet {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        PowerSet(nums);
    }

    public static void PowerSet(int[] nums) {
        List<List<Integer>> listOfLists
                = new ArrayList<List<Integer>>();

        int n = nums.length;
        double power = Math.pow(2, n);
        for (int counter = 0; counter < power; counter++) {
            List<Integer> list1 = new ArrayList<Integer>();;
            for (int j = 0; j < n; j++) {
                if ((counter & 1 << j) != 0) {
                    list1.add(nums[j]);
                }
            }
            listOfLists.add(list1);
        }
        System.out.println(listOfLists);
    }
}