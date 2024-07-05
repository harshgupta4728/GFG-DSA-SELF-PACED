class Solution {
    public Node deleteNode(Node head, int x) {
        // Edge case: empty list
        if (head == null) {
            return null;
        }
        
        // Case: deleting the head node
        if (x == 1) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }
        
        Node current = head;
        int currentPosition = 1;
        
        // Traverse to find the node at position x
        while (currentPosition < x && current != null) {
            current = current.next;
            currentPosition++;
        }
        
        // If current is null, x is greater than the list size
        if (current == null) {
            return head; // No change
        }
        
        // Delete the node
        Node prevNode = current.prev;
        Node nextNode = current.next;
        
        if (prevNode != null) {
            prevNode.next = nextNode;
        }
        
        if (nextNode != null) {
            nextNode.prev = prevNode;
        }
        
        return head;
    }
}
