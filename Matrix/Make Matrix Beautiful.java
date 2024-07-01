class Solution {
    public static int findMinOperation(int N, int[][] matrix) {
        int[] rowSum = new int[N];
        int[] colSum = new int[N];
        int maxSum = 0;
        
        // Calculate sum of each row and column
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                rowSum[i] += matrix[i][j];
                colSum[j] += matrix[i][j];
            }
        }
        
        // Find the maximum sum of any row or column
        for (int i = 0; i < N; i++) {
            maxSum = Math.max(maxSum, rowSum[i]);
            maxSum = Math.max(maxSum, colSum[i]);
        }
        
        int operations = 0;
        
        // Calculate the total number of increments required
        for (int i = 0; i < N; i++) {
            operations += (maxSum - rowSum[i]);
        }
        
        return operations;
    }
}
