class Solution {
    // Function to check whether two linked lists are identical or not.
    public boolean areIdentical(Node head1, Node head2) {
        Node curr1 = head1;
        Node curr2 = head2;
        
        // Traverse both lists
        while (curr1 != null && curr2 != null) {
            // If data of current nodes is not equal, return false
            if (curr1.data != curr2.data) {
                return false;
            }
            // Move to next nodes
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        
        // If both lists are of different lengths
        if (curr1 != null || curr2 != null) {
            return false;
        }
        
        // If reached here, both lists are identical
        return true;
    }
}
