class Solution
{
    
  public static int[] extendedGCD(int a, int b) {
        if (b == 0) {
            return new int[]{a, 1, 0};
        }
        int[] result = extendedGCD(b, a % b);
        int gcd = result[0];
        int x1 = result[1];
        int y1 = result[2];
        int x = y1;
        int y = x1 - (a / b) * y1;
        return new int[]{gcd, x, y};
    }

    public static int modInverse(int a, int m) {
        // Edge case: If m is 1, there is no modular inverse
        if (m == 1) {
            return -1;
        }
        
        int[] result = extendedGCD(a, m);
        int gcd = result[0];
        int x = result[1];
        if (gcd != 1) {
            // Modular inverse does not exist
            return -1;
        } else {
            // x might be negative, so we adjust it to be within the range [0, m-1]
            return (x % m + m) % m;
        }
    }

}
