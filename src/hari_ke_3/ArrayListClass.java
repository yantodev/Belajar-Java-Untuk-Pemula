package hari_ke_3;
import java.util.ArrayList;

public class ArrayListClass {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Menambahkan elemen ke ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Mengakses elemen ArrayList
        System.out.println("Buah pertama: " + fruits.get(0));

        // Menghapus elemen
        fruits.remove(1); // Menghapus "Banana"

        // Menampilkan semua elemen
        System.out.println("Daftar buah: " + fruits);
    }
}
