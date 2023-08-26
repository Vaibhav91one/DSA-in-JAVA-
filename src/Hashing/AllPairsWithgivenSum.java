package Hashing;

import Sorting.OverlappingIntervals;

import java.util.*;

public class AllPairsWithgivenSum {
    public static void main(String[] args){
        long A[] = {1, 2, 4, 5, 7};
        long B[] = {5, 6, 3, 4, 8};
        int X = 9;
        allPairs(A,B,A.length,B.length,X);
    }
    public static  pair[] allPairs(long A[], long B[], long N, long M, long X) {

        //Hashset since elements are distinct
        HashSet<Long> s = new HashSet<>();
        //Arraylist of type pair for easy insertion
        ArrayList<pair> pairs=new ArrayList<pair>();
        //adding elements for B in hashset
        for(int i = 0; i < M; i++){
                s.add(B[i]);
        }

        //sorting A as question require pairs to be in increasing order of A
        Arrays.sort(A);

        //if s contains elements x - A element
        for(int j = 0; j < N; j++){
            if(s.contains(X-A[j])){
//                adding to arraylist
                pairs.add(new pair(A[j], X-A[j]));
            }
        }

//        since return type is pair, we make an array pair and add elements from arraylist
        pair[] ans = new pair[pairs.size()];
        for(int i = 0; i < pairs.size(); i++){
            ans[i] = pairs.get(i);
        }
        return ans;
    }

    static class pair {
        long first, second;
        public pair(long first, long second)
        {
            this.first = first;
            this.second = second;
        }
    }
}
