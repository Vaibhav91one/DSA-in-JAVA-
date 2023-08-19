package Hashing;

import java.util.HashMap;
import java.util.List;

public class CountPairsWithSum {
    public static void main(String[] args){
        int N = 4;
        int K = 6;
        int[] arr = {1, 5, 7, 1};
        System.out.println(getPairsCount(arr,N,K));
    }

    public static int getPairsCount(int[] arr, int n, int k) {
       HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
       int count = 0;
       for(int i = 0; i < n; i++){
           if(h.containsKey(k - arr[i])){
               count += h.get(k - arr[i]);
           }
           if(h.containsKey(arr[i])){
               h.put(arr[i], h.get(arr[i]) + 1);
           }
           else{
               h.put(arr[i], 1);
           }
       }
       return count;
    }

   
    
}
