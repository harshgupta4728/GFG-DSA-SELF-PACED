class GfG {
    // Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x) {
        int sLen = s.length();
        int xLen = x.length();
        
        // If target string is longer than the main string, return -1
        if (xLen > sLen) {
            return -1;
        }
        
        // Iterate through the main string
        for (int i = 0; i <= sLen - xLen; i++) {
            // Check if the substring of s starting at i matches x
            int j;
            for (j = 0; j < xLen; j++) {
                if (s.charAt(i + j) != x.charAt(j)) {
                    break;
                }
            }
            // If the substring matches x, return the starting index
            if (j == xLen) {
                return i;
            }
        }
        
        // If no match is found, return -1
        return -1;
    }
}
