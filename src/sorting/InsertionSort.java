package sorting;

import java.util.Arrays;

public class InsertionSort {
    /**
     * @param nums 数组
     * @return sort完毕的数组
     */
    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            // 从第二个元素开始，确定插入的位置
            int insertIndex = i - 1;

            // 定义当前扫描得到的元素
            int curr = nums[i];

            // 从后向前比较插入元素和扫描得到的大小，如果大说明仍然需要向前
            while (insertIndex >= 0 && curr < nums[insertIndex]) {
                swap(nums, insertIndex, insertIndex + 1);
                insertIndex--;
            }
        }

    }

    public static void swap(int[] nums, int a, int b) {
        int temp;
        temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int[] testArray1 = {1, 7, 11, 0,23,12, 2120, 2, 3, 6, 5, 6};
        int[] testArray2 = {1, 7, 11, 0,23,12, 2120, 2, 3, 6, 5, 6};

        insertionSort(testArray1);
        System.out.println(Arrays.toString(testArray1));

        Arrays.sort(testArray2);
        System.out.println(Arrays.toString(testArray2));

    }
}
