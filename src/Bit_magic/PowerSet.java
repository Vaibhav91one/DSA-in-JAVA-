package Bit_magic;

import java.util.List;
import java.util.ArrayList;

public class PowerSet {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
        System.out.println(subsets(A));
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
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A)
    {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        int n = A.size();
        double power = Math.pow(2, A.size());
        for(int counter = 0; counter < power; counter++){
            ArrayList<Integer> arr1 = new ArrayList<Integer>();
            for (int j = 0; j < n; j++){
                if((counter & 1 << j) != 0){
                    arr1.add(A.get(j));
                }
            }
            arr.add(arr1);
        }
        return arr;
    }
}