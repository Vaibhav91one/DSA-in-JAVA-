package Arrays.PrefixSum;

public class TrappingRainWater {
    public static void main(String[] args){
        int N = 6;
        int[] arr = {3,0,0,2,0,4};
        System.out.println(trappingWater(arr));
    }

    public static long trappingWater(int[] height){
        int n = height.length;
        int res = 0;
        int[] LMax = new int[n];
        int[] RMax = new int[n];

        LMax[0] = height[0];
        for(int i = 1; i < n; i++){
            LMax[i] = Math.max(height[i], LMax[i-1]);
        }

        RMax[n-1] = height[n-1];
        for(int i = n - 2; i >= 0; i--){
            RMax[i] = Math.max(height[i], RMax[i+1]);
        }

        for(int i = 1; i < n - 1; i++){
            res = res + (Math.min(LMax[i], RMax[i]) - height[i]);
        }
        return res;
    }
}

/*
Idea for this is shared at my leetcode profile: https://leetcode.com/Lethal_Bypass/
 */