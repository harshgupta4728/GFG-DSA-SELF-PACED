class Solution
{
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        if (head == null || head.next == null)
            return true;
        
        // Step 1: Find the middle of the linked list
        Node middle = findMiddle(head);
        
        // Step 2: Reverse the second half of the linked list
        Node secondHalf = reverseList(middle.next);
        
        // Step 3: Compare the first and reversed second halves
        Node p1 = head;
        Node p2 = secondHalf;
        boolean isPalindrome = true;
        
        while (isPalindrome && p2 != null) {
            if (p1.data != p2.data)
                isPalindrome = false;
            p1 = p1.next;
            p2 = p2.next;
        }
        
        // Step 4: Restore the original list (optional)
        middle.next = reverseList(secondHalf);
        
        return isPalindrome;
    }
    
    // Helper function to find the middle of the linked list
    private Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    // Helper function to reverse a linked list
    private Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}
