class Solution {
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x) {
        int left = 0;
        int right = n - 1;
        int result = -1;  // To store the index of floor value
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if arr[mid] is less than or equal to x
            if (arr[mid] <= x) {
                result = mid;  // Update result to mid
                left = mid + 1;  // Ignore left half
            } else {
                right = mid - 1;  // Ignore right half
            }
        }
        
        return result;
    }
}
