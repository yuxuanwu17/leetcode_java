package test;

import arraylist.containDuplicate;
import org.junit.Test;

import java.util.Arrays;

public class Junit {
    private int[] nums = {2,14,18,22,22};//[2,14,18,22,22]


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
}
