package tree;

import sorting.BinarySearch;

public class BSTTest {
    public static void main(String[] args) {
//        BinarySearchTree<Integer, String> bt = new BinarySearchTree<>();
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.put(3, "张三");
        tree.put(2, "李四");
        tree.put(1, "王五");
        tree.put(4, "赵六");
        tree.put(5, "洪七");
        tree.delete(2);
        tree.delete(3);
        System.out.println("删除后键5对应的元素是" + tree.get(5));
//        bt.put(4,"二哈");
//        bt.put(1,"张三");
//        bt.put(3,"李四");
//        bt.put(5,"王五");
//        System.out.println(bt.size());
//        bt.put(1,"老三");
//        System.out.println(bt.get(1));

    }

}
