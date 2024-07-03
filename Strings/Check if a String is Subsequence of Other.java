class Solution {
    // Function to check if a string is subsequence of other string.
    public static boolean isSubSequence(String A, String B) {
        int i = 0; // pointer for A
        int j = 0; // pointer for B
        
        int m = A.length();
        int n = B.length();
        
        while (i < m && j < n) {
            if (A.charAt(i) == B.charAt(j)) {
                i++;
            }
            j++;
        }
        
        // If all characters of A are found in B in order
        return i == m;
    }
}
