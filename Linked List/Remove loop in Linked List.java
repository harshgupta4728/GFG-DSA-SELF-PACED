class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        if (head == null || head.next == null) {
            return;
        }
        
        // Detect if there is a loop using Floyd's cycle detection algorithm
        Node slow = head;
        Node fast = head;
        boolean loopExists = false;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                loopExists = true;
                break;
            }
        }
        
        // If there is no loop, return
        if (!loopExists) {
            return;
        }
        
        // Find the starting point of the loop
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        
        // Now slow and fast point to the starting node of the loop
        // Move fast to the node just before the start of the loop
        while (fast.next != slow) {
            fast = fast.next;
        }
        
        // Break the loop
        fast.next = null;
    }
}
