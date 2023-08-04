package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static void main(String[] args){
        int n = 6;
        int A[] = {17,18,5,4,6,1};
//        System.out.println(Leaders(A,n));

        A = Leaders(A);
        for(int j : A) System.out.println(j);

    }

//    Leetcode  Replace Elements with Greatest Element on Right Side
    public static int[] Leaders(int[] arr){
        int curr_ldr = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for(int i = arr.length - 2; i >= 0; i--){
            int temp = Math.max(curr_ldr, arr[i]);
            arr[i] = curr_ldr;
            curr_ldr = temp;
        }
        return arr;
    }

    /*
    Approach:
    In Leetcode the problem statement differs slightly we know that the last element is already a leader,so we have to make that -1. and store the current leader from last element only such that
    the resultant array from the right is starting with 1 in this example.
    other than that the problem is same.
    First, we introduce a variable current_leader to keep track of current leader, Current leader is used to compare the upcoming elements.
    Then,we are setting last element as -1 and later we run a back loop from n - 2 elements to the first index which is 0 then we check the max element by using max from maths
    comparing the current element in array then the current leader element.
    If the current element is greater than current leader we set temp as the greater element and then replace a[i] with the current leader and then current leader to temp(new greater element)
     */

//    Leaders in Array GFG
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> Al = new ArrayList<Integer>();
        int curr_ldr = arr[n - 1];
        for(int i = n - 1; i >= 0; i--){
            if(arr[i] >= curr_ldr){
                curr_ldr = arr[i];
                Al.add(curr_ldr);
            }
        }
        Collections.sort(Al, Collections.reverseOrder());
        return Al;
    }
}

/*
Approach:
Approach here remains same we are just not setting the last element as -1. We use an arraylist here, then for n - 1 to 0 , we check for the greater element if present then we
set current leader as arr[i] (current element) and then
 */

