class Solution {
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n) {
        if (n <= 0) return 0;

        int totalSetBits = 0;
        int bitPosition = 0;

        while ((1 << bitPosition) <= n) {
            // Number of complete sets of (2^(bitPosition+1)) in range 1 to n
            int fullSets = n / (1 << (bitPosition + 1));
            // Number of remaining elements after last complete set
            int remainder = n % (1 << (bitPosition + 1));
            // Number of set bits contributed by this bit position
            totalSetBits += fullSets * (1 << bitPosition);

            // If remainder is more than or equal to 2^bitPosition,
            // add (remainder - 2^bitPosition + 1) set bits
            if (remainder >= (1 << bitPosition)) {
                totalSetBits += (remainder - (1 << bitPosition) + 1);
            }

            bitPosition++;
        }

        return totalSetBits;
    }
}
