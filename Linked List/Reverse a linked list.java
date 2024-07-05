class Solution
{
    // Function to reverse a linked list.
    Node reverseList(Node head)
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the current node's pointer
            
            // Move pointers one position ahead
            prev = current;
            current = next;
        }
        
        // 'prev' now points to the new head of the reversed list
        return prev;
    }
}
