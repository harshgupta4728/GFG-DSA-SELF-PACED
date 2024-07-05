class Swap
{
    // Function to swap elements pairwise in a linked list.
    public static Node pairwise_swap(Node head)
    {
        // If the list is empty or has only one node, return head
        if (head == null || head.next == null) {
            return head;
        }
        
        // Initialize current pointer to head
        Node current = head;
        
        // Traverse the list and swap data in pairs
        while (current != null && current.next != null) {
            // Swap data of current and next nodes
            int temp = current.data;
            current.data = current.next.data;
            current.next.data = temp;
            
            // Move current pointer two steps forward
            current = current.next.next;
        }
        
        return head;
    }
}
