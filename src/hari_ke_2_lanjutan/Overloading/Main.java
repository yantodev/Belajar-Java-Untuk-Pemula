package hari_ke_2_lanjutan.Overloading;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();

        // Polimorfisme statis (compile-time)
        System.out.println("Square Area: " + shape.calculateArea(5));
        System.out.println("Rectangle Area: " + shape.calculateArea(5, 10));
    }
}
