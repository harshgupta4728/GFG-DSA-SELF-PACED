class Solution {
    // Function to return the count of non-repeated elements in the array.
    static long countNonRepeated(int arr[], int n) {
        // HashMap to store element frequency
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        // Populate frequency map
        for (int i = 0; i < n; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }
        
        // Count of non-repeated elements
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                count++;
            }
        }
        
        return count;
    }
}
