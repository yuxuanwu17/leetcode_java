package dp;

import java.util.Arrays;

public class CoinChange {
    int[] memo;

    public int coinChange(int[] coins, int amount) {
        memo = new int[amount + 1];
        Arrays.fill(memo, -666);
        return helper(coins, amount);
    }

    public int helper(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        if (memo[amount] != -666) return memo[amount];

        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            int subProblems = helper(coins, (amount - coin));
            if (subProblems == -1) continue;
            res = Math.min(subProblems + 1, res);
        }

        memo[amount] = (res == Integer.MAX_VALUE) ? -1 : res;

        return memo[amount];
    }

}
