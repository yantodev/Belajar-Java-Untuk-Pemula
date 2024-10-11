package hari_ke_3.Overloading;

public class Shape {
    // Overloaded method to calculate area for different shapes
    public int calculateArea(int side) {
        return side * side; // Square area
    }

    public int calculateArea(int length, int width) {
        return length * width; // Rectangle area
    }
}