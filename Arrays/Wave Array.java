class Solution {
    public static void convertToWave(int n, int[] arr) {
        // Traverse through the array
        for (int i = 0; i < n - 1; i++) {
            // Swap adjacent elements if needed
            if (i % 2 == 0) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
