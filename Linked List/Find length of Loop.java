class Solution
{
    // Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        Node slow = head, fast = head;
        boolean loopExists = false;
        
        // Detecting the loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                loopExists = true;
                break;
            }
        }
        
        // If no loop exists
        if (!loopExists)
            return 0;
        
        // Finding the length of the loop
        int length = 1;
        slow = slow.next;
        while (slow != fast) {
            slow = slow.next;
            length++;
        }
        
        return length;
    }
}
