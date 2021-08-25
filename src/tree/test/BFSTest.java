package tree.test;

import org.junit.Test;
import tree.Deserializable;
import tree.MinDepth;
import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTest {
    @Test
    public void minDepthTest() {
        MinDepth minDepth = new MinDepth();
        TreeNode root = new Deserializable().deserializable("3,9,20,null,null,15,7");
        System.out.println("Min node is " + minDepth.minDepth(root));
        System.out.println("Max node is " + minDepth.maxDepth(root));
    }

    @Test
    public void charTest() {
        String s = "1111";
        char[] a = s.toCharArray();
        System.out.println(a);
        System.out.println(a[1]);
        a[1] -= 1;
        System.out.println(a[1]);
    }

    @Test
    public void QueueTest() {
        Queue<String> q = new LinkedList<>();
        q.offer("0000");
        System.out.println(q.size());
        System.out.println(q.poll());

    }
}
