class Solution {
    // Function to compute the determinant of a matrix.
    static int determinantOfMatrix(int matrix[][], int n) {
        // Base case: if the matrix is 1x1, return the single element.
        if (n == 1) {
            return matrix[0][0];
        }
        
        // Base case: if the matrix is 2x2, return the determinant.
        if (n == 2) {
            return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        }
        
        int determinant = 0;
        
        // Iterate over each element in the first row.
        for (int col = 0; col < n; col++) {
            // Compute the minor matrix by excluding the first row and the current column.
            int[][] minor = getMinor(matrix, 0, col, n);
            // Compute the determinant of the minor matrix recursively.
            int minorDet = determinantOfMatrix(minor, n - 1);
            // Add or subtract the minor determinant to the total determinant.
            determinant += matrix[0][col] * minorDet * (col % 2 == 0 ? 1 : -1);
        }
        
        return determinant;
    }
    
    // Function to compute the minor matrix by excluding a specific row and column.
    static int[][] getMinor(int[][] matrix, int row, int col, int n) {
        int[][] minor = new int[n - 1][n - 1];
        int minorRow = 0, minorCol = 0;
        
        for (int i = 0; i < n; i++) {
            if (i == row) continue;
            minorCol = 0;
            for (int j = 0; j < n; j++) {
                if (j == col) continue;
                minor[minorRow][minorCol] = matrix[i][j];
                minorCol++;
            }
            minorRow++;
        }
        
        return minor;
    }
}
