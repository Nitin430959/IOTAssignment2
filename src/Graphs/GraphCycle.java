package Graphs;

import java.util.ArrayList;

public class GraphCycle {
    static boolean dfsUndirected(int node, int parent, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (dfsUndirected(neighbor, node, visited, adj))
                    return true;
            } else if (neighbor != parent) {
                return true; // cycle found
            }
        }
        return false;
    }

    static boolean hasCycleUndirected(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfsUndirected(i, -1, visited, adj))
                    return true;
            }
        }
        return false;
    }

    // 🔹 DIRECTED GRAPH (DFS + Recursion Stack)
    static boolean dfsDirected(int node, boolean[] visited, boolean[] recStack, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        recStack[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (dfsDirected(neighbor, visited, recStack, adj))
                    return true;
            } else if (recStack[neighbor]) {
                return true; // cycle found
            }
        }

        recStack[node] = false;
        return false;
    }

    static boolean hasCycleDirected(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfsDirected(i, visited, recStack, adj))
                    return true;
            }
        }
        return false;
    }

    // 🔹 MAIN FUNCTION
    public static void main(String[] args) {

        // ===== UNDIRECTED GRAPH =====
        int V1 = 5;
        ArrayList<ArrayList<Integer>> undirected = new ArrayList<>();

        for (int i = 0; i < V1; i++) {
            undirected.add(new ArrayList<>());
        }

        // edges
        undirected.get(0).add(1);
        undirected.get(1).add(0);

        undirected.get(1).add(2);
        undirected.get(2).add(1);

        undirected.get(2).add(3);
        undirected.get(3).add(2);

        undirected.get(3).add(4);
        undirected.get(4).add(3);

        undirected.get(4).add(1); // cycle
        undirected.get(1).add(4);

        if (hasCycleUndirected(V1, undirected)) {
            System.out.println("Undirected Graph: Cycle detected");
        } else {
            System.out.println("Undirected Graph: No cycle");
        }

        // ===== DIRECTED GRAPH =====
        int V2 = 4;
        ArrayList<ArrayList<Integer>> directed = new ArrayList<>();

        for (int i = 0; i < V2; i++) {
            directed.add(new ArrayList<>());
        }

        // edges
        directed.get(0).add(1);
        directed.get(1).add(2);
        directed.get(2).add(3);
        directed.get(3).add(1); // cycle

        if (hasCycleDirected(V2, directed)) {
            System.out.println("Directed Graph: Cycle detected");
        } else {
            System.out.println("Directed Graph: No cycle");
        }
    }
}



