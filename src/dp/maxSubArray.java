package dp;

import java.util.ArrayList;

public class maxSubArray {
    public int maxSubArray(int[] nums) {
        /**
         * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
         * 输出：6
         * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
         */

        // 1. 定义初始化值
        int pre = 0;
        int ans = nums[0];
        // 2. 定义递推公式： max{f(i)}= max{f(i-1)+ans}

        // 增强for循环的底层原理需要通过iterator来实现接口
        for (int num : nums) {
            pre = Math.max(pre + num, num);
            ans = Math.max(ans, pre);
        }

        return ans;
    }
}

