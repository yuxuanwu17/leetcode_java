package linear;

public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;
        ListNode a = head;
        ListNode b = head;

        for (int i = 0; i < k; i++) {
            // base case 是不足k，就不需要反转
            if (b == null) return head;
            b = b.next;
        }
        ListNode newNode = reverse(a, b);
        a.next = reverseKGroup(b, k);

        return newNode;
    }

    public ListNode reverse(ListNode a, ListNode b) {
        ListNode prev, curr, nxt;
        prev = null;
        curr = a;
        while (curr != b) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        return prev;

    }
}
