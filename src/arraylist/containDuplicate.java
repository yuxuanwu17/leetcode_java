package arraylist;

import java.util.Arrays;

public class containDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // 2,14,18,22,22
        Arrays.sort(nums);
        int left = 0;
        int right =1;
        for (int i = 0; i<nums.length-1;i++){
            if(nums[left]==nums[right]) return true;
            right = right+1;
            left++;
        }
        return false;
    }
}
