public void enqueue(T item, int priority) { // Method to enqueue with specified priority 
		Node<T>newNode = new Node<T>(item, priority); // Create a new Node with the given item and priority 
		if (head == null || priority < head.priority) { // If the queue is empty or the new item has higher priority than head, insert at the start 
		newNode.next = head; 
		head = newNode; 
		}
		else { // Traverse the queue to find the correct position to insert the new item based on priority 
		Node<T>current = head; 	
		while(current !=null && priority > current.next.priority) { 
		current = current.next; 
		}
		newNode.next = current.next; // Insert the new node at the correct position 
		current.next = newNode; 
		}
	}
public static void main(String args[]) {	
    PriorityLinkedQueue<String> length = new PriorityLinkedQueue<>(); 
    length.enqueue("Marshall", "Marshall".length());
    length.enqueue("McAllister", "McAllister".length());
    length.enqueue("McDowell", "McDowell".length());
    length.enqueue("Merton", "Merton".length()); 
    length.enqueue("Murnaghan", "Murnaghan".length());
    length.enqueue("MacIntosh", "MacIntosh".length());
    System.out.println(length); 
}
