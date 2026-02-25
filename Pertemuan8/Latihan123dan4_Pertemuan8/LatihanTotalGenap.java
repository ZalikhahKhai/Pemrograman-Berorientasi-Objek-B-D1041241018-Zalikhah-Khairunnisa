/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 25/02/2026  
*/
package Pertemuan8.Latihan123dan4_Pertemuan8;

public class LatihanTotalGenap {
    public static void main(String[] args) {
        System.out.println("=== TOTAL BILANGAN GENAP 1-20 ===");
        int total = 0; // Variabel untuk menghitung total bilangan genap yang dijumlahkan
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue; // Digunakan untuk melewati bilangan ganjil
            }

            total += i;
            System.out.println("Tambah: " + i + " > Total: " + total);
        } 
        System.out.println("---");
        System.out.println("Total akhir: " + total);
    }
}
