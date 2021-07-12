package linear;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = new ListNode(0);
        ListNode newh = curr;
        HashSet<Integer> set = new LinkedHashSet<>();
        // 如果不用linkedHashSet 则结果是-1->0->-3->3->NULL
        // 如果使用了则是：-3->-1->0->3，使用了linkedList就是为了保证顺序，不出现乱序的情况
        while (head != null) {
            set.add(head.val);
            head = head.next;
        }
        for (Integer s : set) {
            ListNode node = new ListNode(s);
            curr.next = node;
            curr = curr.next;
        }
        return newh.next;
    }

    public ListNode deleteDuplicates2(ListNode head) {

        ListNode dummyHead = new ListNode(-1, head);
        while (head != null && head.next != null) {

            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }

        return dummyHead.next;
    }
}

