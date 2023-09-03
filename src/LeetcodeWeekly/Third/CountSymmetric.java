package LeetcodeWeekly.Third;

public class CountSymmetric {
    public static void main(String[] args){
        int low = 11;
        int high = 12;
        System.out.println(countSymmetricIntegers(low,high));
    }

    public static int countSymmetricIntegers(int low, int high) {
         int count = 0;
         for(int i = low; i <= high; i++){
             if(isSymmetric(i)){
                 count++;
             }
         }
         return count;
    }

    static int reverse(int n)
    {
        int rev = 0;
        while (n != 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return rev;
    }
    public static boolean isSymmetric(int n) {
        int length = (int) (Math. log10(n) + 1);
        if(length % 2 == 1){
            return false;
        }
        int firstDigitsSum = 0;
        int LastDigitssum = 0;
        int temp = n;
        int temp2 = reverse(n);
       for(int i = 0; i < length/2; i++){
         firstDigitsSum += temp%10;
         temp = temp/10;
         LastDigitssum += temp2%10;
         temp2 = temp2/10;
        }
        return firstDigitsSum == LastDigitssum;
    }
}
