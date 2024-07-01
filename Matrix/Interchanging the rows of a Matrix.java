class Solution {
    // Function to interchange the rows of a matrix.
    static void interchangeRows(int matrix[][]) {
        int n1 = matrix.length;
        int m1 = matrix[0].length;
        
        for (int i = 0; i < n1 / 2; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[n1 - 1 - i];
            matrix[n1 - 1 - i] = temp;
        }
    }
}
