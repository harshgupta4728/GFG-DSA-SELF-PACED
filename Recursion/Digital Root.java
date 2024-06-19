class Solution {
    public int digitalRoot(int n) {
        // If n is 0, its digital root is 0
        if (n == 0) {
            return 0;
        }
        // Using the formula to find digital root
        return 1 + (n - 1) % 9;
    }
}
