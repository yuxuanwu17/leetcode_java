package tree;

public class BinarySearchTree<Key extends Comparable<Key>, Value> {
    private Node root;
    private int N;

    private class Node {
        public Key key;
        private Value value;
        public Node left;
        public Node right;

        public Node(Key key, Value value, Node left, Node right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }



    public int size() {
        return N;
    }

    /**
     * 用root 来代表整棵树
     * @param key
     * @param value
     * return 的是重载的put方法
     */
    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    /**
     *有三种情况
     * @param x
     * @param key
     * @param value
     * @return 代表的是插入的指定位置
     */
    private Node put(Node x, Key key, Value value) {
        if (x == null) {
            N++;
            return new Node(key, value, null, null);
        }
        // 这一步是为了判断x节点和key的值的大小
        int cmp = key.compareTo(x.key);
        if (cmp > 0) {
            x.right = put(x.right, key, value);
        } else if (cmp < 0) {
            x.left = put(x.left, key, value);
        } else {
            x.value = value;
        }
        return x;
    }

    public Value get(Key key) {
        return get(root, key);

    }
    // 这里其实有些递归的思想
    private Value get(Node x, Key key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp > 0) {
            return get(x.right, key);
        }
        if (cmp < 0) {
            return get(x.left, key);
        } else {
            return x.value;
        }
    }

    public void delete(Key key) {
        root = delete(root, key);
    }

    private Node delete(Node x, Key key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp > 0) {
            x.right = delete(x.right, key);
        } else if (cmp < 0) {
            x.left = delete(x.left, key);
        } else {
            // 这里的是新节点的key小于当前节点的key，当前x就是要删除掉的节点
            // 如果没有右子树，就返回左子树
            if (x.right == null) {
                return x.left;
            }
            if (x.left == null) {
                return x.right;
            }
            // 如果当前的左右子树都存在
            // 找到当前右子树中最小的点
            Node minNode = x.right;
            while (minNode.left != null) {
                minNode = minNode.left;
            }
            // 删除右子树最小的节点
            Node n = x.right;
            while (n.left != null) {
                if (n.left.left == null) {
                    n.left = null;
                } else {
                    n = n.left;
                }
            }

            // 让被删除节点的左子树称之为最小节点minNode的左子树，让被删除节点的右子树成为最小节点minNode的右子树
            minNode.left = x.left;
            minNode.right = x.right;
            x = minNode;
            N--;
        }
        return x;

    }
}
