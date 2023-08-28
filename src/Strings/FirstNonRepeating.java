package Strings;

import java.util.HashMap;

public class FirstNonRepeating {
    public static void main(String[] args){

    }

    static char nonrepeatingCharacter(String S)
    {
        HashMap<Character,Integer> h = new HashMap<>();

        for(int i =0; i < S.length(); i++){
            char c = S.charAt(i);
            //puts the default value 0 + 1 if not present else increments by 1
            h.put(c, h.getOrDefault(c,0)+1);
        }

        for(int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            if(h.get(c) == 1){
                return c;
        }
    }
        return '$';
    }
}
