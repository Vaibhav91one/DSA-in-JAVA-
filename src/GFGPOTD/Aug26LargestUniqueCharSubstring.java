package GFGPOTD;

import java.util.HashMap;

public class Aug26LargestUniqueCharSubstring {
    public static void main(String[] args){
        String S = "aabacbebebe";
        int K = 3;
    }

    public int longestkSubstr(String s, int k) {
        //TwoPointer, sliding window approach
        int i = 0; //pointer for start
        int j = 0;//pointer for end
        int ans = -1; // -1 if no substring with k unique characters is present.

        //Key will be character of the string and value will be the frequency of the character
        HashMap<Character, Integer> h = new HashMap<>();

        while(j < s.length()){
            char c = s.charAt(j);
            //inserting the char with default value and increasing the value by 1 if repeating
            h.put(c, h.getOrDefault(c,0) + 1);
            //if we have k unique characters in the string, we will update the ans with the length of the substring that is j - i + 1
            if(h.size() == k) ans = Math.max(ans, j - i + 1);

            //if we have more than k unique characters
            if(h.size() > k){
//                get the first i character
                char x = s.charAt(i);
                h.put(x,h.get(x) - 1); // decrement its frequency
                if(h.get(x) == 0){
                    h.remove(x); //if frequency becomes 0, remove the element
                }
                i++; // in any case we have to update i++, if we have more than k unique characters
            }
            j++;
        }
        return ans;
    }
}
