class Solution {
    // Function to return non-repeated elements in the array.
    static ArrayList<Integer> printNonRepeated(int arr[], int n) {
        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create an ArrayList to store non-repeated elements
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (frequencyMap.get(num) == 1) {
                result.add(num);
            }
        }

        return result;
    }
}
