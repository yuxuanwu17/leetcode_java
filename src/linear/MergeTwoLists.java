package linear;

import linear.ListNode;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoLists {
    // l1:1-2-3-4-5
    // l2:1-2
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {


        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;

        /**
         * 注意不用考虑三种情况，相等的那种，因为只要保证一个不动，另一个也肯定不动
         */
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                curr = curr.next;
                l1 = l1.next;
            } else {
                curr.next = l2;
                curr = curr.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            curr.next = l2;
        } else {
            curr.next = l1;
        }

        return dummyHead.next;
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        // 类似归并排序中的合并过程
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        // 任一为空，直接连接另一条链表
        if (l1 == null) {
            cur.next = l2;
        } else {
            cur.next = l1;
        }
        return dummyHead.next;
    }


    public ListNode mergeTwoLists3(ListNode l1, ListNode l2) {
        ArrayList<Integer> list1 = nodeToList(l1);
        ArrayList<Integer> list2 = nodeToList(l2);
        list1.addAll(list2);

        Object[] array = list1.toArray();
        Arrays.sort(array);

        return arrayToNode(array);
    }

    public ArrayList<Integer> nodeToList(ListNode node) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        while (node != null) {
            arraylist.add(node.val);
            node = node.next;
        }
        return arraylist;
    }

    public ListNode arrayToNode(Object[] array) {
        ListNode listNode = new ListNode();
        ListNode dummyHead = new ListNode();
        dummyHead.next = listNode;

        for (int i = 0; i < array.length; i++) {
            listNode.next = new ListNode((Integer) array[i]);
            listNode = listNode.next;
        }

        return dummyHead.next.next;
    }
}
