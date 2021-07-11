package linear;

import linear.ListNode;

import java.util.HashSet;

public class HasCircleSol {
    public boolean hasCircle(ListNode head) {
        // 这里考虑的是只有头结点和头结点为空的情况
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            // 这里需要保证fast.next 仍然有下一个结点，所以需要进行判断
            if (fast.next == null || fast == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public boolean hasCircle_hashset(ListNode head) {
        HashSet<ListNode> hashset = new HashSet<ListNode>();
        while (head != null) {
            if (!hashset.add(head)) return true;
            head = head.next;
        }
        return false;
    }

}

