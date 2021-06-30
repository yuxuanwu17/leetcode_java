package test;

import linear.ListNode;
import linear.ReverseList;

public class ReverseListTest {
    public static void main(String[] args) throws Exception {
        int[] l1Array = {2,4,3};
        int[] l2Array = {5, 6, 4};
        ListNode l1 = new ListNode(l1Array);
        ListNode l2 = new ListNode(l2Array);
        ReverseList obj = new ReverseList();
        ListNode l1_reverse = obj.reverseList(l1);
        System.out.println(l1_reverse);
    }
}
