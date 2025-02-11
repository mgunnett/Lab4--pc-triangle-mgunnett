package lab4_PartC_Triangle;

	/**
	 * Representation of an Euclidean (i.e., planar) triangle. Triangle is defined
	 * by the (x,y) coordinates of the three points A, B, and C where two of the 
	 * three sides come together.
	 * @author John K. Estell
	 * @version 1.0 - 30 January 2016
	 */
	public class Triangle {
	    private double ax, ay;  // point A
	    private double bx, by;  // point B
	    private double cx, cy;  // point C
	    
	    // constructor
	    /** 
	     * Instantiates a Triangle object described by three points in Euclidean space.
	     * @param ax x-coordinate of point A
	     * @param ay y-coordinate of point A
	     * @param bx x-coordinate of point B
	     * @param by y-coordinate of point B
	     * @param cx x-coordinate of point C
	     * @param cy y-coordinate of point C
	     */
	    public Triangle( double ax, double ay, 
	                     double bx, double by, 
	                     double cx, double cy ) {
	        this.ax = ax; this.ay = ay;
	        this.bx = bx; this.by = by;
	        this.cx = cx; this.cy = cy;
	    }
	    
	    //length calculations
	    
	    /**
	     * Length of the distance between points A and B.
	     * @return distance (in dimensionless units) between points A and B.
	     */
	    public double getLength_AB() {
	        
	    }
	    
	    /**
	     * Length of the distance between points A and C.
	     * @return distance (in dimensionless units) between points A and C.
	     */
	    public double getLength_AC() {
	        
	    }
	    
	    /**
	     * Length of the distance between points B and C.
	     * @return distance (in dimensionless units) between points B and C.
	     */
	    public double getLength_BC() {
	        
	    }
	    
	    /**
	     * Length of the continuous line forming the boundary of the triangle.
	     * @return distance (in dimensionless units) of the traversal from any one point
	     * along the closed path back to itself. 
	     */
	    public double perimeter() {
	        
	    }
	    
	    // helper function: calculates the distance between the points (x1,y1) and (x2,y2).
	    private double getLength( double x1, double y1, double x2, double y2 ) {
	        
	    }
	    
	    // angle calculations
	    
	    /**
	     * Calculate angle present at point A.
	     * @return angle (in degrees) formed by the intersection of line segments AB and AC.
	     */
	    public double getAngleAt_A() {
	        
	    }
	    
	    /**
	     * Calculate angle present at point B.
	     * @return angle (in degrees) formed by the intersection of line segments BA and BC. 
	     */
	    public double getAngleAt_B() {
	        
	    }
	    
	    /**
	     * Calculate angle present at point C.
	     * @return angle (in degrees) formed by the intersection of line segments CA and CB. 
	     */
	    public double getAngleAt_C() {
	        
	    }
	    
	    // helper function: calculates angle OPPOSITE the first side passed as a parameter.
	    // angle is calculated via the Law of Cosines and is returned in units of degrees.
	    private double getAngle( double len_s1, double len_s2, double len_s3 ) {
	        
	    }
	    
	    /**
	     * Calculates the area of the triangle using Heron's Formula. This is the easiest formula
	     * to use as it is simple to calculate the lengths of all three sides given the points
	     * that form the triangle.
	     * @return area (in dimensionless square units) within the boundary of the triangle.
	     */
	    public double area() {
	        
	    }

	    @Override
	    public int hashCode() {
	        int hash = 5;
	        hash = 97 * hash + (int) (Double.doubleToLongBits(this.ax) ^ (Double.doubleToLongBits(this.ax) >>> 32));
	        hash = 97 * hash + (int) (Double.doubleToLongBits(this.ay) ^ (Double.doubleToLongBits(this.ay) >>> 32));
	        hash = 97 * hash + (int) (Double.doubleToLongBits(this.bx) ^ (Double.doubleToLongBits(this.bx) >>> 32));
	        hash = 97 * hash + (int) (Double.doubleToLongBits(this.by) ^ (Double.doubleToLongBits(this.by) >>> 32));
	        hash = 97 * hash + (int) (Double.doubleToLongBits(this.cx) ^ (Double.doubleToLongBits(this.cx) >>> 32));
	        hash = 97 * hash + (int) (Double.doubleToLongBits(this.cy) ^ (Double.doubleToLongBits(this.cy) >>> 32));
	        return hash;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        final Triangle other = (Triangle) obj;
	        if (Double.doubleToLongBits(this.ax) != Double.doubleToLongBits(other.ax)) {
	            return false;
	        }
	        if (Double.doubleToLongBits(this.ay) != Double.doubleToLongBits(other.ay)) {
	            return false;
	        }
	        if (Double.doubleToLongBits(this.bx) != Double.doubleToLongBits(other.bx)) {
	            return false;
	        }
	        if (Double.doubleToLongBits(this.by) != Double.doubleToLongBits(other.by)) {
	            return false;
	        }
	        if (Double.doubleToLongBits(this.cx) != Double.doubleToLongBits(other.cx)) {
	            return false;
	        }
	        if (Double.doubleToLongBits(this.cy) != Double.doubleToLongBits(other.cy)) {
	            return false;
	        }
	        return true;
	    }
	    

	

}
