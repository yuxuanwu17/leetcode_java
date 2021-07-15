package tree;

import sorting.BinarySearch;

public class BSTTest {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(1);
        bst.insert(2);
        bst.insert(3);
        System.out.println(bst.getSize());
        bst.delete(2);
        System.out.println(bst.getSize());

//        BST.TreeNode treeNode = bst.get(2);
//        System.out.println(treeNode.value);





//        BinarySearchTree<Integer, String> bt = new BinarySearchTree<>();
//        bt.put(4,"二哈");
//        bt.put(1,"张三");
//        bt.put(3,"李四");
//        bt.put(5,"王五");
//        System.out.println(bt.size());
//        bt.put(1,"老三");
//        System.out.println(bt.get(1));


//        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
//        tree.put(3, "张三");
//        tree.put(2, "李四");
//        tree.put(1, "王五");
//        tree.put(4, "赵六");
//        tree.put(5, "洪七");
//        tree.delete(2);
//        tree.delete(3);
//        System.out.println("删除后键5对应的元素是" + tree.get(5));
    }

}
