// Import the necessary libraries 
import edu.princeton.cs.introcs.StdDraw; 
import java.awt.Color;

public class Circle implements GraphicsElement{
	
private Point2D centre_point; // Declare the centre point based on Point2D 
private double radius; // Declare the radius 

public Circle(double x, double y, double r) { // Constructor to initialise the Circle with coordinates (x,y) and radius (r) 
centre_point = new Point2D(x,y); // Centre-point declaration 
radius = r; // Radius declaration 
}

// Override the draw method from the GraphicsElement 
@Override 
public void draw(Color c) { // Set the pen colour 
StdDraw.setPenColor(c); 
StdDraw.setPenRadius(0.005);
StdDraw.circle(centre_point.X(),centre_point.Y(),radius); // Draw a circle using StdDraw with the centre-point and radius 
}

// Override the move by method from the GraphicsElement 
@Override
public void moveBy(double x, double y) { 
centre_point = new Point2D(x, y); // Move the centre-point by a certain amount 	
}

// Override the scale by method from the GraphicsElement 
@Override
public void scaleBy(double factor) {
if (factor > 0) { // Scale the radius by a specified factor if the factor is higher than zero 
radius = radius * factor; 
}
	
}
public static void main (String args[]) {
Circle c = new Circle(0.3,0.3,0.25); // Create a circle with a centre-point and radius 
StdDraw.clear(Color.RED); // Set the background at red 
c.draw(new Color(0.5f,0.2f,0.7f)); // Draw the circle with the certain colour 
c.scaleBy(0.4); // Scale the circle 
c.moveBy(0.1, 0.1); // Move the circle 
c.draw(new Color(0.5f, 0.7f, 0.2f)); // Draw the scaled and moved circle with a different colour 
}
}
