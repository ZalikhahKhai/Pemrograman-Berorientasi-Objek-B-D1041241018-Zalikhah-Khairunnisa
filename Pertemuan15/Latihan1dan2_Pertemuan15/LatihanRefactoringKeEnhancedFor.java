/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 24/03/2026  
*/
package Pertemuan15.Latihan1dan2_Pertemuan15;

public class LatihanRefactoringKeEnhancedFor {
    public static void main(String[] args) {
        String[] buah = {"Apel", "Jeruk", "Mangga", "Anggur"};

        // Enhanced for digunakan untuk mempersingkat for
        // Nilai dalam array tidak dimodifikasi
        for (String b : buah) {
            System.out.println("Buah: " + b);
        }
    }
}
