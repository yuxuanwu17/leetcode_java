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

    public ListNode reverseListPartial(ListNode a, ListNode b) {
        // 1. 定义前指针节点和curr节点
        ListNode prev = null;
        ListNode curr = a;

        // 2.  //每次循环，都将当前节点指向它前面的节点，然后当前节点和前节点后移
        while (curr != b) {
            ListNode nextTemp = curr.next; // 临时结点，暂存当前节点的下一个节点，用于向后移位
            curr.next = prev; // 将当前节点指向他前面的一个节点，
            prev = curr;//前指针向后移动
            curr = nextTemp;//当前指针向后移动
        }
        return prev;
    }

    public ListNode reverseList2(ListNode head) {
        // 1. 先判断递归终止的条件
        // 1.1 当head==null 或者 只剩唯一一个结点，则也没有必要来进行翻转了
        // 1.2 注意返回的是head，这里是一个难以理解的点；也就是每次递归都拆分成head 和除了head以外的结点
        if (head==null||head.next==null)return head;

        // 2. 用来记录这个翻转链表 (递归递归，也是要保证移动的)
        ListNode p = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

}
