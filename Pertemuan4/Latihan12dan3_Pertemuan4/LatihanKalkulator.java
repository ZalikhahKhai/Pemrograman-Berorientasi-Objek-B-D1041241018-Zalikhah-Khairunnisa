/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 18/02/2026  
*/
package Pertemuan4.Latihan12dan3_Pertemuan4;

public class LatihanKalkulator {
    public static void main(String[] args) {
        int angka1 = 25;
        int angka2 = 4;

        System.out.println("=== KALKULATOR ===");
        System.out.println("Angka 1: " + angka1);
        System.out.println("Angka 2: " + angka2);
        System.out.println("---");
        System.out.println("Penjumlahan :" + (angka1 + angka2));
        System.out.println("Pengurangan :" + (angka1 - angka2));
        System.out.println("Perkalian   :" + (angka1 * angka2));
        System.out.println("Pembagian   :" + (angka1 / angka2));
        System.out.println("Sisa Bagi   :" + (angka1 % angka2));

        double hasilBagi = (double) angka1 / angka2;
        System.out.println("Pembagian Desimal: " + hasilBagi);
    }
}
