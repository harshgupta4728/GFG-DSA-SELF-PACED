class Solution {

    // arr: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        if (n == 1) {
            return 1; // If there's only one element, it's the equilibrium point.
        }

        long totalSum = 0;
        for (long num : arr) {
            totalSum += num;
        }

        long leftSum = 0;
        for (int i = 0; i < n; i++) {
            // totalSum - arr[i] gives us the sum of elements after the current index.
            if (leftSum == totalSum - leftSum - arr[i]) {
                return i + 1; // Return 1-based index
            }
            leftSum += arr[i];
        }

        return -1; // No equilibrium point found
    }
}
