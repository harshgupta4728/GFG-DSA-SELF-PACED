class Geeks {
    public static boolean pairExists(int arr[], int n, int c) {
        // Create a hash set to store the elements
        HashSet<Integer> set = new HashSet<>();
        
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Check if the required pair exists
            if (set.contains(c ^ arr[i])) {
                return true;
            }
            // Add the current element to the set
            set.add(arr[i]);
        }
        // If no pair is found, return false
        return false;
    }
}
