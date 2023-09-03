package LeetcodePOTD;

import java.util.ArrayList;

public class Sep2ExtraCharacters {
    public static void main(String[] args){
        String s = "leetscode";
        String[] dictionary = {"leet","code","leetcode"};
        System.out.println(minExtraChar(s,dictionary));
    }

    public static int minExtraChar(String s, String[] dictionary) {
        int wordLength = 0;
        int GivenLength = s.length();
        for(String word: dictionary){
            if(search(word, s)){
                wordLength += word.length();
            }
        }
           return GivenLength-wordLength;
    }

    static boolean search(String pat, String S)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int n = S.length();
        int m = pat.length();
        int i = 0; int j = 0;
        int[] lps = new int[m];
        lps(pat,lps);

        //when the pattern crosses the length of the text while matching we return
        while((n - i) >= (m -j)){
            //if pattern characters match the characters in the text string
            if(pat.charAt(j) == S.charAt(i)){
                i++;
                j++;
            }
//            if all the character match the characters in the text
            if(j == m){
                j = lps[j - 1];
                return true;
                // putting j to the last character that matched with the text
            }
//            if pat and text do not match, and we still have characters from text
            else if (i < n
                    && pat.charAt(j) != S.charAt(i)) {
                // Do not match lps[0..lps[j-1]] characters,
                // they will match anyway
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
            return false;
    }

    static void lps(String s,int[] lps) {
        int len = 0;
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
        res = lps[s.length()-1];
    }
}


