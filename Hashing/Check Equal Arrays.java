class Solution {
    // Function to check if two arrays are equal or not.
    public static boolean check(int[] arr1, int[] arr2) {
        // Check if the lengths of the arrays are different
        if (arr1.length != arr2.length) {
            return false;
        }

        // Create frequency maps for both arrays
        Map<Integer, Integer> frequencyMap1 = new HashMap<>();
        Map<Integer, Integer> frequencyMap2 = new HashMap<>();

        // Populate the frequency map for arr1
        for (int num : arr1) {
            frequencyMap1.put(num, frequencyMap1.getOrDefault(num, 0) + 1);
        }

        // Populate the frequency map for arr2
        for (int num : arr2) {
            frequencyMap2.put(num, frequencyMap2.getOrDefault(num, 0) + 1);
        }

        // Check if both frequency maps are equal
        return frequencyMap1.equals(frequencyMap2);
    }
}
