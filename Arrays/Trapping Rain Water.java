class Solution {
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        if (n <= 2) {
            return 0; // Not enough blocks to trap water
        }
        
        // Arrays to store the maximum height to the left and right of each block
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        // Initialize the first leftMax value
        leftMax[0] = arr[0];
        // Fill the leftMax array
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }
        
        // Initialize the last rightMax value
        rightMax[n - 1] = arr[n - 1];
        // Fill the rightMax array
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }
        
        // Calculate the total trapped water
        long totalWater = 0;
        for (int i = 0; i < n; i++) {
            totalWater += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }
        
        return totalWater;
    } 
}
