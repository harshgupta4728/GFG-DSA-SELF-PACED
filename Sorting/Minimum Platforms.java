
class Solution {
    // Function to find the minimum number of platforms required at the railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n) {
        // Sort the arrival and departure arrays
        Arrays.sort(arr);
        Arrays.sort(dep);

        // Platforms needed at a time
        int platformsNeeded = 1;
        int maxPlatforms = 1;

        // Pointers for arrival and departure arrays
        int i = 1, j = 0;

        // Iterate through all the trains
        while (i < n && j < n) {
            // If next event is arrival, increment count of platforms needed
            if (arr[i] <= dep[j]) {
                platformsNeeded++;
                i++;
            } 
            // If next event is departure, decrement count of platforms needed
            else {
                platformsNeeded--;
                j++;
            }
            // Update maxPlatforms if needed
            maxPlatforms = Math.max(maxPlatforms, platformsNeeded);
        }
        return maxPlatforms;
    }
}
