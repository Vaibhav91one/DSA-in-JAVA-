package GFGPOTD;
import java.util.ArrayList;
public class Oct1 {
    public static void main(String[] args){
        int n = 4, m = 4;
        int matrix[][] = {{1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15,16}};

        boundaryTraversal(matrix,n,m);
    }

    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        //if single row, only putting elements once
        if(n == 1){
            for(int i = 0; i < m; i++){
                al.add(matrix[0][i]);
            }
        }
        //if single column, only putting elements once
        if(m == 1){
            for(int i = 0; i < n; i++){
                al.add(matrix[n][0]);
            }
        }

        else{
//            upper boundary
            for(int i = 0; i < m; i++){
                al.add(matrix[0][i]);
            }
            // Right boundary
            for(int i = 1; i < n; i++){
                al.add(matrix[i][m-1]);
            }
//          lower boundary
            for(int i = m - 2; i >=0; i--){
                al.add(matrix[n-1][i]);
            }
            // left boundary
            for(int i = n - 2; i >=1; i--){
                al.add(matrix[i][0]);
            }
        }
        return al;
    }
}
