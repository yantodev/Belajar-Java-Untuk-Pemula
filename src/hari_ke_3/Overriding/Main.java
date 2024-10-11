package hari_ke_3.Overriding;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog(); // Polimorfisme dinamis (runtime)

        myAnimal.sound(); // Output: Animal is making a sound
        myDog.sound(); // Output: Dog is barking
    }
}
