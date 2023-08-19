package Arrays;

import java.util.ArrayList;

public class SubarrayWithGivenSum {
    public static void main(String[] args){
        int N = 42;
        int S = 468;
        int A[] = {135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};
        System.out.println(IsSumListStartEnd(A,N,S));
    }

    public static boolean IsSum(int arr[], int n , int s){
        int sum = 0;
        int sm2 = 0;
        ArrayList<Integer> Al = new ArrayList<Integer>();
        for(int e = 0; e < n; e++){
            while(sum > s && sm2 < e -1){
                sum -= arr[sm2];
                sm2++;
            }
            if(sum == s){
                System.out.println(sm2);
                System.out.println(e);
                return true;
            }
            if(e < n){
                sum += arr[e];
            }
        }
        return (sum == s);
    }
    public static ArrayList<Integer> IsSumListStartEnd(int arr[], int n , int s){
        int currentSum = arr[0], start = 0;
        ArrayList<Integer> Al = new ArrayList<Integer>();

        //If given sum is 0, since this apporach work on positive integers only
        if(s == 0){
            Al.add(-1);
            return Al;
        }

//        traverse from 1 to n inclusive because if the in while loop we are checking for i - 1, and also we need to provide 1 based index and everywhere we are checking for < i - 1
//        So, it never goes out of bound and for the last run we get the 1 based end index, the last run here remove a start element which end in giving our result
          // Also we need to check again if the next sum generated is equal to the given sum for the last if statement.
        for(int i = 1; i <= n; i++){
            // while the current sum is greater than the given sum remove elements from the start.
            // Here by keeping start <  i - 1 we ensure that there is still one element in the sub array even though it is not our answer.
            // we can also replace start < i - 1 with start < n
            while(currentSum > s && start < n){
                currentSum -= arr[start];
                start++;
            }

            // else if our curr sum is equal to given sum we return the start and end index of the sub-array.
            if(currentSum == s){
              Al.add(start + 1);
              Al.add(i);
              return Al;
            }
            // we keep adding element until the current sum is less than the given sum. also i < n
            if(i < n){
                currentSum += arr[i];
            }
            if(currentSum == s){
                Al.add(start + 1);
                Al.add(i);
                return Al;
            }
        }
        Al.add(-1);
        return Al;
    }
}

/*
Idea for this is shared at my leetcode profile: https://leetcode.com/Lethal_Bypass/
 */
