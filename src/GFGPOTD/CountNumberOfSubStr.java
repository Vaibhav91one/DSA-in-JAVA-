package GFGPOTD;

import java.util.HashMap;

public class CountNumberOfSubStr {
    public static void main(String[] args){
        String S = "aba";
        int K = 2;
    }

    long substrCount (String S, int K) {
        return atmost(S,K) - atmost(S, K - 1);
    }

    long atmost (String S, int K) {
        // provided that lowercase alphabets are present
        int arr[] = new int[26];
        //current distinct characters
        int dist = 0;
        // to maintain the no of distinct character, we remove elements from the left by incrementing it. when dist > k
        int left = 0;
        long res = 0;
        int n = S.length();
        for(int i = 0; i < n; i++){
            //adding the current element to the array
            arr[S.charAt(i) - 'a']++;
            //checking if the added element is distinct or have not occurred earlier
            if(arr[S.charAt(i) - 'a'] == 1) dist++;

            //if distinct character get greater than k we remove items from left
            while(dist > K){
                //decrementing the left most character
                arr[S.charAt(left) - 'a']--;
                //if leftmost character becomes 0 we decrement the no of decrement characters
                if(arr[S.charAt(left) - 'a'] == 0) dist--;
                // Then we increment left, so that next character from String s can be removed if still dist > K
                left++;
            }

            //res helps us keep track of no of elements with k distinct characters for example "aabc" if here i = 0
            // we will get the res = 0 + (0 - 0 + 1) = 1; 1 substring 'a'
            // for i = 1, res = 1 + 1 - 0 + 1 = 3; 3 substrings 'a' 'a' 'aa'
            res = res + (i - left + 1);
        }
        return res;
    }
}
