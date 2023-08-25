package Matrix;

import java.util.Arrays;

public class Tranpose {
    public static void main(String[] args){
        int N = 4;
        int mat[][] = {{1, 1, 1, 1},
                       {2, 2, 2, 2},
                       {3, 3, 3, 3},
                       {4, 4, 4, 4}};
        transpose(N,mat);
        for(int i = 0; i < N; i++){
            System.out.println(Arrays.toString(mat[i]));
        }
    }

    public static void transpose(int n,int matrix[][])
    {
        //keeping diagonal elements as diagonal element remain same in transposed matrix also (diagonal from L TO R)
       for(int i = 0; i < matrix.length; i++){
           for(int j = i+1; j < matrix.length; j++){
               swap(matrix,i,j);
           }
       }
    }

    static public void swap(int[][] arr, int n1, int n2) {
        int temp = arr[n2][n1];
        arr[n2][n1] = arr[n1][n2];
        arr[n1][n2] = temp;
    }
}
