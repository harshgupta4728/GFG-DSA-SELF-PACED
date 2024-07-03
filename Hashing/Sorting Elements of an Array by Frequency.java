class Solution {
    // Function to sort the array according to frequency of elements.
    static ArrayList<Integer> sortByFreq(int arr[], int n) {
        // Frequency map to store the count of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // List to store the elements and their frequencies
        List<int[]> freqList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            freqList.add(new int[]{entry.getKey(), entry.getValue()});
        }

        // Sort the list by frequency (in descending order), then by element value (in ascending order)
        Collections.sort(freqList, (a, b) -> {
            if (a[1] == b[1]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(b[1], a[1]);
            }
        });

        // Create the result list and add elements according to their sorted order
        ArrayList<Integer> result = new ArrayList<>();
        for (int[] pair : freqList) {
            int element = pair[0];
            int frequency = pair[1];
            for (int i = 0; i < frequency; i++) {
                result.add(element);
            }
        }

        return result;
    }
}
