class Solution {

    public static void rearrange(long arr[], int n) {
        // Initialize maximum element
        long max_elem = arr[n-1] + 1;

        // Indexes for max and min elements
        int max_index = n - 1, min_index = 0;

        // Traverse the array elements
        for (int i = 0; i < n; i++) {
            // At even index, we place maximum elements
            if (i % 2 == 0) {
                arr[i] += (arr[max_index] % max_elem) * max_elem;
                max_index--;
            }
            // At odd index, we place minimum elements
            else {
                arr[i] += (arr[min_index] % max_elem) * max_elem;
                min_index++;
            }
        }

        // Obtain original values
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / max_elem;
        }
    }
}
