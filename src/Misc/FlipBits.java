package Misc;

public class FlipBits {
    public static void main(String[] args){
        int N = 5;
        int A[] = {1, 0, 0, 1, 0};
        System.out.println(CountMaxOnes(A,N));
    }
    // Using kadane's algorithm
    public static int CountMaxOnes(int[] a, int n){
        int one_count = 0;
        int curr_sum = 0;
        int max_sum = 0;

        // Iterating over all the elements
        for(int i = 0; i < n; i++){
//            Counting the no of ones
            if(a[i] == 1){
                one_count++;
            }
            // if 0 we consider it as 1 and if 1 we consider it as -1

            int val = (a[i] == 0? 1 : -1);

            //keeping track of maximum curr_sum, so that no negative elements are present.
            curr_sum = Math.max(curr_sum + val, val);

            //keeping track of max no of zeros present  in the array
            max_sum = Math.max(curr_sum, max_sum);

            //if curr_sum becomes negative we reset it to 0 because we want to deal with only -1 and 1
//            if(curr_sum<0){
//                curr_sum = 0;
//            }
        }
        return one_count + max_sum;
    }
}
