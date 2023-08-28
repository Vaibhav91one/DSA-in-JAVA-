package Hashing;
import java.util.ArrayList;
import java.util.HashMap;

public class CountDistinctInWindow {
    public static void main(String[] args){
        int N = 7;
        int K = 4;
        int A[] = {1,2,1,3,4,2,3};
        System.out.println(countDistinct(A,N,K));
    }

    static ArrayList<Integer>  countDistinct(int A[], int n, int k)
    {
        //Arraylist for storing sizes
        ArrayList<Integer> al = new ArrayList<Integer>();
        //Hashmap for storing the frequencies of elements
        HashMap<Integer, Integer> h = new HashMap<>();

        //Storing the frquency of the first k elements
        for(int i = 0; i < k; i++){
            h.put(A[i], h.getOrDefault(A[i],0) + 1);
        }
        //adding size of distinct elements in first k window
        al.add(h.size());


        for(int i = k; i < n; i++){
//        decresing the frequency of elements from the start
            //A[i-k] is the first element of the first window
            if(h.get(A[i-k]) == 1){
                h.remove(A[i-k]);
            }
            else{
                h.put(A[i - k], h.get(A[i-k]) - 1);

            }
//        A[i] is the last element of the window here and adding it if not present else increasing frequency
                h.put(A[i], h.getOrDefault(A[i],0) + 1);

            al.add(h.size());
        }
        return al;
    }
}
