package Strings;

public class IsAnagram {
    public static void main(String[] args){
        String a = "geeksforgeeks";
        String b = "forgeeksgeeks";
    }

    public static boolean isAnagram(String a,String b)
    {
        if(a.length() != b.length()){
            return false;
        }

        int[] count = new int[256];

        for(int i = 0; i < a.length(); i++){
            count[a.charAt(i)]++;
        }

        for(int i = 0; i < a.length(); i++){
            count[b.charAt(i)]--;
        }

        for(int i = 0; i < 256; i++){
            if(count[i] !=0){
                return false;
            }
        }
        return true;
    }
}
