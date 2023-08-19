package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionTwoArr {
    public static void main(String[] args){
         int a[] = {1,2,3};
         int b[] = {4,5,3};
         int n = 3;
         int m  =3;
         doUnion(a,n,b,m);
    }

    public static int doUnion(int a[], int n, int b[], int m)
    {
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> list = new ArrayList<>();


        int i = 0;
        int j = 0;

        while(i < n && j < m){
            if( i > 0 && a[i] == a[i-1]){
                i++;
                continue;
            }

            if( j > 0 && b[j] == b[j-1]){
                j++;
                continue;
            }

            if(a[i] == b[j]){
                list.add(a[i]);
                i++;
                j++;
            }
            else if(a[i] < b[j]){
                list.add(a[i]);
                i++;
            }
            else if(a[i] > b[j]){
                list.add(b[i]);
                j++;
            }
        }

        while( i < n){
            if(a[i] != a[i - 1]){
                list.add(a[i]);
                i++;
            }
        }

        while( j < m){
            if(b[j] != b[j - 1]){
                list.add(b[j]);
                j++;
            }
        }

        System.out.println(list);

        int res = 0;
        for (int k = 0; k < list.size(); k++)
            res++;
        return res;
    }
}
