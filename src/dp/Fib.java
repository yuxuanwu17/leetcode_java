package dp;

public class Fib {
    public int fib(int n) {
        if(n<=2) return 1;
        return fib(n-1)+fib(n-2);
    }

    public int fib_dp(int n) {
        if(n<=2) return 1;

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
}
