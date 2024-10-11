package hari_ke_2;
//Hari kedua

//Java 17
//record hari_ke_2.Person(String name, int age) {
//    // Constructor
//
//    // Method to display info
//    public void displayInfo() {
//        System.out.println("Name: " + name + ", Age: " + age);
//    }
//}



//public class hari_ke_2.Main {
//    public static void main(String[] args) {
//        // Membuat objek dari kelas hari_ke_2.Person
//        hari_ke_2.Person person1 = new hari_ke_2.Person("John", 25);
//        hari_ke_2.Person person2 = new hari_ke_2.Person("Alice", 30);
//        // Menampilkan informasi
//        person1.displayInfo();
//        person2.displayInfo();
//
//        person1.setName("John Smith");
//        person1.setAge(20);
//        person1.displayInfo();
//    }
//}

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 25, "Software Engineer");
        employee1.displayEmployeeInfo();
    }
}