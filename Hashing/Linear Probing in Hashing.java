class Solution {
    // Function to fill the array elements into a hash table using Linear Probing to handle collisions.
    int[] linearProbing(int hash_size, int arr[], int sizeOfArray) {
        // Initialize the hash table with -1
        int[] hashTable = new int[hash_size];
        Arrays.fill(hashTable, -1);

        // Traverse the given array
        for (int i = 0; i < sizeOfArray; i++) {
            int element = arr[i];
            int hashIndex = element % hash_size;

            // Find the next available position using linear probing
            int start = hashIndex;
            while (hashTable[hashIndex] != -1 && hashTable[hashIndex] != element) {
                // Move to the next index
                hashIndex = (hashIndex + 1) % hash_size;

                // Check if we have looped back to the start index
                if (hashIndex == start) {
                    // The hash table is full, so we drop the element
                    break;
                }
            }

            // If the position is empty, insert the element
            if (hashTable[hashIndex] == -1) {
                hashTable[hashIndex] = element;
            }
        }

        return hashTable;
    }
}
