package linear;

public class RemoveElements {
    //    int[] num1 = {1, 2, 6, 3, 4, 5, 6};
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode curr = dummyHead; // 如果这里改成head，则会导致在链表6，6，6的时候使第一个给保留下来,引入的dummyHead可以解决这个问题
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return dummyHead.next;
    }
}
