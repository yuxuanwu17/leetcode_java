package linear;

import linear.ListNode;

public class RemoveNthFromEnd {
    ListNode head;
    int i;

    public RemoveNthFromEnd(ListNode head, int i) {
        this.head = head;
        this.i = i;
    }

    public RemoveNthFromEnd() {

    }

//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode dummy = new ListNode(0, head);
//        int length = getLength(head);
//        ListNode cur = dummy;
//        for (int i = 1; i < length - n + 1; ++i) {
//            cur = cur.next;
//        }
//        cur.next = cur.next.next;
//        ListNode ans = dummy.next;
//        return ans;
//    }
//
//    public int getLength(ListNode head) {
//        int length = 0;
//        while (head != null) {
//            ++length;
//            head = head.next;
//        }
//        return length;
//    }

    public ListNode removeNthFromEnd(ListNode head, int n) {


        // 1. 定义dummy head
        ListNode dummyHead = new ListNode(0, head);

        // 2. 定义firstNode 从head出发
        ListNode firstNode = head;

        // 3. 定义secondNode 在dummy head
        ListNode secondNode = dummyHead;

        // 4. 循环n下
        for (int i = 0; i < n; i++) {
            firstNode = firstNode.next;
        }


        // 5. secondNode 和firstNode 同时出发； 直到firstNode == null
        while (firstNode != null) {
            firstNode = firstNode.next;
            secondNode = secondNode.next;
        }

        // 6. 完成删除操作
        secondNode.next = secondNode.next.next;

        // 7. 定义一个新的完整的链表返回
        return dummyHead.next;

    }

    public static void main(String[] args) throws Exception {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = new ListNode(nums);
        RemoveNthFromEnd obj = new RemoveNthFromEnd();
//        int length = obj.getLength(head);
//        System.out.println(length);
//        System.out.println(head);
        obj.removeNthFromEnd(head, 1);
        System.out.println(obj);
//        System.out.println(obj.head.next.val);
    }
}
