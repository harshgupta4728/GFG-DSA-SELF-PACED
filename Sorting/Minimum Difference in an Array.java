class Solution {
    // Function to find minimum difference between any pair of elements in an array.
    public static int MinimumDifference(int arr[], int n) {
        // Sort the array
        Arrays.sort(arr);
        
        // Initialize minimum difference to a large value
        int minDiff = Integer.MAX_VALUE;
        
        // Traverse the array and find minimum difference between consecutive elements
        for (int i = 1; i < n; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        
        // Return the minimum difference found
        return minDiff;
    }
}
