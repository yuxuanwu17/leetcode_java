package dp;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        /**
         * 输入：[7,1,5,3,6,4]
         * 输出：5
         *
         * ======
         *
         * 记录【今天之前买入的最小值】
         * 计算【今天之前最小值买入，今天卖出的获利】，也即【今天卖出的最大获利】
         * 比较【每天的最大获利】，取最大值即可
         *
         */

        int max = 0;
        int min = prices[0];

        for (int price : prices) {
            // 今天之前买入的最小值
            min = Math.min(min, price);
            // 今天的最大获利，price-min
            // 比较每天的最大获利
            max = Math.max(max, price-min);
        }

        return max;
    }

    /**
     * 和最大子序列和相似
     *
     * 1。 找到前一天能获得的最大利润(最小值是0)
     * 2。 今天的利润差
     * 3。 比较
     */

    public int maxProfit2(int[] prices) {
        int res = 0;
        int pre = 0;

        if (prices.length < 2) {
            return 0;
        }

        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            pre = Math.max(0, diff + pre);
            res = Math.max(pre, res);

        }

        return res;
    }

    /**
     *
     */
    public int maxProfit3(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];

        for (int i = 0; i < n; i++) {
            if (i - 1 == -1) {
                dp[i][0] = 0;
                dp[i][1] = -prices[i];
                continue;
            }
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], - prices[i]); // 选择买入，所以是-

        }

        return dp[n - 1][0];
    }

    public int maxProfit4(int[] prices) {

        int n = prices.length;

        int dp_i_0 = 0, dp_i_1 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            dp_i_0 = Math.max(dp_i_0, dp_i_1 + prices[i]);
            dp_i_1 = Math.max(dp_i_1, - prices[i]); // 选择买入，所以是-

        }

        return dp_i_0;
    }

    /**
     * you can only have 2 transaction in one day
     * @param prices
     * @return
     */
    public int maxProfit_k2(int[] prices) {

        //dp[i][k][0] = dp[i-1][k][0],dp[i-1][k][1]+price[i]
        //dp[i][k][1] = dp[i-1][k][1], dp[i-1][k-1][0]-price[0]
        // k = 2

        // dp[i][2][0] = dp[i-1][2][0],dp[i-1][2][1]+price[i]
        // dp[i][2][1] = dp[i-1][2][1],dp[i-1][1][0]-price[i]
        // dp[i][1][0] = dp[i-1][1][0],dp[i-1][1][1]+price[i]
        // dp[i][1][1] = dp[i-1][1][1], -price[i]

        int n = prices.length;

        int dp_i_10 = 0;
        int dp_i_11 = Integer.MIN_VALUE;
        int dp_i_20 = 0;
        int dp_i_21 = Integer.MIN_VALUE;

        for (int i = 0; i<n;i++){
            dp_i_10 = Math.max(dp_i_10,dp_i_11+prices[i]);
            dp_i_11 = Math.max(dp_i_11,-prices[i]);
            dp_i_20 = Math.max(dp_i_20,dp_i_21+prices[i]);
            dp_i_21 = Math.max(dp_i_21,dp_i_10-prices[i]);

        }

        return Math.max(dp_i_20,dp_i_10);
    }

    public int maxProfit_k(int[] prices) {
        int n =prices.length;
        int max_k = 2;
        int[][][] dp = new int[n][max_k + 1][2];
        for (int i = 0; i < n; i++) {
            for (int k = max_k; k >= 1; k--) {
                if (i - 1 == -1) {
                    dp[i][k][0]=0;
                    dp[i][k][1]=-prices[i];
                    continue;
                }
                dp[i][k][0] = Math.max(dp[i-1][k][0], dp[i-1][k][1] + prices[i]);
                dp[i][k][1] = Math.max(dp[i-1][k][1], dp[i-1][k-1][0] - prices[i]);
            }
        }
        // 穷举了 n × max_k × 2 个状态，正确。
        return dp[n - 1][max_k][0];
    }

}
