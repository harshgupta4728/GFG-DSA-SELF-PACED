class Solution
{
    // Function to find the parent of a node 'a'
    private int find(int a, int par[]) {
        // Path compression: update the parent of 'a' to its root
        if (par[a] != a) {
            par[a] = find(par[a], par);
        }
        return par[a];
    }
    
    // Function to merge two nodes a and b
    public void union_(int a, int b, int par[], int rank[]) {
        int rootA = find(a, par);
        int rootB = find(b, par);
        
        // Union by rank: attach smaller rank tree under root of higher rank tree
        if (rootA != rootB) {
            if (rank[rootA] > rank[rootB]) {
                par[rootB] = rootA;
            } else if (rank[rootA] < rank[rootB]) {
                par[rootA] = rootB;
            } else {
                par[rootB] = rootA;
                rank[rootA]++;
            }
        }
    }

    // Function to check whether 2 nodes are connected or not
    public Boolean isConnected(int a, int b, int par[], int rank[]) {
        return find(a, par) == find(b, par);
    }
}
