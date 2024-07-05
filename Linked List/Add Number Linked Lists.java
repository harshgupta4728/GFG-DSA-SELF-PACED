class Solution {
    // Function to add two numbers represented by linked list.
    static Node addTwoLists(Node num1, Node num2) {
        // Trim leading zeros
        num1 = trimZeros(num1);
        num2 = trimZeros(num2);
        
        // Check if both lists are null or empty after trimming
        if (num1 == null && num2 == null) {
            return new Node(0); // Special case: both lists are zeros
        }
        
        // Reverse both lists to make addition easier
        num1 = reverse(num1);
        num2 = reverse(num2);
        
        Node result = null;
        Node temp = null;
        Node prev = null;
        int carry = 0;
        int sum;
        
        while (num1 != null || num2 != null) {
            int x = (num1 != null) ? num1.data : 0;
            int y = (num2 != null) ? num2.data : 0;
            
            sum = carry + x + y;
            
            carry = sum / 10;
            sum = sum % 10;
            
            temp = new Node(sum);
            
            if (result == null) {
                result = temp;
            } else {
                prev.next = temp;
            }
            
            prev = temp;
            
            if (num1 != null) num1 = num1.next;
            if (num2 != null) num2 = num2.next;
        }
        
        if (carry > 0) {
            temp.next = new Node(carry);
        }
        
        // Reverse the result list to get the correct order
        return reverse(result);
    }
    
    // Utility function to trim leading zeros from the linked list
    static Node trimZeros(Node head) {
        Node current = head;
        Node prev = null;
        
        while (current != null && current.data == 0) {
            prev = current;
            current = current.next;
        }
        
        if (prev != null) {
            prev.next = null; // Cut off leading zeros
        }
        
        return current;
    }
    
    // Utility function to reverse a linked list
    static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }
}
