package Heap;

import java.util.PriorityQueue;

public class PurchasingMaxItems {
    public static void main(String[] args){
        int N = 7;
        int K = 50;
        int arr[] = {1, 12, 5, 111, 200, 1000, 10};

        System.out.println(toyCount(N, K, arr));
    }
    static int toyCount(int N, int K, int arr[])
    {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            p.add(arr[i]);
        }

        for(int i = 0; i < arr.length; i++){
            if(K > p.peek()){
                K -= p.peek();
                p.remove(p.peek());
                count++;
            }
        }

        return count;
    }


}
