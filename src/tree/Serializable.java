package tree;

public class Serializable {
    String SEP = ",";
    String NULL = "#";

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.toString();
    }

    /**
     * StringBuilder 可以用于高效拼接字符串，所以也可以认为是一个列表，
     * 用 , 作为分隔符，
     * 用 # 表示空指针 null，
     * 调用完 traverse 函数后，
     * StringBuilder 中的字符串应该是 1,2,#,4,#,#,3,#,#,。
     *
     * @param root
     * @param sb
     */
    public void serialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append(NULL).append(SEP);
            return;
        }

        // preOrder traverse
        sb.append(root.val).append(SEP);
        serialize(root.left, sb);
        serialize(root.right, sb);
    }


}
