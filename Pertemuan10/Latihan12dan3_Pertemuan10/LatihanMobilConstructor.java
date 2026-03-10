/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 10/03/2026  
*/
package Pertemuan10.Latihan12dan3_Pertemuan10;

class Mobil {
    // Atribut yang digunakan untuk class Mobil
    String merk;
    String warna;
    int tahun;

    // Constructor 1, tanpa parameter
    public Mobil() {
        merk = "Belum diisi";
        warna = "Belum diisi";
        tahun = 0;
    }

    // Constructor 2, dengan satu parameter
    public Mobil(String merk) {
        this.merk = merk;
        this.warna = "Belum diisi"; // kalau default, tetap harus inisialisasi default
        this.tahun = 0;
    }

    // Constructor 3, dengan semua parameter
    public Mobil(String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    // Method untuk menampilkan spesifikasi mobil
    public void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk    : " + merk);
        System.out.println("Warna   : " + warna);
        System.out.println("Tahun   : " + tahun);
        System.out.println();
    }
}

public class LatihanMobilConstructor {
    public static void main(String[] args) {
        // Object 1, tanpa menggunakan parameter dan constructor default
        Mobil mobil1 = new Mobil();
        mobil1.tampilkanSpesifikasi();

        // Object 2, menggunakan constructor dengan satu parameter
        Mobil mobil2 = new Mobil("Toyota");
        mobil2.tampilkanSpesifikasi();

        // Object 3, menggunakan constructor dengan tiga parameter
        Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023);
        mobil3.tampilkanSpesifikasi();
    }
}
