class Solution {
    // Function to arrange all letters of a string in lexicographical order
    // using Counting Sort.
    public static String countSort(String arr) {
        // Array to store frequency of characters from 'a' to 'z'.
        int[] count = new int[26];
        
        // Counting frequencies of characters in the input string.
        for (int i = 0; i < arr.length(); i++) {
            count[arr.charAt(i) - 'a']++;
        }
        
        // Building the sorted string from counting array.
        StringBuilder sorted = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                sorted.append((char) ('a' + i));
                count[i]--;
            }
        }
        
        // Converting StringBuilder to String and returning.
        return sorted.toString();
    }
}
