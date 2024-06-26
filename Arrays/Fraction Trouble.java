class Solution {
    public int[] LargestFraction(int n, int d) {
        int num = 0, deno = 1;

        // Iterate over possible denominators in reverse order
        for (int q = 10000; q >= 2; q--) {
            int p = (n * q - 1) / d;

            // Update the fraction if it's larger
            if (p * deno >= q * num) {
                deno = q;
                num = p;
            }
        }

        int g = gcd(num, deno);

        // Return the irreducible fraction
        return new int[]{num / g, deno / g};
    }

    // Helper method to calculate gcd
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
