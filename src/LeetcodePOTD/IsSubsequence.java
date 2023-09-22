package LeetcodePOTD;

public class IsSubsequence {
    public static void main(String[] args){
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }

    public static boolean isSubsequence(String s, String t) {
        int i = s.length()-1;
        int j = t.length() -1;
        int count = 0;

        while(count != s.length() && j != -1){
            char s1 = s.charAt(i);
            char s2 = t.charAt(j);
            if(s1 == s2){
                i--;
                j--;
                count++;
            }
            else{
                j--;
            }
        }

        if(count == s.length()){
            return true;
        }
       return false;
    }
}
