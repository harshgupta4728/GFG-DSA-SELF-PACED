class Solution {
    // Function to find minimum number of pages.
    public static long findPages(int n, int[] arr, int m) {
        if (m > n) return -1;

        long low = Arrays.stream(arr).max().getAsInt();
        long high = Arrays.stream(arr).sum();
        long result = high;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (isFeasible(arr, n, m, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    private static boolean isFeasible(int[] arr, int n, int m, long mid) {
        int studentsRequired = 1;
        long currentSum = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > mid) return false;

            if (currentSum + arr[i] > mid) {
                studentsRequired++;
                currentSum = arr[i];
                if (studentsRequired > m) return false;
            } else {
                currentSum += arr[i];
            }
        }

        return true;
    }
}
