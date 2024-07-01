class Solution {
    // Function to modify the matrix such that if a matrix cell matrix[i][j]
    // is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean rowFlag = false;
        boolean colFlag = false;
        
        // Step 1: Determine if the first row or first column needs to be marked
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 1) {
                colFlag = true;
                break;
            }
        }
        
        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 1) {
                rowFlag = true;
                break;
            }
        }
        
        // Step 2: Use the first row and first column to mark the rest of the matrix
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][0] = 1;
                    matrix[0][j] = 1;
                }
            }
        }
        
        // Step 3: Update the cells based on the marks in the first row and first column
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 1 || matrix[0][j] == 1) {
                    matrix[i][j] = 1;
                }
            }
        }
        
        // Step 4: Update the first row if needed
        if (rowFlag) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 1;
            }
        }
        
        // Step 5: Update the first column if needed
        if (colFlag) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 1;
            }
        }
    }
}
