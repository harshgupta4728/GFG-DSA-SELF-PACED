class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr) {
        // Map to store the first occurrence index of each element
        HashMap<Integer, Integer> elementIndexMap = new HashMap<>();
        // Set to keep track of repeating elements
        HashSet<Integer> repeatingElements = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (elementIndexMap.containsKey(arr[i])) {
                repeatingElements.add(arr[i]);
            } else {
                elementIndexMap.put(arr[i], i + 1); // Store 1-based index
            }
        }
        
        // Find the smallest index among the repeating elements
        int minIndex = Integer.MAX_VALUE;
        for (int element : repeatingElements) {
            minIndex = Math.min(minIndex, elementIndexMap.get(element));
        }
        
        return minIndex == Integer.MAX_VALUE ? -1 : minIndex;
    }
}
