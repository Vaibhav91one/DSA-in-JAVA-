package Arrays;

public class CountSmallerThanX {
    public static  void main(String[] args){
        long N = 7;
        long[] A = {1, 2, 2, 2, 5, 7, 9};
        long X = 2;

        System.out.println(countOfElements(A, N, X));
    }
    public static long countOfElements(long[] arr, long n, long x) {
        long count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > x) {
                continue;
            }
            if (arr[i] <= x) {
                count++;
            }
        }
        return count;
    }
}
