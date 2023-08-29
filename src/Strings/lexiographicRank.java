package Strings;

public class lexiographicRank {
    static int MAX_CHAR = 256;
    public static void main(String[] args){
        String S = "ozebxparwklnmdqc";
        System.out.println(findRank(S));
        System.out.println(factorial(0));
    }

    public static long findRank(String S)
    {
      //Since we will get the rank of string shorter than S we need to add 1 inorder to get rank of S
      long res = 1;
      long n = S.length();
      long mul = factorial(n);
      long[] count = new long[256];

      //Adding frequency of each character in S
      for(int i = 0; i < n; i++){
          count[S.charAt(i)]++;
      }

      //cumulative frequency -> how many characters/elements are behind ith character.
      for(int i = 1; i < 256; i++){
          count[i] += count[i-1];
      }

      // n-1 because for last element there will be nothing on the right side.
      for(int i =0; i < n-1; i++){
          mul = mul/(n-i); //getting the factorial of no spaces left after i element
          // adding the no of character less than the current character and multiplying with mul for no of combination that can be made.
          res = res + count[S.charAt(i)-1] * mul;

//          we do this because now we move to the next ith position and we have fixed previous ith element
          for(int j = S.charAt(i) ; j < 256; j++){
             count[j]--;
          }
      }
      return res;
    }

    public static long factorial(long n){
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
}
