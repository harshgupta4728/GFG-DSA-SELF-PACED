class Solution {
    // Function to merge K sorted linked list.
    Node mergeKList(Node[] arr, int K) {
        PriorityQueue<Node> minHeap = new PriorityQueue<>(new Comparator<Node>() {
            public int compare(Node a, Node b) {
                return a.data - b.data;
            }
        });

        // Insert all heads into min-heap
        for (Node node : arr) {
            if (node != null) {
                minHeap.add(node);
            }
        }

        Node dummy = new Node(0); // Dummy node to simplify code
        Node tail = dummy;

        while (!minHeap.isEmpty()) {
            // Get the node with the smallest value
            Node minNode = minHeap.poll();
            // Append it to the result list
            tail.next = minNode;
            tail = tail.next;
            // Move to the next node in the linked list
            if (minNode.next != null) {
                minHeap.add(minNode.next);
            }
        }

        return dummy.next; // Return the head of the merged sorted list
    }
}
