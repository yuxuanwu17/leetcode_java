package linear.test;

import linear.*;
import org.junit.Test;

public class Junit {
    //    int[] num1 = {6, 1, 2, 6, 3, 4, 5, 6, 6, 6};
    int[] num1 = {-3, -1, 0, 0, 0, 3, 3};
//        int[] num2 = {1, 2, 3, 4, 5, 6};
    int[] num2 = {1, 2, 2, 1};
    ListNode l1 = new ListNode(num1);
    ListNode l2 = new ListNode(num2);

    ListNode node1 = new ListNode(new int[]{1});
    ListNode node2 = new ListNode(new int[]{2});
    ListNode node3 = new ListNode(new int[]{2});


    public Junit() throws Exception {
    }

    @Test
    public void mergeTwoListsTest() {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
//        ListNode res = mergeTwoLists.mergeTwoLists2(l1, l2);
        ListNode res = mergeTwoLists.mergeTwoLists(l1, l2);
        System.out.println("=============");
        System.out.println("dummy node is: " + res);

    }

    @Test
    public void removeElementsTest() {
        RemoveElements removeElements = new RemoveElements();
        ListNode res = removeElements.removeElements(l1, 6);
        System.out.println(res);
    }

    @Test
    public void deleteReplicatesTest() {
        DeleteDuplicates dlt = new DeleteDuplicates();
        ListNode res = dlt.deleteDuplicates2(l1);
        System.out.println(res);
//        System.out.println("=============");
//        System.out.println("dummy node is: "+ res);
    }

    @Test
    public void cycleDetectTest() {
        HasCircleSol obj = new HasCircleSol();
//        obj.hasCircle_hashset();
    }

    @Test
    public void reverseListN() {
        ReverseListN reverseListN = new ReverseListN();
        System.out.println("l2 is: " + l2);
        ListNode res = reverseListN.reverseN(l2, 3);
        System.out.println(res);
    }

    @Test
    public void reverseList() {
        ReverseList reverseList = new ReverseList();
        System.out.println(l2);
        ListNode res = reverseList.reverseList2(l2);
        System.out.println(res);
    }

    @Test
    public void traverse() {
        ReverseList reverseList = new ReverseList();
        System.out.println("Initial: "+l2);
        reverseList.traverse(l2);
        System.out.println("===========");
        reverseList.preOrderTraverse(l2);
    }
    @Test
    public void preOrderTraverse() {
        ReverseList reverseList = new ReverseList();
        System.out.println("Initial: "+l2);
        reverseList.preOrderTraverse(l2);
    }

    @Test
    public void reverseBetween() {
        System.out.println("l2 is: " + l2);
        ReverseTargetRange reverseTargetRange = new ReverseTargetRange();
        ListNode res = reverseTargetRange.reverseBetween(l2, 2, 5);
        System.out.println(res);
    }

    @Test
    public void reverseKGroup() {
        ReverseKGroup reverseKGroup = new ReverseKGroup();
        ListNode listNode = reverseKGroup.reverseKGroup(l2, 2);
        System.out.println(listNode);
    }

    @Test
    public void isPalindromeTest() {
        IsPalindrome isPalindrome = new IsPalindrome();
        boolean res = isPalindrome.isPalindrome3(l2);
        System.out.println(res);
    }
}
