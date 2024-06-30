class Solution {
    // Function to count inversions in the array.
    static long inversionCount(long arr[], int n) {
        long[] temp = new long[n];
        return mergeSortAndCount(arr, temp, 0, n - 1);
    }

    // Function to merge two halves and count inversions.
    static long mergeAndCount(long[] arr, long[] temp, int left, int mid, int right) {
        int i = left; // Starting index for left subarray
        int j = mid + 1; // Starting index for right subarray
        int k = left; // Starting index to be sorted
        long invCount = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid + 1) - i;
            }
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (i = left; i <= right; i++) arr[i] = temp[i];

        return invCount;
    }

    // Function to divide the array and count inversions.
    static long mergeSortAndCount(long[] arr, long[] temp, int left, int right) {
        long invCount = 0;
        if (left < right) {
            int mid = (left + right) / 2;

            invCount += mergeSortAndCount(arr, temp, left, mid);
            invCount += mergeSortAndCount(arr, temp, mid + 1, right);
            invCount += mergeAndCount(arr, temp, left, mid, right);
        }
        return invCount;
    }
}
