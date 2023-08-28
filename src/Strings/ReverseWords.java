package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args){
        String S = "i.like.this.program.very.much";
        System.out.println(reverseWords(S));
    }

    static String reverseWords(String S)
    {
           StringBuilder sb = new StringBuilder();
           //splitting the string by . and putting words into array
           String[] arr = S.split("\\.");
           //appending the words to the sb from the back and also appending .
           for(int i = arr.length - 1; i >=0; i--){
               sb.append(arr[i] + ".");
           }
           //removing the extra . and converting to string
           return sb.toString().substring(0,sb.length()-1);
    }
}
