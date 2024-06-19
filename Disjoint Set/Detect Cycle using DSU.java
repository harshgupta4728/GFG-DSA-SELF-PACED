class Solution
{
    // Function to detect cycle using DSU in an undirected graph.
    public int detectCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        int[] parent = new int[V];
        int[] rank = new int[V];

        // Initialize the parent and rank arrays.
        for (int i = 0; i < V; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        // Traverse all edges.
        for (int u = 0; u < V; u++) {
            for (int v : adj.get(u)) {
                if (u < v) {  // Avoid processing the same edge twice.
                    if (!union(u, v, parent, rank)) {
                        return 1;  // Cycle detected.
                    }
                }
            }
        }

        return 0;  // No cycle detected.
    }

    // Function to find the parent of a node 'a' with path compression.
    private int find(int a, int[] parent) {
        if (parent[a] != a) {
            parent[a] = find(parent[a], parent);
        }
        return parent[a];
    }

    // Function to union two nodes 'a' and 'b' with union by rank.
    private boolean union(int a, int b, int[] parent, int[] rank) {
        int rootA = find(a, parent);
        int rootB = find(b, parent);

        if (rootA == rootB) {
            return false;  // Cycle detected.
        }

        if (rank[rootA] > rank[rootB]) {
            parent[rootB] = rootA;
        } else if (rank[rootA] < rank[rootB]) {
            parent[rootA] = rootB;
        } else {
            parent[rootB] = rootA;
            rank[rootA]++;
        }

        return true;  // No cycle detected.
    }
}
