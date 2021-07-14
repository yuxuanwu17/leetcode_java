package sorting;

public class BinarySearch {
    public static int binarySearch(int[] nums, int target) {
        int left = -1;
        int right = nums.length;
        while (left + 1 != right) {
            int m = (left + right) / 2;
            if (nums[m] < target) {
                left = m;
            } else {
                right = m;
            }
        }
        // 这里存在一个如果他不存在的情况，需要考虑
        if (right == nums.length || nums[right] != target) return -1;
        return right;
    }

    public static int binarySearch2(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid+1;
            } else if (nums[mid] > target) {
                right = mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    }
