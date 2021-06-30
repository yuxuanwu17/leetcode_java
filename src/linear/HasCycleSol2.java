package linear;

import linear.ListNode;

public class HasCycleSol2 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;

        while (slow != null && fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) break;
        }
        //如果满足下面的条件，说明无环
        if (fast == null || fast.next == null) return null;

        //下面开始找环的入口节点
        //刚才的循环 慢指针走了a + b (a是从开始到入口节点) 假设等于cnt
        //          快指针走了 a + b + c + b (b + c = 环)，应该等于2 * cnt
        //推导出 a = c，所以把慢指针再放到头节点，下一次快慢指针相遇的节点即环的入口节点
        slow = head;
        while (slow != null && fast != null) {
            if (slow == fast) break;
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}


