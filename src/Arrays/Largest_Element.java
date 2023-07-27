package Arrays;

public class Largest_Element {
    public static void main(String[] args){
        int[] arr = {50,24,3,45};
        int n = arr.length;
        System.out.println(arr[LargestElement(arr,n)]);
    }

    public static int LargestElement(int[] arr, int n){
        int res = 0;
        for(int i = 1; i < n; i++){
            if(arr[i] > arr[res]){
                res = i;
            }
        }
        return res;
    }
}

/*
Idea:
The idea here is to keep a res variable to keep track of the latest max element.
Firstly, res references to the first element and whenever there is element greater than the arr[res] we change res to that element index.
Here, the index is i.So, res = i.
*/