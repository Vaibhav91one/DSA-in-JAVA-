package Arrays;
import java.util.ArrayList;
public class WindowSliding1 {
    public static void main(String[] args){
        int N = 4;
        int K = 2;
        ArrayList<Integer> Arr = new ArrayList<Integer>();
        Arr.add(100);
        Arr.add(200);
        Arr.add(300);
        Arr.add(400);
        System.out.println(maximumSumSubarray(K,Arr,N));
    }

    public static long maximumSumSubarray(int k, ArrayList<Integer> Arr, int N){
        long curr_sum = 0;

        for(int i = 0; i < k; i++){
              curr_sum += Arr.get(i);
        }
        long max_sum = curr_sum;
        for(int i = k; i < N; i++){
            curr_sum += (Arr.get(i) - Arr.get(i - k));
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }
}

/*
A simple explanation for this technique is that we are using a window k and slide it such that we add the next element and remove the i - k element.
 */
