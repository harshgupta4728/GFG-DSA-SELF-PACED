class Solution {
    static int RecursivePower(int n, int p) {
        // base case: any number to the power of 0 is 1
        if (p == 0) {
            return 1;
        }
        // recursive case
        return n * RecursivePower(n, p - 1);
    }
}
