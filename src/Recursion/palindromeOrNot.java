package Recursion;

import java.util.Locale;

public class palindromeOrNot {
    public static void main(String[] args){
       String S = "abba";
       System.out.println(Palindrome(S));
    }

    public static int Palindrome(String S){
        S = S.toLowerCase().replaceAll("[^a-z0-9]", "");
       int low = 0;
       int high = S.length() - 1;

       while(low < high){
           if(S.charAt(low) != S.charAt(high)){
               return 0;
           }
           low++;
           high--;
       }
       return 1;
    }
}
