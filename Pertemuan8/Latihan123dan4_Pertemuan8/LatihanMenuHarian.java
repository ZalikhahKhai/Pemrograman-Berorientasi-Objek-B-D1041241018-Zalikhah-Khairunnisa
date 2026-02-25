/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 25/02/2026  
*/
package Pertemuan8.Latihan123dan4_Pertemuan8;

public class LatihanMenuHarian {
    public static void main(String[] args) {
        System.out.println("=== MENU MAKAN 3 HARI ===");
        for (int i = 1; i <= 3; i++) { // Outer loop untuk menunjukkan hari (1, 2, dan 3)
            System.out.println("Hari " + i + ":");

            for (int j = 1; j <= 2; j++) { // Inner loop untuk menunjukkan waktu makan (pagi dan sore)
                if (i == 1 && j == 1) {
                    System.out.println("    Pagi: Nasi Goreng");
                } else if (i == 1 && j == 2) {
                    System.out.println("    Sore: Soto Ayam"); 
                    System.out.println();
                } else if (i == 2 && j == 1) {
                    System.out.println("    Pagi: Bubur Ayam");
                } else if (i == 2 && j == 2) {
                    System.out.println("    Sore: Mie Goreng");
                    System.out.println();
                } else if (i == 3 && j == 1) {
                    System.out.println("    Pagi: Roti Bakar");
                } else {
                    System.out.println("    Sore: Nasi Uduk");
                    System.out.println();
                }
            }
        }
    }
}