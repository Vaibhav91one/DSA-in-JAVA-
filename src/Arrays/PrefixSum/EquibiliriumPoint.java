package Arrays.PrefixSum;

public class EquibiliriumPoint {
    public static void main(String[] args){
        int n = 5;
        long A[] = {1,3,5,2,2};
        System.out.println(Pivot(A,n));
    }

    public static long Pivot(long[] arr, int n){
        int sum = 0;
        for(int i =0; i < n; i++){
            sum += arr[i];
        }
        int l_sum = 0;
        for(int i = 0; i < n; i++){
            if(l_sum == sum - arr[i]){
                return i+1;
            }
            l_sum += arr[i];
            sum -= arr[i];
        }
        return -1;
    }
}

/*
Idea for this is shared at my leetcode profile: https://leetcode.com/Lethal_Bypass/
 */


