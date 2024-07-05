class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
    int intersectPoint(Node head1, Node head2)
    {
        int len1 = length(head1); // Length of list1
        int len2 = length(head2); // Length of list2
        
        int diff = Math.abs(len1 - len2); // Calculate length difference
        
        // Move the longer list's pointer diff steps forward
        if (len1 > len2) {
            head1 = movePointer(head1, diff);
        } else {
            head2 = movePointer(head2, diff);
        }
        
        // Traverse both lists until they intersect or reach the end
        while (head1 != null && head2 != null) {
            if (head1 == head2) { // Intersection found
                return head1.data;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        
        // No intersection found
        return -1;
    }
    
    // Function to calculate the length of a linked list
    private int length(Node head) {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    
    // Function to move pointer forward by 'steps' in a linked list
    private Node movePointer(Node head, int steps) {
        while (steps > 0 && head != null) {
            head = head.next;
            steps--;
        }
        return head;
    }
}
