class Solution {
    public static boolean isSorted(Node head) {
        if (head == null || head.next == null) {
            return true; // A list with 0 or 1 node is considered sorted
        }
        
        Node current = head;
        boolean isIncreasing = true;
        
        while (current.next != null) {
            if (current.data > current.next.data) {
                isIncreasing = false;
                break;
            } else if (current.data < current.next.data) {
                isIncreasing = true;
                break;
            }
            current = current.next;
        }
        
        // Check the entire list
        while (current.next != null) {
            if (isIncreasing && current.data > current.next.data) {
                return false;
            } else if (!isIncreasing && current.data < current.next.data) {
                return false;
            }
            current = current.next;
        }
        
        return true;
    }
}
