/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 24/03/2026  
*/
package Pertemuan13.Latihan1dan2_Pertemuan13;

public class LatihanArrayNilai {
    public static void main(String[] args) {
        // Inisialisasi array dan nilainya
        int[] nilai = {85, 90, 78, 92, 88};

        System.out.println("=== DAFTAR NILAI ===");
        for (int i = 0; i < nilai.length; i++) { // Loop untuk mengakses baris sesuai indeks
            System.out.println("Nilai " + (i + 1) + ": " + nilai[i]);
        }  

        System.out.println();
        System.out.println("Total Nilai: " + nilai.length); // nilai.length digunakan untuk melihat panjang array
    }
}
