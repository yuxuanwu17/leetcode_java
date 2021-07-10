package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersect {

    /**
     * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
     * <p>
     * Example 1:
     * <p>
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2,2]
     * Example 2:
     * <p>
     * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * Output: [4,9]
     * Explanation: [9,4] is also accepted.
     * <p>
     * [4,9,5]
     * [9,4,9,8,4]
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        // 1. 用Arraylist 储存nums1值
        ArrayList list1 = new ArrayList();
        for (int num1 : nums1) {
            list1.add(num1);
        }

        // 2. new 一个新的results array
        // 注意这里不能用array，因为扩展不方便，所以还是使用list
        ArrayList storeList = new ArrayList();

        // 3. 遍历nums2

        for (int num2 : nums2) {
            // 4. 判断是否在nums2中，若是删除
            if (list1.contains(num2)) {
                storeList.add(num2);
//                list1.remove(num2);
                list1.remove(Integer.valueOf(num2));
                // remove 有多个重载方法，有没有 Integer.valueOf 就是 remove(int index) 和 remove(Object obj) 的关系
                //5. 加入到新的res array中
            }

        }

        // 4. 返还删除后的nums2 作为results，然后去重复,转换为数组
        int[] res = new int[storeList.size()];
        int counter = 0;
        for (Object num : storeList) {
            res[counter] = (int) num;
            counter++;
        }

        return res;
    }


    public int[] intersect_two_pointers(int[] nums1, int[] nums2) {
        //1. sort序列
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        //2.定义接受list
        ArrayList<Integer> temp = new ArrayList<Integer>();


        //3. 双指针遍历
        int p1 = 0, p2 = 0;
        while (p1 < nums1.length && p2 < nums2.length) {
//        for (int p1 = 0, p2 = 0; p1 < nums1.length && p2 < nums2.length; p1++, p2++) {
            //4.相等则用temp接受
            if (nums1[p1] == nums2[p2]) {
                temp.add(nums1[p1]);
                p1++;
                p2++;
            }

            else if (nums1[p1] < nums2[p2]) {
                p1++;

            }
            else {
                p2++;

            }

        }

        //5. 返回array形式
        int[] results = new int[temp.size()];
        int counter = 0;
        for (Integer nums : temp) {
            results[counter] = nums;
            counter++;
        }


        return results;
    }
}
