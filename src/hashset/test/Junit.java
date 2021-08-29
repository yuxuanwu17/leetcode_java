package hashset.test;

import hashset.TwoSum;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Junit {
    @Test
    public void twoSumTest() {
        int[] nums = {1, 3, 1, 2, 2, 3};
        int target = 4;
        TwoSum twoSum = new TwoSum();
        List<List<Integer>> ints = twoSum.twoSumVal(nums, nums[0],target);
        System.out.println(ints);
    }

    @Test
    public void threeSumTest() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int target = 0;
        TwoSum twoSum = new TwoSum();
        List<List<Integer>> ints = twoSum.threeSumVal(nums, target);
        System.out.println(ints);
    }
}
