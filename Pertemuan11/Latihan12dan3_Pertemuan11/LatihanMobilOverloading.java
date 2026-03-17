/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 17/03/2026  
*/
package Pertemuan11.Latihan12dan3_Pertemuan11;

class Mobil {
    // Atribut yang digunakan untuk class Mobil
    String merk;
    String warna;
    int tahun;

    // Constructor 1, tanpa parameter
    public Mobil() {
        merk = "Unknown";
        warna = "Unknown";
        tahun = 0;
    }

    // Constructor 2, hanya merk, sisanya default
    public Mobil(String merk) {
        this.merk = merk;
        this.warna = "Unknown";
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

public class LatihanMobilOverloading {
    public static void main(String[] args) {
        // Object 1, isi tanpa menggunakan parameter >> constructor ke-1
        Mobil mobil1 = new Mobil();
        mobil1.tampilkanSpesifikasi();

        // Object 2, isi dengan satu parameter >> constructor ke-2
        Mobil mobil2 = new Mobil("Toyota");
        mobil2.tampilkanSpesifikasi();

        // Object 3, isi dengan semua parameter >> constructor ke-3
        Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023);
        mobil3.tampilkanSpesifikasi();
    }
}
