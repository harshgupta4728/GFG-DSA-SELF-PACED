
class Solution {
    // Function to count the number of possible triangles.
    static int findNumberOfTriangles(int arr[], int n) {
        // Sort the array
        Arrays.sort(arr);
        int count = 0;

        // Fix the third element, and find pairs using two pointers
        for (int i = n - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;
            while (left < right) {
                // Check if the triplet forms a triangle
                if (arr[left] + arr[right] > arr[i]) {
                    // If arr[left] + arr[right] > arr[i], then all elements between left and right can form a triangle with arr[i]
                    count += right - left;
                    // Move the right pointer to the left
                    right--;
                } else {
                    // Move the left pointer to the right
                    left++;
                }
            }
        }
        return count;
    }
}
