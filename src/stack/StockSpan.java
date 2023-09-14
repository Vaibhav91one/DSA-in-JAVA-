package stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args){
        int N = 7;
        int price[] = {100 ,80 ,60 ,70 ,60 ,75 ,85};
        System.out.println(Arrays.toString(calculateSpan(price, N)));
    }

    public static int[] calculateSpan(int price[], int n)
    {
        int[] arr = new int[n];
        Stack<Integer> s = new Stack<>();

        s.push(0);

        for(int i = 0; i < n; i++){
            while(!s.isEmpty() && price[i] >= price[s.peek()]){
                s.pop();
            }

            int span = s.isEmpty()? (i+1): (i - s.peek());
            s.push(i);
            arr[i] = span;
        }
        return arr;
    }

}
