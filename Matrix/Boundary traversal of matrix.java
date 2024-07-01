class Solution {
    // Function to return list of integers that form the boundary 
    // traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // Handle the edge cases where matrix has only one row or one column
        if (n == 1) {
            for (int j = 0; j < m; j++) {
                result.add(matrix[0][j]);
            }
            return result;
        }
        if (m == 1) {
            for (int i = 0; i < n; i++) {
                result.add(matrix[i][0]);
            }
            return result;
        }
        
        // Traverse the top row from left to right
        for (int j = 0; j < m; j++) {
            result.add(matrix[0][j]);
        }
        
        // Traverse the right column from top to bottom
        for (int i = 1; i < n; i++) {
            result.add(matrix[i][m - 1]);
        }
        
        // Traverse the bottom row from right to left
        for (int j = m - 2; j >= 0; j--) {
            result.add(matrix[n - 1][j]);
        }
        
        // Traverse the left column from bottom to top
        for (int i = n - 2; i > 0; i--) {
            result.add(matrix[i][0]);
        }
        
        return result;
    }
}
