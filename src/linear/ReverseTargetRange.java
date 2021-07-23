package linear;

public class ReverseTargetRange {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == 1) {
            return reverseListN(head, n);
        }
        head.next = reverseBetween(head.next, m - 1, n - 1);
//        System.out.println("m==1 后的情况"+head);
        return head;
    }
    ListNode successor = null;
    public ListNode reverseListN(ListNode head, int num) {
        if (num == 1) {
            successor = head.next;
            return head;
        }
        ListNode last = reverseListN(head.next, num - 1);
        head.next.next = head;
        head.next = successor;
        return last;
    }
}
