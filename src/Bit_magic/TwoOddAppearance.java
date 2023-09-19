package Bit_magic;
import java.util.Arrays;
public class TwoOddAppearance {
    public static void main(String[] args){
        int N = 6;
        int[] Arr =  {1, 2, 3, 2, 1, 4};
        System.out.println(Arrays.toString(TwoOdd(Arr, N)));
    }

    public static int[] TwoOdd(int[] arr, int n){
        int XOR = 0;
        int[] res = new int[2];
        for(int i = 0; i < n; i++){
            XOR = XOR ^ arr[i];
        }
        int Sn = XOR & -XOR;
        for(int i = 0; i < n; i++){
            if((arr[i] & Sn) != 0){
                res[0] = res[0] ^ arr[i];
            }
            else{
                res[1] = res[1] ^ arr[i];
            }
        }
//        Arrays.sort(res);
//        reverse(res);
        return res;
    }
    public static void reverse(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }
}

/*
Idea:
First we XOR all the elements and the XOR will the result of the two odd appearing element using the property 2 ^ 2 = 0 same element results 0
Then we store Sn = XOR & ~(XOR - 1), which results in one of the odd appearing element
Now we perform XOR operation on all the element where Sn bit is set that is arr[i] & Sn != 0, => Results in one of the odd appearing number
Now we perform XOR operation on all the element where Sn bit is not set that is arr[i] & Sn != 0, => Results in other odd appearing number

A more optimized way of doing  this is using HashMap
 */
