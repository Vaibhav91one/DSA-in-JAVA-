package GFGPOTD;

public class luckyNumber {
    public static void main(String[] args){
      int n = 5;
    }

    public static boolean isLucky(int n)
    {
        for(int i = 2; i <= n; i++){
            if(n%i == 0) return false;
            n = n - n/i;
        }
        return true;
    }
}
