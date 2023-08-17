package Searching;
import java.util.Arrays;
public class TripletWithGivenSum {
    public static void main(String[] args){
        int n = 5;
        int X = 10;
        int[] arr = {1 ,2 ,4 ,3 ,6};
        System.out.println(find3numbers(arr,n,X));
    }

    public static boolean find3numbers(int A[], int n, int X){
        Arrays.sort(A);
        for(int i = 0; i < n; i++){
            if(isPair(A,i+1, n-1,X-A[i])){
                return true;
            }
        }
        return false;
    }

    public static boolean isPair(int a[], int low, int high, int sum){

        while(low < high){
            if(a[low] + a[high] == sum){
                return true;
            }

            else if(a[low] + a[high] > sum){
                high--;
            }

            else{
                low++;
            }
        }
        return false;
    }

}
