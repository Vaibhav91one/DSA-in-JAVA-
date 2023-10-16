package Heap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class SortKSorted {
    public static void main(String[] args){
        int n = 7, k = 3;
        int arr[] = {6,5,3,2,8,10,9};
        System.out.println(nearlySorted(arr, n, k));
    }

    static ArrayList <Integer> nearlySorted(int arr[], int num, int k)
    {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i <= k; i++){
            p.add(arr[i]);
        }

        int index = 0;

        for(int i = k+1; i < num; i++){
            al.add(p.poll());
            p.add(arr[i]);
        }

        while(!p.isEmpty()){
            al.add(p.poll());
        }

        return al;
    }

}
