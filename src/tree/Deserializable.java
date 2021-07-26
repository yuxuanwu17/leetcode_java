package tree;


import java.util.LinkedList;

public class Deserializable {
    String SEP = ",";
    String NULL = "null";


    public TreeNode deserializable(String data) {
        LinkedList<String> nodes = new LinkedList<>();
        for (String s : data.split(SEP)) {
            nodes.addLast(s);
        }
        return deserializable(nodes);
    }

    public TreeNode deserializable(LinkedList<String> nodes) {
        if (nodes.isEmpty()) return null;
        String first = nodes.removeFirst();
        if (first.equals(NULL)) return null;
        TreeNode root = new TreeNode(Integer.parseInt(first));

        root.left = deserializable(nodes);
        root.right = deserializable(nodes);

        return root;
    }

}
