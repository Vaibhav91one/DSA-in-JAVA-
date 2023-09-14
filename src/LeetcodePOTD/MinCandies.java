package LeetcodePOTD;
import java.util.Arrays;

public class MinCandies {
    public static void main(String[] args){
       int[] ratings = {1,2,87,87,87,2,1};
       candy(ratings);
    }

    public static int candy(int[] ratings) {
        int n = ratings.length;
        int[] res = new int[n];
        Arrays.fill(res,1);
        //Left to right scan and check whether ratings[i]>ratings[i-1] if yes then increment by res[i-1]+1
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                res[i] = res[i-1]+1;
            }
        }

//        System.out.println(Arrays.toString(res));
        // Right to left scan and check whether raings[i]>ratings[i+1] if yes then check whether res[i]<=res[i+1]
        //inc by res[i+1]+1
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                if(res[i]<=res[i+1]){
                    res[i] = res[i+1]+1;
                }
            }
        }

//        System.out.println(Arrays.toString(res));
        int cnt=0;
        for(int i=0;i<n;i++){
            cnt+=res[i];
        }
        return cnt;
    }
}
