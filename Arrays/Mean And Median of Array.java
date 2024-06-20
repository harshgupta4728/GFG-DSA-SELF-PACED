class Solution {
    // Function to find the mean of the array elements.
    public int mean(int A[], int N) {
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }
        // Mean is floor of the average
        return (int)(sum / N);
    }

    // Function to find the median of the array elements.
    public int median(int A[], int N) {
        Arrays.sort(A);
        // If N is odd, return the middle element
        if (N % 2 != 0) {
            return A[N / 2];
        } else {
            // If N is even, return the floor of the average of the two middle elements
            return (A[(N - 1) / 2] + A[N / 2]) / 2;
        }
    }
}
