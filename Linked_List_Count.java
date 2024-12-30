public int count(T item) { // Method to count the number of occurrences of a specified item in the linked list 
		int count = 0; 
		Node<T> current = head;
		while (current != null) { // Iterate through the list to count occurrences of the item 
		if (current.item.equals(item)) {
		count++; 
		}
		current = current.next;
		}
		return count; 
	}
	public static void main(String args[]) {
	LinkedList<String> List = new LinkedList<>(); // Create a new linked list 
        List.insertHead("Three");
        List.insertHead("Seven");
        List.insertHead("Five");
        List.insertHead("Five");
        List.insertHead("Nine");
        List.insertHead("Five");
        System.out.println("Count of 5 in list: " + List.count("Five")); // Print the list with the number of an item 
        System.out.println("Count of 3 in list: " + List.count("Three")); // Undertake the same function as above  
        System.out.println("Count of 10 in list: " + List.count("Ten")); // Undertake the same function as above 
    }
