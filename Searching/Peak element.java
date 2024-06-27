class Solution
{
    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
    public int peakElement(int[] arr, int n)
    {
        int low = 0;
        int high = n - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Check if mid is peak
            if ((mid == 0 || arr[mid] >= arr[mid - 1]) &&
                (mid == n - 1 || arr[mid] >= arr[mid + 1])) {
                return mid;
            } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                // If left neighbor is greater, search left
                high = mid - 1;
            } else {
                // Otherwise, search right
                low = mid + 1;
            }
        }
        
        return -1; // This line will never be reached due to the problem guarantee
    }
}
