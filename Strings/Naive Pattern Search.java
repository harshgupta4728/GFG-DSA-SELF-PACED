class Solution {
    // Function to check if the given pattern exists in the given string or not.
    static boolean search(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();
        
        // Slide the pattern over the text one by one
        for (int i = 0; i <= N - M; i++) {
            int j;
            // For the current index i, check for the pattern match
            for (j = 0; j < M; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }
            // If the pattern matches at current index i
            if (j == M) {
                return true;
            }
        }
        return false;
    }
}
