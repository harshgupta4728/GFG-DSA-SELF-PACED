class Solution {
    static final int MOD = 1000000007;
    
    // Function to find lexicographic rank of a string.
    static int findRank(String S) {
        int n = S.length();
        
        // Check for repeated characters
        if (hasRepeatedCharacters(S)) {
            return 0;
        }
        
        // Precompute factorials up to n
        int[] factorials = new int[n + 1];
        computeFactorials(factorials, n);
        
        // Compute rank
        int rank = 1; // Start rank from 1
        for (int i = 0; i < n; i++) {
            int smallerCharsCount = countSmallerCharacters(S, i);
            rank = (rank + smallerCharsCount * factorials[n - i - 1]) % MOD;
        }
        
        return rank;
    }
    
    static boolean hasRepeatedCharacters(String S) {
        Set<Character> charSet = new HashSet<>();
        for (char c : S.toCharArray()) {
            if (charSet.contains(c)) {
                return true;
            }
            charSet.add(c);
        }
        return false;
    }
    
    static void computeFactorials(int[] factorials, int n) {
        factorials[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorials[i] = (factorials[i - 1] * i) % MOD;
        }
    }
    
    static int countSmallerCharacters(String S, int index) {
        char currentChar = S.charAt(index);
        int count = 0;
        for (int i = index + 1; i < S.length(); i++) {
            if (S.charAt(i) < currentChar) {
                count++;
            }
        }
        return count;
    }
}
