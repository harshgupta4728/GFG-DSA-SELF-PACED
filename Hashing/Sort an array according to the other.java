class Solution {
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]

    // Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M) {
        // Your code here
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : A1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        // Add elements from A2 in the order they appear
        for (int num : A2) {
            if (countMap.containsKey(num)) {
                int count = countMap.get(num);
                for (int i = 0; i < count; i++) {
                    result.add(num);
                }
                countMap.remove(num);
            }
        }

        // Add remaining elements sorted
        List<Integer> remaining = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                remaining.add(entry.getKey());
            }
        }
        Collections.sort(remaining);
        result.addAll(remaining);

        // Convert result list back to array
        int[] sortedArray = new int[N];
        for (int i = 0; i < N; i++) {
            sortedArray[i] = result.get(i);
        }
        return sortedArray;
    }
}
