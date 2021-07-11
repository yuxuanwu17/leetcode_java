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

}
