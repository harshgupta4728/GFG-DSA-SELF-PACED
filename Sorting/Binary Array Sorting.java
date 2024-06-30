class Solution {
    // Function to sort the binary array.
    static void binSort(int A[], int N) {
        int left = 0, right = N - 1;
        
        while (left <= right) {
            // If A[left] is 0, move left pointer forward
            if (A[left] == 0) {
                left++;
            }
            // If A[right] is 1, move right pointer backward
            else if (A[right] == 1) {
                right--;
            }
            // If A[left] is 1 and A[right] is 0, swap them
            else {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                left++;
                right--;
            }
        }
    }
}
