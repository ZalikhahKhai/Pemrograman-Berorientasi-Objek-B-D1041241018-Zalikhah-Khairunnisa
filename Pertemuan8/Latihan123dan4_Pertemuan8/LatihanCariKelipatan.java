/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 25/02/2026  
*/
package Pertemuan8.Latihan123dan4_Pertemuan8;

public class LatihanCariKelipatan {
    public static void main(String[] args) {
        System.out.println("=== CARI KELIPATAN 7 ===");
        for (int i = 1; i <= 50; i++) {
            System.out.println("Cek: " + i);

            if (i % 7 == 0) { // Digunakan untuk mengecek kelipatan 7 pertama
                System.out.println("Kelipatan 7 pertama: " + i);
                System.out.println("Pencarian selesai.");
                break; // Digunakan apabila kelipatan 7 pertama ditemukan untuk menghentikan pencarian
            }
        }
    }
}