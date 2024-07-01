class Solution {
    // Function to exchange the first column of a matrix with its last column.
    static void exchangeColumns(int matrix[][]) {
        int n1 = matrix.length;
        int m1 = matrix[0].length;

        for (int i = 0; i < n1; i++) {
            // Swap the first and last columns for row i
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][m1 - 1];
            matrix[i][m1 - 1] = temp;
        }
    }
}
