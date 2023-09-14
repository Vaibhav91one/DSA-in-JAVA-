package stack;
import  java.util.Stack;

public class LargestRectangle {
    public static void main(String[] args){
        int N = 7;
        int arr[] = {6,2,5,4,5,1,6};
        System.out.println(getMaxArea(arr));
    }

    public static int getMaxArea(int heights[])
    {
        int n = heights.length;
        Stack<Integer> s = new Stack<>();
        int res = 0;

        for(int i = 0; i < n; i++){

            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                int tp = s.pop();
                int curr = heights[tp] * (s.isEmpty()? i : (i - s.peek() - 1));
                res = Math.max(res, curr);
            }

            s.push(i);
        }
        while(!s.empty()){
            int tp = s.pop();
            int curr = heights[tp] * (s.isEmpty()? n : (n - s.peek() - 1));
            res = Math.max(res, curr);
        }
        return res;
    }

}