package Bit_magic;

public class PowerTwo {
    public static void main(String[] args){
        int n = -2147483648;
        System.out.println(Power(n));
    }

    public static boolean Power(int n){
        if (n <= 0){
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
