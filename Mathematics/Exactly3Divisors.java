class Solution
{
    
    public int exactly3Divisors(int N)
    {
        //Your code here
        int limit = (int) Math.sqrt(N);
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 2: Count primes whose square is ≤ N
        int count = 0;
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i] && (long)i * i <= N) {
                count++;
            }
        }

        return count;
    }
}