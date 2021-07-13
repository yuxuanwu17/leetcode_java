package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] testArray1 = {1, 7, 11, 0,23,12, 2120, 2, 3, 6, 5, 6};
        int[] testArray2 = {1, 7, 11, 0,23,12, 2120, 2, 3, 6, 5, 6};

        quickSort(testArray1);
        System.out.println(Arrays.toString(testArray1));

        Arrays.sort(testArray2);
        System.out.println(Arrays.toString(testArray2));
    }

    public static void quickSort(int [] nums) {

    }
}
