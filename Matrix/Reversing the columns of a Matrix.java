class Solution {
    // Function to reverse the columns of a matrix.
    static void reverseCol(int matrix[][]) {
        int n1 = matrix.length;
        int m1 = matrix[0].length;

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1 / 2; j++) {
                // Swap the elements
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][m1 - 1 - j];
                matrix[i][m1 - 1 - j] = temp;
            }
        }
    }
}
