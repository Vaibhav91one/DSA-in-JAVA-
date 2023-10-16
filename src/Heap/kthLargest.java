package Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class kthLargest {
    public static void main(String[] args){
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums,k));

    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();

        for(int i = 0; i < k; i++){
            p.add(nums[i]);
        }

        for(int i = k; i < nums.length; i++){
//            if a greater element comes we add it to k heap
            // we remove the top because we have no need of smaller elements as we need to find largest element
            if(p.peek() < nums[i]){
                p.remove(p.peek());
                p.add(nums[i]);
            }
        }

        return p.peek();
    }

    int[] kLargest(int[] arr, int n, int k) {
        int[] result = new int[k];
        PriorityQueue<Integer> p = new PriorityQueue<>();

        for(int i = 0; i < k; i++){
            p.add(arr[i]);
        }

        for(int i = k; i < arr.length; i++){
//            if a greater element comes we add it to k heap
            // we remove the top because we have no need of smaller elements as we need to find largest element
            if(p.peek() < arr[i]){
                p.remove(p.peek());
                p.add(arr[i]);
            }
        }

        int j = k;
        while(!p.isEmpty() && j >= 0){
            result[j] = p.peek();
            p.remove(p.peek());
            j--;
        }


        return result;
    }
}
