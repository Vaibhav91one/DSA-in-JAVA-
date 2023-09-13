package LeetcodePOTD;

import java.util.HashMap;
import java.util.HashSet;

public class MinDeletions {
    public static void main(String[] args){
        String s = "aab";
        System.out.println(minDeletions(s));
    }

    public static int minDeletions(String s) {
        int n = s.length();
        int operations = 0;
        HashMap<Character, Integer> h = new HashMap<>();
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            h.put(s.charAt(i), h.getOrDefault(c,0)+1);
        }

        HashSet<Integer> uniqset = new HashSet<>();

        for(int freq : h.values()){
            while(freq > 0 && uniqset.contains(freq)){
                freq--;
                operations++;
            }
            uniqset.add(freq);
        }

        return operations;
    }
}
