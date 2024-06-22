class Solution {
    // Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int n, int l[], int r[], int maxx) {
        int[] diff = new int[maxx + 2]; // Use maxx + 2 to handle range upto maxx + 1
        
        // Marking the difference array to reflect the ranges
        for (int i = 0; i < n; i++) {
            diff[l[i]]++;
            diff[r[i] + 1]--;
        }
        
        // Computing prefix sum
        int maxFreq = diff[1];
        int result = 1;
        for (int i = 2; i <= maxx; i++) {
            diff[i] += diff[i - 1];
            if (diff[i] > maxFreq) {
                maxFreq = diff[i];
                result = i;
            }
        }
        
        return result;
    }
}
