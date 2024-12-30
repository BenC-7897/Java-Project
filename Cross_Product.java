public static double crossProd(Point2D p0, Point2D p1, Point2D p2) {
		   double x1 = p1.X()-p0.X(); // To obtain x1 
		   double y1 = p1.Y()-p0.Y(); // To obtain y1
		   double x2 = p2.X()-p0.X(); // To obtain x2 
		   double y2 = p2.Y()-p0.Y(); // To obtain y2 
		   double result = x1 * y2 - x2 * y1; // To get the cross product
		   return result; // Return the cross product 
}	
