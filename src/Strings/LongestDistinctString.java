package Strings;
import java.util.HashSet;
import java.util.Arrays;

public class LongestDistinctString {
    public static void main(String[] args){
        String S = "geeksforgeeks";
        System.out.print(longestSubstrDistinctChars(S));
    }

    static int longestSubstrDistinctChars(String S){
        HashSet<Character> set = new HashSet<>();
        int ans = 0,start = 0;
        for (int i=0;i<S.length();i++){
            //if there were duplicate present
//            Iska mtlb ye hai ki jab tak hma ek distinct character na miljaye tab tak hm piche se element hata raha ga
            while (set.contains(S.charAt(i))){
//                remove the elements from the start
                set.remove(S.charAt(start++));
            }
            //else add the current element as it is distinct
            set.add(S.charAt(i));
//            keep track of maximum length of subsequence with distinct characterr
            ans = Math.max(ans,i-start+1);
        }
        return ans;
    }
}
