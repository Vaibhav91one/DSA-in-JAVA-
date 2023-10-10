package BST;

import java.util.TreeMap;
import java.util.TreeSet;

public class CeilOntheLeftSide {
    public static void main(String[] args){
        int N = 7;
        long x = 5;
        long arr[] = {1,2,8,10,11,12,19};
        System.out.println(findFloor(arr,N,x));
    }

    static int findFloor(long arr[], int n, long x)
    {
        TreeMap<Long, Integer> tm = new TreeMap<>();

        for(int i = 0; i < n; i++){
            tm.put(arr[i], i);
        }

        Long res = tm.floorKey(x);

        if(res == null){
            return -1;
        }


        return tm.get(res);
    }
}
