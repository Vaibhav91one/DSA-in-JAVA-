package Sorting.Algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int N = 5;
        int arr[] = {4, 1, 3, 9, 7};

        bubbleSort(arr,N);
    }

    //in bubble sort we keep swapping the elements in order to get the maximum element at the last index;
    // swapping is only done when the current element is smaller that the next element.
    public static void bubbleSort(int arr[], int n)
    {
        // n-1 because in inner loop we are checking for j + 1 element
       for(int i = 0; i < n - 1; i++){
           // n - i - 1 to optimize the code. as max element get shifted to last element so, we are not comparing with last elements
           // using swap to check if sorting has stopped that is no swapping is done in order to sort. this happens when elements are already sorted.
           boolean swap = false;
           for(int j = 0; j < n - i - 1; j++){
               //swapping when arr[j] is which is the left side element is smaller than the right side element
               if(arr[j] > arr[j+1]){
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
                  swap = true;
               }
           }
           if (!swap){
               //breaking if no swaps happened, already sorted.
               break;
           }
       }

       System.out.println(Arrays.toString(arr));
    }
}
