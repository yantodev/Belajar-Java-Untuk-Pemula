package hari_ke_3;

import java.util.HashMap;

public class HashMapClass {

        public static void main(String[] args) {
            // Membuat HashMap
            HashMap<String, String> capitals = new HashMap<>();

            // Menambahkan key-value pairs
            capitals.put("Indonesia", "Jakarta");
            capitals.put("USA", "Washington D.C.");
            capitals.put("France", "Paris");

            // Mengakses value berdasarkan key
            System.out.println("Ibu kota Indonesia: " + capitals.get("Indonesia"));

            // Menampilkan semua key-value pairs
            System.out.println("Daftar negara dan ibu kotanya: " + capitals);
        }
}
