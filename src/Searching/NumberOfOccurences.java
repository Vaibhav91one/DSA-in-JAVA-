package Searching;

public class NumberOfOccurences {
    public static void main(String[] args){
        int N = 7;
        int X = 2;
        long Arr[] = {1, 1, 2, 2, 2, 2, 3};
        long count = CountOcc(Arr,N,X);
        System.out.println(count);
    }

    public static long CountOcc(long[] arr, int n , int x){
        Index_of_FirstLastOccurence in = new Index_of_FirstLastOccurence();

        long first = in.FirstIndex(arr, n, x);

        if(first == -1){
            return 0;
        }

        return (in.LastIndex(arr,n,x) - first + 1);
    }
}

//Here we utilize the function we have declared in the last class,
//
//        first we find the first occurence
//if first == -1 we return 0 as there is no element x
//else we return Lastoccurence - first + 1;
//
//+1 is added to make it 1 indexed.
