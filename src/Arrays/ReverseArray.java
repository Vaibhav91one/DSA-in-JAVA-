package Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {50,24,3,45};
        int n = arr.length;
        for (int j : arr) System.out.print(j + " ");
        System.out.println("\n");
        arr = Reverse(arr,n);
        for (int j : arr) System.out.print(j + " ");
    }

    public static int[] Reverse(int[] arr, int n ){
     int low = 0;
     int high = n - 1;
     while(low < high){
            int temp;
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
     return arr;
    }
}

/*
Idea:
The idea is simple we just run a while loop for half n such that we swap arr[low] and arr[high]
The loop runs until we reach either the center of the array (in case of odd number of elements) or until low and high crosses each other (in case of even no of elements)
and then we increment low and decrement high.
*/