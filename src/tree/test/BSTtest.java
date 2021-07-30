package tree.test;

import org.junit.Test;
import tree.BST;
import tree.KthSmallest;
import tree.TreeNode;

public class BSTtest {

    @Test
    public void isValidBSTTest() {
        BST bst = new BST();
        Object[] input = {5, 3, 6, 2, 4, null, null, 1};
        for (int i = 0; i < input.length; i++) {
            if (input[i] == null) continue;
            bst.insert((Integer) input[i]);
        }
        boolean validBST = bst.isValidBST(bst.getRoot());
        System.out.println(validBST);
    }
    @Test
    public void deleteBSTNodeTest() {
        BST bst = new BST();
        Object[] input = {5, 3, 6, 2, 4, null, null, 1};
        for (int i = 0; i < input.length; i++) {
            if (input[i] == null) continue;
            bst.insert((Integer) input[i]);
        }
        TreeNode treeNode = bst.deleteNode(bst.getRoot(), 2);
        bst.inOrderTraversal(treeNode);

    }
}
