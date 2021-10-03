package graph;

public class DFS {
    public boolean[] visited;
    private int count;

    // creat the DFS object
    public DFS(Graph G, int s) {
        visited = new boolean[G.V()];
        dfs(G, s);
    }

    // use DFS to find all the adjacent point in graph G
    public void dfs(Graph g, int v) {
        // mark vertex v as visited
        visited[v] = true;
        System.out.println(v);

        // Iterate through all the neighbor, obtain each vertex w
        for (Integer w : g.adj(v)) {
            if (!visited[w]) dfs(g, w);
        }
        count++;
    }

    // check whether w and s are connected
    public boolean visited(int w) {
        return visited[w];
    }

    // obtain the number of vertex that is connected to vertex s
    public int count() {
        return count;
    }

}
