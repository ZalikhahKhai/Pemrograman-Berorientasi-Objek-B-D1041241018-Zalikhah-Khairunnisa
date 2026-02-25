/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 25/02/2026  
*/
package Pertemuan7.Latihan123dan4_Pertemuan7;

public class LatihanRefleksi {
    public static void main(String[] args) {
        System.out.println("=== MENGGUNAKAN WHILE ==="); // While loop
        int angkaWhile = 1;
        while(angkaWhile <= 5) {
            System.out.print(angkaWhile + " ");
            angkaWhile++;
        }
        System.out.println();
        System.out.println();

        System.out.println("=== MENGGUNAKAN DO-WHILE ==="); // Do-while loop
        int angkaDowhile = 1;
        do { 
            System.out.print(angkaDowhile + " ");
            angkaDowhile++;
        } while (angkaDowhile <= 5);
        System.out.println();
        System.out.println();

        System.out.println("=== MENGGUNAKAN FOR ==="); // For loop
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }
}
/* 
Jenis loop yang mudah dipahami bagi saya adalah for loop.
Hal ini dikarenakan jumlah perulangan sudah diketahui dan
lebih singkat kodenya dibanding while dan do-while. Selain
itu, proses increment/decrement dapat langsung dilihat
sehingga meminimalisir kesalahan dalam melakukan perulangan.
*/