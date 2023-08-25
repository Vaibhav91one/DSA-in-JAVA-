package Matrix;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class SnakePattern {
    public static void main(String[] args){
        int N = 3;
        int matrix[][] = {{45, 48, 54},
            {21, 89, 87},
            {70, 78, 15}};
        System.out.println(snakePattern(matrix));
    }

    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int i = 0; i < matrix.length; i++){
            if(i % 2 == 0){
                for(int j = 0; j < matrix.length; j++){
                    al.add(matrix[i][j]);
                }
            }
            else {
                for(int j = matrix.length - 1; j >= 0; j--){
                    al.add(matrix[i][j]);
                }
            }
        }

        return al;
    }
}
