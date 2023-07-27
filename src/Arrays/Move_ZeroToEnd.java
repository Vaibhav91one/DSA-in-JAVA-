package Arrays;

public class Move_ZeroToEnd {
    public static void main(String[] args){
        int[] arr = {1,0,24,0,3,0,45,0};
        int n = arr.length;
        for (int j : arr) System.out.print(j + " ");
        System.out.println("\n");
        arr = MoveZerosToEnd(arr,n);
        for (int j : arr) System.out.print(j + " ");
    }

    public static int[] MoveZerosToEnd(int[] arr, int n){
      int count = 0;
      for(int i =0; i<n; i++){
          if(arr[i] != 0){
              int temp;
              temp = arr[i];
              arr[i] = arr[count];
              arr[count] = temp;
              count++;
          }
      }
      return arr;
    }
}

/*
Idea:
The idea here is to keep track of non-zero elements.
First we initialize a count for non-zero elements and whenever there is a non-zero element we perform a swap such that a[i] and arr[count]
(what is happening is that we are shifting the non-zero element to the start with the help of count)
then we are incrementing the count.
*/