class Solution {
    // Function for finding maximum AND value.
    public static int maxAND(int arr[], int N) {
        int result = 0;

        // Check each bit position from 31st to 0th
        for (int bit = 31; bit >= 0; bit--) {
            // Create a candidate with the current bit set
            int candidate = result | (1 << bit);

            // Check how many numbers have this candidate as a subset
            int count = countPairsWithCandidate(arr, N, candidate);

            // If we have at least 2 numbers with the current candidate bits set, update the result
            if (count >= 2) {
                result = candidate;
            }
        }

        return result;
    }

    // Helper function to count the number of elements in the array
    // that have the candidate bits set
    private static int countPairsWithCandidate(int arr[], int N, int candidate) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            if ((arr[i] & candidate) == candidate) {
                count++;
            }
        }
        return count;
    }
}
