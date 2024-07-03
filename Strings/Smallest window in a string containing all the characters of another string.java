class Solution {
    public String smallestWindow(String s, String p) {
        if (s == null || p == null || s.length() == 0 || p.length() == 0)
            return "";

        // Frequency arrays for characters in P and current window in S
        int[] countP = new int[256];
        int[] countS = new int[256];

        // Fill countP with characters and their frequencies
        for (char c : p.toCharArray()) {
            countP[c]++;
        }

        int left = 0, right = 0;
        int required = p.length(); // Number of characters in P
        int minLength = Integer.MAX_VALUE;
        int minStart = 0;
        boolean found = false;

        // Sliding window approach
        while (right < s.length()) {
            char c = s.charAt(right);
            countS[c]++;

            // Check if the current character forms a part of the desired window
            if (countP[c] > 0 && countS[c] <= countP[c]) {
                required--;
            }

            // Try to minimize the window by advancing the left pointer
            while (required == 0) {
                found = true;
                // Update the smallest window found so far
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minStart = left;
                }

                // Remove s[left] from the current window
                char leftChar = s.charAt(left);
                countS[leftChar]--;

                // If removing s[left] makes the window invalid for P, increment required
                if (countP[leftChar] > 0 && countS[leftChar] < countP[leftChar]) {
                    required++;
                }

                // Move left pointer to the right to shrink the window
                left++;
            }

            // Move right pointer to expand the window
            right++;
        }

        return found ? s.substring(minStart, minStart + minLength) : "-1";
    }
}
