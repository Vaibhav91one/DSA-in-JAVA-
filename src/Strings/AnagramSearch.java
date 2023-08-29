package Strings;

import java.util.ArrayList;
import java.util.List;

public class AnagramSearch {
    public static void main(String[] args){
        String txt = "cbaebabacd";
        String pat = "abc";
//        System.out.println(search(pat,txt));
        System.out.println(findAnagrams(txt,pat));
    }

    static int search(String pat, String txt) {
        List<Integer> l = new ArrayList<Integer>();
      //making arrays for storing the character ascii value as index and their frequencies as value
      int[] countPat = new int[256];
      int[] counttxt = new int[256];
      //res for result
      int res = 0;

      //adding the count of first i characters where i < pattern length
      for(int i = 0; i < pat.length(); i++){
         countPat[pat.charAt(i)]++;
         counttxt[txt.charAt(i)]++;
      }

      //traversing the text after the first i characters above added.
      for(int i = pat.length(); i <= txt.length(); i++){
//          checking if the current array is anagram before any window sliding
          if(areSame(countPat,counttxt)){
              l.add(i-pat.length());
              res++;
          }
//          we have to do this because if our pattern is present at the end we will not be able to check if we keep i < txt.length()
//          Sliding WIndow
          if(i < txt.length()){
            //adding the next charactere from txt to counttxt
            counttxt[txt.charAt(i)]++;
            //removing the character from the window
            counttxt[txt.charAt(i - pat.length())]--;
      }
    }
      System.out.println(l);
      return res;
    }

    static List<Integer> findAnagrams(String s, String p) {
        List<Integer> l = new ArrayList<Integer>();
        //making arrays for storing the character ascii value as index and their frequencies as value
        int[] countPat = new int[256];
        int[] counttxt = new int[256];
        //res for result

        //adding the count of first i characters where i < pattern length
        for(int i = 0; i < p.length(); i++){
            countPat[p.charAt(i)]++;
            counttxt[s.charAt(i)]++;
        }

        //traversing the text after the first i characters above added.
        for(int i = p.length(); i <= s.length(); i++){
//          checking if the current array is anagram before any window sliding
            if(areSame(countPat,counttxt)){
                l.add(i-p.length());
            }
//          we have to do this because if our pattern is present at the end we will not be able to check if we keep i < p.length()
//          Sliding WIndow
            if(i < s.length()){
                //adding the next charactere from p to counttxt
                counttxt[s.charAt(i)]++;
                //removing the character from the window
                counttxt[s.charAt(i - p.length())]--;
            }
        }
       return l;
    }
    public static boolean areSame(int[] arr1, int[] arr2){
        for(int i = 0; i < 256; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
