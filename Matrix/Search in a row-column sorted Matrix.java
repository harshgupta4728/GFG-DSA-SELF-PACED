class Solution { 
    // Function to search a given number in row-column sorted matrix.
    static boolean search(int matrix[][], int n, int m, int x) {  
        // Start from the top-right corner
        int i = 0;
        int j = m - 1;
        
        while (i < n && j >= 0) {
            if (matrix[i][j] == x) {
                return true; // Element found
            } else if (matrix[i][j] > x) {
                j--; // Move left
            } else {
                i++; // Move down
            }
        }
        return false; // Element not found
    } 
}
