class Geeks {
    public static long minOperations(long n) {
        long count = 0;

        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                if ((n == 3) || ((n & 2) == 0)) {
                    // Special case for 3 and case where (n - 1) % 4 == 0
                    n--;
                } else {
                    // General case where (n + 1) % 4 == 0
                    n++;
                }
            }
            count++;
        }

        return count;
    }
}
