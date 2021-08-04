package dp;

public class Fib {
    public int fib_memo(int n) {
        int[] memo = new int[n + 1];
        return helper(memo, n);
    }

    public int helper(int[] memo, int n) {
        if (memo[n] != 0) return memo[n];

        // base case
        if (n == 0 || n == 1) return n;

        memo[n] = helper(memo, n - 1) + helper(memo, n - 2);

        return memo[n];
    }

    public int fib_dp(int n) {
        if (n <= 2) return 1;

        int sum = 0;
        int n1 = 0;
        int n2 = 1;

        for (int i = 2; i <= n; i++) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        return sum;
    }

    public int fib_bottom_to_up(int n) {
        if (n == 0) return 0;

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

}
