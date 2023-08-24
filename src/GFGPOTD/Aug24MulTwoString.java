package GFGPOTD;

public class Aug24MulTwoString{
    public static void main(String[] args){
        String s1 = "0033";
        String s2 = "2";
        System.out.println(multiplyStrings(s1,s2));
    }

    public static String multiplyStrings(String s1,String s2)
    {
        //length of strings
        int n1 = s1.length();
        int n2 = s2.length();

        //Signs of each number
        int a = s1.charAt(0) == '-'? -1: 0;
        int b = s2.charAt(0) == '-'? -1: 0;

//        making new array for storing the results when last digit of s2 is mulitplied with s1
        int[] arr = new int[n1 + n2];
        //running  a reverse loop for standard multiplication method.
        for(int i = n1 -1; i >=0; i--){
          // k is the last index of the new array and its get decremented each iteration.
          int k = i + n2;
          if(s1.charAt(i) != '-'){
              int carry = 0;
              //multiplying all the elements of s2 with s1
              for(int j = n2- 1; j>=0; j--){
                  if(s2.charAt(j) != '-') {
                      // - '0' because of ASCII
                      // here carry is initially zero and arr[k] is the last value present in the new array and k index decrements by 1 each iteration.
                      int x = (s1.charAt(i) - '0')*(s2.charAt(j) - '0') + carry + arr[k];
                      arr[k] = x % 10;
                      carry = x / 10;
                      k--;
                  }
              }
              // adding the last carryy if any
              if (carry > 0) {
                  arr[k] = carry;
              }
          }

        }
        boolean flag = true;
        //stringbuilder instead of string because string is immutable
        StringBuilder sb = new StringBuilder();
        //checking for zeros
        for(int i = 0; i < n1 + n2; i++){
            while(i < n1 + n2 && flag == true && arr[i] == 0){
                i++;
            }
            //after first zeros are traversed through
            flag = false;
            if(i < n1 + n2) sb.append(arr[i]);
        }
        //converting to string and adding sign
        String str = sb.toString();
        if(a < 0 && b>=0 || a>=0 && b <0){
            str = "-"+str;
        }
        if(str.length() == 0) return "0";
        return str;
    }
}
