class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        if (head == null || head.next == null) {
            return false;
        }
        
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move slow pointer one step
            fast = fast.next.next;     // Move fast pointer two steps
            
            // If they meet, there is a loop
            if (slow == fast) {
                return true;
            }
        }
        
        // If fast reaches the end (null), there is no loop
        return false;
    }
}
