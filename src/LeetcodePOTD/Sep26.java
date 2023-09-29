package LeetcodePOTD;

import java.util.Stack;

public class Sep26 {
    public static void main(String[] args){
          String s = "cbacdcbc";
          System.out.println(removeDuplicateLetters(s));
    }

    public static String removeDuplicateLetters(String s) {
           int[] lastIndex = new int[26];
           int n = s.length();

//           maintaining the last index of distinct characters
           for(int i = 0; i < n; i++){
               lastIndex[s.charAt(i) - 'a'] = i;
           }

           boolean[] Seen = new boolean[26];
           Stack<Integer> st = new Stack<>();

           for(int i = 0; i < n; i++){
               int curr = s.charAt(i) - 'a';
               //for only keeping distinct elements
               if(Seen[curr]) continue;

//               if we do not have an empty stack and if we have a greater char at top and we the top character is present later in the string
               while(!st.isEmpty() && st.peek() > curr && i < lastIndex[st.peek()]){
                   Seen[st.pop()] = false;
               }

               st.push(curr);
               Seen[curr] = true;
           }

           StringBuilder sb = new StringBuilder("");

           while(!st.isEmpty()){
               sb.append( (char) (st.pop()+'a'));
           }

           return sb.reverse().toString();
    }
}
