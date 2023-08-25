package Matrix;

import java.util.Arrays;

public class RotateBy90 {
    public static void main(String[] args){
        int N = 3;
        int matrix[][] = {{1, 2 ,3},
                            {4 ,5 ,6},
                             {7 ,8, 9}};
        rotate(matrix);
    }
    static void rotate(int matrix[][])
    {
        //Transposing
      for(int i = 0; i < matrix.length; i++){
          for(int j = i + 1; j < matrix.length; j++){
              swap(matrix,i,j);
          }
      }
      // swapping rows as transposing make first row into first column but in rotate by 90 we make last columns as first rows
        // traversing through columns
      for(int i = 0; i < matrix.length; i++){
//          first row
          int low = 0;
//last row
        int high = matrix.length - 1;
         while(low<high){
            int temp = matrix[low][i];
             matrix[low][i] = matrix[high][i];
            matrix[high][i] = temp;
            low++;
            high--;
         }
      }

      // if we have to do a clockwise rotation we have to just swap columns instead of rows 
    }

    static public void swap(int[][] arr, int n1, int n2) {
        int temp = arr[n2][n1];
        arr[n2][n1] = arr[n1][n2];
        arr[n1][n2] = temp;
    }
}
