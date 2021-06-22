package linear;

import linear.ListNode;

 public class AddTwoNumber {
    private ListNode dummyHead = new ListNode(-1);
    private ListNode tail = dummyHead;

    /***
     * 本质就是一个模拟加法的过程，核心可以用进位符carry来完成
     */

    // Definition for singly-linked list. (imported from the ListNode class)

    // Initialize the data structure here
    int size ;
    ListNode head = null;

    public AddTwoNumber(){
        this.head = null;
        this.size = 0;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 1. 定义头结点和尾结点;定义进位值
        // head 用来记录链表的头部，tail不断向后进行让链表变长
        ListNode head = null, tail = null;
        int carry = 0;

        // 2. 三元运算符来同时遍历l1,l2
        while (l1 != null || l2 != null) {
            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 != null ? l2.val : 0;
            int perSum = num1 + num2 + carry;
            if (head == null) {
                // 3. 第一次循环，构建新的链表，用来处理第一个node的和并且赋值位val
                // 注意这里因为创建列表的早，所以head即是tail
                head = tail = new ListNode(perSum % 10);
            } else {
                // 4. 注意这里不是第一次第一次循环，是第二次循环以后
                tail.next = new ListNode(perSum % 10);
                tail = tail.next;
            }

            // 5. 这里获得了进位的值，也用到了向下强转 (12/10 = 1 )
            carry = perSum / 10;

            // 6. 判断是否为最后一个结点, 保证循环
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

            // 7. 如果链表遍历结束后进位符大于1，需要在答案链表后面附加一个结点，结点的值为carry
            if (carry > 0) {
                tail.next = new ListNode(carry);
            }
        }
        return head;
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */


    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {

        int carry = 0;
        // l1 & l2 长度相同的部分
        while (l1 != null && l2 != null) {
            int val = (l1.val + l2.val + carry) % 10;
            carry = (l1.val + l2.val + carry) / 10;
            appendNode(new ListNode(val));
            l1 = l1.next;
            l2 = l2.next;
        }
        // l1 比l2 长
        while (l1 != null) {
            int val = (l1.val + 0 + carry) % 10;
            carry = (l1.val + carry) / 10;
            appendNode(new ListNode(val));
            l1 = l1.next;
        }

        // l2 比l1 长
        while (l2 != null) {
            int val = (0 + l2.val + carry) % 10;
            carry = (l2.val + carry) / 10;
            appendNode(new ListNode(val));
            l2 = l2.next;
        }

        // 考虑最后一个进位符
        if (carry != 0) {
            appendNode(new ListNode(carry));
        }

        // 注意这里是dummyHead.next
        return dummyHead.next;
    }

    private void appendNode(ListNode node) {
        tail.next = node;
        tail = node;
    }
}

