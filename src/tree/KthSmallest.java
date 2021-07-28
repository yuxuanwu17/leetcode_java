package tree;

import java.util.ArrayList;

public class KthSmallest {
    ArrayList<Integer> list = new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {
//        list = traverse(root);
        return list.get(k);
    }

    //    public ArrayList<Integer> traverse (TreeNode root){
//        if(root == null) return null;
//        traverse(root.left);
//        list.add(root.val);
//        traverse(root.right);
//        return list;
//    }
    public void traverse(TreeNode root) {
        if (root == null) return;
        traverse(root.left);
        // 中序遍历代码位置
        System.out.println(root.val);
        traverse(root.right);
    }


}
