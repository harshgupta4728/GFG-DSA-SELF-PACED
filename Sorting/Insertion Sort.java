class Solution {
    static void insert(int arr[], int i) {
        // Store the value to be positioned
        int key = arr[i];
        // Initialize j to the previous element's index
        int j = i - 1;

        // Move elements of arr[0..i-1], that are greater than key, to one position ahead
        // of their current position
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }

    // Function to sort the array using insertion sort algorithm.
    public void insertionSort(int arr[], int n) {
        // Iterate over the array elements starting from the second element
        for (int i = 1; i < n; i++) {
            // Insert the current element in its correct position
            insert(arr, i);
        }
    }
}
