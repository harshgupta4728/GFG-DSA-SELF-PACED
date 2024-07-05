class Solution
{
    void deleteNode(Node del_node)
    {
        if (del_node == null || del_node.next == null) {
            return; // Edge case: Cannot delete if del_node is null or last node
        }
        
        // Copy the data from the next node to the current node
        del_node.data = del_node.next.data;
        
        // Delete the next node
        del_node.next = del_node.next.next;
    }
}
