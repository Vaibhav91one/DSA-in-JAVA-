package GFGPOTD;

import java.util.Arrays;

public class Aug21Surround1s {
    public static void main(String[] args){
        int[][] matrix = {{1, 0, 0},
                           {1, 1, 0},
                             {0, 1, 0}};
     System.out.println(Count(matrix));
    }

    public static int Count(int[][] matrix)
    {
        int ans = 0;
        // length of the 2D matrix = row
        int n = matrix.length;
        // length of the first array is equal to length of column
        int m = matrix[0].length;

//        These are the combinatins that can be formed by an element with its neigbors, total 8 combinations for a 2d array, left, right, above, below, diagonals
        int[] row = {-1,-1,0,1,1,1,0,-1};
        int[] column = {0,1,1,1,0,-1,-1,-1};

        for(int i = 0; i < n; i++){ //traversing rows
            for(int j = 0; j < m; j++){//traversing column
                if(matrix[i][j] == 1){ //checking if the current element is 1
                    int count = 0; //start the counting the neighbouring 0s
                    for(int k = 0; k < 8; k++){ //checking all the possible neighbours that is 8.
                        // pair forming of row and column
                        int nr = i + row[k];
                        int nc = j + column[k];

                        // validating if nr and nc are not outside the matrix and matrix element == 0
                        if(nr >= 0 && nr < n && nc >= 0 && nc < m && matrix[nr][nc] == 0){
                            count++;
                        }
                    }
//                    checking there is an were any 0s element and if count of 0s is even
                    if(count>0 && count % 2 == 0){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
