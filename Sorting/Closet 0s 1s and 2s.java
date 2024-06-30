class Solution {
    // Function to segregate 0s, 1s and 2s in sorted increasing order.
    public static void segragate012(int arr[], int N) {
        int low = 0, mid = 0;
        int high = N - 1;
        
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // Swap arr[low] and arr[mid], increment both low and mid
                    int temp0 = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp0;
                    low++;
                    mid++;
                    break;
                case 1:
                    // No swap needed, just move mid pointer forward
                    mid++;
                    break;
                case 2:
                    // Swap arr[mid] and arr[high], decrement high
                    int temp2 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp2;
                    high--;
                    break;
            }
        }
    }
}
