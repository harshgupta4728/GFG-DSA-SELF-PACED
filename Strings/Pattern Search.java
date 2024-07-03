class Solution {
    // Function to check if the given pattern exists in the given string or not.
    static boolean search(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();

        // Edge case: empty pattern
        if (M == 0) return true;
        
        // Step 1: Build LPS array
        int[] lps = computeLPSArray(pat);

        // Step 2: Perform pattern matching
        int i = 0;  // index for txt[]
        int j = 0;  // index for pat[]
        while (i < N) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }
            if (j == M) {
                // Pattern found, return true
                return true;
            } else if (i < N && pat.charAt(j) != txt.charAt(i)) {
                // Mismatch after j matches
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        // Pattern not found
        return false;
    }

    // Helper function to compute LPS array
    private static int[] computeLPSArray(String pat) {
        int M = pat.length();
        int[] lps = new int[M];
        int len = 0;  // length of the previous longest prefix suffix
        int i = 1;

        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {  // (pat[i] != pat[len])
                if (len != 0) {
                    len = lps[len - 1];
                } else {  // if (len == 0)
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
