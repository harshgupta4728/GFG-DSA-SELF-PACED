class Solution
{
    // Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high)
    {
        // If the array is not rotated at all
        if (arr[low] <= arr[high])
            return arr[low];
        
        // Binary search to find the minimum element
        while (low <= high) {
            // If the segment is already sorted, return the first element
            if (arr[low] <= arr[high])
                return arr[low];
            
            int mid = low + (high - low) / 2;
            int next = (mid + 1) % arr.length;
            int prev = (mid + arr.length - 1) % arr.length;
            
            // Check if mid is the minimum element
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev])
                return arr[mid];
            // Decide which half to continue the search
            else if (arr[mid] <= arr[high])
                high = mid - 1;
            else if (arr[mid] >= arr[low])
                low = mid + 1;
        }
        
        return -1; // This line will never be reached due to the guaranteed presence of the minimum element
    }
}
