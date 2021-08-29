package hashset;

import java.util.*;

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

    public List<List<Integer>> twoSumVal(int[] nums, int start ,int target) {

        int lo = start, hi = nums.length - 1;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        while (lo < hi) {
            int sum = nums[lo] + nums[hi];
            int left = nums[lo];
            int right = nums[hi];
            if (sum == target) {
                res.add(new ArrayList<>(Arrays.asList(nums[lo], nums[hi])));
                lo++;
                hi--;
                // 因为已经重新排序过，所以如果重复，其实就是看下一个
                // 所以就直接在下方判断就行了
                while (lo < hi && nums[lo] == left) lo++;
                while (lo < hi && nums[hi] == right) hi--;

            } else if (sum < target) lo++;
            else hi--;
        }
        return res;
    }

    public List<List<Integer>> threeSumVal(int[] nums, int target) {
        Arrays.sort(nums);

        int n = nums.length;

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<List<Integer>> tuples = twoSumVal(nums, i + 1, target-nums[i]);
            for (List<Integer> tuple : tuples) {
                tuple.add(nums[i]);
//                System.out.println(tuple);
//                System.out.println(nums[i]);

                res.add(tuple);
            }
            //关键点在于，不能让第一个数重复，至于后面的两个数，我们复用的 twoSum 函数会保证它们不重复
            while (i < n - 1 && nums[i] == nums[i + 1]) i++;

        }

        return res;
    }

    }
