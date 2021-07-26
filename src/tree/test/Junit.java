package tree.test;

import org.junit.Test;
import tree.*;

import java.util.Arrays;
import java.util.List;

public class Junit {
    @Test
    public void serializableTest() {
        String data = "1,2,#,4,#,#,3,#,#,";
        System.out.println("Initial input string: " + data);
//        String[] nodes = data.split(",");
//        System.out.println("Initial input sequence"+Arrays.toString(nodes));

        Deserializable deserializable = new Deserializable();
        TreeNode treeNode = deserializable.deserializable(data);
        System.out.println("The tree is:");
        new CreateTree().printTree(treeNode);

        System.out.println("Convert back to String format");
        String serializeString = new Serializable().serialize(treeNode);
        System.out.println(serializeString);
    }

    @Test
    public void  findDuplicates() {
        FindDuplicateTrees fpt = new FindDuplicateTrees();
        List<TreeNode> nodes = fpt.findDuplicateSubtrees(new Deserializable().deserializable("1,2,3,4,null,2,4,null,null,4"));
        for (TreeNode node : nodes) {
            new CreateTree().printTree(node);
            System.out.println(node);
        }
    }

}
