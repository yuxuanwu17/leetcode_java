package graph.test;

import graph.DFS;
import graph.Graph;
import org.junit.Test;

public class GraphTest {
    @Test
    public void DFSTest() {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("Following is Depth First Traversal (starting from vertex 2)");
        new DFS(g, 2);
    }
}
