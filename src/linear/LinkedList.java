package linear;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    /***
     * Initialize the head node and the size of the node N
     */
    private Node head;
    private int N;

    /***
     * Initialize the head node
     */

    public LinkedList() {
        head = new Node(null, null);
        N = 0;
    }

    public void clear() {
        head.next = null;
        head.item = null;
        N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int length() {
        return N;
    }

    /***
     *
     * @param i index
     * @return the item based on index i
     */
    public T get(int i) {
        if (i < 0 || i >= N) {
            throw new RuntimeException("This is not allowed ");
        }
        Node n = head.next;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        return n.item;
    }

    // insert the item from the last node
    public void insert(T t) {
        // find the last node
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }

        Node newNode = new Node(t, null);
        // let the last node point to the newly inserted node

        n.next = newNode;
        N++;
    }

    // insert item from designed location
    public void insert(T t, int i) {
        if (i < 0 || i >= N) {
            throw new RuntimeException("This is not allowed ");
        }

        // find the previous one
        Node pre = head;
        for (int index = 0; index < i; index++) {
            pre = pre.next;
        }

        // find the current node at location i
        Node curr = pre.next;

        Node newNode = new Node(t, curr);

        // let previous one point to the inserted new node
        pre.next = newNode;

        N++;
    }

    public T remove(int i) {
        if (i < 0 || i >= N) {
            throw new RuntimeException("This is not allowed ");
        }

        // find the previous one (head as first pre node)
        Node pre = head;
        for (int index = 0; index < i; index++) {
            pre = pre.next;
        }

        Node del = pre.next;
        pre.next = del.next;

        N--;

        return del.item;
    }

    public int indexOf(T t) {
        Node n = head;
        for (int index = 0; index < N; index++) {
            n = n.next;
            if (n.item.equals(t)) {
                return index;
            }
        }

        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new LIterator();
    }

    // 准备一个内部类
    private class LIterator implements Iterator<T> {

        private Node n;
        //对Literator进行一个空参构造

        public LIterator(){
            this.n = head;
        }

        @Override

        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public T next() {
            n = n.next;
            return n.item;
        }
    }


    // Define the Node class in a constructor format
    private class Node {
        T item;
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }


}