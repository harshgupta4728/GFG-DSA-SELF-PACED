class Solution {
    // Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[], int n) {
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Perform the inner loop until the last unsorted element
            for (int j = 0; j < n - 1 - i; j++) {
                // If the current element is greater than the next element, swap them
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }
}
