package dp;

import linear.LinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LengthOfLFS {


    public int lengthOfLIS(int[] nums) {
        int maxLength = 1;

        for (int i = 0;i<nums.length;i++){
            maxLength = Math.max(maxLength,recursion(nums,i));
        }
        return maxLength;
    }

    HashMap memo = new HashMap<Integer,Integer>();


    public int recursion (int [] nums, int i){
        if (memo.containsKey(i)) return (int) memo.get(i);

        // base case
        if (i == (nums.length - 1)) return 1;

        int maxSublength = 1;
        for (int j=i+1;j<nums.length;j++){
            if(nums[i]<nums[j]){
                maxSublength = Math.max(maxSublength,recursion(nums,j)+1);
            }
        }
        memo.put(i,maxSublength);
        return maxSublength;
    }
}
