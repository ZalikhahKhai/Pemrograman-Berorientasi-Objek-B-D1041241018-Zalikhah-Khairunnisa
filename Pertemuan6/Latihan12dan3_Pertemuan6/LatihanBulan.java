/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 25/02/2026  
*/
package Pertemuan6.Latihan12dan3_Pertemuan6;

public class LatihanBulan {
    public static void main(String[] args) {
        int month = 13; // Inisialisasi dan deklarasi bulan (1-12)

        System.out.println("=== KONVERSI BULAN ===");
        System.out.println("Angka bulan: " + month);
        switch (month) {
            case 1:
                System.out.println("Nama Bulan: Januari");
                break;
            case 2:
                System.out.println("Nama Bulan: Februari");
                break;
            case 3:
                System.out.println("Nama Bulan: Maret");
                break;
            case 4:
                System.out.println("Nama Bulan: April");
                break;
            case 5:
                System.out.println("Nama Bulan: Mei");
                break;
            case 6:
                System.out.println("Nama Bulan: Juni");
                break;
            case 7:
                System.out.println("Nama Bulan: Juli");
                break;
            case 8:
                System.out.println("Nama Bulan: Agustus");
                break;
            case 9:
                System.out.println("Nama Bulan: September");
                break;
            case 10:
                System.out.println("Nama Bulan: Oktober");
                break;
            case 11:
                System.out.println("Nama Bulan: November");
                break;
            case 12:
                System.out.println("Nama Bulan: Desember");
                break;
            default: // Digunakan untuk validasi
                System.out.println("Error: Angka bulan tidak valid (1-12)");
                break;
        }
    }
}