class Geeks {
    // Function to check if there is a pair with the given sum in the array.
    public static int sumExists(int arr[], int N, int sum) {
        // HashSet to store elements seen so far
        HashSet<Integer> set = new HashSet<>();
        
        // Traverse through the array
        for (int i = 0; i < N; i++) {
            int required = sum - arr[i];
            
            // If the required element is already in the set, we found the pair
            if (set.contains(required)) {
                return 1;
            }
            
            // Otherwise, add the current element to the set
            set.add(arr[i]);
        }
        
        // If no pair is found, return 0
        return 0;
    }
}
