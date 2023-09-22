package JobAthon;
import java.util.Arrays;
public class Problem2_2 {
    public static int goodSubstrings(String s) {
        int n = s.length();
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else if (s.charAt(i - 1) == s.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                if (dp[i][j] < Integer.parseInt(s.charAt(j - 1) + "")) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "122321";
        int count = goodSubstrings(s);
        System.out.println(count);
    }
}
