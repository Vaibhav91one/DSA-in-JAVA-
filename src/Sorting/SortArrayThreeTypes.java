package Sorting;

import java.util.Arrays;
//Dutch national Flag algorithm and Three way Partition
public class SortArrayThreeTypes {
    public static void main(String[] args){
        int N = 5;
        int arr[]= {0, 2, 1, 2, 0};
        sort012(arr,N);
    }

    public static void sort012(int a[], int n)
    {
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while(mid <= high){
            switch (a[mid]){
                case 0: swap(a, low, mid);
                        low++;
                        mid++;
                        break;
                case 1: mid++; break;
                case 2: swap(a,mid, high);
                        high--;
                        break;
            }
        }
    }

    static public void swap(int[] arr, int n1, int n2) {
        int temp = arr[n2];
        arr[n2] = arr[n1];
        arr[n1] = temp;
    }
}
