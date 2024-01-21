import edu.princeton.cs.introcs.StdDraw; // Import this library 
import java.awt.Color; // Import this library 

public class Point2D implements Comparable<Point2D> { // Define Point2D class with a comparable interface method 

    private double x, y; // Declare the x and y coordinates 

    public Point2D(double x, double y) { // Initialise x and y 
        this.x = x;
        this.y = y;
    }
    public double X() { // Obtain x 
        return x;
    }
    public double Y() { // Obtain y 
        return y;
    }
    public void moveBy(double xInc, double yInc) { // Move the points by specific increments 
        x += xInc;
        y += yInc;
    }
    void draw(Color color, double penSize) { // Draw the point with a specific colour 
        StdDraw.setPenColor(color);
        StdDraw.setPenRadius(penSize);
        StdDraw.point(x, y);
    }
    @Override // Override method to undertake the actual comparison from the origin  
    public int compareTo(Point2D other_point) {
    double first_point = Math.sqrt(Math.pow(x - 0.5, 2) + Math.pow(y - 0.5, 2)); // Formula to obtain the distance between the first point  
    double second_point = Math.sqrt(Math.pow(other_point.x - 0.5, 2) + Math.pow(other_point.y - 0.5, 2)); // Formula to obtain the distance between the second point 
    if (first_point < second_point) { 
    return -1; // Return the first point 
    }
    else if (first_point > second_point) {
    return 1; // Return the second point 
    }
    else return 0; // Otherwise don't return anything
    }
    @Override // Override method to actually print the method 
    public String toString() {
        return "(" + x + "," + y + ")";
    } 
    public static void main(String args[]) {
    	Point2D p1 = new Point2D(0.0, 0.0); // Point one 
		Point2D p2 = new Point2D(1.0, 1.0); // Point two 
		if (p1.compareTo(p2) == 0) // If the points are the same distance 
			System.out.println("(1) The points are the same distance from (0.5,0.5)");
		else // If not 
			System.out.println("(1) Point closest to (0.5,0.5) is " + (p1.compareTo(p2)<0 ? p1 : p2)); // Print which point
		p1 = new Point2D(0.2, 0.2);
		p2 = new Point2D(0.8, 0.8);
		if (p1.compareTo(p2) == 0) 
			System.out.println("(2) The points are the same distance from (0.5,0.5)"); // Print out that they're the same distance 
		else
			System.out.println("(2) Point closest to (0.5,0.5) is " + (p1.compareTo(p2)<0 ? p1 : p2)); // Print out which point is closer 
	}
}
