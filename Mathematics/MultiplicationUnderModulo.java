class Solution
{
    private static final long MOD = 1000000007;

    public static long multiplicationUnderModulo(long a, long b) {
        // Step 1: Calculate a % MOD and b % MOD
        a = a % MOD;
        b = b % MOD;
        
        // Step 2: Multiply and take modulo
        long result = (a * b) % MOD;
        
        return result;
    }
}
