class Solution
{
    long floorSqrt(long x)
    {
        if (x == 0 || x == 1) {
            return x;
        }

        long start = 1, end = x, ans = 0;
        while (start <= end) {
            long mid = (start + end) / 2;

            // Check if mid is a perfect square
            if (mid * mid == x) {
                return mid;
            }

            // Since we need floor, we update answer when mid*mid is less than x
            if (mid * mid < x) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
