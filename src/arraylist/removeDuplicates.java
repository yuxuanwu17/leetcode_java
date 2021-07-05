package arraylist;

import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int length = removeDuplicates(nums);
        System.out.println(length);
        System.out.println("---------");
        int[] nums_only = removeDuplicates2(nums);
        System.out.println(Arrays.toString(nums_only));
//        System.out.println("---------");
//        for (int i = 0; i < nums_only.length; i++) {
//            System.out.println(i);
//        }

    }
    public static int removeDuplicates(int[] nums) {
        // 应用双指针，因为是排好序的，只需要验证左右不等就行

        // 1. 判断是不是空和长度是不是为0
        if (nums == null | nums.length == 0) return 0;

        // 2. 定义left & right 指针
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }
    public static int[] removeDuplicates2(int[] nums) {
        // 应用双指针，因为是排好序的，只需要验证左右不等就行

        // 1. 判断是不是空和长度是不是为0
        if (nums == null | nums.length == 0) return null;

        // 2. 定义left & right 指针
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
            }
        }
        return nums;
    }
}
