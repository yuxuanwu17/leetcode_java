package test;

import linear.ListNode;
import linear.HasCircleSol;
public class HasCircleTest {
    public static void main(String[] args) throws Exception {
        int[] l1Array = {3, 2, 0, -4};

        ListNode<Integer> first = new ListNode<Integer>(3, null);
        ListNode<Integer> second = new ListNode<Integer>(2, null);
        ListNode<Integer> third = new ListNode<Integer>(0, null);
        ListNode<Integer> forth = new ListNode<Integer>(4, null);
        ListNode<Integer> fifth = new ListNode<Integer>(2, null);

        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;


        // 这里的

        boolean results = hasCircle(first);
        System.out.println(results);
        System.out.println(first);

    }

    public static boolean hasCircle(ListNode head) {
        // 这里考虑的是只有头结点和头结点为空的情况
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            // 这里需要保证fast.next 仍然有下一个结点，所以需要进行判断
            if ( fast == null||fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    private static class ListNode<T> {
        //存储数据
        T item;
        //下一个结点
        ListNode next;

        public ListNode(T item, ListNode next) {
            this.item = item;
            this.next = next;
        }
    }


}
