package LeetcodeWeekly.Second;

import java.util.Arrays;
import java.util.HashSet;

public class MinimumPossibleSumOfBeauArray {
    public static void main(String[] args){
        int n = 16;
        int target = 6;
        System.out.println(minimumPossibleSum(n,target));
    }

    public static long minimumPossibleSum(int n, int target) {
          int i = 0;
          int[] arr = new int[n];
          HashSet<Integer> h = new HashSet<>();
          if(n == 1){
              return n;
          }
        int j = 1;
        long sum = 0;

          while(i < n){
              if(!h.contains(target - j)){
                      arr[i] = j;
                      h.add(j);
              }
              else{
                  while(h.contains(target - j)){
                      j++;
                      arr[i] = j;
                      h.add(j);
                  }
              }
              sum += arr[i];
              j++;
              i++;
          }
          System.out.println(Arrays.toString(arr));
          return sum;

    }
}
