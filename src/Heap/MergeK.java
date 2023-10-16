package Heap;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeK {
    public static void main(String[] args){

    }


    class Triplet implements Comparable <Triplet>{
        int val, aPos, vPos;

        Triplet(int v, int ap, int vp){
            val = v;
            aPos = ap;
            vPos = vp;
        }

        public int compareTo(Triplet t){
            if( val <= t.val) return -1;
            else return 1;
        }
    }

    public ArrayList<Integer> mergeKArrays(int[][] arr, int K)
    {
        ArrayList<Integer> al = new ArrayList<>();
        PriorityQueue<Triplet> p = new PriorityQueue<>();

        for(int i = 0; i < K; i++){
            p.add(new Triplet(arr[i][0], i, 0));
        }

        while(!p.isEmpty()){
            Triplet curr = p.poll();

            al.add(curr.val);

            int ap = curr.aPos;
            int vp = curr.vPos;

            if(vp+1 < arr[ap].length){
                p.add(new Triplet(arr[ap][vp+1], ap, vp+1));
            }
        }

        return al;
    }
}
