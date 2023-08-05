package Bit_magic;

public class PowerSetString {
    public static void main(String[] args){
        String str = "abc";
        PowerSet(str);
    }

    public static void PowerSet(String str){
        int n = str.length();
        double power = Math.pow(2, n);
        for(int counter = 0; counter < power; counter++){
             for(int j = 0; j < n; j++){
                 if((counter & 1<<j) != 0) System.out.print(str.toCharArray()[j]);
             }
            System.out.println();
        }
    }
}
