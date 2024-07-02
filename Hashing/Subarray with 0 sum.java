class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n) {
        // HashMap to store prefix sums and their indices
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        
        // Initialize prefix sum and add a prefix sum of 0 at index -1
        int prefixSum = 0;
        prefixSumMap.put(0, -1);
        
        // Traverse the array
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            
            // If prefix sum is already in the map, subarray with 0 sum found
            if (prefixSumMap.containsKey(prefixSum) || prefixSum == 0) {
                return true;
            }
            
            // Store the prefix sum and its index in the map
            prefixSumMap.put(prefixSum, i);
        }
        
        // If no subarray with 0 sum is found, return false
        return false;
    }
}
