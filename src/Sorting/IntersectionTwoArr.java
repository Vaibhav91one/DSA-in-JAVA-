package Sorting;
import java.util.Arrays;
import java.util.ArrayList;

public class IntersectionTwoArr {
    public static void main(String[] args){

    }

    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
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
            if(a[i] == b[j]){
                list.add(a[i]);
                i++;
                j++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else if(a[i] > b[j]){
                j++;
            }
        }

        int res = 0;
        for (int k = 0; k < list.size(); k++)
            res++;
        return res;
    }
}
