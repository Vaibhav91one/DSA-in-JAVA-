package Recursion;

public class fact {
    public static void main(String[] args){
        int x = 2;
        System.out.println(calc(x));
    }

    public static int calc(int x){
        if(x == 0)
            return 1;

        else
            return x * calc(x-1);
    }

}
