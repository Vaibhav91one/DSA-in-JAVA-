package GFGPOTD;

import java.util.HashMap;

public class PerfectSum {
    public static void main(String[] args){
        int N = 7;
        int arr[] = {9 ,6 ,1 ,2 ,6 ,8 ,5};
        int sum = 7;
        perfectSum(arr,N,sum);
    }

    public static int perfectSum(int arr[],int n, int sum)
    {
        int count = 0;
        int prefix_sum = 0;
        HashMap<Integer, Integer> h = new HashMap<>();

        for(int i = 0; i < n; i++){
            prefix_sum += arr[i];
//            System.out.println(prefix_sum);
            if(prefix_sum == sum){
                count++;
            }

            if(arr[i] == sum){
                count++;
            }

            if(!h.containsKey(prefix_sum)){
                h.put(prefix_sum,i);
            }
            System.out.println(prefix_sum-sum);

            if(h.containsKey(prefix_sum - sum)){
                count++;
            }
        }
        return count;
    }
}
