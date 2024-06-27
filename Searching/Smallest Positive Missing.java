class Solution {
    // Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size) {
        // Step 1: Segregate positive and non-positive numbers
        int shift = segregate(arr, size);
        int[] arr2 = new int[size - shift];
        int j = 0;
        for (int i = shift; i < size; i++) {
            arr2[j] = arr[i];
            j++;
        }

        // Step 2: Use index as a hash to mark presence of elements
        int n = arr2.length;
        for (int i = 0; i < n; i++) {
            int x = Math.abs(arr2[i]);
            if (x - 1 < n && arr2[x - 1] > 0) {
                arr2[x - 1] = -arr2[x - 1];
            }
        }

        // Step 3: Find the first positive number's index
        for (int i = 0; i < n; i++) {
            if (arr2[i] > 0) {
                return i + 1;
            }
        }

        // If all indices are marked, the missing number is n + 1
        return n + 1;
    }

    // Utility function that segregates positive and non-positive numbers
    static int segregate(int arr[], int size) {
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] <= 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return j;
    }
}
