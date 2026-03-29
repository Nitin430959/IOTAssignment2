package Graphs;

import java.util.ArrayList;

public class Graph1 {
    int V;
    ArrayList<ArrayList<Integer>> adj;

    Graph1(int V) {
        this.V = V;
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // remove this line for directed graph
    }

    void printNeighbors(int node) {
        System.out.println("Neighbors of node " + node + ":");

        for (int neighbor : adj.get(node)) {
            System.out.print(neighbor + " ");
        }
    }

    public static void main(String[] args) {
        Graph1 g = new Graph1(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);

        g.printNeighbors(0);
    }
}

