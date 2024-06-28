class Solution {
    // Function to find the index of element x in the array if it is present.
    static int closer(int arr[], int n, long x) {
        int left = 0, right = n - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if the mid element is the target element
            if (arr[mid] == x) {
                return mid;
            }
            // Check if the element at mid-1 is the target (ensure mid-1 is in bounds)
            if (mid > left && arr[mid - 1] == x) {
                return mid - 1;
            }
            // Check if the element at mid+1 is the target (ensure mid+1 is in bounds)
            if (mid < right && arr[mid + 1] == x) {
                return mid + 1;
            }
            // Adjust the search range
            if (arr[mid] < x) {
                left = mid + 2; // Skip mid+1 as it was already checked
            } else {
                right = mid - 2; // Skip mid-1 as it was already checked
            }
        }
        
        // If the element is not found, return -1
        return -1;
    }
}
