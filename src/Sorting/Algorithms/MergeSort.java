package Sorting.Algorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int N = 5;
        int arr[] = {4, 1, 3, 9, 7};
        int l = 0;
        int r = N - 1;
        mergeSort(arr,l,r);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int l, int r)
    {
        //at least two elements are present.
         if (l < r){
             int m = l + (r -l)/2; // to avoid overflow, we use r - l this ensures that mid-point is correct
             mergeSort(arr,l,m);
             mergeSort(arr,m+1,r);
             merge(arr,l,m,r);
         }
    }

    public static void merge(int[] arr, int l, int m, int r)
    {
     //length of left and right
     int n1 = m-l+1; int n2 = r -m;

     int[] left = new int[n1]; int[] right = new int[n2];

     for(int i = 0; i < n1; i++){
         //adding elements from l to n1;
         left[i] = arr[l+i];
     }

     for(int i = 0; i < n2; i++){
         //adding elements from right portion that is m+1 to n2;
         right[i] = arr[m+1+i];
     }

     int i = 0; int j = 0; int k = l;

     while(i < n1 && j < n2){
//         adding smaller and equal elements first
         if(left[i] <= right[j]){
             arr[k++] = left[i++];
         }
         else{
             arr[k++] = right[j++];
         }
     }
//         adding elements that are left after one of the array elements are depleted
     while(i < n1) arr[k++] = left[i++];
     while(j < n2) arr[k++] = right[j++];
    }
}

//overflow can occur if l and r are large
//For example, let's say the left and right indices are 2147483647 and 2147483648, respectively. These are the maximum values for an unsigned 32-bit integer. The sum of these two numbers is 4294967295, which is greater than the maximum value of an integer. If the midpoint is calculated using the formula L + R/2, the result will be 2147483647.5, which is an invalid value.
