package GFGPOTD;

public class August22BeautifulMatrix {
    public static void main(String[] args){
        int N = 2;
        int matrix[][] = {{1, 2},
            {3, 4}};
        System.out.println(findMinOperation(N,matrix));
    }


    public static int findMinOperation(int N, int[][] matrix) {
        int sum = 0;

        // Sum of matrix elements
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                sum = sum + matrix[i][j];
            }
        }

        //max row sum;
        int row_max = 0;
        //max column sum;
        int column_max = 0;

        for(int i = 0; i < N; i++){
            int a = 0;
            //Going through first row
            for(int j = 0; j < N; j++){
                a += matrix[i][j];
            }
            //max row sum;
            row_max = Math.max(row_max, a);

            int b = 0;
            //Going through first column
            for(int j = 0; j < N; j++){
                b += matrix[j][i];
            }
            //max column sum;
            column_max = Math.max(column_max, b);
        }

//        maximum of row and column max as we need to take the maximum element because we are only authorized increment operations, so we increment to the max value.
        int max_sum = Math.max(row_max, column_max);

        //Explained below:
        return max_sum*N - sum;
    }
}

/*
Approach:
We need to calculate the total sum of all the elements and also need to compute for the maximum row sum and column sum. To make the array beautiful, we need the sum of row and column to be same.
So, we take the maximum of row and column sum and make the sum of row or column same as maximum, once one of the row or column are equal we can shuffle the row in order to make it same. But this is just required to be visually done.

Originally what would happen we need to loop around and increment until same so we need not shuffle. Here we are just returning  min increment operations required.
The increment operations on elements.

We only have to provide the number of increments done in order to make the matrix beautiful.

Now, what we can say is that if we subtract such that max_sum * 3 - total sum will result in the total no of operations that were done in order to make row or column equal.

In this case we are assuming row_max is greater than column max;

Let's assume S1 to be sum of first row, S2 to be sum of second row, S3 to be sum of third row.

Now, if s1 is maximum sum, then

S1 * 3 - (S1 + S2 + S3) => S1 + S1 - S2 - S3 => (S1 - S2) + (S1 - S3), where S1 - S2 is the no of increment we need to do in order to make S2 equal to S1, same goes for S3
 */
