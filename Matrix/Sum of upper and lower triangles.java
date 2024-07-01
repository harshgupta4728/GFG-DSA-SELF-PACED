class Solution {
    // Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n) {
        int upperSum = 0;
        int lowerSum = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Elements in the upper triangle including the diagonal
                if (i <= j) {
                    upperSum += matrix[i][j];
                }
                // Elements in the lower triangle including the diagonal
                if (i >= j) {
                    lowerSum += matrix[i][j];
                }
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(upperSum);
        result.add(lowerSum);
        
        return result;
    }
}
