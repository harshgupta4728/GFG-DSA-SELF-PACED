class LeftIndex { 

    static int leftIndex(int N, int arr[], int X) {
        int left = 0;
        int right = N - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == X) {
                result = mid;  // Update result to current mid
                right = mid - 1;  // Continue to search in the left half
            } else if (arr[mid] < X) {
                left = mid + 1;  // Ignore the left half
            } else {
                right = mid - 1;  // Ignore the right half
            }
        }
        
        return result;
    }
}
