class StrongestNeighbour {
    
    // Function to find maximum for every adjacent pair in the array.
    static void maximumAdjacent(int sizeOfArray, int arr[]) {
        // Using StringBuilder for fast output
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < sizeOfArray - 1; i++) {
            // Finding the maximum of adjacent pairs
            int maxAdjacent = Math.max(arr[i], arr[i + 1]);
            // Appending the result to the StringBuilder
            result.append(maxAdjacent).append(" ");
        }
        
        // Printing the final result
        System.out.print(result.toString().trim());
    }
}
