package tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class FindDuplicateTrees {

    HashMap<String, Integer> memo = new HashMap<>();
    LinkedList<TreeNode> res = new LinkedList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        traverse(root);
        memo.forEach((k, v) -> System.out.println("key: " + k + " freq: " + v));
        return res;
    }

    public String traverse(TreeNode root) {
        if (root == null) return "null";

        String left = traverse(root.left);
        String right = traverse(root.right);

        String subTree = left + "," + right + "," + root.val;
        int freq = memo.getOrDefault(subTree, 0);
        if (freq == 1) {
            res.add(root);
        }
        memo.put(subTree, freq + 1);

        return subTree;
    }
}
