package union_find;

public class UF {
    // 记录连通分量
    private int count;
    // 记录x节点的parent是parent[x]
    private int[] parent;
    private int[] size;

    // 构造函数，n 为图的节点数
    public UF(int n) {
        // 一开始互不联通
        this.count = n;
        // 父节点指针最终指向自己
        parent = new int[n];
        size = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }
//    如果某两个节点被连通，则让其中的（任意）一个节点的根节点接到另一个节点的根节点上：

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) return;
        // 将两颗树合并为一颗

        // 小的树连在大的树上，达到平衡的目的
        if (size[rootP] > size[rootQ]) {
            parent[rootP] = rootQ;
            size[rootP] += size[rootQ];
        } else {
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }
        // 两个分量合并成一个
        count--;

    }

    //  返回某个节点的根节点
    private int find(int x) {
        // 根节点的parent[x] == x
        while (parent[x] != x) {
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }

    // 判断是否connected
    public boolean connected(int p, int q) {
        int rootP = find(q);
        int rootQ = find(q);
        return rootP == rootQ;
    }

    public int count() {
        return count;
    }
}
