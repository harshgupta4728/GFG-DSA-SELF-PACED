class Get {
    public static ArrayList<Integer> displayList(Node head) {
        ArrayList<Integer> result = new ArrayList<>();
        Node current = head;
        
        while (current != null) {
            result.add(current.data);
            current = current.next;
        }
        
        return result;
    }
}
