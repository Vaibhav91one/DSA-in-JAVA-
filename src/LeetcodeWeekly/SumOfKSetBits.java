package LeetcodeWeekly;
import java.util.List;
public class SumOfKSetBits {
    public static void main(String[] args){
        int[]nums = {5,10,1,5,2};
        int  k = 1;
        System.out.println(countSetBits(10));
    }

    public static  int sumIndicesWithKSetBits(List<Integer> nums, int k) {
       int sum = 0;
       int i = 0;

       for(int num: nums){
           if(countSetBits(i) == k){
               sum += num;
           }
           i++;
       }
       return sum;
    }

    public static int countSetBits(int n){
        int count = 0;

        while(n != 0){
            n = n & (n-1);
            count++;
        }

        return count;
    }

}
