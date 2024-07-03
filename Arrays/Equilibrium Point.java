class Solution {
    // arr: input array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[]) {
        // Your code here
        if (arr.length == 1) return 1;  // If there's only one element, return 1 (1-based index)
        
        long totalSum = 0;
        for (long num : arr) {
            totalSum += num;
        }
        
        long leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum) {
                return i + 1;  // Return the 1-based index
            }
            leftSum += arr[i];
        }
        
        return -1;  // No equilibrium point found
    }
}
