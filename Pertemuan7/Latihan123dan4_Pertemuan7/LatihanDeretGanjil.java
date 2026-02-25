/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 25/02/2026  
*/
package Pertemuan7.Latihan123dan4_Pertemuan7;

public class LatihanDeretGanjil {
    public static void main(String[] args) {
        System.out.println("=== BILANGAN GANJIL 1-15 ===");
        int angka = 1; // Inisialisasi dan deklarasi angka awal
        while (angka <= 15) { // Apabila angka kurang dari sama dengan 15, maka program akan terus berjalan
            if (angka % 2 != 0) { // Digunakan untuk cek angka ganjil
                System.out.print(angka + " ");
            }
            angka++; // Post-increment diletakkan di luar if supaya dapat bertambah
        }
    }
}
