class Solution {
    // Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Long> arr, int k) {
        int n = arr.size();
        for (int i = 0; i < n; i += k) {
            int left = i;
            // to handle case when k is not a multiple of n
            int right = Math.min(i + k - 1, n - 1);
            // reverse the sub-array [left, right]
            while (left < right) {
                long temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
                left++;
                right--;
            }
        }
    }

