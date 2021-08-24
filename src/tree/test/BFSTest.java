package tree.test;

import org.junit.Test;
import tree.Deserializable;
import tree.MinDepth;
import tree.TreeNode;

public class BFSTest {
    @Test
    public void minDepthTest() {
        MinDepth minDepth = new MinDepth();
        TreeNode root = new Deserializable().deserializable("3,9,20,null,null,15,7");
        System.out.println(minDepth.minDepth(root));
    }
}
