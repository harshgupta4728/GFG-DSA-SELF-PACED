class Solution {
    // Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // Traverse the array in chunks of size k
        for (int start = 0; start < n; start += k) {
            // Determine the end of the current chunk
            int end = Math.min(start + k - 1, n - 1);
            // Reverse the elements in the current chunk
            reverse(arr, start, end);
        }
    }
    
    // Helper function to reverse elements from start to end indices in the list
    void reverse(ArrayList<Integer> arr, int start, int end) {
        while (start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }
}
