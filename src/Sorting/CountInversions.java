package Sorting;
import java.util.Arrays;
public class CountInversions {
    public static void main(String[] args){
        long N = 5;
        long[] arr = {2, 4, 1, 3, 5};
        System.out.println(inversionCount(arr,N));
    }

    static long inversionCount(long arr[], long N)
    {
        int low = 0;
        int high = arr.length - 1;
        long res = CountPair(arr,low, high);
        return res;
    }

    public static long CountPair(long[] arr, int low, int high){
        long count = 0;

        //at least two elements are present
        if(low < high){
            int mid = (low + high)/2;
            count += CountPair(arr,low,mid);
            count += CountPair(arr,mid+1,high);
            count += CountAndMerge(arr,low,mid,high);
        }

        return count;
    }

    public static long CountAndMerge(long[] arr, int low, int mid, int high){
        long[] left = Arrays.copyOfRange(arr, low, mid + 1);

        // Right subarray
        long[] right = Arrays.copyOfRange(arr, mid + 1, high + 1);

        int n1 = left.length;
        int n2 = right.length;
        int i = 0;
        int j =0;
        int k = low;
        long res = 0;


        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
                res += n1 - i;
            }
        }
        while(i < n1) arr[k++] = left[i++];
        while(j < n2) arr[k++] = right[j++];

        return res;
    }
}
