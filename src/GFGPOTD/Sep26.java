package GFGPOTD;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Sep26 {
    public static void main(String[] args){
        int N = 7, K = 23;
        int A[] = {10,2,3,4,5,7,8};

    }

    public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        HashSet<ArrayList<Integer>> hs = new HashSet<>();

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int s = j + 1;
                int e = n - 1;

                while(s < e){
                    int sum = arr[i] + arr[j] + arr[s] + arr[e];

                    if(sum == k){
                        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[s], arr[e]));
                        if(!hs.contains(al1)){
                            al.add(al1);
                            hs.add(al1);
                        }
                        s++;
                        e--;
                    }
                    else if(sum < k) s++;
                    else e--;
                }
            }
        }
    return al;
    }
}
