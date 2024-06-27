class Solution {
    // Function to count number of ones in the binary array
    // N: size of array
    // arr[]: input array
    public static int countOnes(int arr[], int N) {
        int left = 0;
        int right = N - 1;
        
        // Ensure to handle edge case where array contains all 1s
        if (arr[0] == 0) {
            return 0;
        }
        
        // Ensure to handle edge case where array contains all 0s
        if (arr[N - 1] == 1) {
            return N;
        }
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if this mid is the first 0
            if (arr[mid] == 0) {
                if (mid == 0 || arr[mid - 1] == 1) {
                    return mid; // Found the first 0
                }
                right = mid - 1; // Move to the left half
            } else {
                left = mid + 1; // Move to the right half
            }
        }
        
        // Fallback return value in case of unexpected behavior
        return 0;
    }
}
