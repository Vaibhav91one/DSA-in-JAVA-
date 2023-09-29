package LeetcodeWeekly;

public class MaximumBinary {
    public static void main(String[] args){
        String s = "0101";
        System.out.println(maximumOddBinaryNumber(s));
    }

    public static String maximumOddBinaryNumber(String s) {
        int n = s.length();
        int count = 0;
        StringBuilder str = new StringBuilder("");
       for(int i = 0; i < n; i++){
           char c = s.charAt(i);
           if(c == '1'){
               if(s.charAt(n-1) != '1'){
                   str.append(1);
               }
               else{
                   str.insert(0,'1');
               }
           }
           else{
               str.insert(n-2,'0');
           }
       }
       return str.toString();
    }
}
