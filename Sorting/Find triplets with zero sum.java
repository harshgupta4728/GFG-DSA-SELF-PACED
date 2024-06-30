class Solution {
    // Function to find triplets with zero sum.
    public boolean findTriplets(int arr[], int n) {
        // Sort the array
        Arrays.sort(arr);

        // Iterate over the array
        for (int i = 0; i < n - 2; i++) {
            // Initialize two pointers
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                
                // Check if the sum of the triplet is zero
                if (sum == 0) {
                    return true;
                } else if (sum < 0) {
                    left++;  // Move the left pointer to the right
                } else {
                    right--;  // Move the right pointer to the left
                }
            }
        }

        // If no triplet with zero sum is found
        return false;
    }
}
