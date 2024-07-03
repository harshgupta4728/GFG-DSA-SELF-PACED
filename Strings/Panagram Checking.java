class Solution {
    // Function to check if a string is Pangram or not.
    public static boolean checkPangram(String s) {
        // HashSet to store characters encountered
        HashSet<Character> set = new HashSet<>();
        
        // Iterate through each character in the string
        for (char ch : s.toCharArray()) {
            // Convert character to lowercase
            char lowerCh = Character.toLowerCase(ch);
            
            // Add to set if it's an alphabet character
            if (lowerCh >= 'a' && lowerCh <= 'z') {
                set.add(lowerCh);
            }
            
            // Early return if all letters are found
            if (set.size() == 26) {
                return true;
            }
        }
        
        // If we finish iterating and size of set is 26, it's a Pangram
        return set.size() == 26;
    }
}
