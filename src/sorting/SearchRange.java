package sorting;

import java.util.Arrays;

public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {
        int left = -1;
        int right = nums.length;
        while (left + 1 != right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        int left_range = right;
        if (right == nums.length || nums[right] != target) return new int[]{-1, -1};

        left = -1;
        right = nums.length;
        while (left + 1 != right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        int right_range = left;
//        if (right == nums.length || nums[right] != target) return new int[][]{{-1}, {-1}};
        return new int[]{left_range, right_range};
    }


    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] results = searchRange(nums, target);
        System.out.println(Arrays.toString(results));
    }
}
