class Solution {
    // Function to multiply two matrices.
    static int[][] multiplyMatrix(int A[][], int B[][]) {
        int n1 = A.length;
        int m1 = A[0].length;
        int n2 = B.length;
        int m2 = B[0].length;

        // If the number of columns in A is not equal to the number of rows in B,
        // return an empty matrix.
        if (m1 != n2) {
            return new int[0][0];
        }

        int[][] result = new int[n1][m2];

        // Multiplying matrices A and B.
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                for (int k = 0; k < m1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }
}
