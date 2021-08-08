package linear;

import java.util.ArrayList;

public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {

        ArrayList<Integer> node1 = nodeToArray(head);
        ListNode reverseListNode = traverse(head);
        ArrayList<Integer> node2 = nodeToArray(reverseListNode);
        return node1.equals(node2);
    }

    public ArrayList<Integer> nodeToArray(ListNode head) {
        ArrayList<Integer> node = new ArrayList<>();
        while (head != null) {
            node.add(head.val);
            head = head.next;
        }
        return node;
    }

    public ListNode traverse(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode last = traverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
