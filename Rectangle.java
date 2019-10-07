package mp1;

public class Rectangle {
    //data members
    private double length;
    private double width;

    /* accessor methods for each data member*/
    public double getlength() {
        return length;
    }

    public double getwidth() {
        return width;
    }

    /* modifier methods for each data member */
    public void setlength(double l) {
        length = l;
    }

    public void setwidth(double w) {
        width = w;
    }

    /* constructor receives initializes data members */
    public Rectangle(double l, double w) {
        length = l;
        width = w;
        //setWidth(w);
    }

    /* overloaded constructor initializes data members to 0 */
    public Rectangle() {
        length = 0;
        width = 0;
    }

    /* Override the toString method to print length and width with labels */
    public String toString() {
        return("length: " + length + ", width: " + width);
    }

    /* Override the equals method determine if objects are equal if length and width are equal */
    public boolean equals(Rectangle r) {
        if (r.getlength() == length && r.getwidth() == width) {
            return true;
        } else {
            return false;
        }
    }

    /* Calculates the area of the rectangle */
    public double area() {
        return (length*width);
    }

    /* Calculates the perimeter of the rectangle */
    public double perimeter() {
        return (2*length + 2*width);
    }
}
