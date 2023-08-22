package JobAthon;
import java.util.Arrays;
public class Problem1 {
    public static void main(String[] args){
        int n = 10;
        int[] arr = {1,2 ,2 ,10, 7, 6, 10, 8, 1, 4};
        System.out.println(maxValue(n,arr));
    }

    public static long maxValue(int n, int[] arr) {
        long ans = 0;
        int[] a = new int[n];
        int mx = 0;
        for (int i = 0; i < n; i++) {
            a[i] = mx - arr[i];
            mx = Math.max(mx, arr[i]);
        }
        mx = 0;
        for (int i = 0; i < n; i++) {
            long val = mx;
            val *= (long) arr[i];
            ans = Math.max(ans, val);
            mx = Math.max(mx, a[i]);
        }
        return ans;
    }
}
