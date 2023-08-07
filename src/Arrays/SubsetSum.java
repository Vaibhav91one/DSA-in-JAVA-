package Arrays;

public class SubsetSum {
    public static void main(String[] args){
        int N = 6;
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        IsSubset(arr, N, sum);
    }

    public static int  IsSubset(int[] arr, int n, int sum){
        if(n == 0){
            return (sum == 0)? 1:0;
        }
        return IsSubset(arr, n-1, sum) + IsSubset(arr, n - 1, sum - arr[n - 1]);
    }
}
