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

    // ==========================================================================

    ListNode left;

    public boolean isPalindrome2(ListNode head) {
        left = head;
        return postOrderTraverse(head);

    }

    public boolean postOrderTraverse(ListNode right) {
        // base case
        if (right == null) return true;

        boolean res = postOrderTraverse(right.next);

        res = res && (left.val == right.val);
        left = left.next;
        return res;
    }

    public boolean isPalindrome3(ListNode head) {
        ListNode slow = findMiddleNode(head);
        ListNode left = head;
        ListNode right = traverse(slow);

        System.out.println(left);
        System.out.println(right);

        while (right != null) {
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public ListNode findMiddleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null)
            slow = slow.next;
        return slow;
    }
}
