class Solution {
    
    // Function to find minimum adjacent difference in a circular array.
    public static int minAdjDiff(int arr[], int n) {
        if (n <= 1) {
            return 0;
        }
        
        int minDiff = Integer.MAX_VALUE;
        
        // Calculate differences between adjacent elements
        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i+1]);
            minDiff = Math.min(minDiff, diff);
        }
        
        // Calculate circular difference (between last and first element)
        int circularDiff = Math.abs(arr[n-1] - arr[0]);
        minDiff = Math.min(minDiff, circularDiff);
        
        return minDiff;
    }
}
