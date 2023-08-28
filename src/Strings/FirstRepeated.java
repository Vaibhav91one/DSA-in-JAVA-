package Strings;

public class FirstRepeated {
    public static void main(String[] args){
           String S="geeksforgeeks";
           System.out.println(firstRepChar(S));
    }

    static String firstRepChar(String s)
    {
        StringBuilder sb = new StringBuilder();

        // making a boolean array for checking character has been visited earlier or not
        boolean[] visited = new boolean[256];

        for(int i = 0; i < s.length(); i++){
            // getting the character at i
            char c = s.charAt(i);
            //checking if current character was visited earlier or not
            if(!visited[c]){
                //marking visited if was not visited before
                visited[c] = true;
            }
            else{
                return new String(String.valueOf(c));
            }
        }
        return "-1";
    }
}
