class Solution {
    // Function to merge three sorted lists into a single list.
    static ArrayList<Integer> merge3sorted(int A[], int B[], int C[]) {
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<Element> minHeap = new PriorityQueue<>();

        // Add the first element of each array to the min-heap
        if (A.length > 0) minHeap.add(new Element(A[0], 0, A));
        if (B.length > 0) minHeap.add(new Element(B[0], 0, B));
        if (C.length > 0) minHeap.add(new Element(C[0], 0, C));

        // Continue extracting the smallest element from the min-heap and add the next element of that array to the heap
        while (!minHeap.isEmpty()) {
            Element smallest = minHeap.poll();
            result.add(smallest.value);

            if (smallest.index + 1 < smallest.array.length) {
                minHeap.add(new Element(smallest.array[smallest.index + 1], smallest.index + 1, smallest.array));
            }
        }

        return result;
    }
}

// Helper class to represent an element from an array
class Element implements Comparable<Element> {
    int value;
    int index;
    int[] array;

    Element(int value, int index, int[] array) {
        this.value = value;
        this.index = index;
        this.array = array;
    }

    @Override
    public int compareTo(Element other) {
        return Integer.compare(this.value, other.value);
    }
}
