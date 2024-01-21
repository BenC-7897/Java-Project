public T max() { // Method to find and return the maximum value in the BST 
	return max(root); 
}
private T max(Node<T> n) {
    if (n == null) { // If the node is null, the BST is empty 
    return null; 
}
    if (n.right==null) { // If the right child is null, the current node has the maximum value 
    return n.item; 
}
    return max(n.right); // Recursively traverse the right subtree to find the maximum value 
}
import edu.princeton.cs.introcs.StdDraw;
public class BST_App {
	public static void main(String[] args) throws InterruptedException {
		DrawableBST bal_bst = new DrawableBST(); // Note: A drawable BST can only handle integer items
		int[] fullyBalancedTree = {40,20,60,15,25,50,70,10,20,65,75,17,22,27,45,55,8,12,16,18,21,23,26,28,44,46,54,56,64,66,74,76};
		for (int i=0; i<fullyBalancedTree.length; i++)
			bal_bst.insert(fullyBalancedTree[i]);
		bal_bst.draw(); // Draw the BST 
                System.out.println(bal_bst.max()); // Print the maximum number in the BST 
  }
}
