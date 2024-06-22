class Solution {

    // arr: input array
    // n: size of array
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n) {
        // Initialize the maxSoFar and maxEndingHere with the first element of the array
        long maxSoFar = arr[0];
        long maxEndingHere = arr[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < n; i++) {
            // Update maxEndingHere to include the current element or start new from the current element
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            // Update maxSoFar if maxEndingHere is greater
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        // Return the maximum sum of the contiguous subarray
        return maxSoFar;
    }
}
