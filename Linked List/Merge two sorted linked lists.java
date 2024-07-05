class LinkedList {
    // Function to merge two sorted linked lists.
    Node sortedMerge(Node head1, Node head2) {
        // Dummy node as the head of the merged list
        Node dummy = new Node(0);
        Node tail = dummy; // Pointer to the current tail of the merged list
        
        // Pointers to traverse both lists
        Node curr1 = head1;
        Node curr2 = head2;
        
        // Traverse both lists and merge nodes
        while (curr1 != null && curr2 != null) {
            if (curr1.data <= curr2.data) {
                tail.next = curr1;
                curr1 = curr1.next;
            } else {
                tail.next = curr2;
                curr2 = curr2.next;
            }
            tail = tail.next;
        }
        
        // Append remaining nodes of list1 or list2 if any
        if (curr1 != null) {
            tail.next = curr1;
        }
        if (curr2 != null) {
            tail.next = curr2;
        }
        
        return dummy.next; // Head of the merged sorted list
    }
}
