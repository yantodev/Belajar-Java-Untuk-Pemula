package hari_ke_3;

import java.util.TreeMap;

public class TreeMapClass {

    public static void main(String[] args) {
        // Membuat TreeMap
        TreeMap<String, Integer> scores = new TreeMap<>();

        // Menambahkan key-value pairs
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 92);
        scores.put("Diana", 88);

        // Menampilkan semua key-value pairs
        System.out.println("Daftar Skor:");
        for (String key : scores.keySet()) {
            System.out.println(key + ": " + scores.get(key));
        }

        // Mengakses value berdasarkan key
        System.out.println("\nSkor Bob: " + scores.get("Bob"));

        // Menghapus elemen
        scores.remove("Charlie");
        System.out.println("\nSetelah menghapus Charlie:");
        for (String key : scores.keySet()) {
            System.out.println(key + ": " + scores.get(key));
        }

        // Menampilkan TreeMap dalam urutan terurut
        System.out.println("\nTreeMap dalam urutan terurut:");
        System.out.println(scores);
    }
}
