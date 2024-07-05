class GFG
{
    // Function to swap Kth node from beginning and end in a linked list.
    Node swapkthnode(Node head, int num, int K)
    {
        // If K is out of bounds, return head as it is.
        if (K > num || K <= 0)
            return head;
        
        // If Kth node from beginning and end are the same, no swap needed.
        if (2 * K - 1 == num)
            return head;
        
        // Find Kth node from beginning
        Node curr = head;
        Node prevKthFromStart = null;
        for (int i = 1; i < K; i++) {
            prevKthFromStart = curr;
            curr = curr.next;
        }
        Node KthFromStart = curr;
        
        // Find Kth node from end
        curr = head;
        Node prevKthFromEnd = null;
        for (int i = 1; i < num - K + 1; i++) {
            prevKthFromEnd = curr;
            curr = curr.next;
        }
        Node KthFromEnd = curr;
        
        // If Kth nodes are adjacent, adjust the prev pointers accordingly
        if (prevKthFromStart != null)
            prevKthFromStart.next = KthFromEnd;
        if (prevKthFromEnd != null)
            prevKthFromEnd.next = KthFromStart;
        
        // Swap next pointers of Kth nodes
        Node temp = KthFromStart.next;
        KthFromStart.next = KthFromEnd.next;
        KthFromEnd.next = temp;
        
        // Adjust head pointer if K is 1 or num
        if (K == 1)
            head = KthFromEnd;
        else if (K == num)
            head = KthFromStart;
        
        return head;
    }
}
