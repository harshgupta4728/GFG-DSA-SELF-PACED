class Geeks {
    public static long kSum(int arr[], int n, int k) {
        // Sort the array
        Arrays.sort(arr);

        // Calculate the sum of the first k elements
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
