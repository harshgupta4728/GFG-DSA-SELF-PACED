class Solution {
    // Function to find the middle element of a circular doubly linked list
    public static int findMiddle(Node head) {
        if (head == null) {
            return -1; // no middle element in an empty list
        }
        
        Node slow = head;
        Node fast = head;
        
        // Traverse the list using two pointers approach
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // If fast.next == head, then 'fast' has completed one full traversal
        // and 'slow' is at the middle node
        return slow.data;
    }
}
