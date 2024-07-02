class Solution {
    // Function to insert elements of array in the hashTable avoiding collisions.
    public ArrayList<ArrayList<Integer>> separateChaining(int arr[], int n, int hashSize) {
        // Initialize the hash table with empty lists
        ArrayList<ArrayList<Integer>> hashTable = new ArrayList<>(hashSize);
        for (int i = 0; i < hashSize; i++) {
            hashTable.add(new ArrayList<>());
        }
        
        // Insert each element into the hash table
        for (int i = 0; i < n; i++) {
            int element = arr[i];
            int pos = element % hashSize;
            hashTable.get(pos).add(element);
        }
        
        return hashTable;
    }
}
