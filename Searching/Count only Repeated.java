class Solution {
    // Pair Class
    static class Pair {
        long x;
        long y;

        Pair(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    // Function to find repeated element and its frequency.
    public static Pair findRepeating(long arr[], int n) {
        if (n < 2) return new Pair(-1, -1);

        int left = 0, right = n - 1;
        long repeatedElement = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((mid > 0 && arr[mid] == arr[mid - 1]) || (mid < n - 1 && arr[mid] == arr[mid + 1])) {
                repeatedElement = arr[mid];
                break;
            }
            if (arr[mid] == arr[0] + mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (repeatedElement == -1) return new Pair(-1, -1);
        int count = 0;
        for (int i = 0; i < n; ++i) {
            if (arr[i] == repeatedElement) count++;
        }

        return new Pair(repeatedElement, count);
    }
}
