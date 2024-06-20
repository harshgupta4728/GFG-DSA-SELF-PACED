

class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public void frequencyCount(int[] arr, int N, int P) {
        // Step 1: Normalize values greater than N
        for (int i = 0; i < N; i++) {
            if (arr[i] > N) {
                arr[i] = 0; // Ignore values greater than N
            }
        }

        P = P + 1;

        // Step 2: Use elements as index and increment values at those indices
        for (int i = 0; i < N; i++) {
            if (arr[i] % P == 0) continue;
            arr[arr[i] % P - 1] += P;
        }

        // Step 3: Get the frequencies
        for (int i = 0; i < N; i++) {
            arr[i] /= P;
        }
    }
}
