/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 24/03/2026  
*/
package Pertemuan13.Latihan1dan2_Pertemuan13;

public class LatihanArrayNama {
    public static void main(String[] args) {
        // Inisialisasi array dan nilai string
        String[] nama = {"Andi", "Budi", "Citra", "Deni", "Eka"};

        System.out.println("=== DAFTAR NAMA ===");
        for (int i = 0; i < nama.length; i++) { // Loop untuk mengakses baris sesuai indeks
            System.out.println((i + 1) + ". " + nama[i]);
        }
    }
}
