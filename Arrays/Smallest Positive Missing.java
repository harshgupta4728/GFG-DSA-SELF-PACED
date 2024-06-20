class Solution
{
    // Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Step 1: Segregate positive and non-positive numbers
        int shift = segregate(arr, size);
        int[] arr2 = new int[size - shift];
        for (int i = 0; i < size - shift; i++) {
            arr2[i] = arr[shift + i];
        }
        
        // Step 2: Use index as a marker
        return findMissingPositive(arr2, size - shift);
    }

    // Utility function that segregates positive and non-positive numbers
    static int segregate(int arr[], int size)
    {
        int j = 0, i;
        for(i = 0; i < size; i++) {
            if (arr[i] <= 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return j;
    }

    // Find the smallest positive missing number in the array that contains only positive numbers
    static int findMissingPositive(int arr[], int size)
    {
        for (int i = 0; i < size; i++) {
            int x = Math.abs(arr[i]);
            if (x - 1 < size && arr[x - 1] > 0) {
                arr[x - 1] = -arr[x - 1];
            }
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }

        return size + 1;
    }
}
