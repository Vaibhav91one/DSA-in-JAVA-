package Sorting;

import java.util.Arrays;

//Advice : use merge sort
public class SortArrayTwoTypes {
    public static void main(String[] args){
        int N = 8;
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6 };
        SeggreateHoares(arr,N);
        System.out.println(Arrays.toString(arr));
//        Rearrange(arr,N);
//        System.out.println(Arrays.toString(arr));
    }

    public static void SeggreateHoares(int[] a, int n){
        int low = 0; int high = n - 1;
        while(low < high){
            while(a[low] > 0 && low < high){
                low++;
            };
            while(a[high] < 0 && low < high){
                high--;
            }
            if(low < high) {
                swap(a,low, high);
                low++;
                high--;
            }
        }
        System.out.println(low + " " + high);
    }

    public static void Rearrange(int arr[], int n){
        int[] ans = new int[n];
        int j = 0;
        int k = 1;

        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                ans[j] = arr[i];
                j += 2;
            }
            if (arr[i] < 0) {
                ans[k] = arr[i];
                k += 2;
            }
        }
        arr = Arrays.copyOfRange(ans,0,n);
    }

    public static void MaintainOrder(int arr[], int n){
        int i = 0;
        int j = 0;

        while( j < arr.length){
         if(arr[j] >= 0){
             j++;
         }
        }

    }

    static public void swap(int[] arr, int n1, int n2) {
        int temp = arr[n2];
        arr[n2] = arr[n1];
        arr[n1] = temp;
    }
}
