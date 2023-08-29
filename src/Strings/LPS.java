package Strings;

import java.util.Arrays;

public class LPS {
    public static void main(String[] args){
          String s = "abab";
          System.out.println(lps(s));
    }

    static int lps(String s) {
        int len = 0;
        int[] lps = new int[s.length()];
        //starting is always 0
        lps[0] = 0;
        int res = 0;
        int i = 1;

        while(i < s.length()){
            //if character matches then we increase len and add it to the lps array
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            //if do not match
            else{
                //if the len == 0, this means that there was a distinct character previously, we make lps[i] == 0
                if(len == 0){
                    lps[i] = 0;
                    i++;
                }
                //else we check for recursively for a match of current charcter with character at len and we keep decrementing len until len = 0;
//                ex: abaaaaaab len is at last a and current character is b, we will keep decrementing until len reaches at b which matches
                else{
                    len = lps[len - 1];
                }
            }
        }
//        we wanted the non overlappiing one
        res = lps[s.length()-1];
        System.out.println(Arrays.toString(lps));
        return res;
    }
}
