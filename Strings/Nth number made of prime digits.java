class Solution {
    // Function to find nth number made of only prime digits.
    public static int primeDigits(int n) {
        // List of prime digits
        int[] primes = {2, 3, 5, 7};
        
        // Queue to store numbers made of prime digits
        Queue<String> queue = new LinkedList<>();
        
        // Enqueue the single-digit prime numbers
        for (int prime : primes) {
            queue.add(String.valueOf(prime));
        }
        
        // Dequeue elements until we reach the nth number
        String result = "";
        for (int i = 0; i < n; i++) {
            result = queue.poll();
            for (int prime : primes) {
                queue.add(result + prime);
            }
        }
        
        return Integer.parseInt(result);
    }
}
