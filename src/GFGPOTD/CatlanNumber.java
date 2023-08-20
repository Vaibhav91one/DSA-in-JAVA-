package GFGPOTD;

import java.util.Arrays;

public class CatlanNumber {
    public static void main(String[] args){
     int n = 5;
     System.out.println(Nth(n));
    }

    public static int Nth(int n){
        int mod = 1000000007;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i < dp.length; i++){
            for(int j = 0; j < i; j++){
                long p = (long) dp[j] * dp[i - 1 - j];
                dp[i] = (int)((dp[i] + p) % mod);
            }
        }

        return dp[n];
    }
}
