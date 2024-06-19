import java.util.*;

class LexSort {
    // Function to return the lexicographically sorted power-set of the string.
    static ArrayList<String> powerSet(String s) {
        ArrayList<String> result = new ArrayList<>();
        generatePowerSet(s, 0, new StringBuilder(), result);
        Collections.sort(result); // Sorting lexicographically
        return result;
    }
    
    // Recursive function to generate subsets
    static void generatePowerSet(String s, int index, StringBuilder current, ArrayList<String> result) {
        // Base case: add current subset to result
        if (index == s.length()) {
            result.add(current.toString());
            return;
        }
        
        // Include current character and recurse
        current.append(s.charAt(index));
        generatePowerSet(s, index + 1, current, result);
        
        // Backtrack: exclude current character and recurse
        current.deleteCharAt(current.length() - 1);
        generatePowerSet(s, index + 1, current, result);
    }
}
