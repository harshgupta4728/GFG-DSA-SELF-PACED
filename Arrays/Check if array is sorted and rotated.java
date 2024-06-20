class Solution {    
    // arr[]: input array
    // num: size of array
    // Function to check if array is sorted and rotated
    public static boolean checkRotatedAndSorted(int arr[], int num) {
        // Check for increasing order rotation
        int increaseDropCount = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i] > arr[(i + 1) % num]) {
                increaseDropCount++;
            }
        }
        
        // Check for decreasing order rotation
        int decreaseRiseCount = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i] < arr[(i + 1) % num]) {
                decreaseRiseCount++;
            }
        }
        
        // Array is sorted and rotated if there's exactly one drop or rise point
        return (increaseDropCount == 1 || decreaseRiseCount == 1);
    }
}
