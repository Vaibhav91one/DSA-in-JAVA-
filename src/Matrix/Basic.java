package Matrix;

import java.util.Arrays;

public class Basic {
    public static void main(String[] args){
        int n = 2; //rows
        int m = 3; //columns

//        normal Matrix
        int[][] arr = new int[n][m];
        int count = 0;

        for(int i = 0; i < n; i++){
            //rows
            for(int j = 0; j < m; j++){
                //columns
                arr[i][j] = count;
                count++;
            }
        }

//        Jagged Matrix
        int[][] arr2 = new int[n][];
        for(int i = 0; i < n; i++){
            arr2[i] = new int[i+2];
            for(int j = 0; j < arr[i].length - 1; j++){
                //columns
                arr2[i][j] = count;
                count++;
            }
        }


        for(int i = 0; i < n; i++){
            //rows
            System.out.println(Arrays.toString(arr[i]));
        }

        for(int i = 0; i < n; i++){
            //rows
            System.out.println(Arrays.toString(arr2[i]));
        }




    }
}
