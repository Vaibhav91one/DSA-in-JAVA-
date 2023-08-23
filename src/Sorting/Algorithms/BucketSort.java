package Sorting.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort {
    public static void main(String[] args){
        int k = 5;
        int[] arr = {30,40,10,80,5,12,70};
        int n = arr.length;
        bucketsort(arr,n,k);
        System.out.println(Arrays.toString(arr));
    }

    public static void bucketsort(int[] arr, int n, int k){
        //calculating the maximum value
        int max_val = arr[0];
        for(int i = 1; i < n; i++){
            max_val = Math.max(max_val, arr[i]);
        }

        //incrementing in order to get the right buckets as for max_element the bucket will get out of bound if we do not increment
        max_val++;

        //making buckets for the elements
        ArrayList<ArrayList<Integer>> bucket = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < k; i++){
            bucket.add(new ArrayList<Integer>());
        }

        //Distributing elements to buckets
        for(int i = 0 ; i < n ; i++){
            //calculating bucket number
            int bucket_number = (k * arr[i])/max_val;
            //adding elements to buckets
            bucket.get(bucket_number).add(arr[i]);
        }

        //sorting each bucket
        for(int i = 0; i < k; i++){
            Collections.sort(bucket.get(i));
        }

        //concatenating buckets
        int index = 0;

        for(int i = 0; i < k; i++){
            for(int j = 0; j < bucket.get(i).size(); j++){
                arr[index++] = bucket.get(i).get(j);
            }
        }
    }
}
