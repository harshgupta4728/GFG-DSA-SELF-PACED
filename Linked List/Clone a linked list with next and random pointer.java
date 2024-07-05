class Clone {
    // Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        if (head == null) return null;
        
        // Step 1: Insert duplicate nodes
        Node curr = head;
        while (curr != null) {
            Node clone = new Node(curr.data);
            clone.next = curr.next;
            curr.next = clone;
            curr = clone.next;
        }
        
        // Step 2: Adjust random pointers
        curr = head;
        while (curr != null) {
            if (curr.arb != null) {
                curr.next.arb = curr.arb.next;
            }
            curr = curr.next.next;
        }
        
        // Step 3: Separate original and cloned lists
        Node original = head;
        Node cloned = head.next;
        Node cloneHead = cloned;
        
        while (original != null && cloned != null) {
            original.next = cloned.next;
            original = original.next;
            if (original != null) {
                cloned.next = original.next;
                cloned = cloned.next;
            }
        }
        
        return cloneHead;
    }
}
