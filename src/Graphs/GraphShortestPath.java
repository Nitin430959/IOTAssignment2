package Graphs;

import java.util.*;

public class GraphShortestPath {
    static void bfsShortestPath(List<List<Integer>> graph, int start, int end, int n) {
        boolean[] visited = new boolean[n];
        int[] parent = new int[n];

        Arrays.fill(parent, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();

            if (node == end) break;

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parent[neighbor] = node;
                    q.add(neighbor);
                }
            }
        }

        // Reconstruct path
        List<Integer> path = new ArrayList<>();
        int current = end;

        while (current != -1) {
            path.add(current);
            current = parent[current];
        }

        Collections.reverse(path);

        // Print result
        if (path.get(0) == start) {
            System.out.println("Shortest Path: " + path);
            System.out.println("Distance: " + (path.size() - 1));
        } else {
            System.out.println("No path found");
        }
    }

    public static void main(String[] args) {
        int n = 6;

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(3);
        graph.get(3).add(4);
        graph.get(4).add(5);

        int start = 0;
        int end = 5;

        bfsShortestPath(graph, start, end, n);
    }
}

