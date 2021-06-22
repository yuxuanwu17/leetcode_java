package linear;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        this.val = x;
    }

    ListNode(int x, ListNode next){
        this.val = x;
        this.next = next;
    }

    // 链表节点的构造函数
    // 使用arr为参数，创建一个链表，当前的ListNode为链表头节点
    public ListNode(int[] arr) throws Exception {
        if (arr == null || arr.length == 0)
            throw new Exception("arr can not be empty");

        this.val = arr[0];
        ListNode cur = this;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
    }

    // 链表有环的问题， 还需要一个环发生的索引pos
   /* public ListNode(int[] arr, int pos) {
        if (arr == null || arr.length == 0) {
            throw new RuntimeException("arr can not be empty");
        }

        // 这里赋值的val是顶端那个全局变量
        this.val = arr[0];
        ListNode cur = this;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        // 循环找到插入的结点，类似设计链表的get方法
        // 还没有设计完
        int n = 0;
        ListNode head = next;
        while (head.next != null) {
            if (n==pos) {
                cur.next = head.next;
                break;
            }
            n++;
        }

    }*/

    //以当前节点为头节点的链表信息字符串 方便查看
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        ListNode cur = this;
        while (cur != null) {
            res.append(cur.val + "->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }
}
