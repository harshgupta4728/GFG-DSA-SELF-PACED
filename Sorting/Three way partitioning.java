class Solution {
    // Function to partition the array around the range such
    // that array is divided into three parts.
    public void threeWayPartition(int array[], int a, int b) {
        int n = array.length;
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (array[mid] < a) {
                // Swap array[low] and array[mid], increment low and mid
                int temp = array[low];
                array[low] = array[mid];
                array[mid] = temp;
                low++;
                mid++;
            } else if (array[mid] > b) {
                // Swap array[mid] and array[high], decrement high
                int temp = array[mid];
                array[mid] = array[high];
                array[high] = temp;
                high--;
            } else {
                // Just increment mid
                mid++;
            }
        }
    }
}
