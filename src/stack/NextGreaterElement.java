package stack;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args){
        int N = 4;
        long[] arr = {1 ,3 ,2 ,4};
        System.out.println(Arrays.toString(nextLargerElement(arr,N)));
    }

    public static long[] nextLargerElement(long[] arr, int n)
    {
        long[] res = new long[n];
        Stack<Long> s = new Stack<>();

        s.push(arr[n-1]);

        for(int i = n - 1; i >= 0; i--){
            while(!s.isEmpty() && arr[i] >= s.peek()){
                s.pop();
            }

            long nextGreater = s.isEmpty()? -1: s.peek();
            s.push(arr[i]);
            res[i] = nextGreater;
        }

        Collections.reverse(Arrays.asList(res));

        return res;
    }
}
