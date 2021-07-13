package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] testArray1 = {1, 7, 11, 0,23,12, 2120, 2, 3, 6, 5, 6};
        int[] testArray2 = {1, 7, 11, 0,23,12, 2120, 2, 3, 6, 5, 6};

        bubbleSort(testArray1);
        System.out.println(Arrays.toString(testArray1));

        Arrays.sort(testArray2);
        System.out.println(Arrays.toString(testArray2));
    }

    public static void swap(int[] nums, int a, int b) {
        int temp;
        temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void bubbleSort(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums,j, j + 1);
                }
            }
        }
    }
}
