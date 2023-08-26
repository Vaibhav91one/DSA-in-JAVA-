package Hashing;

import java.util.HashSet;

public class Union {
    public static void main(String[] args){
        int n = 5;
        int m = 3;
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3};
    }

    public static int doUnion(int a[], int n, int b[], int m)
    {
        //checking for min element array
        int min = (n < m)? n: m;
        HashSet<Integer> s = new HashSet<Integer>();

        //adding elements to hashset until min
        for(int i = 0; i < min; i++){
            s.add(a[i]);
            s.add(b[i]);
        }

//        adding elements that are remaining from array
//        if n was greater than adding elements from m to n
        if(n > m){
            for(int i = m; i < n; i++){
                s.add(a[i]);
            }
        }
//        else adding elements from n to m if m was greater
        else if(n < m){
            for(int i = n; i < m; i++){
                s.add(b[i]);
            }
        }
    return s.size();
    }

}
