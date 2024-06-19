class Solution {
    // Function to count digits in a number n
    public int countDigits(int n) {
        // Logarithm base 10 gives the number of digits - 1
        // Adding 1 to this gives the count of digits
        return (int)Math.floor(Math.log10(n)) + 1;
    }
}
