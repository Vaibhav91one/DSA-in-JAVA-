package LeetcodePOTD;

import java.util.Stack;

public class Sep27 {
    public static void main(String[] args){
        String s = "leet2code3";
        int k = 10;
    System.out.println(decodeAtIndex(s,k));
    }

    public static String decodeAtIndex(String s, int k) {
        long size = 0;
        int n = s.length();

        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                size *= c - '0';
            }
            else if(Character.isLetter(c)){
                size++;
            }
        }

        for(int i = n - 1; i >= 0; i--){
            k = (int)(k % size);

            if( k == 0 && Character.isLetter(s.charAt(i))){
                return String.valueOf(s.charAt(i));
            }

            if(Character.isDigit(s.charAt(i))){
                size /= s.charAt(i) - '0';
            }

            else {
                size--;
            }
        }

        return "";
    }
}
