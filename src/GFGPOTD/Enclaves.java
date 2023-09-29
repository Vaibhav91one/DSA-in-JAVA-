package GFGPOTD;

public class Enclaves {
    public static void main (String[] args){

    }

    static int row[] = {-1, 0, 1, 0};
    static int column[] = {0, 1, 0, -1};
    int numberOfEnclaves(int[][] grid) {

        //row
        int n = grid.length;
        //columns
        int m = grid[0].length;
        //counting no of zeros which are unreachable
        int count = 0;

        //checking for boundary elements and if we find a boundary element which is one we try to travel through it and make
        //the node being traversed zero
        // This helps us in leaving out all the one that cannot reach the boundary
        for(int i = 0; i  < n; i++){
            for (int j = 0; j  < m; j++){
                if((i == 0 || j == 0 || i == n - 1 || j == m -1) && grid[i][j] == 1){
                      makeZero(i,j,n,m,grid);
                }
            }
        }

        //counting unreachable elements
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    count++;
                }
            }
        }

        return count;
    }

    // making elements zero as we traverse through it
    // also traversing in up, down, left, right direction if element is one, calling make zero for that element
    public static void makeZero(int i, int j, int n , int m, int[][] grid){
          grid[i][j] = 0;

          for(int k = 0; k < 4; k++){
              int r = i + row[k];
              int c = j + column[k];

              if(r>=0 && c >=0 && r < n && c < m && grid[r][c] == 1){
                  makeZero(r,c,n,m,grid);
              }
          }
    }
}
