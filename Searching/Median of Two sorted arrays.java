class Solution
{
    // Function to find the median of the two arrays when they get merged.
    public static int findMedian(int arr[], int n, int brr[], int m)
    {
        // Ensure the first array is the smaller one
        if (n > m) {
            return findMedian(brr, m, arr, n);
        }
        
        int start = 0, end = n;
        int totalLength = n + m;
        int halfLength = (totalLength + 1) / 2;
        
        while (start <= end) {
            int partitionX = (start + end) / 2;
            int partitionY = halfLength - partitionX;
            
            int maxX = (partitionX == 0) ? Integer.MIN_VALUE : arr[partitionX - 1];
            int minX = (partitionX == n) ? Integer.MAX_VALUE : arr[partitionX];
            
            int maxY = (partitionY == 0) ? Integer.MIN_VALUE : brr[partitionY - 1];
            int minY = (partitionY == m) ? Integer.MAX_VALUE : brr[partitionY];
            
            if (maxX <= minY && maxY <= minX) {
                // Found the correct partition
                if (totalLength % 2 == 0) {
                    return (int) Math.floor((Math.max(maxX, maxY) + Math.min(minX, minY)) / 2.0);
                } else {
                    return Math.max(maxX, maxY);
                }
            } else if (maxX > minY) {
                // Move left in arr
                end = partitionX - 1;
            } else {
                // Move right in arr
                start = partitionX + 1;
            }
        }
        
        // If input arrays are not sorted properly, this line will be reached
        throw new IllegalArgumentException("Input arrays are not sorted properly.");
    }
}
