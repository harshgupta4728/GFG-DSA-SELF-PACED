class Geeks {
    public static int kthDiff(int a[], int n, int k) {
        Arrays.sort(a);
        int low = 0, high = a[n - 1] - a[0];

        while (low < high) {
            int mid = (low + high) / 2;
            if (countPairsWithDiffLessThanOrEqual(a, n, mid) < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    private static int countPairsWithDiffLessThanOrEqual(int[] a, int n, int mid) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += upperBound(a, i, n, a[i] + mid) - (i + 1);
        }
        return count;
    }

    private static int upperBound(int[] a, int start, int end, int value) {
        int low = start, high = end;
        while (low < high) {
            int mid = (low + high) / 2;
            if (a[mid] <= value) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
