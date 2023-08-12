package Searching;

public class CountOf1s {
    public static void main(String[] args){
        int arr[] = {0, 0, 0, 1, 1, 1, 1};
        System.out.println(Count1s(arr));
    }

    public static int Count1s(int arr[]){
        int n = arr.length;
        int low = 0; int high = n-1;
        while(low <= high){
            int mid = (low + high)/2;

            if(arr[mid] == 0){
                low = mid + 1;
            }
//            arr[mid]  == 1
            else{
                if(mid == 0 || arr[mid - 1] != arr[mid]){
                    return (n - mid);
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return 0;
    }
}

//the appoach is similar to previous searching questions;
//
//In this approach we do a binary search and if mid == 0, we update low = high + 1, since this a binary array and sort there is only 0 and 1,
//else arr[mid] == 1, since we need the first occurence we check if there is an element same as mid at mid - 1;
