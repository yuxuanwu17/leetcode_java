package hashset;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        /**
         * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
         *
         * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
         *
         * 你可以按任意顺序返回答案。
         *
         *
         * 示例 1：
         *
         * 输入：nums = [2,7,11,15], target = 9
         * 输出：[0,1]
         * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
         */

        // 1. 定义一个HashMap, 因为需要同时储存值和index
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        //2. 循环
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                int value1 = i;
                int value2 = hashMap.get(target - nums[i]);
                int[] ans = {value1, value2};
                return ans;
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }
}
