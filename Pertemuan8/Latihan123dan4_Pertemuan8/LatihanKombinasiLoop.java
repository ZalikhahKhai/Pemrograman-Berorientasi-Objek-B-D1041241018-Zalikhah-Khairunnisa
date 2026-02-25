/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 25/02/2026  
*/
package Pertemuan8.Latihan123dan4_Pertemuan8;

public class LatihanKombinasiLoop {
    public static void main(String[] args) {
        boolean isFound = false; // Boolean digunakan untuk keluar dari outer loop

        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");
        for (int i = 1; i <= 3; i++) { // Outer loop
            for (int j = 1; j <= 5; j++) { // Inner loop
                System.out.println("Cek: [" + i + "," + j + "]");

                if (i == 2 && j == 3) { // Jika menemukan koordinat [2,3], program akan berhenti
                    System.out.println("Koordinat ditemukan!");
                    System.out.println("Pencarian selesai.");
                    isFound = true; // Mengubah variabel isFound menjadi true untuk menghentikan outer loop
                    break;
                }
            }

            if (isFound) { // Menghentikan outer loop
                break;
            }
        }
    }
}
