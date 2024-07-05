class Solution {
    // Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int n, String str) {
        // Count the number of '1's in the string
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '1') {
                count++;
            }
        }
        
        // If there are 'count' number of '1's, the number of substrings that start and end with '1' is given by count * (count - 1) / 2
        return (count * (count - 1)) / 2;
    }
}
