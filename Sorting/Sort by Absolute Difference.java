
class Solution {
    // Function to sort the array according to difference with given number.
    static void sortABS(List<Integer> arr, int n, int k) {
        Collections.sort(arr, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                // Calculate absolute differences with k
                int diff1 = Math.abs(a - k);
                int diff2 = Math.abs(b - k);
                // If differences are equal, maintain original order
                if (diff1 == diff2) {
                    return 0;
                } else {
                    // Otherwise, compare based on absolute differences
                    return diff1 - diff2;
                }
            }
        });
    }
}
