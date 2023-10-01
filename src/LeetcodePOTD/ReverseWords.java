package LeetcodePOTD;

public class ReverseWords {
    public static void main(String[] args){
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
       int n = s.length();
       int firstIndex, lastIndex;

       if(n == 1) return s;

       char[] ch = s.toCharArray();
       char temp;

       for(int index = 0; index < n; index++){
           firstIndex = index;

           while(index < n && ch[index] != ' '){
               index++;
           }

           lastIndex = index - 1;

           while(firstIndex < lastIndex){
               temp = ch[firstIndex];
               ch[firstIndex++] = ch[lastIndex];
               ch[lastIndex--] = temp;
           }
       }

       return new String(ch);
    }

}
