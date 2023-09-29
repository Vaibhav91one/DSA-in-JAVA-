package LeetcodePOTD;

public class Sep25 {
    public static void main(String[] args){
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s,t));
    }
    public static char findTheDifference(String s, String t) {
        char[] arr = new char[256];

        for(int i = 0;  i < t.length(); i++){
            char c = t.charAt(i);
            arr[c]++;
        }

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            arr[c]--;
        }

        for(int i = 0;  i < 256; i++){
            if(arr[i] >= 1){
                return (char)i;
            }
        }
        return 0;
    }
}
