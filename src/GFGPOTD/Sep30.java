package GFGPOTD;

public class Sep30 {
    public static void main(String[] args){

    }

    void booleanMatrix(int matrix[][])
    {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] row = new int[n];
        int[] column = new int[m];

        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if(matrix[i][j] == 1){
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if(row[i] == 1 || column[j] == 1){
                  matrix[i][j] = 1;
                }
            }
        }
    }
}
