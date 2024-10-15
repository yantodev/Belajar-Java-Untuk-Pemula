package hari_ke_3;

import java.util.HashSet;

public class HashSetClass {

    public static void main(String[] args) {
        // Membuat HashSet
        HashSet<String> cities = new HashSet<>();

        // Menambahkan elemen ke HashSet
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("New York"); // Elemen duplikat tidak akan ditambahkan

        // Menampilkan semua elemen
        System.out.println("Kota: " + cities);
    }
}
