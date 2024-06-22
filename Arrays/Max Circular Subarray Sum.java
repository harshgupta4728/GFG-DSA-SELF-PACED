class Solution {
    
    // Function to find maximum circular subarray sum.
    static int circularSubarraySum(int a[], int n) {
        // Edge case: when there's only one element
        if (n == 1) {
            return a[0];
        }
        
        // Step 1: Find the maximum subarray sum using Kadane's algorithm
        int max_kadane = kadane(a, n);
        
        // Step 2: Find the total sum of the array and the minimum subarray sum
        int total_sum = 0;
        for (int i = 0; i < n; i++) {
            total_sum += a[i];
            a[i] = -a[i]; // Invert the array elements to find the minimum subarray sum
        }
        
        // Step 3: Find the minimum subarray sum using Kadane's algorithm on inverted array
        int min_kadane = kadane(a, n);
        min_kadane = -min_kadane; // Revert the sign to get the original minimum sum
        
        // Step 4: Calculate the maximum circular subarray sum
        int max_circular = total_sum - min_kadane;
        
        // Step 5: Handle the case when all numbers are negative
        if (max_circular == 0) {
            return max_kadane;
        }
        
        // Return the maximum of the non-circular and circular subarray sums
        return Math.max(max_kadane, max_circular);
    }
    
    // Function to implement Kadane's algorithm
    private static int kadane(int[] a, int n) {
        int max_ending_here = a[0];
        int max_so_far = a[0];
        
        for (int i = 1; i < n; i++) {
            max_ending_here = Math.max(a[i], max_ending_here + a[i]);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        
        return max_so_far;
    }
}
