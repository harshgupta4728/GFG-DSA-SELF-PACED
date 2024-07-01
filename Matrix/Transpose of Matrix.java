class Solution {
    public void transpose(int n, int a[][]) {
        // Transposing the matrix in-place
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swapping element at (i, j) with element at (j, i)
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }
}
