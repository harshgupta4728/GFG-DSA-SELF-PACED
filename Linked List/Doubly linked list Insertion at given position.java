class GfG
{
    // Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
	{
		Node newNode = new Node(data);
		
		if (head_ref == null) {
		    head_ref = newNode;
		    return;
		}
		
		Node current = head_ref;
		int count = 0;
		
		// Traverse to the node just before the position 'pos'
		while (current != null && count < pos) {
		    current = current.next;
		    count++;
		}
		
		if (current == null) {
		    // If pos is greater than the length of the list, insert at the end
		    Node lastNode = getLastNode(head_ref);
		    lastNode.next = newNode;
		    newNode.prev = lastNode;
		} else {
		    // Insert newNode after current
		    newNode.next = current.next;
		    if (current.next != null) {
		        current.next.prev = newNode;
		    }
		    current.next = newNode;
		    newNode.prev = current;
		}
		
		// Update head_ref in case of insertion at the beginning
		if (pos == 0) {
		    head_ref = newNode;
		}
	}
	
	// Utility function to get the last node in the doubly linked list
	private Node getLastNode(Node head) {
	    Node temp = head;
	    while (temp != null && temp.next != null) {
	        temp = temp.next;
	    }
	    return temp;
	}
}
