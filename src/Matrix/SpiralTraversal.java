package Matrix;
import java.util.ArrayList;
import java.util.List;
public class SpiralTraversal {
    public static void main(String[] args){
        int n = 3;
        int m = 3;
        int k = 4;
        int A[][] = {{1, 2, 3,4},
            {5 ,6,7,8},
            {9,10,11,12}};
//        System.out.println(findK(A,n,m,k));
        System.out.println(spiralOrder(A));
    }

    static int findK(int A[][], int n, int m, int k)
    {
        //initializing end points of the matrix
        int top = 0; int left = 0;
        int bottom = n - 1; int right = m - 1;
//        count for keeping track of kth element
        int count = 0;

//        while in the boudnary of matrix
        while(top <= bottom && left <= right){
            //going through top layer, first row
            for(int i = left; i <=right; i++){
//                System.out.println(A[top][i]);
                if(count == k - 1){
                    return A[top][i];
                }
                count++;
            }
            top++;

//            last column
            for(int i = top; i <=bottom; i++){
//                System.out.println(A[i][right]);
                if(count == k - 1){
                    return A[i][right];
                }
                count++;
            }
            right--;

            //checking again because top will be used again and while loop will check after the end of this iteration.
            if(top <= bottom){
//                last row
                for(int i = right; i >=left; i--){
//                    System.out.println(A[bottom][i]);
                    if(count == k - 1){
                        return A[bottom][i];
                    }
                    count++;
                }
                bottom--;
            }

            if(left <= right){
                for(int i = bottom; i >= top; i--){
//                    System.out.println(A[i][left]);
                    if(count == k - 1){
                        return A[i][left];
                    }
                    count++;
                }
                left++;
            }
        }
        return -1;
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new ArrayList<Integer>();
        //initializing end points of the matrix
        int n = matrix.length;
        int m = matrix.length;
        int top = 0; int left = 0;
        int bottom = n - 1; int right = m - 1;
//        count for keeping track of kth element

//        while in the boudnary of matrix
        while(top <= bottom && left <= right){
            //going through top layer, first row
            for(int i = left; i <=right; i++){
//                System.out.println(A[top][i]);
                l.add(matrix[top][i]);
            }
            top++;

//            last column
            for(int i = top; i <=bottom; i++){
//                System.out.println(A[i][right]);
                l.add(matrix[i][right]);
            }
            right--;

            //checking again because top will be used again and while loop will check after the end of this iteration.
            if(top <= bottom){
//                last row
                for(int i = right; i >=left; i--){
//                    System.out.println(A[bottom][i]);
                    l.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                for(int i = bottom; i >= top; i--){
//                    System.out.println(A[i][left]);
                    l.add(matrix[i][left]);
                }
                left++;
            }
        }
        return l;
    }
}
