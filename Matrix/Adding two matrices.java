class Solution {
    // Function to add two matrices.
    static int[][] sumMatrix(int A[][], int B[][]) {
        int n1 = A.length;
        int m1 = A[0].length;
        int n2 = B.length;
        int m2 = B[0].length;

        // If dimensions do not match, return an empty matrix.
        if (n1 != n2 || m1 != m2) {
            return new int[0][0];
        }

        int[][] result = new int[n1][m1];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
    }
}
