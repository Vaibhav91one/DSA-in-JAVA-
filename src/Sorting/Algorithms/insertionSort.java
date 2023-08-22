package Sorting.Algorithms;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args){
        int N = 5;
        int arr[] = { 4, 1, 3, 9, 7};
        InsertionSort(arr,N);
    }

    // In insertion sort we keep a sorted range which from 0 to i we keep inserting element in this sorted range by comparing the i elements with elements present in the sorted range
    public static void InsertionSort(int arr[], int n)
    {
        for(int i = 1; i < n; i++){
            //key is the first element after the sorted range
            int key = arr[i];
            //last element of the sorted range
            int j = i - 1;

            // keep going backwards in sorted array and comparing key with sorted elements
            while(j >= 0 && arr[j] > key){
//                replacing the key element index with the greater element
                arr[j+1] = arr[j];
                //decrementing until an element is found in sorted range which is less than key
                j--;
            }
            // adding to key after the index of smaller element in the sorted range
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
