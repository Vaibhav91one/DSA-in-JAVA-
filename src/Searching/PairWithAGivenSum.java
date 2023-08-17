package Searching;

public class PairWithAGivenSum {
    public static void main(String[] args){
        int n = 7;
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int K = 8;
        System.out.println(CountPair(arr,n,K));
    }

    public static int CountPair(int a[], int n, int sum){
        int low = 0;
        int high = n - 1;
        int count = 0;

        while(low < high){
            if(a[low] + a[high] == sum){
                count++;
                low++;
                high--;
            }

            else if(a[low] + a[high] > sum){
                high--;
            }

            else{
                low++;
            }
        }
        return count;
    }
}
