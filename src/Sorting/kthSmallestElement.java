package Sorting;

public class kthSmallestElement {
    public static void main(String[] args) {
        int N = 6;
        int[] arr = {3,2,1,5,6,4};
        int K = 2;
//        System.out.println(findKthElementByQuickSelect(arr, 0, N - 1, K));
        System.out.println(kthLargest(arr, 0, N - 1, K));
    }

    static public int
    findKthElementByQuickSelect(int[] arr, int l, int r, int k) {
        //checking if k lies in the given array
        if (k >= 0 && k <= r - l + 1) {
//            calculating partition using lomeuto partition alogrithm or Quickselect
            int pos = partition(arr, l, r);
            // given partition results in the index which is equal to k - 1(0 based indexing)
            //As elements on r will be greater and on l will be smaller than pos
            //pos - l is done in order to check for the correct index in a l or r sub-array
            if (pos - r == k - 1) {
                return arr[pos];
            }
            //checking l sub-array
            if (pos - r > k - 1) {
                return findKthElementByQuickSelect(arr, l, pos - 1, k);
            }
            //checking r sub-array
            //adjusting k according to the sub-array
            return findKthElementByQuickSelect(arr, pos + 1,
                    r, k - pos + l - 1);
        }
        return 0;
    }

    static public int
    kthLargest(int[] arr, int l, int r, int k) {
        int pivot = l;
        int i = l - 1;
        int j = r + 1;

        while(l <= r){
            do{i++;}while (arr[i] < pivot && i <= r);
            do{j--;}while (arr[j] > pivot && j >= l);
            if(i >= j) return j;
            swap(arr,i, j);
        }
        swap(arr,i, pivot);
        int rank = arr.length - l;
        if (rank == k) return arr[l];
        if (rank > k) return findKthElementByQuickSelect(arr, i + 1, j, k);
        return findKthElementByQuickSelect(arr, i, i - 1, k);
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static int partitionHoares(int arr[], int low, int high){
        int pivot = low;
        int i = low - 1;
        int j = high + 1;

        while(low <= high){
            do{i++;}while (arr[i] < pivot && i <= high);
            do{j--;}while (arr[j] > pivot && j >= low);
            if(i >= j) return j;
            swap(arr,i, j);
        }
        swap(arr,i, pivot);
        return i;
    }

    static public void swap(int[] arr, int n1, int n2) {
        int temp = arr[n2];
        arr[n2] = arr[n1];
        arr[n1] = temp;
    }
}


