package arraylist;

import java.util.Arrays;

public class PivotIndex {
    /**
     * 这里主要使用到的是前缀和preSum的思想
     * 利用了index左右两端的和相等来进行的下一步
     * @param nums
     * @return
     */
    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (2 * sum + nums[i] == total) return i;
            sum = sum + nums[i];
        }
        return -1;
    }
}
