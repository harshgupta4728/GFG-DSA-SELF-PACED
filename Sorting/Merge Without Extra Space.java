class Solution {
    public static void merge(long arr1[], long arr2[], int n, int m) {
        int gap = (n + m) / 2;
        while (gap > 0) {
            int i = 0;
            int j = gap;
            while (j < (n + m)) {
                if (j < n && arr1[i] > arr1[j]) {
                    // Swap within arr1
                    long temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                } else if (j >= n && i < n && arr1[i] > arr2[j - n]) {
                    // Swap between arr1 and arr2
                    long temp = arr1[i];
                    arr1[i] = arr2[j - n];
                    arr2[j - n] = temp;
                } else if (j >= n && i >= n && arr2[i - n] > arr2[j - n]) {
                    // Swap within arr2
                    long temp = arr2[i - n];
                    arr2[i - n] = arr2[j - n];
                    arr2[j - n] = temp;
                }
                i++;
                j++;
            }
            if (gap == 1) {
                break;
            }
            gap = (gap + 1) / 2;
        }
    }
}
