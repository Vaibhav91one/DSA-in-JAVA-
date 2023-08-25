package Matrix;

public class SearchInMatrix {
    public static void main(String[] args){
        int n = 3;
        int m = 3;
        int x = 62;
        int matrix[][] = {{ 3, 30, 38},
            {36, 43, 60},
            {40, 51, 69}};
        System.out.println(search(matrix,n,m,x));
    }

    static boolean search(int matrix[][], int n, int m, int target)
    {
        //top right corner
        int i = 0;
        int j = m -1;
        while(i < n && j>=0){
            if(matrix[i][j] == target){
                return true;
            }
            //looking left as smaller elements are left to top left corner.
            else if(
                    target < matrix[i][j]){
                j--;
            }
            //looking downwards as greater elements are downwards to top left corner.
            else{
                i++;
            }
        }
        return false;
    }
}
