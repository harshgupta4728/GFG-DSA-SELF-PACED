import java.util.*;

class Solution {
    // Mapping of digits to their corresponding characters
    private static final String[] digitToChars = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };
    
    // Function to find list of all words possible by pressing given numbers.
    public static ArrayList<String> possibleWords(int[] a, int N) {
        ArrayList<String> result = new ArrayList<>();
        if (N == 0) return result; // Edge case if N is 0
        
        StringBuilder sb = new StringBuilder();
        generateWords(a, N, 0, sb, result);
        
        // Sort the result lexicographically
        Collections.sort(result);
        
        return result;
    }
    
    // Recursive function to generate all possible words
    private static void generateWords(int[] a, int N, int index, StringBuilder sb, ArrayList<String> result) {
        // Base case: if we have formed a word of length N, add it to the result
        if (sb.length() == N) {
            result.add(sb.toString());
            return;
        }
        
        // Get the current digit and its corresponding characters
        int digit = a[index];
        String chars = digitToChars[digit];
        
        // Iterate through each character and recurse
        for (int i = 0; i < chars.length(); i++) {
            sb.append(chars.charAt(i)); // Choose
            generateWords(a, N, index + 1, sb, result); // Explore
            sb.deleteCharAt(sb.length() - 1); // Unchoose (backtrack)
        }
    }
}
