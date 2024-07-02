class Solution {
    // Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr, int n) {
        // HashMap to store the cumulative sum and its frequency
        HashMap<Long, Integer> prefixSumMap = new HashMap<>();
        
        long prefixSum = 0; // Initialize the prefix sum
        long count = 0; // Initialize the count of subarrays
        
        // Initialize with prefix sum 0 and its count as 1
        prefixSumMap.put(0L, 1);
        
        // Traverse the array
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i]; // Update the prefix sum
            
            // If the prefix sum has been seen before, it means there are subarrays
            // ending at the current index which sum up to 0
            if (prefixSumMap.containsKey(prefixSum)) {
                count += prefixSumMap.get(prefixSum);
            }
            
            // Add/update the prefix sum in the map
            prefixSumMap.put(prefixSum, prefixSumMap.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count;
    }
}
