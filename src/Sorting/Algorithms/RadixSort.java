package Sorting.Algorithms;
import java.util.Arrays;
public class RadixSort {
    public static void main(String[] args){
        int N = 4;
        int arr[] = {1, 9, 345, 2};
        radixSort(arr,N);
        System.out.println(Arrays.toString(arr));
    }

    //Radix sort is better than count sort as count sort is N+K whereas radix sort is d*N+k, if we were to do this for n2 count sort will get to N2 + k
    static void radixSort(int arr[], int n)
    {
        //Finding the largest element
        // in order to get the maximum digits
         int mx = arr[0];
         for(int i = 1; i < n; i++){
           mx = Math.max(mx,arr[i]);
         }

         // sorting according to last digit, then according to second last and so on, until first digit.
//        mx/exp for exp 1000 will be 0 if digit are 3 and so on
         for(int exp = 1; mx/exp > 0; exp = exp*10){
             countSortExp(arr,n,exp);
         }

    }

    static void countSortExp(int[] arr,int n, int exp){
//        Since we are sorting according to digits we take count as size 10 (0 - 9)
        int[] count = new int[10];
        Arrays.fill(count,0);

        //arr[i]/exp = 319/1 => 319 % 10 => 9 first digit
        //arr[i]/exp = 319/10 => 31 % 10 => 1 second last digit
        //arr[i]/exp = 319/100 => 3 % 10 => 3 last digit last digit
        for(int i = 0; i < n; i++){
            count[(arr[i]/exp) % 10]++;
        }

        //cumulative count
        for(int i = 1; i < count.length; i++){
            count[i] = count[i] + count[i - 1];
        }

        int[] output = new int[n];

        //putting our elements from last and to the position according to their digits
        for(int i = n - 1; i >=0; i--){
            output[count[(arr[i]/exp)%10] - 1] = arr[i];
            count[(arr[i]/exp)%10]--;
        }

        for(int i = 0; i < n; i++){
            arr[i] = output[i];
        }
    }
}

