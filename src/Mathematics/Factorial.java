package Mathematics;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(FactorialRecursive(i));
    }

    public static int FactorialRecursive(int n){
        if (n==0){
            return 1;
        }
        return n * FactorialRecursive(n-1);
    }
}
