public static void printArray(double[] items)  {
    for(int i=0; i<items.length; i++) // For loop to go through the numbers in the array 
	{
	System.out.print(items[i]); // Print the array items 
	}
	}
public static void swap(int[] items, int i, int j) { // To actually swap the numbers 
        int temporary = items[i]; // Store the array value in a temporary variable 
        items[i] = items[j]; // Swap formula 
        items[j] = temporary; // Store the new array value in temporary 
}
public static void bubble(int[] items) {
	        for (int i = 0; i < items.length-1; i++) { // For loop to go through the array values 
	                if (items[i] > items[i+1]) { // If the number is bigger than the next numbers 
	                    swap(items, i, i+1); // Swap the numbers
	                }
	            }
	        }
public static void sort(int[] items) {
	          for (int j = 0; j < items.length-1; j++) { // For loop to go through the array values 
                   bubble(items); // Undertake the bubble 
                } 
	    }
public static long sortAndCountSteps(int[] items) { 
        long comparisons = 0; // Start the comparisons count at zero 
        for (int i = 0; i < items.length - 1; i++) { // For loop to go through the array values 
            for (int j = 0; j < items.length - i - 1; j++) { // For loop to go through the array values 
                if (items[j] > items[j + 1]) { // As long as the values are less than the next values 
                    int temp = items[j]; // Store the current value in temporary 
                    items[j] = items[j + 1]; // Swap the current value with the next value 
                    items[j + 1] = temp; // Store the next value in temporary 
                }
                ++comparisons; // Increase the comparisons by one 
            }
        }
        return comparisons; // Return the number of comparisons 
    }
public static void main(String[] args) {
     double[] testArray = {2.5, 3.5, 4.5, 5.5, 6.5}; // Test Array 
          printArray(testArray); // Print the array values 
int[] Array = {5, 3, 0, 7, 4, 1, 3, -4, 2, 5}; // Test Array 
        printArray(Array); // Print the array values 
        swap(Array, 1, 5); // Swap the values 
        printArray(Array); // Print the new array 
int[] testA = {5, 3, 0, 7, 4, 1, 3, -4, 2, 5}; // Test Array 
		System.out.println("A short test array: "); // Print out 
		printArray(testA); // Print out the test array 
		bubble(testA); // Undertake the bubble function 
		System.out.println("Array after one bubble operation: "); // Print array after the bubble function 
		printArray(testA); // Print the new array 
int[] testarray = {5, 3, 0, 7, 4, 1, 3, -4, 2, 5}; // Test Array 
		System.out.println("Sorting the array..."); // Sorting the array 
		sort(testarray); // Sort the test array 
		printArray(testarray); // Print the new test array 
  int[] arr = {5, 3, 0, 7, 4, 1, 3, -4, 2, 5}; // Test Array
    long comparisons = sortAndCountSteps(arr); // To start the count of comparisons 
    System.out.println("Sorted Array: "); // Print the sorted array 
    for (int value : arr) { // For loop to go through the values 
        System.out.print(value + " "); // Count the values 
    }
    System.out.println("\nTotal comparisons: " + comparisons); // Print out the number of comparisons 
}
}
