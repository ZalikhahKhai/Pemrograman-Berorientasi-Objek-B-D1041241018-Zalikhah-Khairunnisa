/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 09/03/2026  
*/
package Pertemuan9.Latihan12dan3_Pertemuan9;

class Mobil {
    // Atribut yang digunakan untuk class Mobil
    String merk;
    String warna;
    int tahun;
    int kecepatan;

    // Method yang digunakan untuk menampilkan spesifikasi Mobil
    public void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println();
        System.out.println("Merk    : " + merk);
        System.out.println();
        System.out.println("Warna   : " + warna);
        System.out.println();
        System.out.println("Tahun   : " + tahun);
        System.out.println();
    }

    // Method yang digunakan untuk mempercepat Mobil
    public void percepat() {
        kecepatan += 20;
        System.out.println("Mobil dipercepat . . .");
        System.out.println();
    }

    // Method yang digunakan untuk menampilkan kecepatan Mobil
    public void tampilkanKecepatan() {
        System.out.println("Kecepatan saat ini: " + kecepatan + " km/jam");
    }
}

public class ClassMobil {
    public static void main(String[] args) {
        // Membuat data mobil ke-1
        Mobil jenisMobil1 = new Mobil();
        jenisMobil1.merk = "Toyota Avanza";
        jenisMobil1.warna = "Silver";
        jenisMobil1.tahun = 2020;

        // Menampilkan informasi spesifikasi mobil
        jenisMobil1.tampilkanSpesifikasi();
        // Menambah kecepatan sebanyak 2x
        jenisMobil1.percepat();
        jenisMobil1.percepat();
        // Menampilkan kecepatan mobil sekarang
        jenisMobil1.tampilkanKecepatan();
    }
}