package Searching;

import java.util.ArrayList;

public class Index_of_FirstLastOccurence {
    public static void main(String[] args){
        int n=9;
        int x=5;
        long arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        ArrayList<Long> Al = new ArrayList<Long>();
        Al.add(FirstIndex(arr,n,x));
        Al.add(LastIndex(arr,n,x));
    }

    public static long FirstIndex(long arr[], int n , int x){
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(x > arr[mid]){
                low = mid + 1;
            }
            else if(x < arr[mid]){
                high = mid - 1;
            }
            else{
                if(mid == 0 || arr[mid - 1] != arr[mid]){
                    return mid;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static long LastIndex(long arr[], int n , int x){
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(x > arr[mid]){
                low = mid + 1;
            }
            else if(x < arr[mid]){
                high = mid - 1;
            }
            else{
                if(mid == n-1 || arr[mid + 1] != arr[mid]){
                    return mid;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}


