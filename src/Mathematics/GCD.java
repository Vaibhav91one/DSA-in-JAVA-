package Mathematics;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = s.nextInt();
        System.out.print("Enter b:");
        int b = s.nextInt();
        int res = gcd(a,b);
        System.out.println(res);
    }

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b,a % b);
        }
    }
}
