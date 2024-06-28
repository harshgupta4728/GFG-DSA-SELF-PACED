class Geeks {
    public static void booleanMatrix(int mat[][], int m, int n) {
        boolean[] fillRow = new boolean[m]; // to keep track of which rows need to be filled with 1s
        
        // Step 1: Identify rows with at least one '1'
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    fillRow[i] = true;
                    break; // no need to check further in this row
                }
            }
        }
        
        // Step 2: Modify the matrix accordingly
        for (int i = 0; i < m; i++) {
            if (fillRow[i]) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = 1;
                }
            }
        }
    }
}
