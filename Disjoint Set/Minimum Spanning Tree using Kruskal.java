class DSU {
    // Find function with path compression
    private int find(int[] parent, int u) {
        if (parent[u] != u) {
            parent[u] = find(parent, parent[u]);
        }
        return parent[u];
    }

    // Union function with union by rank
    private void union(int[] parent, int[] rank, int u, int v) {
        int rootU = find(parent, u);
        int rootV = find(parent, v);
        if (rootU != rootV) {
            if (rank[rootU] > rank[rootV]) {
                parent[rootV] = rootU;
            } else if (rank[rootU] < rank[rootV]) {
                parent[rootU] = rootV;
            } else {
                parent[rootV] = rootU;
                rank[rootU]++;
            }
        }
    }

    // Function to find the minimum spanning tree value using Kruskal's algorithm
    static long kruskalDSU(ArrayList<Edge> adj, int n, int m) {
        // Step 1: Sort all the edges in non-decreasing order of their weight
        Collections.sort(adj, Comparator.comparingInt(e -> e.wt));

        // Step 2: Initialize DSU structures
        int[] parent = new int[n + 1];
        int[] rank = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        // Step 3: Process edges to form MST
        long mstWeight = 0;
        DSU dsu = new DSU();
        for (Edge edge : adj) {
            int u = edge.src;
            int v = edge.des;
            if (dsu.find(parent, u) != dsu.find(parent, v)) {
                dsu.union(parent, rank, u, v);
                mstWeight += edge.wt;
            }
        }

        return mstWeight;
    }
}
