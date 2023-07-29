package Mathematics;

import static java.lang.Math.floor;
import static java.lang.Math.log10;

public class Digits {
    public static void main(String[] args){
        int i = 1234;
//        DigitsCountIterative(i);
//        System.out.println(DigitsCountRecursive(i));
        System.out.println(DigitsCountLogarithmic(i));
    }

    public static void DigitsCountIterative(int n){
        int count = 0;
        while(n != 0){
            System.out.println(n%10);
            n = n/10;
            count++;
        }
        System.out.println(count);
    }

    public static int DigitsCountRecursive(int n){
        if(n == 0){
            return 0;
        }
        System.out.println(n%10);
        return 1 + DigitsCountRecursive(n/10);
    }

    public static double DigitsCountLogarithmic(int n){
        return floor(log10(n) + 1);
    }
}
