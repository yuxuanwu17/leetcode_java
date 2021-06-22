package test;

import linear.AddTwoNumber;
import linear.ListNode;

/***
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 */

public class AddTwoNumberTest {
    public static void main(String[] args) throws Exception {
        int[] l1Array = {2,4,3};
        int[] l2Array = {5, 6, 4};
        ListNode l1 = new ListNode(l1Array);
        ListNode l2 = new ListNode(l2Array);
        System.out.println(l1);
        System.out.println(l2);

        System.out.println("================");
        AddTwoNumber obj = new AddTwoNumber();
        ListNode results = obj.addTwoNumbers(l1, l2);
        System.out.println(results);


    }
}
