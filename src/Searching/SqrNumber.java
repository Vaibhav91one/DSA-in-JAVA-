package Searching;

public class SqrNumber {
    public static void main(String[] args){
        int x = 5;
        System.out.print(Sqr(x));
    }

    public static int Sqr(int x){
        int low = 0;
        int high = x;
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            int midsq = mid * mid;
            if(midsq == x) return mid;

            if(midsq > x){
                high = mid - 1;
            }

            else{
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}
