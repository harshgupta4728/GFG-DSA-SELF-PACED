class Solution
{
    // Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int n, int sum)
    {
        // HashMap to store the cumulative sum and its frequency
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        
        int prefixSum = 0; // Initialize the prefix sum
        int count = 0; // Initialize the count of subarrays
        
        // Initialize with prefix sum 0 and its count as 1
        prefixSumMap.put(0, 1);
        
        // Traverse the array
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i]; // Update the prefix sum
            
            // If the (prefixSum - sum) exists in the map, then there are subarrays
            // which sum up to the given sum
            if (prefixSumMap.containsKey(prefixSum - sum)) {
                count += prefixSumMap.get(prefixSum - sum);
            }
            
            // Add/update the prefix sum in the map
            prefixSumMap.put(prefixSum, prefixSumMap.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count;
    }
}
