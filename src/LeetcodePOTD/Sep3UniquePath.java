package LeetcodePOTD;

import java.util.Arrays;

public class Sep3UniquePath {
    public static void main(String[] args){

    }
    public int uniquePaths(int m, int n) {
       int[] aboveRow = new int[n];
        Arrays.fill(aboveRow, 1);

        for(int row = 1;  row < n; row++){
            int[] currentrow = new int[n];
            Arrays.fill(currentrow, 1);

            for(int col = 1; col < n; col++){
                currentrow[col] = currentrow[col-1] + aboveRow[col];
            }
            aboveRow = currentrow;
        }
     return aboveRow[n - 1];
    }
}
