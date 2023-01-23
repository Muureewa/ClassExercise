public class Point {
    private double x;
    private double y;

    // Default Constructor
    public Point(){
        this(0, 0);
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //getter for x
    public double getX(){
        return x;
    }
    // Setter for x
    public double getY(){
        return y;
    }
    //setter for x
    public void setX(double x){
        this.x = x;
    }


    //setter for y
    public void setY(double y) {
        this.y = y;
    }

    //method that returns true if point is located at origin
    public boolean isLocatedAtOrigin() {
        return x == 0 && y == 0;
    }

    //method that returns distance between this point and the (x, y) coordinate given as method parameters
    public double distance(double xOther, double yOther) {
        double xDiff = x - xOther;
        double yDiff = y - yOther;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    //overriding toString method to return string representation of point
    public String toString() {
        return "Point - x: " + x + ", y: " + y;
    }








}









