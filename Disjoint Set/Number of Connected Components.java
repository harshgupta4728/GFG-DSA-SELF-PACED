class Solution
{
    // Function to merge two nodes a and b.
    static void unionNodes(int a, int b, int arr[], int rank1[], int n) 
    { 
        int rootA = find(a, arr);
        int rootB = find(b, arr);

        if (rootA != rootB) {
            if (rank1[rootA] > rank1[rootB]) {
                arr[rootB] = rootA;
            } else if (rank1[rootA] < rank1[rootB]) {
                arr[rootA] = rootB;
            } else {
                arr[rootB] = rootA;
                rank1[rootA]++;
            }
        }
    }

    // Helper function to find the root of a node with path compression.
    static int find(int a, int arr[]) {
        if (arr[a] != a) {
            arr[a] = find(arr[a], arr); // Path compression
        }
        return arr[a];
    }

    // Function to determine the number of connected components.
    static int findNumberOfConnectedComponents(int n, int arr[], int rank1[]) 
    {
        Set<Integer> uniqueRoots = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            uniqueRoots.add(find(i, arr));
        }
        return uniqueRoots.size();
    }
}
