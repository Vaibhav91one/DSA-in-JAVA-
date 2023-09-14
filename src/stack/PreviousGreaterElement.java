package stack;

import java.util.Arrays;
import java.util.Stack;

public class PreviousGreaterElement {
    public static void main(String[] args){
         int[] arr = {10, 4, 2, 20, 40, 12, 30};
         System.out.println(Arrays.toString(PrevGreater(arr, arr.length)));
    }

    public static int[] PrevGreater(int elem[], int n)
    {
        int[] arr = new int[n];
        Stack<Integer> s = new Stack<>();

        s.push(0);

        for(int i = 0; i < n; i++){
            while(!s.isEmpty() && elem[i] >= elem[s.peek()]){
                s.pop();
            }

            int prev = s.isEmpty()? -1 : s.peek();
            s.push(i);
            if(prev == -1){
                arr[i] = -1;
            }
            else{
                arr[i] = elem[prev];
            }
        }
        return arr;
    }
}
