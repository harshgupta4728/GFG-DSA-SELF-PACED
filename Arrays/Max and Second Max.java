class Solution {
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[]) {
        // Initialize variables to store the largest and second largest elements
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Find the maximum element in the array
        for (int i = 0; i < sizeOfArray; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Find the second maximum element in the array
        for (int i = 0; i < sizeOfArray; i++) {
            if (arr[i] != max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        // If secondMax remains as Integer.MIN_VALUE, it means there's no second maximum
        if (secondMax == Integer.MIN_VALUE) {
            secondMax = -1;
        }

        // Create a list to store the result
        ArrayList<Integer> result = new ArrayList<>();
        result.add(max);
        result.add(secondMax);

        return result;
    }
}
