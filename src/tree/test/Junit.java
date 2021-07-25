package tree.test;

import org.junit.Test;
import tree.CreateTree;
import tree.Deserializable;
import tree.Serializable;
import tree.TreeNode;

import java.util.Arrays;

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
}
