package GfdContest;
import java.util.Arrays;
public class min_operations {
    public static void main(String[] args){
        int n = 3;
        int[] arr = {1, 2, 3};
        int[] brr = {2, 1, 3};
        System.out.println(min_operations(n,arr,brr));
    }

    public static int min_operations(int n, int[] arr, int[] brr) {
        int count = 0;
        while(n > 0){
            if (arr.length == 0 && brr.length == 0) {
                return count;
            }

            if(arr[0] != brr[0]) {
                arr = LeftRotate(arr, n);
                count++;
            }
            if(arr[0] == brr[0]){
                arr = Arrays.copyOfRange(arr, 1, arr.length);
                brr = Arrays.copyOfRange(brr, 1, brr.length);
                count++;
                n = n - 1;
            }
        }
        return count;
    }

    public static int[] LeftRotate(int[] arr, int n){
        int a = arr[0];
        for(int i = 1; i < n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = a;
        return arr;
    }


}
