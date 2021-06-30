package linear;
import linear.ListNode;

public class ReverseList {

    public ReverseList() {
    }

    public ListNode reverseList(ListNode head) {
        // 1. 定义前指针节点和curr节点
        ListNode prev = null;
        ListNode curr = head;

        // 2.  //每次循环，都将当前节点指向它前面的节点，然后当前节点和前节点后移
        while (curr != null) {
            ListNode nextTemp = curr.next; // 临时结点，暂存当前节点的下一个节点，用于向后移位
            curr.next = prev; // 将当前节点指向他前面的一个节点，
            prev = curr;//前指针向后移动
            curr = nextTemp;//当前指针向后移动
        }
        return prev;
    }

}
