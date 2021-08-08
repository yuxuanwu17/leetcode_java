package dp;

public class Knapsack {
    /**
     * @param w   背包的容量
     * @param n   物品的个数
     * @param wt  物品i的重量是wt[i]
     * @param val 物品的价值是val[i]
     * @return
     */
    public int knapsack(int w, int n, int[] wt, int[] val) {
        // dp[i][w] 在前 i 个物品的时候，当背包的容量为w的时候，
        // 可以装的最大价值是
        int[][] dp = new int[n + 1][w + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (j - wt[i-1] < 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(
                            dp[i - 1][j - wt[i - 1]] + val[i - 1],
                            dp[i - 1][j]
                    );
                }

            }

        }
        return dp[n][w];
    }

    public int knapsack2(int W, int N, int[] wt, int[] val) {
        int[][] dp = new int[N + 1][W + 1];

        for (int i = 1; i <= N; i++) {
            for (int w = 1; w <= W; w++) {
                if (w - wt[i-1] < 0) {
                    dp[i][w] = dp[i - 1][w];
                } else {
                    dp[i][w] = Math.max(
                            dp[i - 1][w],
                            dp[i - 1][w - wt[i-1]] + val[i - 1]
                    );
                }
            }
        }

        return dp[N][W] ;
    }


        public static void main(String[] args) {
        Knapsack knapsack = new Knapsack();
        int[] wt = {2, 1, 3};
        int[] val = {4, 2, 3};
        System.out.println(knapsack.knapsack2(4, 3, wt, val));
        System.out.println(knapsack.knapsack(4, 3, wt, val));
    }
}
