package linear.test;

import linear.ListNode;
import linear.MergeTwoLists;
import linear.RemoveElements;
import org.junit.Test;

public class Junit {
    int[] num1 = {6,1, 2, 6, 3, 4, 5, 6, 6, 6};
//        int[] num1 = {6, 6, 6};
    int[] num2 = {1, 2};
    ListNode l1 = new ListNode(num1);
    ListNode l2 = new ListNode(num2);


    public Junit() throws Exception {
    }

    @Test
    public void mergeTwoListsTest() {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
//        ListNode res = mergeTwoLists.mergeTwoLists2(l1, l2);
        ListNode res = mergeTwoLists.mergeTwoLists(l1, l2);
        System.out.println(res);

    }

    @Test
    public void removeElementsTest() {
        RemoveElements removeElements = new RemoveElements();
        ListNode res = removeElements.removeElements(l1, 6);
        System.out.println(res);
    }
}
