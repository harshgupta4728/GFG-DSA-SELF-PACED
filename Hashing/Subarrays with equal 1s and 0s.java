class Solution {
    // Function to count subarrays with equal number of 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n) {
        // Convert 0s to -1s in the array.
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            }
        }
        
        // Create a hashmap to store the prefix sums and their counts.
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int prefixSum = 0;
        int count = 0;
        
        // Initialize with prefix sum 0 and its count as 1.
        prefixSumMap.put(0, 1);
        
        // Traverse the array and calculate the prefix sums.
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            
            // If the prefix sum is already in the map, it means we found a subarray
            // with sum 0, hence increase the count by the number of times this
            // prefix sum has been seen so far.
            if (prefixSumMap.containsKey(prefixSum)) {
                count += prefixSumMap.get(prefixSum);
                prefixSumMap.put(prefixSum, prefixSumMap.get(prefixSum) + 1);
            } else {
                prefixSumMap.put(prefixSum, 1);
            }
        }
        
        return count;
    }
}
