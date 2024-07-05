class Solution {
    // Function to calculate sum of all numbers present in a string.
    public static long findSum(String str) {
        long sum = 0;
        int n = str.length();
        
        // Traverse through the string
        for (int i = 0; i < n; i++) {
            // If current character is a digit, then start forming the number
            if (Character.isDigit(str.charAt(i))) {
                int num = 0;
                // Continue to read digits and form the number
                while (i < n && Character.isDigit(str.charAt(i))) {
                    num = num * 10 + (str.charAt(i) - '0');
                    i++;
                }
                // Add the formed number to the sum
                sum += num;
            }
        }
        
        return sum;
    }
}
