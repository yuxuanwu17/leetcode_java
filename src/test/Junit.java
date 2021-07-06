package test;

import arraylist.containDuplicate;
import dp.maxSubArray;
import dp.Fib;
import hashset.TwoSum;
import org.junit.Test;

import java.util.Arrays;

public class Junit {
    private int[] nums = {2,7,11,15};
    private int target = 9;


    @Test
    public void sorting() {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    @Test
    public void containDuplicateTest() {
        containDuplicate containDuplicate = new containDuplicate();
        boolean results = containDuplicate.containsDuplicate(nums);
        System.out.println(results);
    }

    @Test
    public void maxSubArray() {
        maxSubArray maxSubArray = new maxSubArray();
        int results = maxSubArray.maxSubArray(nums);
        System.out.println(results);
    }

    @Test
    public void fibTest() {
        Fib fib_obj = new Fib();
        int results = fib_obj.fib(5);
        System.out.println(results);

    }
    @Test
    public void fibTes2t() {
        Fib fib_obj = new Fib();
        int results = fib_obj.fib_dp(5);
        System.out.println(results);
    }

    @Test
    public void twosum() {
        TwoSum twoSum = new TwoSum();
        int [] results = twoSum.twoSum(nums,target);
        System.out.println(Arrays.toString(results));
    }


}
