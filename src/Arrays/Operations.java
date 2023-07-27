package Arrays;

import java.util.*;
import java.util.Collections;

public class Operations {
    public static void main(String[] args) {
        int[] arr
                = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int x = 6;
         System.out.println(SEARCH(arr, x));
         arr = Insert(arr, n, x, 2);
        System.out.println((Delete(arr, n, 2)));
        for (int j : arr) System.out.print(j + " ");
    }


    public static boolean SEARCH(int[] arr, int x) {
        for (int j : arr) {
            if (j == x) {
                return true;
            }
        }
        return false;
    }

    public static int[] Insert(int[] arr, int n, int x, int pos) {
        int i;
        int[] newarr = new int[n + 1];
        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;

    }

    public static int Delete(int[] arr, int n, int pos) {
        if (arr[n - 1] == arr[pos - 1]) {
            return (n - 1);
        }
        int prev = arr[n - 1], i;
        for (i = n - 2; i >= 0 && arr[i] != arr[pos - 1]; i--) {
            int curr = arr[i];
            arr[i] = prev;
            prev = curr;
        }

        if (i < 0) {
            return 0;
        }

        arr[i] = prev;

        return (n - 1);
    }

}
