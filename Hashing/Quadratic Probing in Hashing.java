class Solution {
    // Function to fill the array elements into a hash table using Quadratic Probing to handle collisions.
    void quadraticProbing(int[] hash, int hashSize, int[] arr, int N) {
        // Initialize the hash table with -1
        Arrays.fill(hash, -1);

        // Traverse the given array
        for (int i = 0; i < N; i++) {
            int element = arr[i];
            int hashIndex = element % hashSize;
            int j = 0;

            // Find the next available position using quadratic probing
            while (hash[(hashIndex + j * j) % hashSize] != -1 && hash[(hashIndex + j * j) % hashSize] != element) {
                j++;
            }

            // If the position is empty, insert the element
            int finalIndex = (hashIndex + j * j) % hashSize;
            if (hash[finalIndex] == -1) {
                hash[finalIndex] = element;
            }
        }
    }
}
