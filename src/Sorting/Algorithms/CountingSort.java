package Sorting.Algorithms;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args){
        int N = 5;
        String S = "edsab";
        System.out.println(countSort(S));
    }

    public static String countSort(String s)
    {
        int n = s.length();

//        Making a count array which will consists of count of each char at index = character ASCII value
        int[] count = new int[256];
        char[] charArray = new char[s.length()];

        for(int i = 0; i < 256; i++){
            count[i] = 0;
        }

        //adding frequency of each character in s string
        for(int i = 0; i < n; i++){
            count[s.charAt(i)]++;
        }


        //Cumulative frequency or frequency of characters which comes before current character
        for(int i = 1; i < 256; i++){
            count[i] = count[i] + count[i-1];
        }

        char[] output = new char[n];

        for(int i = n-1; i >=0; i--){
            output[count[s.charAt(i)] -1] = s.charAt(i);
            count[s.charAt(i)]--;
        }

        String str = new String(output);
        return str;
    }
}
