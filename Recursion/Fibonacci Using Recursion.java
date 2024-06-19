class Solution {
    static int fibonacci(int n) {
        // base cases
        if (n == 1 || n == 2) {
            return 1;
        }
        // recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
