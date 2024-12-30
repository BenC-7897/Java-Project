public static Point2D[] minXmaxX(Point2D[] points) {
        if (points == null || points.length == 0) { // If there are no points 
            return null; // Return zero 
        }
        Point2D minimum = points[0]; // Start at 0,0 
        Point2D maximum = points[0]; // Start at 0,0 
        for (Point2D Point : points) { // Each time there's a set of points 
            if (Point.X() < minimum.X()) { // If that point is less than the minimum
               minimum = Point; // Return that the point is the minimum 
            }
            if (Point.X() > maximum.X()) { // If that point is greater than the maximum 
               maximum = Point; // Return that the point is the maximum 
            }
        }
        Point2D[] result = {minimum, maximum}; // Print out the minimum and maximum 
        return result;
    }
