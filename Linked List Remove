public int removeAll(T item) { // Method to remove all occurrences of a specified item from the linked list 
		int removal = 0; // Start the number of removals 
		if (head == null ) { // If the list is empty, return zero 
		return removal; 
		}
		while (head!=null && head.item.equals(item)) { // Remove the occurrences of the item from the start 
		head = head.next; 
		removal++; 
		}
		Node<T> current = head; // Go through the list and remove occurrences of the item 
		while (current != null && current.next !=null) {
			if (current.next.item.equals(item)) {
			current.next = current.next.next; 
			removal++; // Increase number of removals by one 
			}
			else current = current.next;
			}
			return removal; // Return the number of removals 
	}
public static void main(String args[]) {
System.out.println("Original List: " + List); // Print the original list 
int removal_variable = List.removeAll("Ten"); // Remove a certain element 
System.out.println("New List: " + List); // Print the list after removal 
}
