package Graphs;

import java.util.LinkedList;

public class GraphDFS {


    private int vertices;
    private LinkedList<Integer>[] adjList;

    GraphDFS(int v) {
        vertices = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adjList[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    void DFS(int start) {
        boolean[] visited = new boolean[vertices];
        dfsUtil(start, visited);
    }

    void dfsUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int n : adjList[v]) {
            if (!visited[n])
                dfsUtil(n, visited);
        }
    }

    public static void main(String[] args) {
        GraphDFS g = new GraphDFS(6);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);

        System.out.println("DFS Traversal:");
        g.DFS(0);
    }
}

