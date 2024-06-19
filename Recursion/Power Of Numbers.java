class Solution {

    static final int MOD = 1000000007;

    long power(int N, int R) {
        // Your code here
        return powerMod(N, R, MOD);
    }

    long powerMod(long x, long y, int p) {
        long res = 1; // Initialize result
        x = x % p; // Update x if it is more than or equal to p

        if (x == 0) return 0; // In case x is divisible by p;

        while (y > 0) {
            // If y is odd, multiply x with result
            if ((y & 1) == 1) {
                res = (res * x) % p;
            }

            // y must be even now
            y = y >> 1; // y = y / 2
            x = (x * x) % p; // Change x to x^2
        }
        return res;
    }
}
