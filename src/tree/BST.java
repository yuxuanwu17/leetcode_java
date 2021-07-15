package tree;

public class BST {
    /**
     * 二分查找树满足以下的特性：
     * 每个节点都比自己左子树上的节点大，并比右子树上的节点小。
     * BST does not allow nodes with the same value
     * <p>
     * O(T):O(logN)
     */

    static class TreeNode {
        public int value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }

        public TreeNode() {

        }
    }

    /**
     * 定义treeNode
     **/
    private TreeNode root;
    private int size = 0;


    public int getSize(){
        return this.size;
    }

    /**
     * 跳出循环后，如果是因为current==null而跳出的，则返回null
     * 如果不是，则默认是current跳出的，所以返回的是current
     *
     * @param key 输入的想要查找的值
     * @return 返回null 或者是get到的值value
     */
    public TreeNode get(int key) {
        TreeNode current = root;
        while (current != null && current.value != key) {
            if (key < current.value) {
                current = current.left;
            } else if (key > current.value) {
                current = current.right;
            }
        }
        return current == null ? null : current;
    }


    /**
     * 插入需要两个值
     * 一个父亲节点，一个当前节点
     * <p>
     * void 函数仍然用return的意思是相当于终止函数
     *
     * @param key
     */
    public void insert(int key) {

        // 先判断是否存在，不存在则让输入为root
        if (root == null) {
            root = new TreeNode(key);
            size++;
            return;
        }

        // current 代表你要插入的值
        // parent 插入的父亲

        TreeNode current = root;
        TreeNode parent = null;
        while (true) {
            parent = current;
            if (key < parent.value) {
                current = parent.left;
                if (current == null) {
                    parent.left = new TreeNode(key);
                    size++;
                    return;
                }
            } else if (key > parent.value) {
                current = parent.right;
                if (current == null) {
                    parent.right = new TreeNode(key);
                    size++;
                    return;
                }
            } else {
                return; // BST does not allow nodes with the same value
            }
        }
    }

    /**
     * 删除需要考虑三种情况
     * <p>
     * Case 1: if node to be deleted has no children （删除节点没有子节点）
     * Case 2: if node to be deleted has only one child （删除节点有一个子节点，可以是左，也可以是右）
     * Case 3: current.left != null && current.right != null （删除节点有两个节点，左右节点都存在）
     *
     * https://www.bilibili.com/video/BV1qQ4y1M7Z4
     *
     * @param key
     * @return
     * @insideparam parent: 用来记录上一个父亲节点
     * @insideparam current：用来记录当前的节点
     */
    public boolean delete(int key) {
        TreeNode parent = root;
        TreeNode current = root;
        boolean isLeftChild = false;
        while (current != null && current.value != key) {
            parent = current;
            if (current.value > key) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
        }
        if (current == null) {
            return false;
        }
        // Case 1: if node to be deleted has no children
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
            size--;
            // Case 2: if node to be deleted has only one child
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left; // 和下方不一致的主要是current.left 和current.right 的区别
            } else {
                parent.right = current.left;
            }
            size--;
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
            size--;
            // Case 3: current.left != null && current.right != null
            // 找右子树上的最小的节点来替代--> successor
        } else {
            // 这一步是获得最小的节点
            TreeNode successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
            size--;
        }
        return true;
    }

    private TreeNode getSuccessor(TreeNode node) {
        // 找右子树上的最小的节点来替代--> successor
        // 同时遵循保证树形结构的完整
        TreeNode successor = null; // 最后需要放上去的那个节点
        TreeNode successorParent = null;
        TreeNode current = node.right; // 找到待删除位置的sub右子树上找到最小的点
        // 这里的while循环已经保证了最小左子树，但是没法保证最小左子树是否含有右节点
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.left;
        }

        // 说明待删除的点是有左子树的
        if (successor != node.right) {
            // 这一步的目的是为了将最小左子树的有节点给连接上
            // 如果没有也就返回null，不影响
            successorParent.left = successor.right;
            successor.right = node.right;
        }
        return successor;
    }

    public static void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.value);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

}
