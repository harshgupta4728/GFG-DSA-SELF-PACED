class Solution {
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int arr[], int n) {
        // Edge case: if the array size is less than 2, no valid (i, j) pair exists
        if (n == 1) {
            return 0;
        }

        // Create leftMin and rightMax arrays
        int[] leftMin = new int[n];
        int[] rightMax = new int[n];
        
        // Fill leftMin array
        leftMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(arr[i], leftMin[i - 1]);
        }
        
        // Fill rightMax array
        rightMax[n - 1] = arr[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            rightMax[j] = Math.max(arr[j], rightMax[j + 1]);
        }
        
        // Find the maximum difference j - i
        int i = 0, j = 0, maxDiff = -1;
        while (j < n && i < n) {
            if (leftMin[i] <= rightMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }
        
        return maxDiff;
    }
}
