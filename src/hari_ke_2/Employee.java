package hari_ke_2;

public class Employee extends Person {
    private String position;

    // Constructor
    public Employee(String name, int age, String position) {
        super(name, age); // Memanggil constructor dari kelas induk (hari_ke_2.Person)
        this.position = position;
    }

    // Method to display employee info
    public void displayEmployeeInfo() {
        displayInfo(); // Memanggil metode dari kelas hari_ke_2.Person
        System.out.println("Position: " + position);
    }
}
