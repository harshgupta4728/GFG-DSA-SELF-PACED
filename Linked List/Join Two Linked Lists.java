class Join {
    public static Node joinTheLists(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }
        
        Node tail1 = head1;
        
        // Traverse to the end of the first list
        while (tail1.next != null) {
            tail1 = tail1.next;
        }
        
        // Connect the tail of the first list to the head of the second list
        tail1.next = head2;
        
        return head1; // Return the head of the first list
    }
}
