class Solution {
    // Function to rearrange an array so that arr[i] becomes arr[arr[i]]
    // with O(1) extra space.
    static void arrange(long arr[], int n) {
        // First pass to encode both original and new values.
        for (int i = 0; i < n; i++) {
            // Encode arr[i] with the new value
            arr[i] += (arr[(int)arr[i]] % n) * n;
        }
        
        // Second pass to decode the new values.
        for (int i = 0; i < n; i++) {
            // Decode the new value from arr[i]
            arr[i] = arr[i] / n;
        }
    }
}
