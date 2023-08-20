package GFGPOTD;

public class GfgPOTD_2008 {
    public static void main(String[] args){
        int N = 7;
        int X = 2;
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(count(arr,N,X));
    }

    public static int count(int[] arr, int n, int x) {
     int first = FirstIndex(arr,n,x);

     if(first == -1){
         return 0;
     }

     return (LastIndex(arr,n,x) - first + 1);
    }

    public static int FirstIndex(int[] arr, int n, int k){
        int low = 0;
        int high = n - 1;

        while (low <= high){
            int mid = (low + high)/2;

            if(k > arr[mid]){
                 low = mid + 1;
            }

            else if(k < arr[mid]){
                high = mid - 1;
            }

            else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int LastIndex(int[] arr, int n, int k){
        int low = 0;
        int high = n - 1;

        while (low <= high){
            int mid = (low + high)/2;

            if(k > arr[mid]){
                low = mid + 1;
            }

            else if(k < arr[mid]){
                high = mid - 1;
            }
            else{
                if(mid == n - 1 || arr[mid+1] != arr[mid]){
                    return mid;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

}
