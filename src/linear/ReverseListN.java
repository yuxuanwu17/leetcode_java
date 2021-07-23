package linear;

public class ReverseListN {
    ListNode successor = null;
    public ListNode reverseN(ListNode head, int num) {
        if (num == 1) {
            successor = head.next;
            return head;
        }

        ListNode last = reverseN(head.next, num - 1);
        head.next.next = head;
        head.next = successor;
        return last;
    }
}
