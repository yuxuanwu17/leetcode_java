package dp.test;

import dp.MaxProfit;
import org.junit.Test;

public class test {
    private int[] nums = {7, 1, 5, 3, 6, 4};

    @Test
    public void maxProfitTest() {
        MaxProfit maxProfit = new MaxProfit();
        int profit = maxProfit.maxProfit(nums);
        System.out.println(profit);
        int profit2 = maxProfit.maxProfit2(nums);
        System.out.println(profit2);
    }
}
