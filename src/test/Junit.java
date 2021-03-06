package test;

import arraylist.containDuplicate;
import dp.maxSubArray;
import dp.Fib;
import hashset.TwoSum;
import org.junit.Test;
import sorting.BinarySearch;

import java.util.Arrays;

public class Junit {
    private int[] nums = {-1,0,3,5,9,12};
    private int target = 2;

    private int[][] mat = {{1,2,2},{3,4}};

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
        int results = fib_obj.fib_memo(5);
        System.out.println(results);

    }
    @Test
    public void fibTes2t() {
        Fib fib_obj = new Fib();
        int results = fib_obj.fib_dp(5);
        int results2 = fib_obj.fib_bottom_to_up(5);
        System.out.println(results);
        System.out.println(results2);
    }

    @Test
    public void twosum() {
        TwoSum twoSum = new TwoSum();
        int [] results = twoSum.twoSum(nums,target);
        System.out.println(Arrays.toString(results));
//        System.out.println(Arrays.toString(new int[0]));
    }

    @Test
    public void matric() {
        //    private int[][] mat = {{1,2,2},{3,4}};
//        int n = mat[0].length;
//        int m = mat.length;
//        System.out.println(n);
//        System.out.println(m);
        int []n = mat[0];
        System.out.println(Arrays.toString(mat[0]));
    }

    @Test
    public void BinarySearchTest() {
        int num = BinarySearch.binarySearch2(nums,target);
        System.out.println(num);
    }


}
