package graph;

import java.util.LinkedList;

public class Graph {
    // vertex
    private final int V;

    // edge
    private int E;

    // adjacency matrix, an array storing the Queue
    private LinkedList[] adj;

    // construct the graph
    public Graph(int V) {
        this.V = V;
        this.E = 0;
        this.adj = new LinkedList[V];

        for (int i = 0; i < adj.length; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // return the number of vertex V
    public int V() {
        return V;
    }

    // return the number of edge E
    public int E() {
        return E;
    }

    public void addEdge(int v, int w) {
        // add w to queue adj[v], so vertex v would have w in their queue
        adj[v].add(w);

        // reversely add v to vertex w
        adj[w].add(v);
        E++;
    }

    // return all the vertex that are frontiers of vertex v
    public LinkedList<Integer> adj(int v) {
        return adj[v];
    }

}
