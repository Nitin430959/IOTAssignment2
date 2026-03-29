package Graphs;

import java.util.ArrayList;

public class GraphComponents {
    static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, adj);
            }
        }
    }

    static int countComponents(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, visited, adj);
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int V = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Example graph
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(2).add(3);
        adj.get(3).add(2);

        // Node 4 is isolated

        int result = countComponents(V, adj);
        System.out.println("Connected Components: " + result);
    }
}

