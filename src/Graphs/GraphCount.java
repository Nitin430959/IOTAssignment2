package Graphs;

import java.util.ArrayList;

public class GraphCount {
    public static void main(String[] args) {
        int V = 4;

        // Adjacency List
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges (Undirected)
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);

        // Count vertices
        int vertices = adj.size();

        // Count edges
        int edgeCount = 0;
        for (int i = 0; i < V; i++) {
            edgeCount += adj.get(i).size();
        }

        // For undirected graph divide by 2
        edgeCount = edgeCount / 2;

        System.out.println("Vertices: " + vertices);
        System.out.println("Edges: " + edgeCount);
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // for undirected graph
    }
}

