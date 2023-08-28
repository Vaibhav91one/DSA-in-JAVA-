package Strings;
import java.util.LinkedHashSet;
import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args){
        String S = "zvvo";

    }

    static String removeDups(String S) {
      StringBuilder sb = new StringBuilder();

      // making a boolean array for checking character has been visited earlier or not
      boolean[] visited = new boolean[256];

      for(int i = 0; i < S.length(); i++){
          // getting the character at i
          char c = S.charAt(i);
          //checking if current character was visited earlier or not
          if(!visited[c]){
              //marking visited if was not visited before
              visited[c] = true;
              sb.append(c);
          }
      }
      return sb.toString();
    }
}
