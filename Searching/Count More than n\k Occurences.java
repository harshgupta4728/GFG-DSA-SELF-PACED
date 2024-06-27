class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) {
        // Calculate the threshold
        int threshold = n / k;
        
        // Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        // Traverse the array to fill the frequency map
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        // Count the number of elements with frequency greater than the threshold
        int count = 0;
        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) > threshold) {
                count++;
            }
        }
        
        return count;
    }
}
