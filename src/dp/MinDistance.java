package dp;

public class MinDistance {
    public int minDistance(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        // dp[i][j] 用来存储s1[0...i-1] 变成s2[0..j-1]的最小距离
        // 因为索引不能为-1，为非法，所以为0
        int dp[][] = new int[m + 1][n + 1];
        // base case
        for (int i = 1; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 1; j <= n; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = min(
                            dp[i - 1][j - 1] + 1,
                            dp[i - 1][j] + 1,
                            dp[i][j - 1] + 1
                    );

                }

            }

        }

        return dp[m][n];
    }


    public int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
