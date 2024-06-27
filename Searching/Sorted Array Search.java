class Solution{
    static int searchInSorted(int arr[], int N, int K) {
        int left = 0;
        int right = N - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;  // to avoid potential overflow
            
            // Check if K is present at mid
            if (arr[mid] == K) {
                return 1;
            }
            // If K is greater, ignore the left half
            else if (arr[mid] < K) {
                left = mid + 1;
            }
            // If K is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }
        // If we reach here, then the element was not present
        return -1;
    }
}
