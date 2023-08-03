package Bit_magic;

public class GetOddOccurence {
    public static void main(String[] args){
        int N = 7;
        int[] Arr = {1, 2, 3, 2, 3, 1, 3};
        System.out.println(getOddOccurrence(Arr,N));
    }
    public static int getOddOccurrence(int[] arr, int n) {
        int res = 0;
        for(int i =0; i < n; i++){
            res = res ^ arr[i];
        }
        return res;
    }
}
