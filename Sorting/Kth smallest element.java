class Solution {
    // Function to find the kth smallest element in the array.
    public static int kthSmallest(int arr[], int n, int k) {
        // PriorityQueue to act as a max-heap (using reverse order comparator)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            maxHeap.add(arr[i]);

            // If heap size exceeds k, remove the largest element
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // The root of the heap is the Kth smallest element
        return maxHeap.peek();
    }
}
