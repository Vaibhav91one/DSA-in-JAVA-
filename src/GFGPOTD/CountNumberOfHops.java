package GFGPOTD;

public class CountNumberOfHops {
    public static void main(String[] args){
        int N = 4;
        System.out.println(countWays(N));
    }

    static long countWays(int n)
    {
        if(n == 0){
            return 0;
        }

        long res = countWays(n-1) + countWays(n-2) + countWays(n-3);

        return res + 1;
    }

}
