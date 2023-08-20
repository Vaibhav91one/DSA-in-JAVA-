package Recursion;

public class MaximiseCutSegment {
    public static void main(String[] args){
        int N = 4;
        int x = 2;
        int y = 1;
        int z = 1;
        System.out.println(maximizeCuts(N,x,y,z));
    }

    public static int maximizeCuts(int n, int x, int y, int z)
    {
        //in case we have gotten to the last cut which cuts such that there are no more pieces left
        if(n == 0) return 0;
        //in case when there is a cut made which cuts more than the given passed rope length.
        if(n < 0) return -1;

        // in res we will get the maximum cuts that were made
        // Working for this is that for every cut we make, we recursively make a cut again with other lengths given to us.
        // such that when we cut first with x length, we recursively call again and cut x length again and it returns if it satisfies any of the above base cases.
        // now it wil cut for y recursively and return if it satisfies any of the base cases and same goes for z
        // now res (recursive call one) will contain the max for maximizeCuts(n-x,x,y,z)
        // similarly for res Math.max(maximizeCuts(n-y,x,y,z) and maximizeCuts(n-z,x,y,z)
        // after these call end the res will have the maximum cuts
        int res = Math.max(
                maximizeCuts(n-x,x,y,z), Math.max(maximizeCuts(n-y,x,y,z), maximizeCuts(n-z,x,y,z))
        );

//        When ever we make a cut and the cut it done such that n becomes 0, it will return 0 and the parent caller res will be increment by 1 this means the cut was successfully done.
        if(res == -1) return -1;

        return (res+1);
    }
}

//Not the best apporach requires DP.