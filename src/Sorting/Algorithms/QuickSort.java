package Sorting.Algorithms;


import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args){
        int N = 8;
        int arr[] = {24,18 ,38, 43, 14, 40, 1,54};
        int low = 0;
        int high = N -1;
        quickSort(arr,low, high);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void quickSort(int arr[], int low, int high)
    {
        //There are at least two elements present
        if( low < high){
            int p = partition(arr,low, high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
    }

    //using lomeuto partition.
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        //taking last element as pivot
        int i = low - 1;
        //index to swap with is initially less than low;

        // running loop from low to the high - 1 elements as pivot is last element
        for(int j = low; j <= high - 1; j++){
//            element less than pivot is found
            if(arr[j] < pivot){
                i++;
                swap(arr,i, j);
            }
        }
        //this swap is done in order to put the pivot element in the right place as element less than i+1 are shorter than pivot which was done in the prev loop
        //element on right are swapped to last.
        swap(arr,i+1, high);
        return i+1;
    }
}

//Hoare partition provides us an index where all the the elements on the left are less than the pivot and on the right the elements are greater or equal to pivot.It does not place the pivot element.
//whereas lomeuto partiton sort a single element and places it such that all elements on the left of the returned index/pivot are smaller and all elements on right are greater than the pivot.
//This ensures that a single element is sorted or in its right position.
