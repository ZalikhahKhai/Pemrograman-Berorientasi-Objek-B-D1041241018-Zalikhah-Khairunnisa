/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 25/02/2026  
*/
package Pertemuan7.Latihan123dan4_Pertemuan7;

public class LatihanTabelPerkalian {
    public static void main(String[] args) {
        System.out.println("=== TABEL PERKALIAN 7 ===");
        int angka = 7; // Deklarasi dan inisialisasi angka perkalian
        for (int i = 1; i <= 12; i++) { // Melakukan iterasi dari 1-12
            int hasil = angka * i; // Menghitung hasil kali
            System.out.println(angka + " x " + i + " = " + hasil);
        }
    }
}