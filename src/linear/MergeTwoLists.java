package linear;

import linear.ListNode;

public class MergeTwoLists {
    // l1:1-2-3-4-5
    // l2:1-2
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {


        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;

        /**
         * 注意不用考虑三种情况，相等的那种，因为只要保证一个不动，另一个也肯定不动
         */
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                curr = curr.next;
                l1 = l1.next;
            } else {
                curr.next = l2;
                curr = curr.next;
                l2 = l2.next;
            }
        }
            if (l1 == null) {
                curr.next = l2;
            }
            else {
                curr.next = l1;
            }

        return dummyHead.next;
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        // 类似归并排序中的合并过程
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        // 任一为空，直接连接另一条链表
        if (l1 == null) {
            cur.next = l2;
        } else {
            cur.next = l1;
        }
        return dummyHead.next;
    }

}
