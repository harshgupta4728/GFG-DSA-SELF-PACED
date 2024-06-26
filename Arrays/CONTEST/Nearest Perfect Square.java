class Solution {
    static boolean isPerfect(long n) {
        double sqrt = Math.sqrt(n);
        return (sqrt - Math.floor(sqrt)) == 0;
    }

    // Function to find the nearest perfect square
    static long nearestPerfectSquare(long n) {
        if (isPerfect(n)) {
            return getNearestPerfectSquare(n);
        }

        // Variables to store the nearest perfect square numbers above and below N
        long aboveN = n + 1;
        while (!isPerfect(aboveN)) {
            aboveN++;
        }

        long belowN = n - 1;
        while (!isPerfect(belowN)) {
            belowN--;
        }

        // Find the differences
        long diff1 = aboveN - n;
        long diff2 = n - belowN;

        // Return the greater perfect square if distances are equal
        if (diff1 < diff2) {
            return aboveN;
        } else if (diff2 < diff1) {
            return belowN;
        } else {
            return aboveN; // If distances are equal, return the greater perfect square
        }
    }

    // Function to find the nearest perfect square for a perfect square number
    static long getNearestPerfectSquare(long n) {
        long aboveN = n + 1;
        while (!isPerfect(aboveN)) {
            aboveN++;
        }

        long belowN = n - 1;
        while (!isPerfect(belowN)) {
            belowN--;
        }

        long diff1 = aboveN - n;
        long diff2 = n - belowN;

        if (diff1 < diff2) {
            return aboveN;
        } else if (diff2 < diff1) {
            return belowN;
        } else {
            return aboveN; // If distances are equal, return the greater perfect square
        }
    }
}
