package tree;

import sorting.BinarySearch;

public class BSTTest {
    public static void main(String[] args) {
        BST bst = new BST();
        //5,3,6,2,4,null,null,1
        Object[] input = {5, 3, 6, 2, 4, null, null, 1};
        for (int i = 0; i < input.length; i++) {
            if (input[i] == null) continue;
            bst.insert((Integer) input[i]);
        }
        TreeNode inputRoot = bst.getRoot();
        KthSmallest kthSmallest = new KthSmallest();
        int i = kthSmallest.kthSmallest(inputRoot, 1);
        System.out.println(i);

//        System.out.println("inOrder:");
//        bst.inOrderTraversal(bst.getRoot());
//        TreeNode inputRoot = bst.getRoot();
//        KthSmallest kthSmallest = new KthSmallest();
//        System.out.println("===============");
//        kthSmallest.traverse(inputRoot);




//        System.out.println("节点树:"+bst.count(bst.getRoot()));
//        System.out.println("preOrder:");
//        bst.preOrderTraversal(bst.getRoot());
//        System.out.println("=================");
//        System.out.println("inOrder:");
//        bst.inOrderTraversal(bst.getRoot());
//        System.out.println("=================");
//        System.out.println("postOrder:");
//        bst.postOrderTraversal(bst.getRoot());
    }

}
