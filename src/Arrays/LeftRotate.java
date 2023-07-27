package Arrays;

public class LeftRotate {
    public static void main(String[] args){
        int[] arr = {50,24,3,45};
        int n = arr.length;
        for (int j : arr) System.out.print(j + " ");
        System.out.println("\n");
        arr = LeftRotate(arr, n);
        for (int j : arr) System.out.print(j + " ");
    }

    public static int[] LeftRotate(int[] arr, int n){
        int a = arr[0];
        for(int i = 1; i < n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = a;
        return arr;
    }
}

/*
Idea:
left rotate means that shifting all the elements to the left and the first element to the last
The idea here is to store the first element and shifting all element such that arr[i -1] = arr[i]
and after all the shifting changing the last element to the first element which was stored.
 */