/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 10/03/2026  
*/
package Pertemuan10.Latihan12dan3_Pertemuan10;

class Buku {
    // Atribut yang digunakan untuk class Buku 
    String judul;
    String pengarang;
    int harga;

    // Constructor 1, tanpa parameter
    public Buku() { // tidak pakai void
        judul = "Belum diisi";
        pengarang = "Belum diisi";
        harga = 0;
    }

    // Constructor 2, dengan parameter (3 buah) dan menggunakan this.parameter
    public Buku(String judul, String pengarang, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    // Method untuk menampilkan data buku
    public void tampilkanInfo() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul       : " + judul);
        System.out.println("Pengarang   : " + pengarang);
        System.out.println("Harga       : Rp " + harga);
        System.out.println();
    }
}

public class LatihanBukuConstructor {
    public static void main(String[] args) {
        // Object 1, tanpa menggunakan parameter dan constructor default
        Buku bk1 = new Buku();
        bk1.tampilkanInfo();

        // Object 2 dan 3, menggunakan constructor dengan parameter
        // Jumlah input harus sesuai dengan parameter yang telah dibuat
        Buku bk2 = new Buku("Pemrograman Java", "Budi Raharjo", 125000);
        bk2.tampilkanInfo();

        Buku bk3 = new Buku("Algoritma dan Struktur Data", "Rinaldi Munir", 150000);
        bk3.tampilkanInfo();
    }
}