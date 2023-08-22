package Sorting.Algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int N = 5;
        int arr[] = {4, 1, 3, 9, 7};
        selectionSort(arr,N);
    }

//    In selection sort we find the min element from index i+1 to n(n is exclusive) and place it at starting postions
    public static void selectionSort(int arr[], int n)
    {
        // n - 1 because j is incremented i+1 as first position get replaced by the minimum element.
        for(int i = 0; i < n - 1; i++){
//            placing min elements to the start
            int min_index = i;
            for(int j = i+1; j < n; j++){
// if an element which is less than the min_index element is found
                if(arr[j] < arr[min_index]){
                   min_index = j;
                }
            }
            // swapping the new minimum element with the previous minimum element assumed to be first index element
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
