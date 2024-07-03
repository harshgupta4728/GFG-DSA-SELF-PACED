class Solution {
    // Function to perform case-specific sorting of strings.
    public static String caseSort(String str) {
        // Arrays/lists to store uppercase and lowercase characters
        ArrayList<Character> upperChars = new ArrayList<>();
        ArrayList<Character> lowerChars = new ArrayList<>();
        
        // Traverse through the string and separate characters
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperChars.add(ch);
            } else {
                lowerChars.add(ch);
            }
        }
        
        // Sort both lists
        Collections.sort(upperChars);
        Collections.sort(lowerChars);
        
        // Iterator for both lists
        Iterator<Character> upperIter = upperChars.iterator();
        Iterator<Character> lowerIter = lowerChars.iterator();
        
        // Build the sorted string based on original case
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(upperIter.next());
            } else {
                result.append(lowerIter.next());
            }
        }
        
        return result.toString();
    }
}
