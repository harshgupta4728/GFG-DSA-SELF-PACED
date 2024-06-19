class Solution {
    // Recursive function to compute sum of digits
    public int sumOfDigits(int n) {
        // Base case: if n is less than 10, return n itself
        if (n < 10) {
            return n;
        }
        // Recursive case: sum of last digit + sum of digits of remaining number
        return n % 10 + sumOfDigits(n / 10);
    }
}
