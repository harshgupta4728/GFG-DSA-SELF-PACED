class Solution {
    private static final long MOD = 1000000007;
    public static long sumUnderModulo(long a, long b){
        // code here
        long result = (a % MOD + b % MOD) % MOD;
        return result;
    }   
}