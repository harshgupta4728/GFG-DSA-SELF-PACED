class Solution {

    static int search(int arr[], int n, int x) {
        // Loop through the array
        for (int i = 0; i < n; i++) {
            // Check if the current element is equal to x
            if (arr[i] == x) {
                return i; // Return the index of the first occurrence of x
            }
        }
        return -1; // If x is not found in the array, return -1
    }
}
