package Misc;

public class Nearest10 {
    public static void main(String[] args){
        int purchaseAmount = 15;
        System.out.print(accountBalanceAfterPurchase(purchaseAmount));
    }
    public static int accountBalanceAfterPurchase(int purchaseAmount) {
        int roundedAmount = round(purchaseAmount);
        System.out.println(roundedAmount);
        return (100 - roundedAmount);
    }

    public static int round(int n){
        int a = (n / 10) * 10;
        int b = a + 10;
        System.out.println(a + " " + b);
        if(n - a == b - n){
            return Math.max(a,b);
        }
        return (n - a > b - n)? b : a;
    }

}
