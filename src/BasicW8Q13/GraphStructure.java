package BasicW8Q13;

import java.util.*;

class GraphStructure {

    ArrayList<ArrayList<Integer>> graph;
    int a;

    GraphStructure(int nodes) {
        a = nodes;
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < a; i++) {
            graph.add(new ArrayList<Integer>());
        }
    }

    void addEdge(int v, int u) {
        graph.get(v).add(u);
        graph.get(u).add(v);
    }

    void printGraph() {
        for (int i = 0; i < a; i++) {
            System.out.print("Node " + i);
            for (int x : graph.get(i)) {
                System.out.print(" -> " + x);
            }
            System.out.println();
        }
    }

    void dfsUtil(int node, boolean visited[]) {
        visited[node] = true;
        System.out.print(node + " ");
        for (int x : graph.get(node)) {
            if (visited[x] == false) {
                dfsUtil(x, visited);
            }
        }
    }

    void DFS(int start) {
        boolean visited[] = new boolean[a];
        System.out.println("DFS Traversal");
        dfsUtil(start, visited);
    }

    void BFS(int start) {
        boolean visited[] = new boolean[a];
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        System.out.println("BFS Traversal");
        visited[start] = true;
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");
            for (int x : graph.get(node)) {
                if (!visited[x]) {
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
    }
}
