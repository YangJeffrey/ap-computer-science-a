package mp1;

package com.company;

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
        l = length;
    }

    public void setwidth(double w) {
        w = width;
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
        //setWidth(0);
    }

    /* Override the toString method to print length and width with labels */
    public String toString(double l, double w) {
        return("length: " + l + ", width: " + w);
    }

    /* Override the equals method determine if objects are equal if length and width are equal */
    public boolean equals(double l, double w) {
        if (l == w) {
            return true;
        } else {
            return false;
        }
    }

    /* Calculates the area of the rectangle */
    public static double area(double l, double w) {
        return (l*w);
    }

    /* Calculates the perimeter of the rectangle */
    public static double perimeter(double l, double w) {
        return (2*l + 2*w);
    }
}
